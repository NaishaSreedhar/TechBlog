package com.techblog.utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
public class ExcelUtility {
//creating objects for excel book and sheet
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelWsheet;
	
	//creating static  method
	public static String getCellData(int RowNum,int ColNum,String ExcelPath,int SheetNum) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelPath);
	    excelWbook=new XSSFWorkbook(Excel);
	    excelWsheet=excelWbook.getSheetAt(SheetNum);
	    return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	    
	}
	
	public static String setloginpass(int RowNum,int ColNum,String ExcelPath,int SheetNum) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelPath);
	    excelWbook=new XSSFWorkbook(Excel);
	    excelWsheet=excelWbook.getSheetAt(SheetNum);
		
	
	return excelWsheet.getRow(RowNum).getCell(ColNum).getRawValue().toString();
	
	}
	    
	    
	 
	}
	
	
	
	

