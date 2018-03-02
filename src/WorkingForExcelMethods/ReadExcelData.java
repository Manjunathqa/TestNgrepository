package WorkingForExcelMethods;

import libExcel.Excelconfigration;

public class ReadExcelData {
	
	public static void main(String[] args)
	{
		Excelconfigration objexcel=new Excelconfigration("C:\\Users\\Admin\\Desktop\\Manjunath_ Candidate Self Assessment Sheet (Autosaved).xlsx");
		String cellval=objexcel.getData(1,1,1);
		System.out.println(cellval);
	}

}
