package org.ictak.LTutilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LTrExcelUtility {
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelSheet;

   public static String getData(int rowNum,int colNum) throws IOException
	 
   {
	   FileInputStream inp = new FileInputStream("E:\\AutomationICTAKLearnerTracker\\src\\main\\resources\\IntrnshpAdmn.xlsx");
	   excelWbook = new XSSFWorkbook(inp);
		excelSheet = excelWbook.getSheetAt(0);
		
		XSSFRow currentRow=excelSheet.getRow(rowNum);
		Cell currentCell = currentRow.getCell(colNum);
		if(currentCell== null)
		{
			return "";
		}
		
		DataFormatter formatter = new DataFormatter();
		String strValue = formatter.formatCellValue(currentCell);
		return strValue;
		
	}
	 
	}
	


