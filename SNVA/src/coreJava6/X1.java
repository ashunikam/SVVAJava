package coreJava6;

import java.time.LocalDate;
import java.util.Date;

public class X1 extends BMW{
	static int x1Cnt;
	LocalDate date;
	public X1(String color, double speed, boolean sport, boolean convertible, LocalDate date) {
		super(color,speed,sport, convertible);
		this.date=date;
		x1Cnt=x1Cnt+1;
	}
	

}
