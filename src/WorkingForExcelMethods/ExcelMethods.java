package WorkingForExcelMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMethods {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		//1.Create and read the file
		File file=new File("C:\\Users\\Admin\\Desktop\\Manjunath_ Candidate Self Assessment Sheet (Autosaved).xlsx");
		FileInputStream fis=new FileInputStream(file);
		//2.create workbook
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//3.get the sheet
		Sheet sh=wb.getSheet("V&V");
		//4.get the row
		Row r=sh.getRow(0);
		//5.get the cell
		Cell c=r.getCell(0);
		//6.get the data
		String data=c.getStringCellValue();
		System.out.println(data);
		


	}

}
