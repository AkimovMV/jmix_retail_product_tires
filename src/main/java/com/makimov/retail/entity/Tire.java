package com.makimov.retail.entity;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@JmixEntity
@Table(name = "TIRE")
@Entity
public class Tire {
    @Column(name = "ID", nullable = false, length = 30)
    @Id
    private String id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "PRODUCER_ARTICLE_ID", nullable = false, length = 50)
    @NotNull
    private String producerArticleId;

    @Column(name = "WIDTH", length = 50)
    private String width;

    @Column(name = "WIDTH_ID_1C")
    private Integer widthId1c;

    @Column(name = "HEIGHT", length = 50)
    private String height;

    @Column(name = "HEIGHT_ID_1C")
    private Integer heightId1c;

    @Column(name = "DIAMETER", length = 50)
    private String diameter;

    @Column(name = "DIAMETER_ID_1C")
    private Integer diameterId1c;

    @Column(name = "DIAMETER_OUT", length = 50)
    private String diameterOut;

    @Column(name = "DIAMETER_OUT_ID_1C")
    private Integer diameterOutId1c;

    @Column(name = "SEASON", length = 50)
    private String season;

    @Column(name = "THORN")
    private Boolean thorn = false;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "CATEGORY_ID_1C")
    private Integer categoryId1c;

    @Column(name = "HOMOLOGATION", length = 50)
    private String homologation;

    @Column(name = "TECHNOLOGY", length = 50)
    private String technology;

    @Column(name = "SPEED_INDEX", length = 50)
    private String speedIndex;

    @Column(name = "SPEED_INDEX_ID_1C")
    private Integer speedIndexId1c;

    @Column(name = "LOAD_INDEX", length = 50)
    private String loadIndex;

    @Column(name = "LOAD_INDEX_ID_1C")
    private Integer loadIndexId1c;

    @Column(name = "AXIS", length = 50)
    private String axis;

    @Column(name = "AXIS_ID_1C")
    private Integer axisId1c;

    @Column(name = "LAYER", length = 50)
    private String layer;

    @Column(name = "LAYER_ID_1C")
    private Integer layerId1c;

    @Column(name = "PRODUCER", length = 50)
    private String producer;

    @Column(name = "PRODUCER_ID_1C")
    private Integer producerId1c;

    @Column(name = "MODEL", length = 50)
    private String model;

    @Column(name = "MODEL_ID_1C")
    private Integer modelId1c;

    @Column(name = "OFF_ROAD")
    private Boolean offRoad = false;

    @Column(name = "HAS_TUBE")
    private Boolean hasTube = false;

    @Column(name = "RUN_FLAT")
    private Boolean runFlat = false;

    @Column(name = "HAS_RIM_TAPE")
    private Boolean hasRimTape = false;

    @Column(name = "WEIGHT")
    private Float weight;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE")
    private Date dateUpdate;

    @Column(name = "OUTER_DIAMETER", length = 50)
    private String outerDiameter;

    @Column(name = "OUTER_DIAMETER_ID_1C")
    private Integer outerDiameterId1c;

    @Column(name = "TIRE_TYPE", length = 50)
    private String tireType;

    @Column(name = "TIRE_CONSTRUCTION", length = 50)
    private String tireConstruction;

    @Column(name = "PATTERN_TYPE")
    private String patternType;

    @Column(name = "APPLYING", length = 150)
    private String applying;

    public void setSpeedIndex(String speedIndex) {
        this.speedIndex = speedIndex;
    }

    public String getSpeedIndex() {
        return speedIndex;
    }

    public String getApplying() {
        return applying;
    }

    public void setApplying(String applying) {
        this.applying = applying;
    }

    public String getPatternType() {
        return patternType;
    }

    public void setPatternType(String patternType) {
        this.patternType = patternType;
    }

    public String getTireConstruction() {
        return tireConstruction;
    }

    public void setTireConstruction(String tireConstruction) {
        this.tireConstruction = tireConstruction;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public Integer getOuterDiameterId1c() {
        return outerDiameterId1c;
    }

    public void setOuterDiameterId1c(Integer outerDiameterId1c) {
        this.outerDiameterId1c = outerDiameterId1c;
    }

    public String getOuterDiameter() {
        return outerDiameter;
    }

    public void setOuterDiameter(String outerDiameter) {
        this.outerDiameter = outerDiameter;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getHasRimTape() {
        return hasRimTape;
    }

    public void setHasRimTape(Boolean hasRimTape) {
        this.hasRimTape = hasRimTape;
    }

    public Boolean getRunFlat() {
        return runFlat;
    }

    public void setRunFlat(Boolean runFlat) {
        this.runFlat = runFlat;
    }

    public void setHasTube(Boolean hasTube) {
        this.hasTube = hasTube;
    }

    public Boolean getHasTube() {
        return hasTube;
    }

    public Boolean getOffRoad() {
        return offRoad;
    }

    public void setOffRoad(Boolean offRoad) {
        this.offRoad = offRoad;
    }

    public Integer getModelId1c() {
        return modelId1c;
    }

    public void setModelId1c(Integer modelId1c) {
        this.modelId1c = modelId1c;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProducerId1c() {
        return producerId1c;
    }

    public void setProducerId1c(Integer producerId1c) {
        this.producerId1c = producerId1c;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getLayerId1c() {
        return layerId1c;
    }

    public void setLayerId1c(Integer layerId1c) {
        this.layerId1c = layerId1c;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public Integer getAxisId1c() {
        return axisId1c;
    }

    public void setAxisId1c(Integer axisId1c) {
        this.axisId1c = axisId1c;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }

    public Integer getLoadIndexId1c() {
        return loadIndexId1c;
    }

    public void setLoadIndexId1c(Integer loadIndexId1c) {
        this.loadIndexId1c = loadIndexId1c;
    }

    public String getLoadIndex() {
        return loadIndex;
    }

    public void setLoadIndex(String loadIndex) {
        this.loadIndex = loadIndex;
    }

    public Integer getSpeedIndexId1c() {
        return speedIndexId1c;
    }

    public void setSpeedIndexId1c(Integer speedIndexId1c) {
        this.speedIndexId1c = speedIndexId1c;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getHomologation() {
        return homologation;
    }

    public void setHomologation(String homologation) {
        this.homologation = homologation;
    }

    public Integer getCategoryId1c() {
        return categoryId1c;
    }

    public void setCategoryId1c(Integer categoryId1c) {
        this.categoryId1c = categoryId1c;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getThorn() {
        return thorn;
    }

    public void setThorn(Boolean thorn) {
        this.thorn = thorn;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getDiameterOutId1c() {
        return diameterOutId1c;
    }

    public void setDiameterOutId1c(Integer diameterOutId1c) {
        this.diameterOutId1c = diameterOutId1c;
    }

    public String getDiameterOut() {
        return diameterOut;
    }

    public void setDiameterOut(String diameterOut) {
        this.diameterOut = diameterOut;
    }

    public Integer getDiameterId1c() {
        return diameterId1c;
    }

    public void setDiameterId1c(Integer diameterId1c) {
        this.diameterId1c = diameterId1c;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public Integer getHeightId1c() {
        return heightId1c;
    }

    public void setHeightId1c(Integer heightId1c) {
        this.heightId1c = heightId1c;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getWidthId1c() {
        return widthId1c;
    }

    public void setWidthId1c(Integer widthId1c) {
        this.widthId1c = widthId1c;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getProducerArticleId() {
        return producerArticleId;
    }

    public void setProducerArticleId(String producerArticleId) {
        this.producerArticleId = producerArticleId;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean fillBySource(Tire sourceTire){
        if (sourceTire == null) {
            return false;
        }

        boolean hasChanges = false;

        if (!areEqual(this.getName(), sourceTire.getName())) {
            this.setName(sourceTire.getName());
            hasChanges = true;
        }
        if (!areEqual(this.getProducerArticleId(), sourceTire.getProducerArticleId())) {
            this.setProducerArticleId(sourceTire.getProducerArticleId());
            hasChanges = true;
        }
        if (!areEqual(this.getWidth(), sourceTire.getWidth())) {
            this.setWidth(sourceTire.getWidth());
            hasChanges = true;
        }
        if (!areEqual(this.getWidthId1c(), sourceTire.getWidthId1c())) {
            this.setWidthId1c(sourceTire.getWidthId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getHeight(), sourceTire.getHeight())) {
            this.setHeight(sourceTire.getHeight());
            hasChanges = true;
        }
        if (!areEqual(this.getHeightId1c(), sourceTire.getHeightId1c())) {
            this.setHeightId1c(sourceTire.getHeightId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getDiameter(), sourceTire.getDiameter())) {
            this.setDiameter(sourceTire.getDiameter());
            hasChanges = true;
        }
        if (!areEqual(this.getDiameterId1c(), sourceTire.getDiameterId1c())) {
            this.setDiameterId1c(sourceTire.getDiameterId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getDiameterOut(), sourceTire.getDiameterOut())) {
            this.setDiameterOut(sourceTire.getDiameterOut());
            hasChanges = true;
        }
        if (!areEqual(this.getDiameterOutId1c(), sourceTire.getDiameterOutId1c())) {
            this.setDiameterOutId1c(sourceTire.getDiameterOutId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getSeason(), sourceTire.getSeason())) {
            this.setSeason(sourceTire.getSeason());
            hasChanges = true;
        }
        if (!areEqual(this.getThorn(), sourceTire.getThorn())) {
            this.setThorn(sourceTire.getThorn());
            hasChanges = true;
        }
        if (!areEqual(this.getCategory(), sourceTire.getCategory())) {
            this.setCategory(sourceTire.getCategory());
            hasChanges = true;
        }
        if (!areEqual(this.getCategoryId1c(), sourceTire.getCategoryId1c())) {
            this.setCategoryId1c(sourceTire.getCategoryId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getHomologation(), sourceTire.getHomologation())) {
            this.setHomologation(sourceTire.getHomologation());
            hasChanges = true;
        }
        if (!areEqual(this.getTechnology(), sourceTire.getTechnology())) {
            this.setTechnology(sourceTire.getTechnology());
            hasChanges = true;
        }
        if (!areEqual(this.getSpeedIndex(), sourceTire.getSpeedIndex())) {
            this.setSpeedIndex(sourceTire.getSpeedIndex());
            hasChanges = true;
        }
        if (!areEqual(this.getSpeedIndexId1c(), sourceTire.getSpeedIndexId1c())) {
            this.setSpeedIndexId1c(sourceTire.getSpeedIndexId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getLoadIndex(), sourceTire.getLoadIndex())) {
            this.setLoadIndex(sourceTire.getLoadIndex());
            hasChanges = true;
        }
        if (!areEqual(this.getLoadIndexId1c(), sourceTire.getLoadIndexId1c())) {
            this.setLoadIndexId1c(sourceTire.getLoadIndexId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getAxis(), sourceTire.getAxis())) {
            this.setAxis(sourceTire.getAxis());
            hasChanges = true;
        }
        if (!areEqual(this.getAxisId1c(), sourceTire.getAxisId1c())) {
            this.setAxisId1c(sourceTire.getAxisId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getLayer(), sourceTire.getLayer())) {
            this.setLayer(sourceTire.getLayer());
            hasChanges = true;
        }
        if (!areEqual(this.getLayerId1c(), sourceTire.getLayerId1c())) {
            this.setLayerId1c(sourceTire.getLayerId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getProducer(), sourceTire.getProducer())) {
            this.setProducer(sourceTire.getProducer());
            hasChanges = true;
        }
        if (!areEqual(this.getProducerId1c(), sourceTire.getProducerId1c())) {
            this.setProducerId1c(sourceTire.getProducerId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getModel(), sourceTire.getModel())) {
            this.setModel(sourceTire.getModel());
            hasChanges = true;
        }
        if (!areEqual(this.getModelId1c(), sourceTire.getModelId1c())) {
            this.setModelId1c(sourceTire.getModelId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getOffRoad(), sourceTire.getOffRoad())) {
            this.setOffRoad(sourceTire.getOffRoad());
            hasChanges = true;
        }
        if (!areEqual(this.getHasTube(), sourceTire.getHasTube())) {
            this.setHasTube(sourceTire.getHasTube());
            hasChanges = true;
        }
        if (!areEqual(this.getRunFlat(), sourceTire.getRunFlat())) {
            this.setRunFlat(sourceTire.getRunFlat());
            hasChanges = true;
        }
        if (!areEqual(this.getHasRimTape(), sourceTire.getHasRimTape())) {
            this.setHasRimTape(sourceTire.getHasRimTape());
            hasChanges = true;
        }
        if (!areEqual(this.getWeight(), sourceTire.getWeight())) {
            this.setWeight(sourceTire.getWeight());
            hasChanges = true;
        }
        if (!areEqual(this.getDateUpdate(), sourceTire.getDateUpdate())) {
            this.setDateUpdate(sourceTire.getDateUpdate());
            hasChanges = true;
        }
        if (!areEqual(this.getOuterDiameter(), sourceTire.getOuterDiameter())) {
            this.setOuterDiameter(sourceTire.getOuterDiameter());
            hasChanges = true;
        }
        if (!areEqual(this.getOuterDiameterId1c(), sourceTire.getOuterDiameterId1c())) {
            this.setOuterDiameterId1c(sourceTire.getOuterDiameterId1c());
            hasChanges = true;
        }
        if (!areEqual(this.getTireType(), sourceTire.getTireType())) {
            this.setTireType(sourceTire.getTireType());
            hasChanges = true;
        }
        if (!areEqual(this.getTireConstruction(), sourceTire.getTireConstruction())) {
            this.setTireConstruction(sourceTire.getTireConstruction());
            hasChanges = true;
        }
        if (!areEqual(this.getPatternType(), sourceTire.getPatternType())) {
            this.setPatternType(sourceTire.getPatternType());
            hasChanges = true;
        }

        if (!areEqual(this.getApplying(), sourceTire.getApplying())) {
            this.setApplying(sourceTire.getApplying());
            hasChanges = true;
        }

        return hasChanges;
    }
}