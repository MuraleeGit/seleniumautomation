package Automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static void main(String[] abc) {
	
	FileInputStream fis = new FileInputStream (“path of excel file”);
	Workbook wb = WorkbookFactory.create (fis);
	Sheet s = wb.getSheet(“sheetName”);
	String value = s.getRow(1).getCell(1).getStringCellValue (); // read data
	s.getRow(1).getCell (1).setCellValue (“value to be set”); //write data
	FileOutputStream FOS = new FileOutputStream (“path of file”);
	wb.write (FOS); //save file

}
}

