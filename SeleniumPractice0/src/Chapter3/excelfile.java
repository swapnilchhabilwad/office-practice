package Chapter3;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class excelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		
		// Creating a path for excel sheet
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		// Storing the data in excel sheet and fetching the data.
		Workbook wb = WorkbookFactory.create(fis);
		
		
		
		//String url=wb.sheet("Sheet1").getrow(1).getcell(0).getStringCellValue();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
