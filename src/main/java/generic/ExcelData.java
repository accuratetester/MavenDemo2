package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
     public static String getData(String filepath,String SheetName,int rn,int cn)
     {
    	 try
    	 {
    		 FileInputStream fis = new FileInputStream(filepath);
    		 Workbook wb = WorkbookFactory.create(fis);
    		 Sheet sh = wb.getSheet(SheetName);
    		 Row r = sh.getRow(rn);
    		 Cell c = r.getCell(cn);
    		 String data = c.getStringCellValue();
    		 return data;    		 
    	 }
    	 catch(Exception e)
    	 {
    		 return "";
    	 }
     }
     
     public static int getRowCount(String filepath,String SheetName)
     {
    	 try
    	 {
    		 FileInputStream fis = new FileInputStream(filepath);
    		 Workbook wb = WorkbookFactory.create(fis);
    		 Sheet sh = wb.getSheet(SheetName);
    		 int rc=  sh.getLastRowNum();
    		 return rc;
    	 }
    	 catch(Exception e)
    	 {
    		 return 0;
    	 }
     }
     
     public static int getCellCount(String filepath,String SheetName,int rn)
     {
    	 try
    	 {
    		 FileInputStream fis = new FileInputStream(filepath);
    		 Workbook wb = WorkbookFactory.create(fis);
    		 Sheet sh = wb.getSheet(SheetName);
    		 Row rc = sh.getRow(rn);
    		 int cc = rc.getLastCellNum();
    		 return cc;    		 
    	 }
    	 catch(Exception e)
    	 {
    		 return 0;
    	 }
     }
}
