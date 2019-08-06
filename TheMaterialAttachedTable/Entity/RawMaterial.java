package co.tests.main.POI.TheMaterialAttachedTable.Entity;

import java.util.List;

public class RawMaterial {

    private String rawMaterialName;
    private String CASNumber;
    private String activeOutput;
    private List<RawMaterialMixture> rawMaterialMixtures;

    public List<RawMaterialMixture> getRawMaterialMixtures() {
        return rawMaterialMixtures;
    }

    public void setRawMaterialMixtures(List<RawMaterialMixture> rawMaterialMixtures) {
        this.rawMaterialMixtures = rawMaterialMixtures;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
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
        return "RawMaterial{" +
                "rawMaterialName='" + rawMaterialName + '\'' +
                ", CASNumber='" + CASNumber + '\'' +
                ", activeOutput='" + activeOutput + '\'' +
                ", rawMaterialMixtures=" + rawMaterialMixtures +
                '}';
    }
}
