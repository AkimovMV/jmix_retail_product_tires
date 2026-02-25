package com.makimov.retail.services;

import com.makimov.retail.entity.Tire;
import com.makimov.retail.entity.TireStock;
import com.makimov.retail.entity.TireStockDTO;
import com.makimov.retail.entity.Warehouse;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private DataManager dataManager;

    @PersistenceContext
    private EntityManager entityManager;

    private final HttpGraphQlClient graphQlClient;

    public ProductService(HttpGraphQlClient graphQlClient, DataManager dataManager) {
        this.graphQlClient = graphQlClient;
    }

    public List<Tire> fetchTires(){
        String query = """
            query {
                  getTires1c {
                    id
                    product
                    name
                    producerArticleId
                    width
                    widthId1c
                    height
                    heightId1c
                    diameter
                    diameterId1c
                    diameterOut
                    diameterOutId1c
                    season
                    thorn
                    category
                    categoryId1c
                    homologation
                    technology
                    speedIndex
                    speedIndexId1c
                    loadIndex
                    loadIndexId1c
                    axis
                    axisId1c
                    layer
                    layerId1c
                    producer
                    producerId1c
                    model
                    modelId1c
                    offRoad
                    hasTube
                    runFlat
                    hasRimTape
                    hasPicture
                    image
                    weight
                    dateUpdate
                    outerDiameter
                    outerDiameterId1c
                    tireType
                    tireConstruction
                    patternType
                    applying
                  }
                }
        """;

        List<Tire> result = graphQlClient
                .document(query)
                .retrieveSync("getTires1c")
                .toEntityList(Tire.class);

        return result;
    }

    public String returnCurrentDate(LocalDateTime now) {
        now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        return formattedDate;
    }

    public void saveTiresFrom1c7() {
        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveTiresFrom1c7 start "+ this.returnCurrentDate(dateStart));
        List<Tire> tiresList = this.fetchTires();

        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < tiresList.size(); i++) {
            Tire newTire = tiresList.get(i);
            System.out.println("id шины "+ newTire.getId());

            Tire existingTire = dataManager.load(Tire.class).id(newTire.getId()).optional().orElse(dataManager.create(Tire.class));
            if (existingTire.getId() != null ) {
                boolean hasChange = existingTire.fillBySource(newTire);
                if (hasChange) {
                    saveContext.saving(existingTire);
                    System.out.println("id шины " + existingTire.getId() + " внесены изменения (update)");
                } else {
                    System.out.println("id шины " + existingTire.getId() + " изменений нет - запись не произведена");
                }

            } else {
                saveContext.saving(newTire);
                System.out.println("id шины " + newTire.getId() + " внесены изменения (insert)");
            }
            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == tiresList.size() - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(true);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTiresFrom1c7 end "+ this.returnCurrentDate(dateEnd));
        System.out.println("saveTiresFrom1c7 time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }

    public List<Warehouse> fetchWarehouses1C(){
        String query = """
            query {
               getWarehouses1c {
                 id
                 name
                 id1c: warehouse
               }
             }
        """;

        List<Warehouse> result = graphQlClient
                .document(query)
                .retrieveSync("getWarehouses1c")
                .toEntityList(Warehouse.class);

        return result;
    }

    public void saveWarehousesFrom1c7() {
        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveWarehousesFrom1c7 start "+ this.returnCurrentDate(dateStart));
        List<Warehouse> list = this.fetchWarehouses1C();

        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < list.size(); i++) {
            Warehouse newElement = list.get(i);
            System.out.println("id склад1с "+ newElement.getId());

            Warehouse existingElement = dataManager.load(Warehouse.class).id(newElement.getId()).optional().orElse(dataManager.create(Warehouse.class));
            if (existingElement.getId() != null ) {
                boolean hasChange = existingElement.fillBySource(newElement);
                if (hasChange) {
                    saveContext.saving(existingElement);
                    System.out.println("id  " + existingElement.getId() + " внесены изменения (update)");
                } else {
                    System.out.println("id  " + existingElement.getId() + " изменений нет - запись не произведена");
                }

            } else {
                saveContext.saving(newElement);
                System.out.println("id  " + newElement.getId() + " внесены изменения (insert)");
            }
            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == list.size() - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(true);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveWarehousesFrom1c7 end "+ this.returnCurrentDate(dateEnd));
        System.out.println("saveWarehousesFrom1c7 time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }

    public List<TireStockDTO> fetchTireStocks1C(){
        String query = """
            query GetTires1cStocks($product1C: String) {
              getTires1cStocks(product_1c: $product1C) {
                warehouse
                warehouseId1c: warehouse_id
                product
                productId1c: product_1c
                count
                price
              }
            }
        """;

        List<TireStockDTO> result = graphQlClient
                .document(query)
                .retrieveSync("getTires1cStocks")
                .toEntityList(TireStockDTO.class);

        return result;
    }

    @Transactional
    public void clearTireStock() {
//        entityManager.createQuery("DELETE FROM TireStock")
//                .executeUpdate();
    }


    public void saveTireStocksFrom1c7() {
        this.clearTireStock();

        LocalDateTime dateStart = LocalDateTime.now();
        int elementCount = 0;
        System.out.println("saveTireStocksFrom1c7 start "+ this.returnCurrentDate(dateStart));
        List<TireStockDTO> list = this.fetchTireStocks1C();

        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < list.size(); i++) {
            TireStockDTO tireStockDTO = list.get(i);
            System.out.println("id склад1с "+ tireStockDTO.getWarehouseId1c() + " шина 1с "+tireStockDTO.getProductId1c() );

            TireStock newElement = new TireStock();

            Warehouse warehouse = dataManager.load(Warehouse.class).id(tireStockDTO.getWarehouseId1c()).optional().orElse(dataManager.create(Warehouse.class));

            if (warehouse.getId() == null) {
                continue;
            }

            Tire tire = dataManager.load(Tire.class).id(tireStockDTO.getProductId1c()).optional().orElse(dataManager.create(Tire.class));
            if (tire.getId() == null) {
                continue;
            }

            newElement.setWarehouse(warehouse);
            newElement.setTire(tire);
            newElement.setCount(tireStockDTO.getCount());
            newElement.setPrice(tireStockDTO.getPrice());

            saveContext.saving(newElement);

            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == list.size() - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(true);
            }
            elementCount++;
        }

        LocalDateTime dateEnd = LocalDateTime.now();
        System.out.println("saveTireStocksFrom1c7 end "+ this.returnCurrentDate(dateEnd));
        System.out.println("saveTireStocksFrom1c7 time: "+ ChronoUnit.SECONDS.between(dateStart, dateEnd) + " count elements:"+elementCount);
    }
}


