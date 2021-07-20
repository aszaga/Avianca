package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static ArrayList<Map<String, String>> readExcel(String rutaDeExcel, String hojaDeExcel) throws IOException {
        ArrayList<Map<String, String>> arrayListDatoPlanTrabajo = new ArrayList<Map<String, String>>();
        Map<String, String> avianca = new HashMap<String, String>();
        File file = new File(rutaDeExcel);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(hojaDeExcel);
        Iterator<Row> rowIterator = newSheet.iterator();
        Row titulos = rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                cell.getColumnIndex();
                switch (cell.getCellTypeEnum()) {
                    case STRING:
                        avianca.put(titulos.getCell(cell.getColumnIndex()).toString(), cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        avianca.put(titulos.getCell(cell.getColumnIndex()).toString(), String.valueOf((long) cell.getNumericCellValue()));
                        break;
                    case BLANK:
                        avianca.put(titulos.getCell(cell.getColumnIndex()).toString(), "");
                        break;
                    default:
                }
            }
            arrayListDatoPlanTrabajo.add(avianca);
            avianca = new HashMap<String, String>();
        }
        return arrayListDatoPlanTrabajo;
    }

    public static void escribirLog(String texto) {
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("C:\\Users\\ASTRID\\OneDrive\\Documentos\\VueloAvianca.txt");

            
            fichero.write(texto + "\n");


            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepcion: " + ex.getMessage());
        }
    }


}
