package co.tests.main.POI.PollutantLineWasteWaterAttachedTable;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellFontStyle {

    /**
     * 设置字体居中
     * @Param:
     * @return:
     * @Author: SetCellFont
     * @Date: 2019/8/1
     */
    public  void setCellCenter(CellStyle cellStyle){
        CellStyle tempCellStyle = cellStyle;
        tempCellStyle.setAlignment(HorizontalAlignment.CENTER);
        tempCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
    }

    /**
     * 设置单元格边框(细版)
     * @param cellStyle
     * @return
     */
    public void setCellBorderThin(CellStyle cellStyle){
        CellStyle tempCellStyle = cellStyle;
        tempCellStyle.setBorderTop(BorderStyle.THIN);
        tempCellStyle.setBorderBottom(BorderStyle.THIN);
        tempCellStyle.setBorderLeft(BorderStyle.THIN);
        tempCellStyle.setBorderRight(BorderStyle.THIN);
    }

    /**
     * 设置单元格边框(粗版)
     * @param cellStyle
     * @return
     */
    public void setCellBorderMedium(CellStyle cellStyle){
        CellStyle tempCellStyle = cellStyle;
        //无效 不清楚为啥
//        cellStyle.setFillForegroundColor(IndexedColors.PINK.index);
        tempCellStyle.setBorderTop(BorderStyle.MEDIUM);
        tempCellStyle.setBorderBottom(BorderStyle.MEDIUM);
        tempCellStyle.setBorderLeft(BorderStyle.MEDIUM);
        tempCellStyle.setBorderRight(BorderStyle.MEDIUM);

    }

    /**
     * 设置字体(加粗)
     */
    public Font setCellFontrBold(XSSFWorkbook wb){
        Font font = wb.createFont();
        font.setFontHeightInPoints((short)11);
        font.setBold(true);
        return font;
    }

    /**
     *为合并之后的单元格设置边框(细版)
     *
     */
    public void setMergeCellThin(CellRangeAddress cellRangeAddress, Sheet sheet){
        RegionUtil.setBorderTop(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN,cellRangeAddress,sheet);
    }

    /**
     * 设置合并后的单元格边框(粗版)
     * @param cellRangeAddress
     * @param sheet
     */
    public void setMergeCellBold(CellRangeAddress cellRangeAddress, Sheet sheet){
        RegionUtil.setBorderTop(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderBottom(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderLeft(BorderStyle.MEDIUM,cellRangeAddress,sheet);
        RegionUtil.setBorderRight(BorderStyle.MEDIUM,cellRangeAddress,sheet);
    }

    /**
     * 设置单元格白色样式
     * @param cellStyle
     */
    public void setCellWhiteStyle(CellStyle cellStyle){
        cellStyle.setFillForegroundColor(IndexedColors.WHITE.index);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }

}
