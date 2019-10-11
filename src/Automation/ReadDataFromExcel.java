package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	
	public static void main(String...abc) throws InvalidFormatException, IOException {
	//System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	File file=new File("D:\\GBG Group Plan.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	XSSFWorkbook wkbok=new XSSFWorkbook(file);
	XSSFSheet sheet=wkbok.getSheet("JD");
	XSSFRow row=sheet.getRow(2);
	XSSFCell cell=row.getCell(2);
	System.out.println(cell.getStringCellValue());
	fis.close();
	
}
}

