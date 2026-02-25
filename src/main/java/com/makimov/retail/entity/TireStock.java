package com.makimov.retail.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@JmixEntity
@Table(name = "TIRE_STOCK", indexes = {
        @Index(name = "IDX_TIRE_STOCK_TIRE", columnList = "TIRE_ID"),
        @Index(name = "IDX_TIRE_STOCK_WAREHOUSE", columnList = "WAREHOUSE_ID"),
        @Index(name = "IDX_TIRE_STOCK_TIRE_WAREHOUSE", columnList = "TIRE_ID, WAREHOUSE_ID", unique = true)
})
@Entity
public class TireStock {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Long id;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "TIRE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Tire tire;

    @JoinColumn(name = "WAREHOUSE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Warehouse warehouse;

    @Column(name = "COUNT_")
    private Integer count;

    @Column(name = "PRICE", precision = 19, scale = 2)
    private BigDecimal price;

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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}