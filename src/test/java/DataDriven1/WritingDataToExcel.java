package DataDriven1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file= new FileOutputStream("C:\\Users\\kousi\\eclipse-workspace\\MavenAutoPractise\\testData\\myfile.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 
		 XSSFSheet sheet=workbook.createSheet("Sample");
		 
		 XSSFRow row1=sheet.createRow(0);
		 row1.createCell(0).setCellValue("Java");
		 row1.createCell(1).setCellValue("Java1");
		 row1.createCell(2).setCellValue("Java2");
		 row1.createCell(3).setCellValue("Java3");
		 row1.createCell(4).setCellValue("Java4");
		 
		 XSSFRow row2=sheet.createRow(1);
		 row2.createCell(0).setCellValue("J");
		 row2.createCell(1).setCellValue("J1");
		 row2.createCell(2).setCellValue("J2");
		 row2.createCell(3).setCellValue("J3");
		 row2.createCell(4).setCellValue("J4");
		 workbook.write(file);
		 workbook.close();
		 file.close();
		 
		 System.out.println("File Created.......");
		 

	}

}
