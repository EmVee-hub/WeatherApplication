package WeatherAppImplementation;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class DailyWeather extends WeatherUnit {
	private List<HourlyWeather> hours;
	Calendar date;
	
	public DailyWeather(double temperature, Calendar date, List<HourlyWeather> hours) {
		super(temperature);
		this.date = date;
		this.hours = hours;
	}

	public List<HourlyWeather> getHours() {
		return hours;
	}

	public Calendar getDate() {
		return date;
	}

}
