package com.ExcelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritemultipleVal {

	public static void main(String[] args) throws IOException {
		String path="D:\\selenium\\ExcelSheet\\Write.xlsx";
		   FileInputStream fis = new FileInputStream(path);
		   XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet = wb.createSheet("Country3");
		  
		  Object[][] entryData= {
				  {"sNo","Country","capital","Currency"},
				  {"1","India","Delhi","rupee"},
				  {"2","France","Paris","Euro"},
				  {"3","Japan","Tokya","Yen"},
		  };
		  int rowcount=0;
		  for(Object[] obj:entryData) {
			  Row row = sheet.createRow(rowcount++);
			  
			  int colcount=0;
			  for(Object col:entryData) {
				  Cell column = row.createCell(colcount++);
				  
			  if(col instanceof String ) {
				  column.setCellValue((String)col);
				  
			  }else if(col instanceof Integer) {
				  column.setCellValue((Integer)col);
			  }
				  
			  }
		  }
		  FileOutputStream fos = new  FileOutputStream(path);
		  wb.write(fos);
		  fos.close();
		  System.out.println("Written successfully");
	}
	

}
