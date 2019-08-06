package co.tests.main.POI.TheMaterialAttachedTable;

import cn.hutool.core.util.RandomUtil;
import co.tests.main.POI.TheMaterialAttachedTable.Entity.Production;
import co.tests.main.POI.TheMaterialAttachedTable.Entity.ProductionLine;
import co.tests.main.POI.TheMaterialAttachedTable.Entity.RawMaterial;

import java.util.List;

/**
 * 1.生成表头
 * 2.设计每列表头
 * 3.每个生产线对应多个产品和原辅料
 * 每个产品包含多个字段、原辅料同理
 * 产品包含纯物质与混合物
 * 混合物包含多种物质 需要根据这个合并(详情见年度废料填报原型图)
 * 原辅料同理
 *
 * 方法必须按顺序执行，否则报错
 */
public class SixMain {

    //首先从生产线中抽离这两个集合写入到excel 在合并，然后循环生产线集合
    public static void main(String[] args) {
            for(int k = 0; k <= 20 ; k++) {
                CreateDatas createDatas = new CreateDatas();
                List<ProductionLine> productionLines = createDatas.createProductionLineDatas(RandomUtil.randomInt(3,7));
                List<Production> productions1 = createDatas.createProductionDatas(5);
                List<Production> productions2 = createDatas.createProductionDatas(5);
                CreateScheduleSix createScheduleSix = new CreateScheduleSix();
                //首先生成前两行
                createScheduleSix.createTitle();
                //生成列标题
                createScheduleSix.createColumnHead();
                //某些单元格样式有问题，单独设置下
                createScheduleSix.setFourthRowStyle();
                //填充产品数据\
                for (int i = 0; i < productionLines.size(); i++) {

                    createScheduleSix.fillProductionDatas(productionLines.get(i).getProductions());

                    createScheduleSix.fillRawMaterialDatas(productionLines.get(i).getRawMaterials());

                    createScheduleSix.fillProductionLinesDatas(productionLines.get(i));
                }

                createScheduleSix.createSignRow();

                createScheduleSix.WriteExcel("C:\\Users\\Administrator\\Desktop\\ttttest\\test"+k+".xlsx");
            }

    }

}
