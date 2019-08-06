package co.tests.main.POI.TheMaterialAttachedTable.Entity;

public class ProductionMixture {
    private String matter;
    private String CASNumber;
    private String designProductionCapacity;
    private String activeOutput;

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

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }


    @Override
    public String toString() {
        return "ProductionMixture{" +
                "matter='" + matter + '\'' +
                ", CASNumber='" + CASNumber + '\'' +
                ", designProductionCapacity='" + designProductionCapacity + '\'' +
                ", activeOutput='" + activeOutput + '\'' +
                '}';
    }
}
