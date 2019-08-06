package co.tests.main.POI.TheMaterialAttachedTable;

import cn.hutool.core.util.RandomUtil;
import co.tests.main.POI.TheMaterialAttachedTable.Entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 生成测试数据
 */
public class CreateDatas {


    /**
     * 生成生产线集合
     * 传递count会自动生成相关联的数据
     * @param count
     * @return
     */
    public  List<ProductionLine> createProductionLineDatas(int count){
        ArrayList<ProductionLine> productionLines = new ArrayList<>();
        while(count != 0){
            ProductionLine productionLine = new ProductionLine();
            productionLine.setId(String.valueOf(count));
            productionLine.setProductionLineName("生产线\r\n名称"+count);
            productionLine.setProductionNumber("生产线\r\n编号"+count);
            productionLine.setProductions(createProductionDatas(RandomUtil.randomInt(1,5)));
            productionLine.setRawMaterials(createRawMaterialDatas(RandomUtil.randomInt(1,5)));
            productionLines.add(productionLine);
            count--;
        }
        return productionLines;
    }

    /**
     * 产品数据集合
     * @param count
     * @return
     */
    public  List<Production> createProductionDatas(int count){
        ArrayList<Production> productions = new ArrayList<>();
        while(count != 0){
            Production production = new Production();
            production.setProductionMixtures(createProductionMixtureDatas(RandomUtil.randomInt(0,8)));
            production.setProductionName("产品名称"+count);
            if(production.getProductionMixtures().size() == 0 || production.getProductionMixtures().size() == 1)
                production.setProductionName(production.getProductionName()+"\r\n(纯物质)");
            else
                production.setProductionName(production.getProductionName()+"\r\n(混合物)");
            production.setCASNumber("产品\r\ncas号"+count);
            production.setDesignProductionCapacity("设计\r\n产能"+count);
            production.setActiveOutput("实际\r\n产量"+count);
            productions.add(production);
            count--;
        }
        return productions;
    }

    /**
     * 产品混合物数据集合
     * @param count
     * @return
     */
    public  List<ProductionMixture> createProductionMixtureDatas(int count){
        ArrayList<ProductionMixture> productionMixtures = new ArrayList<>();
        while(count > 0){
            ProductionMixture productionMixture = new ProductionMixture();
            productionMixture.setMatter("物质"+count);
            productionMixture.setCASNumber("cas号物质\r\n(混合物)"+count);
            productionMixture.setDesignProductionCapacity("设计产能物质\r\n(混合物)"+count);
            productionMixture.setActiveOutput("实际产量\r\n物质(混合物)"+count);
            productionMixtures.add(productionMixture);
            count--;
        }
        return productionMixtures;
    }

    /**
     * 原辅料数据集合
     * @param count
     * @return
     */
    public  List<RawMaterial> createRawMaterialDatas(int count){
        ArrayList<RawMaterial> rawMaterials = new ArrayList<>();
        while(count != 0){
            RawMaterial rawMaterial = new RawMaterial();
            rawMaterial.setRawMaterialMixtures(createRawMaterialMixture(RandomUtil.randomInt(0,8)));
            rawMaterial.setRawMaterialName("原辅料\r\n名称"+count);
            if(rawMaterial.getRawMaterialMixtures().size() == 0 || rawMaterial.getRawMaterialMixtures().size() == 1)
                rawMaterial.setRawMaterialName(rawMaterial.getRawMaterialName()+"\r\n(纯物质)");
            else
                rawMaterial.setRawMaterialName(rawMaterial.getRawMaterialName()+"\r\n(混合物)");
            rawMaterial.setCASNumber("原辅\r\n料cas号"+count);
            rawMaterial.setActiveOutput("原辅料\r\n实际用量"+count);
            rawMaterials.add(rawMaterial);
            count --;
        }
        return rawMaterials;
    }

    /**
     * 原辅料混合物集合
     * @param count
     * @return
     */
    public  List<RawMaterialMixture> createRawMaterialMixture(int count){
        ArrayList<RawMaterialMixture> rawMaterialMixtures = new ArrayList<>();
        while(count-- != 0){
            RawMaterialMixture rawMaterialMixture = new RawMaterialMixture();
            rawMaterialMixture.setMatter("物质"+count);
            rawMaterialMixture.setCASNumber("cas号\r\n(混合物)"+count);
            rawMaterialMixture.setActiveOutput("实际用量\r\n(混合物)"+count);
            rawMaterialMixtures.add(rawMaterialMixture);
        }
        return rawMaterialMixtures;
    }


}
