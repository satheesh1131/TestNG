package dataDriven;

import java.io.IOException;

import com.excel.methods.Excel_Methods;

public class ReadCell {
	public static void main(String[] args) throws IOException {
		Excel_Methods em = new Excel_Methods("C:\\Users\\dell\\Documents\\WorkBook\\MavenWorkBook.xlsx");
		System.out.println("The Value Of The Particular Cell :");
		String sN = em.getSheetName(0);
		System.out.println(em.getCellValue(sN, 0, 0));
		System.out.println("The Value Of The Row One Of The Sheet :");
		for(int i=0;i<em.getPhysicalCells(sN, 0);i++) {
			System.out.println(em.getCellValue(sN, 0, i));
		}
		System.out.println("The Value Of The Row Two Of The Sheet :");
		for(int i=0;i<em.getPhysicalCells(sN, 1);i++) {
			System.out.println(em.getCellValue(sN, 1, i));
		}
		System.out.println("The Value Of The Row Three Of The Sheet :");
		for(int i=0;i<em.getPhysicalCells(sN, 2);i++) {
			System.out.println(em.getCellValue(sN, 2, i));
		}
		System.out.println("The Values Of the Entire Sheet :");
		for(int i=0;i<em.getPhysicalRows(sN);i++) {
			for(int j=0;j<em.getPhysicalCells(sN, i);j++) {
				System.out.print(em.getCellValue(sN, i, j)+"  ");
			}
			System.out.println();
		}
		em.woorBookClose();
	}
}
