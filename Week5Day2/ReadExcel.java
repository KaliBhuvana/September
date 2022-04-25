package Week5Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

/*	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wb= new XSSFWorkbook("./Data/CreateLead.xlsx");
XSSFSheet ws = wb.getSheet("Lead");
int rowNum = ws.getLastRowNum();
int cellNum = ws.getRow(0).getLastCellNum();
for (int i = 1; i <=rowNum; i++) {
	for (int j = 0; j < cellNum; j++) {
		String text = ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(text);
	}
}
	}*/

	public static String[][] readData(String excelName) {
		// TODO Auto-generated method stub
		return ReadExcel.readData(excelName);
	}

}
