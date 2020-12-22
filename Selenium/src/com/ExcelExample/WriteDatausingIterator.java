package com.ExcelExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatausingIterator {

	public static void main(String[] args) throws IOException {
		String path="D:\\selenium\\ExcelSheet\\ExcelFile.xlsx";
    FileInputStream fis = new FileInputStream(path);
    XSSFWorkbook wb = new   XSSFWorkbook(fis);
    XSSFSheet sheet = wb.createSheet("Stu");
    
    Map<String,Object[]> map = new TreeMap<String,Object[]>();
    map.put("1", new Object[] {"Roll-no","Student_Name","Class"});
    map.put("2", new Object[] {"1","Ram","Inter-I"});
    map.put("3", new Object[] {"2","Ravi","Inter-I"});
    
    Set<String>keys = map.keySet();
    
    int row=0;
    for(String keyid:keys) {
    	XSSFRow rows = sheet.createRow(row++);
    	Object[] values =map.get(keyid);
    	int col=0;
    	for(Object data:values) {
    		XSSFCell cell = rows.createCell(col++);
    		cell.setCellValue((String)data);
    	}
    }
    FileOutputStream fos = new  FileOutputStream(path);
    wb.write(fos);
    fos.close();
    
     
   
    
	}

}
