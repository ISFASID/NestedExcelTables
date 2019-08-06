package co.tests.main.POI.TheMaterialAttachedTable;

import co.tests.main.POI.TheMaterialAttachedTable.Entity.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CreateScheduleSix {
    private   ScheduleSixStyle scheduleSixStyle = new ScheduleSixStyle();
    private   XSSFWorkbook wb = new XSSFWorkbook();
    //原辅料开始添加数据行数(当前行数索引)
    public int rawMaterialNumberber = 5;
    //产品开始添加数据行数(当前行数索引)
    public int productionNumber = 5;
    //产线开始合并数据行数
    public int productionLineNumber = 5;
    /**
     * 头部设计
     */
    public void createTitle(){
        //第一行
        Sheet sheet = wb.createSheet();
        Row firstRow = sheet.createRow(0);
        Cell firstRowFirstCell = firstRow.createCell(0);
        CellStyle firstRowFirstCellStyle = wb.createCellStyle();
        firstRowFirstCell.setCellValue("附表6");
        scheduleSixStyle.setWordFontBold(firstRowFirstCellStyle,wb);
        firstRowFirstCell.setCellStyle(firstRowFirstCellStyle);
        CellRangeAddress firRowRange = new CellRangeAddress(0,0,0,11);
        scheduleSixStyle.mergeTitleOnce(sheet,firRowRange);
        scheduleSixStyle.setBorderByMergeBold(firRowRange,sheet);
        //第二行
        Row secondRow = sheet.createRow(1);
        secondRow.setHeight((short)650);
        Cell secondRowFirstCell = secondRow.createCell(0);
        CellStyle secondRowFirstCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(secondRowFirstCellStyle,wb);
        scheduleSixStyle.setCellHorizontalCentering(secondRowFirstCellStyle);
        CellRangeAddress secondRowRange = new CellRangeAddress(1,1,0,11);
        scheduleSixStyle.mergeTitleOnce(sheet,secondRowRange);
        scheduleSixStyle.setBorderByMergeBold(secondRowRange,sheet);

        secondRowFirstCellStyle.setWrapText(true);
        secondRowFirstCell.setCellStyle(secondRowFirstCellStyle);
        secondRowFirstCell.setCellValue("XXX企业( )年度物料情况表\r\n(填报基准年为上一年度，参照附件2填报说明进行填报)");

    }


    /**
     * 标题设计
     */
    public void createColumnHead(){
        Sheet sheet = wb.getSheetAt(0);
        //从表中第三行开始设计标题
        Row row = sheet.createRow(2);

        Cell cellOne = row.createCell(0);
        CellStyle cellStyleOne = wb.createCellStyle();
        cellOne.setCellValue("序号");
        cellStyleOne.setRotation((short)255);
        scheduleSixStyle.setWordFontBold(cellStyleOne,wb);
        scheduleSixStyle.setWordCenter(cellStyleOne);
        cellOne.setCellStyle(cellStyleOne);
        sheet.setColumnWidth(0,255*3);


        Cell cellTwo = row.createCell(1);
        CellStyle cellStyleTwo = wb.createCellStyle();
        cellTwo.setCellValue("生产线\r\n名称");
        scheduleSixStyle.setWordFontBold(cellStyleTwo,wb);
        scheduleSixStyle.setWordCenter(cellStyleTwo);
        cellStyleTwo.setWrapText(true);
        cellTwo.setCellStyle(cellStyleTwo);
        sheet.setColumnWidth(1,255*8);


        Cell cellThree = row.createCell(2);
        CellStyle cellStyleThree = wb.createCellStyle();
        cellThree.setCellValue("生产线\r\n编号");
        scheduleSixStyle.setWordFontBold(cellStyleThree,wb);
        scheduleSixStyle.mergeTitle(sheet);
        scheduleSixStyle.setWordCenter(cellStyleThree);
        cellStyleThree.setWrapText(true);
        cellThree.setCellStyle(cellStyleThree);
        sheet.setColumnWidth(2,255*6);

        Cell cellFour = row.createCell(3);
        cellFour.setCellValue("产品(t/a)");
        CellStyle cellStyleFour = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(cellStyleFour,wb);
        scheduleSixStyle.setWordCenter(cellStyleFour);
        cellFour.setCellStyle(cellStyleFour);
        CellRangeAddress cellFourRange = new CellRangeAddress(2,2,3,7);
        scheduleSixStyle.mergeTitleOnce(sheet,cellFourRange);
        scheduleSixStyle.setBorderByMergeBold(cellFourRange,sheet);

        //生成产品标题单元格的子标题单元格
        Row afterCellFourRow = sheet.createRow(3);

        Cell proNameTitle = afterCellFourRow.createCell(3);
        proNameTitle.setCellValue("产品\r\n中文名称");
        CellStyle proNameCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(proNameCellStyle,wb);
        scheduleSixStyle.setWordCenter(proNameCellStyle);
        proNameCellStyle.setWrapText(true);
        proNameTitle.setCellStyle(proNameCellStyle);
        CellRangeAddress proNameTitleRange = new CellRangeAddress(3,4,3,4);
        scheduleSixStyle.mergeTitleOnce(sheet,proNameTitleRange);
        scheduleSixStyle.setBorderByMergeBold(proNameTitleRange,sheet);
        sheet.setColumnWidth(3,255*8);



        Cell casTitle = afterCellFourRow.createCell(5);
        casTitle.setCellValue("CAS号");
        CellStyle casCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(casCellStyle,wb);
        scheduleSixStyle.setWordCenter(casCellStyle);
        casTitle.setCellStyle(casCellStyle);
        CellRangeAddress casTitleRange = new CellRangeAddress(3,4,5,5);
        scheduleSixStyle.mergeTitleOnce(sheet,casTitleRange);
        scheduleSixStyle.setBorderByMergeBold(casTitleRange,sheet);
        sheet.setColumnWidth(5,255*8);

        Cell designProCapacityTitle = afterCellFourRow.createCell(6);
        designProCapacityTitle.setCellValue("设计\r\n产能");
        CellStyle designProCapacityCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(designProCapacityCellStyle,wb);
        scheduleSixStyle.setWordCenter(designProCapacityCellStyle);
        designProCapacityCellStyle.setWrapText(true);
        designProCapacityTitle.setCellStyle(designProCapacityCellStyle);
        CellRangeAddress designProCapacityRange = new CellRangeAddress(3,4,6,6);
        scheduleSixStyle.mergeTitleOnce(sheet,designProCapacityRange);
        scheduleSixStyle.setBorderByMergeBold(designProCapacityRange,sheet);
        sheet.setColumnWidth(6,255*10);

        Cell activeOutPutTitle = afterCellFourRow.createCell(7);
        activeOutPutTitle.setCellValue("实际产量\r\n(上年度)");
        CellStyle activeOutPutCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(activeOutPutCellStyle,wb);
        scheduleSixStyle.setWordCenter(activeOutPutCellStyle);
        activeOutPutCellStyle.setWrapText(true);
        activeOutPutTitle.setCellStyle(designProCapacityCellStyle);
        CellRangeAddress activeOutPutRange = new CellRangeAddress(3,4,7,7);
        scheduleSixStyle.mergeTitleOnce(sheet,activeOutPutRange);
        scheduleSixStyle.setBorderByMergeBold(activeOutPutRange,sheet);
        sheet.setColumnWidth(7,255*12);
        //============================================================

        Cell cellSeven = row.createCell(8);
        cellSeven.setCellValue("原辅料(t/a)");
        CellStyle cellSevenCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(cellSevenCellStyle,wb);
        scheduleSixStyle.setWordCenter(cellSevenCellStyle);
        cellSeven.setCellStyle(cellSevenCellStyle);
        CellRangeAddress cellSevenRange = new CellRangeAddress(2,2,8,11);
        scheduleSixStyle.mergeTitleOnce(sheet,cellSevenRange);
        scheduleSixStyle.setBorderByMergeBold(cellSevenRange,sheet);
        //生成原辅料标题子单元格
        Cell rawNameTitle = afterCellFourRow.createCell(8);
        rawNameTitle.setCellValue("原辅料\r\n中文名称");
        CellStyle rawNameCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(rawNameCellStyle,wb);
        scheduleSixStyle.setWordCenter(rawNameCellStyle);
        rawNameCellStyle.setWrapText(true);
        rawNameTitle.setCellStyle(rawNameCellStyle);
        CellRangeAddress rawNameRange = new CellRangeAddress(3,4,8,9);
        scheduleSixStyle.mergeTitleOnce(sheet,rawNameRange);
        scheduleSixStyle.setBorderByMergeBold(rawNameRange,sheet);
        sheet.setColumnWidth(8,255*8);

        Cell rawCASTitle = afterCellFourRow.createCell(10);
        rawCASTitle.setCellValue("CAS号");
        CellStyle rawCASCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(rawCASCellStyle,wb);
        scheduleSixStyle.setWordCenter(rawCASCellStyle);
        rawCASTitle.setCellStyle(rawCASCellStyle);
        CellRangeAddress rawCASRange = new CellRangeAddress(3,4,10,10);
        scheduleSixStyle.mergeTitleOnce(sheet,rawCASRange);
        scheduleSixStyle.setBorderByMergeBold(rawCASRange,sheet);
        sheet.setColumnWidth(10,255*8);

        Cell rawActiveOutPutTitle = afterCellFourRow.createCell(11);
        rawActiveOutPutTitle.setCellValue("实际产量\r\n(上年度)");
        CellStyle rawActiveOutPutCellStyle = wb.createCellStyle();
        scheduleSixStyle.setWordFontBold(rawActiveOutPutCellStyle,wb);
        scheduleSixStyle.setWordCenter(rawActiveOutPutCellStyle);
        rawActiveOutPutCellStyle.setWrapText(true);
        rawActiveOutPutTitle.setCellStyle(rawActiveOutPutCellStyle);
        CellRangeAddress rawActiveOutPutRange = new CellRangeAddress(3,4,11,11);
        scheduleSixStyle.mergeTitleOnce(sheet,rawActiveOutPutRange);
        scheduleSixStyle.setBorderByMergeBold(rawActiveOutPutRange,sheet);
        sheet.setColumnWidth(11,255*12);
    }

    /**
     * 第四行第二个单元格样式有问题，单独调用这个方法设置一下
     */
    public void setFourthRowStyle(){
        //第四行没有左边框
        Row fourthRow = wb.getSheetAt(0).getRow(3);
        Cell fourthRowSecondCell = fourthRow.createCell(1);
        Cell fourthRowFirstCell = fourthRow.createCell(0);

        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderLeft(BorderStyle.MEDIUM);
        fourthRowFirstCell.setCellStyle(cellStyle);
        cellStyle.setBorderRight(BorderStyle.MEDIUM);
        cellStyle.setBorderTop(BorderStyle.MEDIUM);
        cellStyle.setBorderBottom(BorderStyle.MEDIUM);
        fourthRowSecondCell.setCellStyle(cellStyle);
        //第二行没有左边框
        Row secondRow = wb.getSheetAt(0).getRow(1);
        Cell secondRowFirstCell = secondRow.createCell(0);
        CellStyle secondRowFirstCellStyle = wb.createCellStyle();
        secondRowFirstCellStyle.setBorderLeft(BorderStyle.MEDIUM);
        secondRowFirstCell.setCellStyle(secondRowFirstCellStyle);


    }

    /**
     * 填充产品的单元格数据
     * @param productions
     *
     */
    public void fillProductionDatas(List<Production> productions){
        Sheet sheet = wb.getSheetAt(0);
        int len = productions.size();
        CellStyle generalCellStyle = wb.createCellStyle();
        generalCellStyle.setWrapText(true);
        scheduleSixStyle.setWordCenter(generalCellStyle);
        scheduleSixStyle.setBorderBySingleCellThin(generalCellStyle);

        for(int i = 0; i < len; i++){
            if(productions.get(i).getProductionMixtures().size() == 0 || productions.get(i).getProductionMixtures().size() == 1){
                Row productionRow = null;
                if(sheet.getRow(productionNumber) != null){
                    productionRow = sheet.getRow(productionNumber);
                }else{
                    productionRow = sheet.createRow(productionNumber);
                }
                Cell productionNameCell = productionRow.createCell(3);
                productionNameCell.setCellValue(productions.get(i).getProductionName());
                productionNameCell.setCellStyle(generalCellStyle);

                Cell productionCASnumberCell = productionRow.createCell(5);
                productionCASnumberCell.setCellValue(productions.get(i).getCASNumber());
                productionCASnumberCell.setCellStyle(generalCellStyle);

                Cell productionDesignProductionCapacityCell = productionRow.createCell(6);
                productionDesignProductionCapacityCell.setCellValue(productions.get(i).getDesignProductionCapacity());
                productionDesignProductionCapacityCell.setCellStyle(generalCellStyle);

                Cell productionActiveOutPutCell= productionRow.createCell(7);
                productionActiveOutPutCell.setCellValue(productions.get(i).getActiveOutput());
                productionActiveOutPutCell.setCellStyle(generalCellStyle);

                CellRangeAddress productionMergeRange = new CellRangeAddress(productionNumber,productionNumber,3,4);
                scheduleSixStyle.mergeTitleOnce(sheet,productionMergeRange);
                scheduleSixStyle.setBorderByMergeThin(productionMergeRange,sheet);
//                if(i != len - 1)
                productionNumber++;
            }else{
                //当前行数赋值给currentRowNum 然后自增，
                int currentRowNum = productionNumber;
                List<ProductionMixture> productionMixtures = productions.get(i).getProductionMixtures();
                int productionMixturesLen = productionMixtures.size();
                for(int j = 0; j < productionMixturesLen ;j++){
                    //当前行的下一行创建新的一行
                    Row productionMixtureRow = null;
                    if(sheet.getRow(productionNumber) != null){
                        productionMixtureRow = sheet.getRow(productionNumber);
                    }else{
                        productionMixtureRow = sheet.createRow(productionNumber);
                    }
                    if(j == 0){
                        Cell productionNameCell = productionMixtureRow.createCell(3);
                        productionNameCell.setCellValue(productions.get(i).getProductionName());
                        productionNameCell.setCellStyle(generalCellStyle);
                    }
                    //混合物名称generalCellStyle
                    Cell productionMixtureNameCell = productionMixtureRow.createCell(4);
                    productionMixtureNameCell.setCellValue(productionMixtures.get(j).getMatter());
                    productionMixtureNameCell.setCellStyle(generalCellStyle);

                    Cell productionMixtureCASCell = productionMixtureRow.createCell(5);
                    productionMixtureCASCell.setCellValue(productionMixtures.get(j).getCASNumber());
                    productionMixtureCASCell.setCellStyle(generalCellStyle);

                    Cell productionMixtureDesignCapacityCell = productionMixtureRow.createCell(6);
                    productionMixtureDesignCapacityCell.setCellValue(productionMixtures.get(j).getDesignProductionCapacity());
                    productionMixtureDesignCapacityCell.setCellStyle(generalCellStyle);

                    Cell productionMixtureActiveOutPutCell = productionMixtureRow.createCell(7);
                    productionMixtureActiveOutPutCell.setCellValue(productionMixtures.get(j).getActiveOutput());
                    productionMixtureActiveOutPutCell.setCellStyle(generalCellStyle);

                    if(j != productionMixturesLen - 1 || productionMixturesLen == 1) {
                        productionNumber++;
                    }

                }
                if(currentRowNum   < productionNumber ){
                    CellRangeAddress productionMixtureMergeRange = new CellRangeAddress(currentRowNum ,productionNumber,3,3);
                    scheduleSixStyle.mergeTitleOnce(sheet,productionMixtureMergeRange);
                    scheduleSixStyle.setBorderByMergeThin(productionMixtureMergeRange,sheet);
                    productionNumber++;
                }
            }
        }

    }


    /**
     * 填充原辅料数据
     * @param rawMaterials
     */
    public void fillRawMaterialDatas(List<RawMaterial> rawMaterials){
            Sheet sheet = wb.getSheetAt(0);
            int rawMaterialLen = rawMaterials.size();
            CellStyle generalCellStyle = wb.createCellStyle();
            generalCellStyle.setWrapText(true);
            scheduleSixStyle.setWordCenter(generalCellStyle);
            scheduleSixStyle.setBorderBySingleCellThin(generalCellStyle);
            for(int i = 0; i < rawMaterialLen ; i++){
                if(rawMaterials.get(i).getRawMaterialMixtures().size() == 0 || rawMaterials.get(i).getRawMaterialMixtures().size() == 1){
                    Row rawMaterialRow = null;
                    if(sheet.getRow(rawMaterialNumberber) != null){
                        rawMaterialRow = sheet.getRow(rawMaterialNumberber);
                    }else{
                        rawMaterialRow = sheet.createRow(rawMaterialNumberber);
                    }
                    Cell rawMaterialNameCell = rawMaterialRow.createCell(8);
                    rawMaterialNameCell.setCellValue(rawMaterials.get(i).getRawMaterialName());
                    rawMaterialNameCell.setCellStyle(generalCellStyle);

                    Cell rawMaterialCASCell = rawMaterialRow.createCell(10);
                    rawMaterialCASCell.setCellValue(rawMaterials.get(i).getCASNumber());
                    rawMaterialCASCell.setCellStyle(generalCellStyle);

                    Cell rawMaterialActiveOutPutCell = rawMaterialRow.createCell(11);
                    rawMaterialActiveOutPutCell.setCellValue(rawMaterials.get(i).getActiveOutput());
                    rawMaterialActiveOutPutCell.setCellStyle(generalCellStyle);

                    CellRangeAddress rawMaterialMergeRange = new CellRangeAddress(rawMaterialNumberber,rawMaterialNumberber,8,9);
                    scheduleSixStyle.mergeTitleOnce(sheet,rawMaterialMergeRange);
                    scheduleSixStyle.setBorderByMergeThin(rawMaterialMergeRange,sheet);
//                    if(i != rawMaterialLen - 1){
                    rawMaterialNumberber++;
//                    }
                }else{
                    int currentRawMaxtureRow = rawMaterialNumberber;
                    Row rawMaterialMaxtureRow = null;
                    List<RawMaterialMixture> rawMaterialMixtures = rawMaterials.get(i).getRawMaterialMixtures();
                    int rawMaterialMixturesLen = rawMaterialMixtures.size();
                    /**
                     * do something
                     */
                    for(int j = 0;j < rawMaterialMixturesLen;j++){
                        if(sheet.getRow(rawMaterialNumberber)!=null){
                            rawMaterialMaxtureRow = sheet.getRow(rawMaterialNumberber);
                        }else{
                            rawMaterialMaxtureRow = sheet.createRow(rawMaterialNumberber);
                        }
                        if(j == 0){
                            Cell rawMaterialNameCell = rawMaterialMaxtureRow.createCell(8);
                            rawMaterialNameCell.setCellValue(rawMaterials.get(i).getRawMaterialName());
                            rawMaterialNameCell.setCellStyle(generalCellStyle);
                        }
                        Cell rawMixtureNameCell = rawMaterialMaxtureRow.createCell(9);
                        rawMixtureNameCell.setCellValue(rawMaterialMixtures.get(j).getMatter());
                        rawMixtureNameCell.setCellStyle(generalCellStyle);

                        Cell rawMixtureCASCell = rawMaterialMaxtureRow.createCell(10);
                        rawMixtureCASCell.setCellValue(rawMaterialMixtures.get(j).getCASNumber());
                        rawMixtureCASCell.setCellStyle(generalCellStyle);

                        Cell rawMixtureActiveOutPutCell = rawMaterialMaxtureRow.createCell(11);
                        rawMixtureActiveOutPutCell.setCellValue(rawMaterialMixtures.get(j).getActiveOutput());
                        rawMixtureActiveOutPutCell.setCellStyle(generalCellStyle);
                        if(j != rawMaterialMixturesLen - 1 || rawMaterialMixturesLen == 1)
                            rawMaterialNumberber++;
                    }

                    if(currentRawMaxtureRow < rawMaterialNumberber) {
                        CellRangeAddress rawMaterialMergeRange = new CellRangeAddress(currentRawMaxtureRow, rawMaterialNumberber, 8, 8);
                        scheduleSixStyle.mergeTitleOnce(sheet, rawMaterialMergeRange);
                        scheduleSixStyle.setBorderByMergeThin(rawMaterialMergeRange,sheet);
                        rawMaterialNumberber++;
                    }
                }
            }
    }







    /**
     * 填充生产线数据
     * 首先填充产品与原辅料的数据
     *
     */

    public void fillProductionLinesDatas(ProductionLine productionLine){
        Sheet sheet = wb.getSheetAt(0);
//        int lastRowNum = sheet.getPhysicalNumberOfRows();
//        System.out.println(lastRowNum);
        System.out.println("当前excel生产线产品行数:"+productionNumber);
        System.out.println("当前excel生产线原辅料行数:"+rawMaterialNumberber);
        if(productionNumber < rawMaterialNumberber){
            CellRangeAddress blank = new CellRangeAddress(productionNumber,rawMaterialNumberber -1,3,7);
            scheduleSixStyle.mergeTitleOnce(sheet,blank);
            scheduleSixStyle.setBorderByMergeThin(blank,sheet);
            productionNumber = rawMaterialNumberber ;


        }
        if(productionNumber > rawMaterialNumberber){
            CellRangeAddress blank = new CellRangeAddress(rawMaterialNumberber,productionNumber -1,8,11);
            scheduleSixStyle.mergeTitleOnce(sheet,blank);
            scheduleSixStyle.setBorderByMergeThin(blank,sheet);
            rawMaterialNumberber = productionNumber ;

        }

            Row productionMergeHeadRow = null;
            CellStyle generalCellStyle = wb.createCellStyle();

            generalCellStyle.setWrapText(true);
            scheduleSixStyle.setWordCenter(generalCellStyle);
            scheduleSixStyle.setBorderBySingleCellThin(generalCellStyle);
            if (sheet.getRow(productionLineNumber) != null) {
                productionMergeHeadRow = sheet.getRow(productionLineNumber);
            } else {
                productionMergeHeadRow = sheet.createRow(productionLineNumber);
            }
            Cell productionIdCell = productionMergeHeadRow.createCell(0);
            productionIdCell.setCellValue(productionLine.getId());
            productionIdCell.setCellStyle(generalCellStyle);

            Cell productionNameCell = productionMergeHeadRow.createCell(1);
            productionNameCell.setCellValue(productionLine.getProductionLineName());
            productionNameCell.setCellStyle(generalCellStyle);

            Cell productionLineNumberCell = productionMergeHeadRow.createCell(2);
            productionLineNumberCell.setCellValue(productionLine.getProductionNumber());
            productionLineNumberCell.setCellStyle(generalCellStyle);

            if(productionLineNumber + 1 < sheet.getPhysicalNumberOfRows()) {
                CellRangeAddress productionIdMergeRange = new CellRangeAddress(productionLineNumber, sheet.getPhysicalNumberOfRows() - 1, 0, 0);
                scheduleSixStyle.mergeTitleOnce(sheet, productionIdMergeRange);
                scheduleSixStyle.setBorderByMergeThin(productionIdMergeRange,sheet);

                CellRangeAddress productionNameMergeRange = new CellRangeAddress(productionLineNumber, sheet.getPhysicalNumberOfRows() - 1, 1, 1);
                scheduleSixStyle.mergeTitleOnce(sheet, productionNameMergeRange);
                scheduleSixStyle.setBorderByMergeThin(productionNameMergeRange,sheet);

                CellRangeAddress productionLineNumberMergeRange = new CellRangeAddress(productionLineNumber, sheet.getPhysicalNumberOfRows() - 1, 2, 2);
                scheduleSixStyle.mergeTitleOnce(sheet, productionLineNumberMergeRange);
                scheduleSixStyle.setBorderByMergeThin(productionLineNumberMergeRange,sheet);
            }
            productionLineNumber = sheet.getPhysicalNumberOfRows() ;

    }

    /**
     * 设置签字行
     */
    public void createSignRow(){
        Sheet sheet = wb.getSheetAt(0);
        int finalRow = sheet.getPhysicalNumberOfRows();
        Row signRow = sheet.createRow(finalRow);
        Cell unitLeader = signRow.createCell(0);
        unitLeader.setCellValue("单位负责人:");
        Cell unitAuditor = signRow.createCell(4);
        unitAuditor.setCellValue("单位审核人:");
        Cell unitFillFormPerson = signRow.createCell(7);
        unitFillFormPerson.setCellValue("单位填表人:");
        Cell signTime = signRow.createCell(9);
        signTime.setCellValue("填表时间:      年    月    日");
    }





    /**
     * 写出Excel
     */
    public void WriteExcel(String path){

        Sheet sheet = wb.getSheetAt(0);
        //设置一下打印参数
        XSSFPrintSetup xssfPrintSetup = ((XSSFSheet) sheet).getPrintSetup();
        xssfPrintSetup.setLandscape(true);
        xssfPrintSetup.setPaperSize(PaperSize.A4_PAPER);
        //0左1右 2上3下
        sheet.setMargin((short)0,0.8);
        sheet.setMargin((short)1,1.0);
        sheet.setMargin((short)2,2.0);
        sheet.setMargin((short)3,2.0);

        File file = new File(path);
        FileOutputStream out = null;
        try {
            System.out.println("开始生成表格"+file.getPath()+file.getName());
            out = new FileOutputStream(file);
            wb.write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("结束生成表格"+file.getPath()+file.getName());
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
