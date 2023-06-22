package coreJava6;

import java.time.LocalDate;
import java.util.Date;

public class X5 extends BMW{
	static int x5Cnt;
	LocalDate date;
	public X5(String color,double speed, boolean sport, boolean convertible,LocalDate date) {
		super(color,speed,sport, convertible);
		this.date=date;
		x5Cnt=x5Cnt+1;
	}

}
