package co.tests.main.POI.PollutantLineWasteWaterAttachedTable;

import co.tests.main.POI.PollutantLineWasteWaterAttachedTable.entity.Pollutant;
import co.tests.main.POI.PollutantLineWasteWaterAttachedTable.entity.ProductStation;
import co.tests.main.POI.PollutantLineWasteWaterAttachedTable.entity.ProductionLine;
import co.tests.main.POI.PollutantLineWasteWaterAttachedTable.entity.WasteWater;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CreateScheduleOne {

    private static final XSSFWorkbook wb = new XSSFWorkbook();
    private static final SetCellFontStyle setCellFontStyle = new SetCellFontStyle();
    private static final MergeCellStyle mergeCellStyle = new MergeCellStyle();

    private static List<ProductionLine> productionLines;
    private static List<ProductStation> productionStations;
    //    private static List<Pollutant> pollutants;
    private static List<WasteWater> wasteWaters;

//生成测试数据
    static{
//        wasteWaters = CreateEntityDatas.createWasteWaters(3);
//    productionStations = CreateEntityDatas.createProductionStations(3);
    productionLines = CreateEntityDatas.createProductionDatas(5);
    }
    /**
    * @Description: 生成列标题
    * @Param:
    * @return:
    * @Author: CreateScheduleOne
    * @Date: 2019/8/1
    */
    public XSSFWorkbook createFirstRowValue(){



        Sheet sheet = wb.createSheet();
        Row rowFirst = sheet.createRow(0);
        Row rowSecond = sheet.createRow(1);
        //首先设置前两行
        //第一行
        Cell firstRow = rowFirst.createCell(0);
        firstRow.setCellValue("附表一");
        CellStyle cellStyleFirstRow = wb.createCellStyle();
        setCellFontStyle.setCellWhiteStyle(cellStyleFirstRow);
        cellStyleFirstRow.setFont(setCellFontStyle.setCellFontrBold(wb));
        firstRow.setCellStyle(cellStyleFirstRow);
        mergeCellStyle.mergeFirstRow(sheet,0,0);

        //第二行
        rowSecond.setHeight((short)650);
        Cell secondRow = rowSecond.createCell(0);
        CellStyle secondRowCellStyle = wb.createCellStyle();
        setCellFontStyle.setCellCenter(secondRowCellStyle);
        setCellFontStyle.setCellWhiteStyle(secondRowCellStyle);
        secondRowCellStyle.setWrapText(true);
        secondRow.setCellValue("XXXX企业( )年度废水污染物产生情况表(生产线废水)\r\n(填报基准年为上一年度，参照附件2填报说明进行填报)");
        Font font = wb.createFont();
        font.setFontHeightInPoints((short)13);
        font.setBold(true);
        secondRowCellStyle.setFont(font);
        secondRow.setCellStyle(secondRowCellStyle);
        mergeCellStyle.mergeFirstRow(sheet,1,1);

        Row rowThird = sheet.createRow(2);
        Cell cellZero = rowThird.createCell(0);
        cellZero.setCellValue("序\r\n号");
        //边框加粗
        CellStyle cellStyle = wb.createCellStyle();
        setCellFontStyle.setCellBorderMedium(cellStyle);
        setCellFontStyle.setCellCenter(cellStyle);
        cellStyle.setFillForegroundColor(IndexedColors.WHITE.index);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setWrapText(true);
        //加粗
        Font boldFont = setCellFontStyle.setCellFontrBold(wb);

        //设置文字纵向排列
//        cellStyle.setRotation((short)255);
        cellZero.setCellStyle(cellStyle);
        sheet.setColumnWidth(0,255*3);




        Cell cellOne = rowThird.createCell(1);
        cellOne.setCellValue("生产线\r\n名称");
        cellStyle.setFont(boldFont);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellOne.setCellStyle(cellStyle);
        sheet.setColumnWidth(1,255*8);


        Cell cellTwo = rowThird.createCell(2);
        cellTwo.setCellValue("生产线\r\n编号");
        cellStyle.setFont(boldFont);
        cellTwo.setCellStyle(cellStyle);
        sheet.setColumnWidth(2,255*8);

        Cell cellThree = rowThird.createCell(3);
        cellThree.setCellValue("产品\r\n及产量");
        cellStyle.setFont(boldFont);
        cellThree.setCellStyle(cellStyle);
        sheet.setColumnWidth(3,255*10);

        Cell cellFour = rowThird.createCell(4);
        cellFour.setCellValue("生产废水\r\n工段");
        cellStyle.setFont(boldFont);
        cellFour.setCellStyle(cellStyle);
        sheet.setColumnWidth(4,255*14);

        Cell cellFive = rowThird.createCell(5);
        cellFive.setCellValue("废水\r\n名称");
        cellStyle.setFont(boldFont);
        cellFive.setCellStyle(cellStyle);
        sheet.setColumnWidth(5,255*10);

        Cell cellSix = rowThird.createCell(6);
        cellSix.setCellValue("废水\r\n量");
        cellStyle.setFont(boldFont);
        cellSix.setCellStyle(cellStyle);
        sheet.setColumnWidth(6,255*8);

        Cell cellSeven = rowThird.createCell(7);
        cellSeven.setCellValue("污染物\r\n名称");
        cellStyle.setFont(boldFont);
        cellSeven.setCellStyle(cellStyle);
        sheet.setColumnWidth(7,255*12);

        Cell cellEight = rowThird.createCell(8);
        cellEight.setCellValue("CAS号");
        cellStyle.setFont(boldFont);
        cellEight.setCellStyle(cellStyle);
        sheet.setColumnWidth(8,255*10);

        Cell cellNine = rowThird.createCell(9);
        cellNine.setCellValue("污染物\r\n产生量");
        cellStyle.setFont(boldFont);
        cellNine.setCellStyle(cellStyle);
        sheet.setColumnWidth(9,255*8);

        Cell cellTen = rowThird.createCell(10);
        cellTen.setCellValue("涉及车间及\r\n装置");
        cellStyle.setFont(boldFont);
        cellTen.setCellStyle(cellStyle);
        sheet.setColumnWidth(10,255*12);

        Cell cellEleven = rowThird.createCell(11);
        cellEleven.setCellValue("汇入企业最终排放口\r\n名称");
        cellStyle.setFont(boldFont);
        cellEleven.setCellStyle(cellStyle);
        sheet.setColumnWidth(11,255*10);

        Cell cellTwelve = rowThird.createCell(12);
        cellTwelve.setCellValue("排放口排污\r\n许可编号");
        cellStyle.setFont(boldFont);
        cellTwelve.setCellStyle(cellStyle);
        sheet.setColumnWidth(12,255*10);
        return wb;

    }



    //获取Sheet 暂时获取第一页
    static Sheet getSheet(){
        return wb.getSheetAt(0);
    }




    /**
    * 生成污染物表中数据
    * */
    public  void createPollutantExcelDatas(List<Pollutant> pollutants){
        Sheet sheet = getSheet();
        sheet.setDefaultRowHeight((short)300);
        CellStyle cellStyle = wb.createCellStyle();
        setCellFontStyle.setCellBorderThin(cellStyle);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        setCellFontStyle.setCellWhiteStyle(cellStyle);
        int len =  pollutants.size();
        for(int i = 0; i < len; i++){
            Row row = sheet.createRow(sheet.getLastRowNum() + 1);
            Cell cellEight = row.createCell(7);
            cellEight.setCellValue(pollutants.get(i).getPollutantName());
            cellEight.setCellStyle(cellStyle);

            Cell cellNine = row.createCell(8);
            cellNine.setCellValue(pollutants.get(i).getCASNumber());
            cellNine.setCellStyle(cellStyle);

            Cell cellTen = row.createCell(9);
            cellTen.setCellValue(pollutants.get(i).getPollutantProduction());
            cellTen.setCellStyle(cellStyle);
        }
    }


    /** 
    * 从废水开始嵌套生成表中数据
    * @Param:  
    * @return:  
    * @Author: CreateScheduleOne
    * @Date: 2019/8/1 
    */ 
    public void createWasteWaterExcelDatas(final List<WasteWater> waters){
        
        Sheet sheet = getSheet();
        sheet.setDefaultRowHeight((short)200);
        int len = waters.size();
        int pollutantCount = 0;
        CellStyle cellStyleMerge = wb.createCellStyle();
        setCellFontStyle.setCellCenter(cellStyleMerge);
        setCellFontStyle.setCellWhiteStyle(cellStyleMerge);
        for(int i = 0; i < len; i++){
            //首先生成废水类中的污染物数据
            createPollutantExcelDatas(waters.get(i).getPollutants());
            pollutantCount = waters.get(i).getPollutants().size();
            int lastRow = sheet.getLastRowNum();
            System.out.println(sheet.getLastRowNum());
            Row row = null;
            if(pollutantCount == 1){
                 row = sheet.getRow(lastRow);
            }
            else if(pollutantCount == 0){
                row = sheet.createRow(lastRow + 1);
            }
            else{
                 row = sheet.getRow(lastRow - pollutantCount + 1);
            }

            Cell cellFive = row.createCell(5);
            cellFive.setCellValue(waters.get(i).getWastWaterName());
            cellFive.setCellStyle(cellStyleMerge);

            Cell cellSix = row.createCell(6);
            cellSix.setCellValue(waters.get(i).getWastWaterProduction());
            cellSix.setCellStyle(cellStyleMerge);

            Cell cellTen = row.createCell(10);
            cellTen.setCellValue(waters.get(i).getWorkShopAndEquipment());
            cellTen.setCellStyle(cellStyleMerge);


            Cell cellEleven = row.createCell(11);
            cellEleven.setCellValue(waters.get(i).getFinalOutLetName());
            cellEleven.setCellStyle(cellStyleMerge);


            Cell cellTwelve = row.createCell(12);
            cellTwelve.setCellValue(waters.get(i).getLicenseNumber());
            cellTwelve.setCellStyle(cellStyleMerge);

            if(pollutantCount != 1) {
                mergeCellStyle.mergeWastWater(sheet, lastRow - pollutantCount + 1, sheet.getLastRowNum());
            }
            else{
                CellStyle cellStyle = wb.createCellStyle();
                setCellFontStyle.setCellBorderThin(cellStyle);
                cellStyle.setAlignment(HorizontalAlignment.CENTER);

                cellFive.setCellStyle(cellStyle);
                cellSix.setCellStyle(cellStyle);
                cellTen.setCellStyle(cellStyle);
                cellEleven.setCellStyle(cellStyle);
                cellTwelve.setCellStyle(cellStyle);
            }
        }
    }


    /**
    * 从工段数据开始嵌套生成
    * @Param: null
    * @return:
    * @Author: CreateScheduleOne
    * @Date: 2019/8/1
    */
    public void createProductStationExcelDatas(List<ProductStation> productStations){
        Sheet sheet = getSheet();
        int len = productStations.size();
        sheet.setDefaultRowHeight((short)150);
        int currentLastRow = 0;
        int fillValueRow = sheet.getLastRowNum() + 1;

        CellStyle cellStyleMerge = wb.createCellStyle();
        setCellFontStyle.setCellCenter(cellStyleMerge);

        setCellFontStyle.setCellWhiteStyle(cellStyleMerge);
        for(int i = 0; i < len; i++){
            createWasteWaterExcelDatas(productStations.get(i).getWasteWaters());
//          System.err.println(sheet.getLastRowNum());
            currentLastRow = sheet.getLastRowNum();
            Row row = sheet.getRow(fillValueRow);

            Cell cellFour = row.createCell(4);
            cellFour.setCellValue(productStations.get(i).getStationName());
            cellFour.setCellStyle(cellStyleMerge);
            row.setHeight((short)250);
            if(currentLastRow != fillValueRow){
                mergeCellStyle.mergeProductStation(sheet, fillValueRow, currentLastRow);
            }else{
                CellStyle cellStyle = wb.createCellStyle();
                setCellFontStyle.setCellBorderThin(cellStyle);
                cellStyle.setAlignment(HorizontalAlignment.CENTER);
                cellFour.setCellStyle(cellStyle);
            }
            fillValueRow = currentLastRow + 1;
        }
    }

    /**
     * 从生产线开始生成表中内容
     *
     */
    public void createProductLineExcelDatas(){
        Sheet sheet = getSheet();
        int len = productionLines.size();

        int currentLastRow = 0;

        int fillValueRow = 3;
        CellStyle cellStyleMerge = wb.createCellStyle();
        setCellFontStyle.setCellCenter(cellStyleMerge);
        setCellFontStyle.setCellWhiteStyle(cellStyleMerge);
        for(int i = 0; i < len; i++){
            createProductStationExcelDatas(productionLines.get(i).getProductStations());
            currentLastRow = sheet.getLastRowNum();
            Row row = sheet.getRow(fillValueRow);
            Cell cellZero = row.createCell(0);
            cellZero.setCellValue(productionLines.get(i).getId());
            cellZero.setCellStyle(cellStyleMerge);

            Cell cellOne = row.createCell(1);
            cellOne.setCellValue(productionLines.get(i).getProductionLineName());
            cellOne.setCellStyle(cellStyleMerge);

            Cell cellTwo = row.createCell(2);
            cellTwo.setCellValue(productionLines.get(i).getProductionLineNumber());
            cellTwo.setCellStyle(cellStyleMerge);

            Cell cellThree = row.createCell(3);
            cellThree.setCellValue(productionLines.get(i).getProductAndyield());
            CellStyle cellThreeStyle = cellStyleMerge;
            cellThreeStyle.setWrapText(true);
            cellThree.setCellStyle(cellThreeStyle);

            if(currentLastRow != fillValueRow){
                mergeCellStyle.mergeProductLine(sheet, fillValueRow, currentLastRow);
            }else{
                CellStyle cellStyle = wb.createCellStyle();
                setCellFontStyle.setCellBorderThin(cellStyle);
                cellZero.setCellStyle(cellStyle);
                cellOne.setCellStyle(cellStyle);
                cellTwo.setCellStyle(cellStyle);
                cellThree.setCellStyle(cellStyle);
            }
            fillValueRow = currentLastRow + 1;

        }
    }


    /**
     * 在表首部插入两行生成文本标题
     */
    public void createTextHeadLine(){
        Sheet sheet = wb.getSheetAt(0);
        sheet.shiftRows(0,0,1);
    }


    /**
    * 写出excel表格
    * @Param:
    * @return:
    * @Author: CreateScheduleOne
    * @Date: 2019/8/1
    */
    public boolean WriteOut(String path){
        File file = new File(path);
        FileOutputStream out = null;
        try{
            System.out.println("开始生成"+file.getPath()+file.getName());
            out = new FileOutputStream(file);
            this.wb.write(out);
            return true;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                System.out.println("结束生成"+file.getPath()+file.getName());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}
