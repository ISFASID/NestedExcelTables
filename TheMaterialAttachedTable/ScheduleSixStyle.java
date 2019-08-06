package co.tests.main.POI.TheMaterialAttachedTable;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ScheduleSixStyle {

    /**
     * 设置字体加粗
     * @param cellStyle
     * @param wb
     */
    public void setWordFontBold(CellStyle cellStyle, XSSFWorkbook wb){
        Font font = wb.createFont();
        font.setBold(true);
        cellStyle.setFont(font);
    }

    /**
     * 设置单元格水平居中
     * @param cellStyle
     */
    public void setCellHorizontalCentering (CellStyle cellStyle){
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
    }

    /**
     * 设置单元格垂直居中
     * @param cellStyle
     */
    public void setCellVerticalCenter(CellStyle cellStyle){
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
    }

    /**
     * 合并前三个标题单元格
     */
    public void mergeTitle(Sheet sheet){
        CellRangeAddress cellOne = new CellRangeAddress(2,4,0,0);
        sheet.addMergedRegion(cellOne);
        setBorderByMergeBold(cellOne,sheet);

        CellRangeAddress cellTwo= new CellRangeAddress(2,4,1,1);
        sheet.addMergedRegion(cellTwo);
        setBorderByMergeBold(cellTwo,sheet);

        CellRangeAddress cellThree = new CellRangeAddress(2,4,2,2);
        sheet.addMergedRegion(cellThree);
        setBorderByMergeBold(cellThree,sheet);
    }

    /**
     * 合并一次单元格
     * @param sheet
     */
    public void mergeTitleOnce(Sheet sheet,CellRangeAddress target){
        sheet.addMergedRegion(target);
    }

    /**
     * 设置字体居中
     * @param cellStyle
     */
    public void setWordCenter(CellStyle cellStyle) {
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
    }

    /**
     * 单个单元格粗边框
     * @param cellStyle
     */
    public void setBorderBySingleCellBold(CellStyle cellStyle){
        cellStyle.setBorderTop(BorderStyle.MEDIUM);
        cellStyle.setBorderBottom(BorderStyle.MEDIUM);
        cellStyle.setBorderRight(BorderStyle.MEDIUM);
        cellStyle.setBorderLeft(BorderStyle.MEDIUM);
    }

    /**
     * 单个单元格细边框
     * @param cellStyle
     */
    public void setBorderBySingleCellThin(CellStyle cellStyle){
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
    }

    /**
     * 设置合并单元格粗边框
     * @param cellRangeAddress
     * @param sheet
     */
    public void setBorderByMergeBold(CellRangeAddress cellRangeAddress,Sheet sheet){
        RegionUtil.setBorderTop(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderBottom(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderLeft(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderRight(BorderStyle.MEDIUM,cellRangeAddress,sheet);
    }

    /**
     * 设置合并单元格细边框
     * @param cellRangeAddress
     * @param sheet
     */
    public void setBorderByMergeThin(CellRangeAddress cellRangeAddress,Sheet sheet){
        RegionUtil.setBorderTop(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN,cellRangeAddress,sheet);
    }

}
