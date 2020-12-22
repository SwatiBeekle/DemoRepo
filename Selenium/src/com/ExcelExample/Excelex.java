package com.ExcelExample;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelex {

	public static void main(String[] args) throws IOException,InvalidFormatException { 
		String file="D:\\selenium\\ExcelSheet\\JAVA.xlsx";
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		 XSSFRow row = sheet.getRow(0);
		 int rowcount = row.getLastCellNum();
		
		
		for(int i=0;i<rowcount;i++) {
			String val = row.getCell(i).getStringCellValue();
			System.out.println(val);
			
		}
		
		
		
		
		
		}
		
		
		
      
	}


