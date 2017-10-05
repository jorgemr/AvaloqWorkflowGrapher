/**
 * 
 */
package com.jorgemr.projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @author Jm6
 *
 */
public class AvaloqWorkflowGrapher {

	private static final String FILE_NAME = "C:\\Users\\Jm6\\Desktop\\eclipse\\4\\AvaloqWorkFlowGrapher\\docs\\Copia de WFC.SECEVT2.xls";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("asdas");

		try {

			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			Workbook workbook = new HSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {

				Row currentRow = iterator.next();
				if (currentRow.getCell(4).getStringCellValue().equals("")) {
					Node n = new Node();
					n.setId((int)currentRow.getCell(3).getNumericCellValue());

					System.out.println(n);
				} else {
					Trans t = new Trans();
					if (currentRow.getCell(3).getCellTypeEnum() == CellType.NUMERIC) {
						t.setNodeId((int)(currentRow.getCell(3).getNumericCellValue()));
                    }
					if (currentRow.getCell(4).getCellTypeEnum() == CellType.NUMERIC) {
						t.setId((int)currentRow.getCell(4).getNumericCellValue());
                    }
					if (currentRow.getCell(28).getCellTypeEnum() == CellType.NUMERIC) {
						t.setStatement(currentRow.getCell(28).getStringCellValue());
                    }

					System.out.println(t);
				}

			}

			datatypeSheet = workbook.getSheetAt(1);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {

				Row currentRow = iterator.next();
				Rule r = new Rule();
				r.setName(currentRow.getCell(4).getStringCellValue());
				r.setStatement(currentRow.getCell(16).getStringCellValue());

				System.out.println(r);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
