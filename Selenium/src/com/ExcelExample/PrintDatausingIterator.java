package com.ExcelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintDatausingIterator {

	public static void main(String[] args) throws IOException {
		 FileInputStream fis = new FileInputStream("D:\\selenium\\ExcelSheet\\ExcelData.xlsx");
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		    XSSFSheet sheet = wb.getSheet("sheet2");
		    
		  
		   
		  Iterator<Row> row = sheet.rowIterator();
		  row.next();
		  while(row.hasNext()) {
			  Row r = row.next();
			  XSSFRow rows=(XSSFRow) r;
			  
			  Iterator<Cell> cells = rows.cellIterator();
			  while(cells.hasNext()) {
				 cells.next();
				 XSSFCell cc =(XSSFCell)cells.next();
				 
				 if(cc.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					 String data=cc.getStringCellValue();
					 System.out.println(data+" ");
				 }else if(cc.getCellType()==XSSFCell.CELL_TYPE_STRING) {
					 System.out.println(cc.getNumericCellValue());
				 
				 }
			  }
		  }
			  System.out.println();
			  try {
				  fis.close();
			  }catch(IOException e) {
				  System.out.println(e);
			  }
			  
		  
	
		   

	}

}
