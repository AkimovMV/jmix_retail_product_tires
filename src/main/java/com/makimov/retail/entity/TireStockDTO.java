package com.makimov.retail.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@JmixEntity
public class TireStockDTO {

    private String warehouseId1c;

    @JmixProperty(mandatory = true)
    @NotNull
    private String productId1c;

    private Integer count;

    private BigDecimal price;

    public String getWarehouseId1c() {
        return warehouseId1c;
    }

    public void setWarehouseId1c(String warehouseId1c) {
        this.warehouseId1c = warehouseId1c;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getProductId1c() {
        return productId1c;
    }

    public void setProductId1c(String productId1c) {
        this.productId1c = productId1c;
    }

}