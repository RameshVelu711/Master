package org.junit.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelGetAll {
	@Test
	public void Excel() throws IOException {

	File file = new File("C:\\Users\\Ramesh Riyo\\eclipse-workspace\\FrameWork1\\excelSheet\\Book1.xlsx"); 
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet("sheet01");
	
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		System.out.println(cell);
		
	}
	
	
	
	}
	}

}
