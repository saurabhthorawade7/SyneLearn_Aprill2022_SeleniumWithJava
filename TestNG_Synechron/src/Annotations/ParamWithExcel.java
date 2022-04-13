package Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamWithExcel {


	@Test(dataProvider="getdata")
	public void testCase1(String cn, String cp){
		//selenium code to login 
		System.out.println(cn+ " password is "+cp);
	}
	@DataProvider
	public Object[][] getdata() throws IOException{
		File f=new File("TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xls = new XSSFWorkbook(fis);
//		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rowCount = xls.getSheetAt(0).getLastRowNum();
//		int rowCount = xls.getSheetIndex(0).getRowCount("Sheet1");
		int columnCount = xls.getSheetAt(0).getRow(0).getLastCellNum();
//		int columnCount = xls.getColumnCount("Sheet1");
		Object obj[][]=new Object[rowCount-1][columnCount];
		
		for(int i=2;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
				obj[i-2][j]=xls.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
//				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	}
	
}
