package parseException3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class funcao {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public DayOfWeek dia_da_semana(String data) {
		
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate data1 = LocalDate.parse(data, formatter);
			DayOfWeek diasemana = data1.getDayOfWeek();
			return diasemana;
		}catch(DateTimeParseException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
		
	}
	
}
