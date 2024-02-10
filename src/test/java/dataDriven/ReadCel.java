package dataDriven;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import com.excel.methods.Excel_Methods;

public class ReadCel {
	public static void main(String[] args) throws IOException {
		Excel_Methods em = new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		Object value = em.getValue(em.getSheetName(0), 0, 1);
		System.out.println(value);
		List<String> rowValue = em.getRowValue(em.getSheetName(0), 0);
		System.out.println(rowValue);
		LinkedHashMap<String,String> sheetValue = em.getSheetValue(em.getSheetName(0));
		System.out.println(sheetValue);
		em.woorBookClose();
	}
}
