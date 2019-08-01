package co.tests.main.POI.target;

import co.tests.main.POI.target.entity.Pollutant;
import co.tests.main.POI.target.entity.ProductStation;
import co.tests.main.POI.target.entity.ProductionLine;
import co.tests.main.POI.target.entity.WasteWater;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateEntityDatas {

    /**
     *  生产线数据
     */

    public static List<ProductionLine> createProductionDatas(int count){
        ArrayList<ProductionLine> productionLines = new ArrayList<>();
        while(count != 0){
            String num = String.valueOf(count);
            ProductionLine productionLine = new ProductionLine();
            productionLine.setId(num);
            productionLine.setProductionLineName(num+"生产线名称");
            productionLine.setProductionLineNumber(num+"生产线编号");
            productionLine.setProductAndyield(num+"产品及产量"+"\r\n"+"asdasdasdasdadadadasdasdasdasdad");
            productionLine.setProductStations(createProductionStations(count));
            productionLines.add(productionLine);
            count--;
        }
        return productionLines;
    }

    /**
     * 工段数据
     * @param count
     * @return
     */
    public static  List<ProductStation> createProductionStations(int count){
        ArrayList<ProductStation> productStations = new ArrayList<>();
        while(count != 0){
            Random random = new Random();
            String num = String.valueOf(count);
            ProductStation productStation = new ProductStation();
            productStation.setStationName("工段名称"+num);
            productStation.setWasteWaters(createWasteWaters(random.nextInt(3) + 1));
            productStations.add(productStation);
            count--;
        }
        return productStations;
    }

    /**
     * 废水数据
     * @param count
     * @return
     */
    public static List<WasteWater> createWasteWaters(int count){
        ArrayList<WasteWater> wasteWaters = new ArrayList<>();
        while(count != 0){
            Random random = new Random();
           String num = String.valueOf(count);
           WasteWater wasteWater = new WasteWater();
            //废水名称
           wasteWater.setWastWaterName("废水名称"+num);
           //废水量
           wasteWater.setWastWaterProduction("废水量"+num);
           //涉及车间及装置
           wasteWater.setWorkShopAndEquipment("车间"+num+"装置"+num);
            //汇入企业最终排放口名称
           wasteWater.setFinalOutLetName("排放口"+num);
            //排放口排污许可编号
           wasteWater.setLicenseNumber("许可编号"+num);
           wasteWater.setPollutants(createPollutants(random.nextInt(2)+ 1));
           wasteWaters.add(wasteWater);
           count--;
        }
        return wasteWaters;
    }

    /**
     * 污染物数据
     * @param count
     * @return
     */
    public static List<Pollutant> createPollutants(int count){
        ArrayList<Pollutant> pollutants = new ArrayList<>();
        while(count != 0){
            String num = String.valueOf(count);
            Pollutant pollutant = new Pollutant();
            pollutant.setPollutantName("污染物名称"+num);
            pollutant.setCASNumber("CAS号码"+num);
            pollutant.setPollutantProduction(num+" t/a");
            pollutants.add(pollutant);
            count --;
        }
        return pollutants;
    }

}
