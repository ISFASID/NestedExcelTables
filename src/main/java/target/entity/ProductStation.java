package target.entity;

import java.util.List;

public class ProductStation {

    private String stationName;

    private List<WasteWater> wasteWaters;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<WasteWater> getWasteWaters() {
        return wasteWaters;
    }

    public void setWasteWaters(List<WasteWater> wasteWaters) {
        this.wasteWaters = wasteWaters;
    }

    @Override
    public String toString() {
        return "ProductStation{" +
                "stationName='" + stationName + '\'' +
                ", wasteWaters=" + wasteWaters +
                '}';
    }
}
