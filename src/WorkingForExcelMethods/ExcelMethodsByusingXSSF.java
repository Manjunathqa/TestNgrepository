package WorkingForExcelMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethodsByusingXSSF {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
	 File src=new File("C:\\Users\\Admin\\Desktop\\Manjunath_ Candidate Self Assessment Sheet.xlsx");
	 FileInputStream fis=new FileInputStream(src);
	 //1.Creating workbook
	 
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 //2.get the sheet
	XSSFSheet ws= wb.getSheetAt(0);
	//get the row numbers present in excel
	int rowcount=ws.getLastRowNum();
	
	System.out.println("Total rows available:-"+rowcount);
	
	
	String data=ws.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel:- "+data);
	
	for(int i=0;i<rowcount;i++)
	{
		String data0=ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data0);
		
	}
	
	wb.close();
	 

	}

	
	}

	

	



