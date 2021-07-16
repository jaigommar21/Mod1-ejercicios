package pe.edu.tecsup.app.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

	final static String FORMAT_DATE = "dd/MM/YYYY";

	public static String getFechaActual() {
		// TODO Auto-generated method stub
		Calendar calendar = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
		return sdf.format(calendar.getTime());
		
	}

}
