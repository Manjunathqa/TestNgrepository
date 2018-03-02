package libExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Excelconfigration {
	XSSFWorkbook wb;
	XSSFSheet ws;
			
		public Excelconfigration(String Excelpath)
		{
			try {
				File src=new File(Excelpath);
				FileInputStream file=new FileInputStream(src);
                //1.Creating workbook
				 wb=new XSSFWorkbook(file);
				
                //2.Creating worksheets
          
			} catch (Exception e)
			{
				System.out.println(e.getMessage());
			} 
				
			}
		public String getData(int Sheetno,int rowno,int colno)
		{
		      ws=wb.getSheetAt(Sheetno);
			String cellvalue=ws.getRow(rowno).getCell(colno).getStringCellValue();
			
			return cellvalue;
			}
		
		
			
			
}