package co.tests.main.POI.TheMaterialAttachedTable.Entity;

public class RawMaterialMixture {
    private String matter;
    private String CASNumber;
    private String activeOutput;

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public String getCASNumber() {
        return CASNumber;
    }

    public void setCASNumber(String CASNumber) {
        this.CASNumber = CASNumber;
    }

    public String getActiveOutput() {
        return activeOutput;
    }

    public void setActiveOutput(String activeOutput) {

        this.activeOutput = activeOutput;
    }

    @Override
    public String toString() {
        return "RawMaterialMixture{" +
                "matter='" + matter + '\'' +
                ", CASNumber='" + CASNumber + '\'' +
                ", activeOutput='" + activeOutput + '\'' +
                '}';
    }
}

