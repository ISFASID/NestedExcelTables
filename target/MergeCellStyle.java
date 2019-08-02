package co.tests.main.POI.PollutantLineWasteWaterAttachedTable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class MergeCellStyle {

    private static final SetCellFontStyle setCellFontStyle = new SetCellFontStyle();


    /**
     * 设置表头样式
     * @param sheet
     * @param fr
     * @param lr
     * @param fc
     * @param lc
     */
    public void  firstLayerNest(Sheet sheet, int fr, int lr, int fc, int lc){
        CellRangeAddress cellRangeAddress = new CellRangeAddress(1,4,0,0);
        sheet.addMergedRegion(cellRangeAddress);
    }

    /**
     * 合并废水类属性单元格，并设置样式
     * @param sheet
     * @param fr
     * @param lr
     */
    public void mergeWastWater(Sheet sheet,int fr,int lr){
        CellRangeAddress wastWaterNameRegion = new CellRangeAddress(fr,lr,5,5);
        CellRangeAddress wastWaterProductionRegion = new CellRangeAddress(fr,lr,6,6);
        CellRangeAddress workShopAndEquipmentRegion = new CellRangeAddress(fr,lr,10,10);
        CellRangeAddress finalOutLetNameRegion = new CellRangeAddress(fr,lr,11,11);
        CellRangeAddress licenseNumberRegion = new CellRangeAddress(fr,lr,12,12);

            sheet.addMergedRegion(wastWaterNameRegion);
            setCellFontStyle.setMergeCellThin(wastWaterNameRegion,sheet);


            sheet.addMergedRegion(wastWaterProductionRegion);
            setCellFontStyle.setMergeCellThin(wastWaterProductionRegion,sheet);


            sheet.addMergedRegion(workShopAndEquipmentRegion);
            setCellFontStyle.setMergeCellThin(workShopAndEquipmentRegion,sheet);


            sheet.addMergedRegion(finalOutLetNameRegion);
            setCellFontStyle.setMergeCellThin(finalOutLetNameRegion,sheet);


            sheet.addMergedRegion(licenseNumberRegion);
            setCellFontStyle.setMergeCellThin(licenseNumberRegion,sheet);

    }
    
    /** 
    *  合并工段，并设置样式
    * @Param:  
    * @return:  
    * @Author: MergeCellStyle
    * @Date: 2019/8/1 
    */ 
    public void mergeProductStation(Sheet sheet,int fr,int lr){
        CellRangeAddress stationNameRegion = new CellRangeAddress(fr,lr,4,4);
        sheet.addMergedRegion(stationNameRegion);
        setCellFontStyle.setMergeCellThin(stationNameRegion,sheet);
    }

    /**
     * 合并生产线，并设置样式
     * @param sheet
     * @param fr
     * @param lr
     */
    public void mergeProductLine(Sheet sheet,int fr,int lr){
        CellRangeAddress productionLineId = new CellRangeAddress(fr,lr,0,0);
        sheet.addMergedRegion(productionLineId);
        setCellFontStyle.setMergeCellThin(productionLineId,sheet);

        CellRangeAddress productionLineName = new CellRangeAddress(fr,lr,1,1);
        sheet.addMergedRegion(productionLineName);
        setCellFontStyle.setMergeCellThin(productionLineName,sheet);

        CellRangeAddress productionLineNumber = new CellRangeAddress(fr,lr,2,2);
        sheet.addMergedRegion(productionLineNumber);
        setCellFontStyle.setMergeCellThin(productionLineNumber,sheet);

        CellRangeAddress productAndyield = new CellRangeAddress(fr,lr,3,3);
        sheet.addMergedRegion(productAndyield);
        setCellFontStyle.setMergeCellThin(productAndyield,sheet);
    }

    /**
     * 合并第一\二行并设置边框
     * @param sheet
     * @param fr
     * @param lr
     */
    public void mergeFirstRow(Sheet sheet,int fr,int lr){
        CellRangeAddress firstRow = new CellRangeAddress(fr,lr,0,12);
        sheet.addMergedRegion(firstRow);
        setCellFontStyle.setMergeCellBold(firstRow,sheet);
    }

}
