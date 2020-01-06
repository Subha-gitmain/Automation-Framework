package com.CRMVTiger.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	
	/**
	 * Read the Data from Common Data Property File
	 * @author Subha
	 * @throws Throwable 
	 */
	
	public String getPropertyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/commonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		System.out.println(value);
		return value;
	}
	
	/**
	 * Data driven from Excell scheet      
	 * @author Subha
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/ExcelData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		 Cell cell=rw.getCell(cellNum);
		String data= cell.getStringCellValue();
		System.out.println(data);
		return data;
	}




}
