package co.tests.main.POI.TheMaterialAttachedTable.Entity;

import java.util.List;

public class Production {

    private String productionName;
    private String CASNumber;
    private String designProductionCapacity;
    private String activeOutput;
    private List<ProductionMixture> productionMixtures;

    public List<ProductionMixture> getProductionMixtures() {
        return productionMixtures;
    }

    public void setProductionMixtures(List<ProductionMixture> productionMixtures) {
        this.productionMixtures = productionMixtures;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getCASNumber() {
        return CASNumber;
    }

    public void setCASNumber(String CASNumber) {
        this.CASNumber = CASNumber;
    }

    public String getDesignProductionCapacity() {
        return designProductionCapacity;
    }

    public void setDesignProductionCapacity(String designProductionCapacity) {
        this.designProductionCapacity = designProductionCapacity;
    }

    public String getActiveOutput() {
        return activeOutput;
    }

    public void setActiveOutput(String activeOutput) {


        this.activeOutput = activeOutput;
    }


    @Override
    public String toString() {
        return "Production{" +
                "productionName='" + productionName + '\'' +
                ", CASNumber='" + CASNumber + '\'' +
                ", designProductionCapacity='" + designProductionCapacity + '\'' +
                ", activeOutput='" + activeOutput + '\'' +
                ", productionMixtures=" + productionMixtures +
                '}';
    }
}
