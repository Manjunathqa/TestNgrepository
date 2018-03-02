package WorkingForExcelMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src=new File("C:\\Users\\Admin\\Desktop\\Manjunath_ Candidate Self Assessment Sheet (Autosaved).xlsx");
		FileInputStream file=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet Sheet1=wb.getSheetAt(0);
		Sheet1.getRow(0).createCell(6).setCellValue("pass");
		Sheet1.getRow(1).createCell(6).setCellValue("ok");
		
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		
		
		
		
		
		
		

	}

}
