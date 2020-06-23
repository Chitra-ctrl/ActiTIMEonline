package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * 
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	
	public String getPropertyValue(String key) throws IOException{
		FileInputStream fis =new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}
	/**
	 * 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return data
	 * @throws IOException
	 */
	public String getExcelValue(String sheetname, int rownum, int cellnum) throws IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		return data;
	
	}

}
