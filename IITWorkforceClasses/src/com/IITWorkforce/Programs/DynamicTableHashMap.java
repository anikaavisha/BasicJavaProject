package com.IITWorkforce.Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicTableHashMap {
   static String key;
   static double value;
	

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ektaj\\Desktop\\TestingHasMap.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFFormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
		HashMap<String,Double> h = new HashMap<String,Double>();
		for(Row row: sheet){
			for(Cell cell: row){
				switch(fe.evaluateInCell(cell).getCellType())  
	    		 {  
	    		 case Cell.CELL_TYPE_NUMERIC:   
	    			value = cell.getNumericCellValue();
	    			
	    			break;
	    		 case Cell.CELL_TYPE_STRING:
	    			 key = cell.getStringCellValue();
	    			 
		    			break;
	    		
	    		}
				
				h.put(key, value);
				 
	    	 }
	    	
				
			}
		System.out.println(h);
		}
	


}

