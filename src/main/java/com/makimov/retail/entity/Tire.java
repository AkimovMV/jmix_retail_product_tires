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

    @Column(name = "WIDTH", nullable = false, length = 50)
    @NotNull
    private String width;

    @Column(name = "WIDTH_ID_1C", nullable = false)
    @NotNull
    private Integer widthId1c;

    @Column(name = "HEIGHT", nullable = false, length = 50)
    @NotNull
    private String height;

    @Column(name = "HEIGHT_ID_1C", nullable = false)
    @NotNull
    private Integer heightId1c;

    @Column(name = "DIAMETER", nullable = false, length = 50)
    @NotNull
    private String diameter;

    @Column(name = "DIAMETER_ID_1C", nullable = false)
    @NotNull
    private Integer diameterId1c;

    @Column(name = "DIAMETER_OUT", length = 50)
    private String diameterOut;

    @Column(name = "DIAMETER_OUT_ID_1C", nullable = false)
    @NotNull
    private Integer diameterOutId1c;

    @Column(name = "SEASON", nullable = false, length = 50)
    @NotNull
    private String season;

    @Column(name = "THORN", nullable = false)
    @NotNull
    private Boolean thorn = false;

    @Column(name = "CATEGORY", nullable = false)
    @NotNull
    private String category;

    @Column(name = "CATEGORY_ID_1C", nullable = false)
    @NotNull
    private Integer categoryId1c;

    @Column(name = "HOMOLOGATION", nullable = false, length = 50)
    @NotNull
    private String homologation;

    @Column(name = "TECHNOLOGY", nullable = false, length = 50)
    @NotNull
    private String technology;

    @Column(name = "SPEED_INDEX", nullable = false)
    @NotNull
    private Integer speedIndex;

    @Column(name = "SPEED_INDEX_ID_1C", nullable = false)
    @NotNull
    private Integer speedIndexId1c;

    @Column(name = "LOAD_INDEX", nullable = false, length = 50)
    @NotNull
    private String loadIndex;

    @Column(name = "LOAD_INDEX_ID_1C", nullable = false)
    @NotNull
    private Integer loadIndexId1c;

    @Column(name = "AXIS", nullable = false, length = 50)
    @NotNull
    private String axis;

    @Column(name = "AXIS_ID_1C", nullable = false)
    @NotNull
    private Integer axisId1c;

    @Column(name = "LAYER", nullable = false, length = 50)
    @NotNull
    private String layer;

    @Column(name = "LAYER_ID_1C")
    private Integer layerId1c;

    @Column(name = "PRODUCER", nullable = false, length = 50)
    @NotNull
    private String producer;

    @Column(name = "PRODUCER_ID_1C", nullable = false)
    @NotNull
    private Integer producerId1c;

    @Column(name = "MODEL", nullable = false, length = 50)
    @NotNull
    private String model;

    @Column(name = "MODEL_ID_1C")
    private Integer modelId1c;

    @Column(name = "OFF_ROAD", nullable = false)
    @NotNull
    private Boolean offRoad = false;

    @NotNull
    @Column(name = "HAS_TUBE", nullable = false)
    private Boolean hasTube = false;

    @Column(name = "RUN_FLAT", nullable = false)
    @NotNull
    private Boolean runFlat = false;

    @Column(name = "HAS_RIM_TAPE", nullable = false)
    @NotNull
    private Boolean hasRimTape = false;

    @Column(name = "WEIGHT", nullable = false)
    @NotNull
    private Float weight;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATE", nullable = false)
    @NotNull
    private Date dateUpdate;

    @Column(name = "OUTER_DIAMETER", nullable = false, length = 50)
    @NotNull
    private String outerDiameter;

    @Column(name = "OUTER_DIAMETER_ID_1C", nullable = false)
    @NotNull
    private Integer outerDiameterId1c;

    @Column(name = "TIRE_TYPE", nullable = false, length = 50)
    @NotNull
    private String tireType;

    @Column(name = "TIRE_CONSTRUCTION", nullable = false, length = 50)
    @NotNull
    private String tireConstruction;

    @Column(name = "PATTERN_TYPE", nullable = false)
    @NotNull
    private String patternType;

    @Column(name = "APPLYING", nullable = false, length = 150)
    @NotNull
    private String applying;

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

    public Integer getSpeedIndex() {
        return speedIndex;
    }

    public void setSpeedIndex(Integer speedIndex) {
        this.speedIndex = speedIndex;
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

}