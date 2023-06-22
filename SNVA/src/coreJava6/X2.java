package coreJava6;

import java.time.LocalDate;
import java.util.Date;

public class X2 extends BMW{
	static int x2Cnt;
	LocalDate date;
	public X2(String color,double speed, boolean sport, boolean convertible,LocalDate date) {
		super(color,speed,sport, convertible);
		this.date=date;
		x2Cnt=x2Cnt+1;
	}

}
