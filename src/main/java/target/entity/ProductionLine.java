package target.entity;

import java.util.List;

public class ProductionLine {

    private String id;
    private String productionLineName;
    private String productionLineNumber;
    private String productAndyield;
    private List<ProductStation> productStations;

    public List<ProductStation> getProductStations() {
        return productStations;
    }

    public void setProductStations(List<ProductStation> productStations) {
        this.productStations = productStations;
    }

    public String getProductionLineNumber() {
        return productionLineNumber;
    }

    public void setProductionLineNumber(String productionLineNumber) {
        this.productionLineNumber = productionLineNumber;
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

    public String getProductAndyield() {
        return productAndyield;
    }

    public void setProductAndyield(String productAndyield) {
        this.productAndyield = productAndyield;
    }


    @Override
    public String toString() {
        return "ProductionLine{" +
                "id='" + id + '\'' +
                ", productionLineName='" + productionLineName + '\'' +
                ", productionLineNumber='" + productionLineNumber + '\'' +
                ", productAndyield='" + productAndyield + '\'' +
                ", productStations=" + productStations +
                '}';
    }
}
