package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	public static String getdata(String a, int b,int c) throws EncryptedDocumentException, IOException {
		FileInputStream source= new FileInputStream("C:\\Users\\Devang\\eclipse-workspace\\zerodha_automation\\src\\test\\resources\\selenium data.xlsx");
		String value=WorkbookFactory.create(source).getSheet(a).getRow(b).getCell(c).getStringCellValue();
		return value;
	}

}
