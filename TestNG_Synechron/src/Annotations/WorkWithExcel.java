package Annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WorkWithExcel {

	@Test
	public void testCase1() throws IOException{
//		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
//		//ShineXlsReader xls=new ShineXlsReader(".\\src\\annotations\\TestData.xlsx");
//		int rowCount = xls.getRowCount("Sheet1");
//		int columnCount = xls.getColumnCount("Sheet1");
//		System.out.println("Row count ="+rowCount);
//		System.out.println("Col count = "+columnCount);
//		
		File f=new File("TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xls=new XSSFWorkbook(fis);
		int rowCount = xls.getSheetAt(0).getLastRowNum();
		short columnCount = xls.getSheetAt(0).getRow(0).getLastCellNum();
		
		System.out.println("Row count ="+rowCount);
		System.out.println("Col count = "+columnCount);
		
		for(int i=2;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
//				String cellData = xls.getCellData("Sheet1", j, i);
				String cellData = xls.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellData);
			}
		}
	}
}
