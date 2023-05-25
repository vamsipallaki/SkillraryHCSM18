package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
/**
 *  * this calss contains reusable methods to perform to actions on excel file
 */
 * //@author PALLAKI VAMSI
 */

public class Excelutitlity {
	private workbook workbook;
	private DataFormater df;
	/**
	 * THIS METHOD IS USED TO INITIALIZE EXCEL FILE
	 * @param excelPath
	 */
	public void excelInit(String excelPath) {
		FileInputStream fis= null;
		try {
				fis=new FileInputStream (excelPath);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		
	}
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum);
	df=new DataFormatter();
	return df.formatCellFileOutputStream alue(workbook.getSheet(sheetName).getRow(rowNum).createCell);
}
public Map<String, String>readDataFromExcel(String sheetName){
	Map<String, String>map =new HashMap< >();
	df=new DataFormatter();
	Sheet sheet=workbook.getSheet(sheetName);
	for(int i=0;i<=sheet.getLastRowNum();i++) {
		String key= df.formatCellValue9sheet.getRow(i).getcell(0));
		String value= df.formateCellValue(sheet.get.Row(i.getCell(1));
		map.put(key, value);
	}
	return map;
		
	
}
public void writeToExcel(String sheetName, int rowNum,
		int cellNum,String value, String excelpath) {
	Cell cell= workbook.getSheet(sheetName).getRow(rowNum).createCell(cellNum);
	cell.setCellValue(value);
	fileOutputStream fos=null;
	try {
		fos=new FileOutputStream(excelpath);
	
}catch(FileNotFoundException e) {
	e.printStackTrace();
}
	try {
		workbook.write(fos);
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	try {
		workbook.write(fos);
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public void closeExcel() {
	try {
		workbook.close();
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
