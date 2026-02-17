package com.makimov.retail;

import com.makimov.retail.entity.Tire;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    private final HttpGraphQlClient graphQlClient;

    @Autowired
    private DataManager dataManager;

    public ProductService() {

        this.graphQlClient = HttpGraphQlClient.builder()
                .url("http://localhost:5001")
                .build();
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

    public void saveTiresFrom1c7() {
        List<Tire> entities = this.fetchTires();

        SaveContext saveContext = new SaveContext().setDiscardSaved(true);
        for (int i = 0; i < entities.size(); i++) {
            saveContext.saving(entities.get(i));
            // сохранение по 100 позиций
            if ((i + 1) % 100 == 0 || i == entities.size() - 1) {
                dataManager.save(saveContext);
                saveContext = new SaveContext().setDiscardSaved(true);
            }
        }
    }
}


