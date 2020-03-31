package target;

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
    public  CellStyle setCellCenter(XSSFWorkbook wb){
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return cellStyle;
    }

    /**
     * 设置单元格边框(细版)
     * @param wb
     * @return
     */
    public CellStyle setCellBorderThin(XSSFWorkbook wb){
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        return cellStyle;
    }

    /**
     * 设置单元格边框(粗版)
     * @param wb
     * @return
     */
    public CellStyle setCellBorderMedium(XSSFWorkbook wb){
        CellStyle cellStyle = wb.createCellStyle();
        //无效 不清楚为啥
//        cellStyle.setFillForegroundColor(IndexedColors.PINK.index);
        cellStyle.setBorderTop(BorderStyle.MEDIUM);
        cellStyle.setBorderBottom(BorderStyle.MEDIUM);
        cellStyle.setBorderLeft(BorderStyle.MEDIUM);
        cellStyle.setBorderRight(BorderStyle.MEDIUM);
        return cellStyle;
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
     *为合并之后的单元格设置边框
     *
     */
    public void setMergeCellBold(CellRangeAddress cellRangeAddress, Sheet sheet){
        RegionUtil.setBorderTop(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN,cellRangeAddress,sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN,cellRangeAddress,sheet);
    }

    public void setCellWhiteStyle(CellStyle cellStyle){
        cellStyle.setFillForegroundColor(IndexedColors.WHITE.index);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }
}
