package com.cg.ReqresAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProblemStatement2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ALTAFH\\OneDrive - Capgemini\\Desktop\\Excel Files\\File.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet workSheet = workBook.getSheetAt(0);
		XSSFSheet workSheetTwo = workBook.getSheetAt(1);
		System.out.println("---------------------------------------------");
		System.out.println(" Showing Mismatch Results ");
		System.out.println("---------------------------------------------");
		for (int i = 1; i < workSheet.getPhysicalNumberOfRows(); i++) {
			Row rowFromFirstSheet = workSheet.getRow(i);
			Row rowFromScndSheet = workSheetTwo.getRow(i);
			for (int c = 0; c < rowFromFirstSheet.getLastCellNum(); c++) {
				CellType string = rowFromFirstSheet.getCell(c).getCellType();
				if (rowFromFirstSheet.getCell(c).getCellType().equals("NUMERIC")) {
					if (rowFromFirstSheet.getCell(c).getNumericCellValue() != rowFromScndSheet.getCell(c)
							.getNumericCellValue()) {
						System.out.println((int) rowFromFirstSheet.getCell(c).getNumericCellValue() + " "
								+ rowFromScndSheet.getCell(c).getNumericCellValue() + " " + "at line number" + i);
					}
				} else if (rowFromFirstSheet.getCell(c).getCellType().toString().equals("STRING")) {
					if (rowFromFirstSheet.getCell(c).getStringCellValue() != rowFromScndSheet.getCell(c)
							.getStringCellValue()) {
						System.out.println(rowFromFirstSheet.getCell(c).getStringCellValue() + " "
								+ rowFromScndSheet.getCell(c).getStringCellValue() + " " + i);
					}

				}
			}

		}
		System.out.println("---------------------------------------------");
	}

}
