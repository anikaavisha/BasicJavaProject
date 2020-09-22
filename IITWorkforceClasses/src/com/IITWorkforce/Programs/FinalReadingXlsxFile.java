package com.IITWorkforce.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FinalReadingXlsxFile {

	public void getDataFromXlsx() throws IOException{
		File file = new File("C:\\Users\\ektaj\\Desktop\\testingExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		for(Row row :sheet){
			
			for(Cell cell :row){
				switch(fe.evaluateInCell(cell).getCellType())
				{
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "   ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+ "    ");
						break;
				}
			
				
			}
			System.out.println();
		}

	}


public static void main(String[] args) throws IOException{
	FinalReadingXlsxFile excelData = new FinalReadingXlsxFile();
	excelData.getDataFromXlsx();
	
}
}


