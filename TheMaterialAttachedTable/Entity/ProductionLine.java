package co.tests.main.POI.TheMaterialAttachedTable.Entity;

import java.util.List;

public class ProductionLine {
    private String id;
    private String productionLineName;
    private String productionNumber;
    private List<Production> productions;
    private List<RawMaterial> rawMaterials;

    public List<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }

    public void setRawMaterials(List<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public List<Production> getProductions() {
        return productions;
    }

    public void setProductions(List<Production> productions) {
        this.productions = productions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductionLineName() {
        return productionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        this.productionLineName = productionLineName;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    @Override
    public String toString() {
        return "ProductionLine{" +
                "id='" + id + '\'' +
                ", productionLineName='" + productionLineName + '\'' +
                ", productionNumber='" + productionNumber + '\'' +
                ", productions=" + productions +
                ", rawMaterials=" + rawMaterials +
                '}';
    }
}
