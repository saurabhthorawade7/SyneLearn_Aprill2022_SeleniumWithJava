package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class Test123 extends TestBase {

	
	@Test(dataProvider="getdata")
	public void testCase1(String checkbox){
		hp.clickondontchange();
		hp.clickontodaysdeal();
		td.selectcheck(checkbox);
		isp.clickonfirstiteminitemsublist();
		
	}
	@DataProvider
	public Object[][] getdata() throws IOException{
		File f=new File(".\\src\\com\\excelFiles\\TestData1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xls=new XSSFWorkbook(fis);
		int rowCount = xls.getSheetAt(0).getLastRowNum();
		short columnCount = xls.getSheetAt(0).getRow(0).getLastCellNum();
		
		/*
		 * ShineXlsReader xls=new
		 * ShineXlsReader(".\\src\\com\\excelFiles\\TestData1.xlsx"); int rowCount =
		 * xls.getRowCount("Sheet1"); int columnCount = xls.getColumnCount("Sheet1");
		 */
		 Object obj[][]=new Object[rowCount-1][columnCount];
		for(int i=2;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
//				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
				obj[i-2][j] = xls.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}

}
