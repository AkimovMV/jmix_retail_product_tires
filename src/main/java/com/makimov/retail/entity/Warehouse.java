package com.makimov.retail.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@JmixEntity
@Table(name = "WAREHOUSE")
@Entity
public class Warehouse {

    @Column(name = "ID", nullable = false, length = 30)
    @Id
    private String id;

    @Column(name = "ID_1C")
    private String id1c;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId1c() {
        return id1c;
    }

    public void setId1c(String id1c) {
        this.id1c = id1c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    private boolean areEqual(Object obj1, Object obj2) {
        // Если оба объекта null — они равны
        if (obj1 == null && obj2 == null) {
            return true;
        }
        // Если только один из объектов null — они не равны
        if (obj1 == null || obj2 == null) {
            return false;
        }
        // В остальных случаях используем стандартный метод equals()
        return obj1.equals(obj2);
    }

    public boolean fillBySource(Warehouse sourceElement){
        if (sourceElement == null) {
            return false;
        }

        boolean hasChanges = false;

        if (!areEqual(this.getName(), sourceElement.getName())) {
            this.setName(sourceElement.getName());
            hasChanges = true;
        }
        if (!areEqual(this.getName(), sourceElement.getName())) {
            this.setName(sourceElement.getName());
            hasChanges = true;
        }
        if (!areEqual(this.getId1c(), sourceElement.getId1c())) {
            this.setId1c(sourceElement.getId1c());
            hasChanges = true;
        }

        return hasChanges;
    }
}