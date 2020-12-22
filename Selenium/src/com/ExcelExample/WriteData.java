package com.ExcelExample;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		String path="D:\\selenium\\ExcelSheet\\TestData.xlsx";
   FileInputStream fis = new FileInputStream(path);
   XSSFWorkbook wb = new XSSFWorkbook(fis);
  XSSFSheet sheet = wb.createSheet("user");
  Row row = sheet.createRow(0);
  Cell cell = row.createCell(1);
  cell.setCellValue("age");
//  sheet.getRow(1).getCell(2).setCellValue("Id");
//  sheet.getRow(1).getCell(2).setCellValue("name");
//  sheet.getRow(2).getCell(3).setCellValue("Address");
// 
 
  
  FileOutputStream fos = new FileOutputStream(path);
 wb.write(fos);
 fos.close();
  
   


	}

}
