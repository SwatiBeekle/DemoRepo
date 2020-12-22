package com.ExcelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("D:\\selenium\\ExcelSheet\\ExcelData.xlsx");
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet = wb.getSheet("sheet1");
    
   int rowcount = sheet.getLastRowNum();
   System.out.println("total rows are :"+rowcount);
   
   for(int i=0;i<=rowcount;i++) {
	   XSSFRow row = sheet.getRow(i);
	   
	   for(int j=0;j<row.getLastCellNum();j++) {
		   System.out.println(row.getCell(j).getStringCellValue());
	   }
	   System.out.println();
   }



	}

}
