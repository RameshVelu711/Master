package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		
	//In realTime if Excel cell values are empty in any cells just use this to get  all cell values
		
		File file = new File("C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Practice\\Excel\\Book1.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("va maame");
   
		int lastRowNum = sheet.getLastRowNum();
		
		for (int i = 0; i < lastRowNum+1; i++) {
			
			Row row = sheet.getRow(i);
			
			if (row!=null) {
				
				short lastCellNum = row.getLastCellNum();
				for (int j = 0; j < lastCellNum+1; j++) {
				
					Cell cell = row.getCell(j);
					
					if (cell!=null) {
						CellType cellType = cell.getCellType();
						switch (cellType) {
						case STRING:
							String value = cell.getStringCellValue();
							System.out.println(value);
							break;
						case NUMERIC:
							
							
							
							break;
						default:
							break;
						}
					}
					
					
				}
				
				
				
				
				
				
			}
						
		}
		
		
		
		
	}
}