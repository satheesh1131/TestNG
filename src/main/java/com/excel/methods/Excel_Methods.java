package com.excel.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Methods {
	File f;
	FileInputStream fis;
	XSSFWorkbook wB;
	public Excel_Methods(String file) throws IOException {
		f = new File(file);
		fis = new FileInputStream(f);
		wB = new XSSFWorkbook(fis);
	}
	/**
	 * Return the value of the cell in its own type as Numeric or String and other type values into String.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public Object getValue(String sheetName,int rowIndex,int cellIndex) {
		if(getCellType(sheetName, rowIndex, cellIndex).equals(CellType.STRING)) {
			return getCellValueText(sheetName, rowIndex, cellIndex);
		}else if(getCellType(sheetName, rowIndex, cellIndex).equals(CellType.NUMERIC)) {
			return getCellValueNum(sheetName, rowIndex, cellIndex);
		}else {
			return getCellValue(sheetName, rowIndex, cellIndex);
		}
	}
	/**
	 * Get the value of the given cell of the given row of the given sheet and return in String.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public String getCellValue(String sheetName,int rowIndex,int cellIndex) {
		DataFormatter dt = new DataFormatter();
		return dt.formatCellValue(wB.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex));
	}
	/**
	 * Return the numeric value of the given cell.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public int getCellValueNum(String sheetName,int rowIndex,int cellIndex) {
		return (int) wB.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}
	/**
	 * Return the String value of the given cell.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public String getCellValueText(String sheetName,int rowIndex,int cellIndex) {
		return wB.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}
	/**
	 * Return all values in the given row in the List<String>.
	 * @param sheetName
	 * @param rowIndex
	 * @return
	 */
	public List<String> getRowValue(String sheetName,int rowIndex){
		DataFormatter dt = new DataFormatter();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<getPhysicalCells(sheetName, rowIndex);i++) {
			list.add( dt.formatCellValue(wB.getSheet(sheetName).getRow(rowIndex).getCell(i)));
		}
		return list;
	}
	public LinkedHashMap<String, String> getSheetValue(String sheetName){
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		for(int i=0;i<getPhysicalRows(sheetName);i++) {
			for(int j=0;j<getPhysicalCells(sheetName, i);j++) {
				hm.put("s"+(wB.getSheetIndex(wB.getSheet(sheetName))+1)+"r"+(i+1)+"c"+(j+1),getCellValue(sheetName, i, j));
			}
		}
		return hm;
	}
	/**
	 * Return the number of physically defined rows in the given sheet.
	 * @param sheetName
	 * @return
	 */
	public int getPhysicalRows(String sheetName) {
		return wB.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	/**
	 * Return the number of physically defined cells in the given row of the given sheet.
	 * @param sheetName
	 * @param rowIndex
	 * @return
	 */
	public int getPhysicalCells(String sheetName,int rowIndex) {
		return wB.getSheet(sheetName).getRow(rowIndex).getPhysicalNumberOfCells();
	}
	/**
	 * Return the name of the sheet of the given Index in String.
	 * @param sheetIndex
	 * @return
	 */
	public String getSheetName(int sheetIndex) {
		return wB.getSheetName(sheetIndex);
	}
	/**
	 * Return the CellType of the given cell.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public CellType getCellType(String sheetName,int rowIndex,int cellIndex) {
		return wB.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getCellType();
	}
	/**
	 * Closes the workbook.
	 * @throws IOException
	 */
	public void woorBookClose() throws IOException {
		wB.close();
	}
	
}
