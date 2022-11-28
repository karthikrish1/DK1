package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class reading {

	@Test
	public void rw() throws IOException
	{
		// apache poi, apache poi ooxml, apache poi ooxml schema
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		// converting this into a workbook
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows 
		int row=sheet.getLastRowNum();
		System.out.println(row);
		
		//Number of columns in row 0
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns : "+ col);
		
		//particular cell value: know the row index and column index
		//10,2
		XSSFCell data = sheet.getRow(10).getCell(2);
		System.out.println(data);
		
		//row:iterate column wise
		System.out.println("ROW 0 ");
		
		for(int i=0;i<col;i++)
		{
		XSSFCell data1 = sheet.getRow(0).getCell(i);
		System.out.println(data1);
		// 0,0   0,1   0,2  0,3  0,4  0,5
		}
		
		//col: iterate row wise
		System.out.println("COLUMN 0");
		for(int i=0;i<row;i++)
		{
		XSSFCell data1 = sheet.getRow(i).getCell(0);
		System.out.println(data1);
		// 0,0    1,0    2,0   3,0.... 70,0
		}
		
		//67,4
		sheet.getRow(67).createCell(4).setCellValue("WELCOME");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}
}
