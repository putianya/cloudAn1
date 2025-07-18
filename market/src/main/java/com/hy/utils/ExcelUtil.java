package com.hy.utils;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import javax.servlet.http.HttpServletResponse;

/**
 * @author zh
 * @Description TODO
 * @createTime 2025/7/15
 */
public class ExcelUtil {

    public static HorizontalCellStyleStrategy getHorizontalCellStyleStrategy(HttpServletResponse response,String fileName) {
        // 2. 设置响应头
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ".xlsx");

        // 3. 定义表头和内容的样式（带边框）
        WriteCellStyle headStyle = new WriteCellStyle();
        // 设置表头字体
        WriteFont headFont = new WriteFont();
        headFont.setFontHeightInPoints((short) 12);
        headFont.setBold(true);
        headStyle.setWriteFont(headFont);
        // 设置表头边框
        headStyle.setBorderLeft(BorderStyle.THIN);
        headStyle.setBorderTop(BorderStyle.THIN);
        headStyle.setBorderRight(BorderStyle.THIN);
        headStyle.setBorderBottom(BorderStyle.THIN);
        headStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());

        WriteCellStyle contentStyle = new WriteCellStyle();
        // 设置内容边框
        contentStyle.setBorderLeft(BorderStyle.THIN);
        contentStyle.setBorderTop(BorderStyle.THIN);
        contentStyle.setBorderRight(BorderStyle.THIN);
        contentStyle.setBorderBottom(BorderStyle.THIN);

        // 4. 使用 HorizontalCellStyleStrategy 应用样式
        HorizontalCellStyleStrategy styleStrategy = new HorizontalCellStyleStrategy(headStyle, contentStyle);

        return styleStrategy;
    }
}
