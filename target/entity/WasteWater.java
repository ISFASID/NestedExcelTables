package co.tests.main.POI.target.entity;

import java.util.List;

public class WasteWater {
    private String wastWaterName;

    private String wastWaterProduction;

    private String workShopAndEquipment;

    private String finalOutLetName;

    private String licenseNumber;

    private List<Pollutant> pollutants;

    public List<Pollutant> getPollutants() {
        return pollutants;
    }

    public void setPollutants(List<Pollutant> pollutants) {
        this.pollutants = pollutants;
    }

    public String getWastWaterName() {
        return wastWaterName;
    }

    public void setWastWaterName(String wastWaterName) {
        this.wastWaterName = wastWaterName;
    }

    public String getWastWaterProduction() {
        return wastWaterProduction;
    }

    public void setWastWaterProduction(String wastWaterProduction) {
        this.wastWaterProduction = wastWaterProduction;
    }

    public String getWorkShopAndEquipment() {
        return workShopAndEquipment;
    }

    public void setWorkShopAndEquipment(String workShopAndEquipment) {
        this.workShopAndEquipment = workShopAndEquipment;
    }

    public String getFinalOutLetName() {
        return finalOutLetName;
    }

    public void setFinalOutLetName(String finalOutLetName) {
        this.finalOutLetName = finalOutLetName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "WasteWater{" +
                "wastWaterName='" + wastWaterName + '\'' +
                ", wastWaterProduction='" + wastWaterProduction + '\'' +
                ", workShopAndEquipment='" + workShopAndEquipment + '\'' +
                ", finalOutLetName='" + finalOutLetName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", pollutants=" + pollutants +
                '}';
    }
}
