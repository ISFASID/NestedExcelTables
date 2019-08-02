package co.tests.main.POI.PollutantLineWasteWaterAttachedTable.entity;

public class Pollutant {

    private String pollutantName;

    private String CASNumber;

    private String pollutantProduction;


    public String getPollutantName() {
        return pollutantName;
    }

    public void setPollutantName(String pollutantName) {
        this.pollutantName = pollutantName;
    }

    public String getCASNumber() {
        return CASNumber;
    }

    public void setCASNumber(String CASNumber) {
        this.CASNumber = CASNumber;
    }

    public String getPollutantProduction() {
        return pollutantProduction;
    }

    public void setPollutantProduction(String pollutantProduction) {
        this.pollutantProduction = pollutantProduction;
    }

    @Override
    public String toString() {
        return "Pollutant{" +
                "pollutantName='" + pollutantName + '\'' +
                ", CASNumber='" + CASNumber + '\'' +
                ", pollutantProduction='" + pollutantProduction + '\'' +
                '}';
    }
}
