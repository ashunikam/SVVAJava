package coreJava3;

public class AutoBoxingAssignment {
	public static void main(String[] args) {
	int int1=4;
	float float1=2.3f;
	boolean boolean1=false;
	System.out.println(" Int Autoboxing");
	Integer intWrap=int1;
	System.out.println(intWrap+ " "+ int1 );
	System.out.println(" Float Autoboxing");
	Float floatWrap=float1;
	System.out.println(floatWrap+" "+float1);
	System.out.println(" Boolean Autoboxing");
	Boolean booleanWrap=boolean1;
	System.out.println(booleanWrap+" "+boolean1);
	System.out.println("--------------------------");
	System.out.println(" Int Unboxing");
	int1=intWrap;
	System.out.println(intWrap+ " "+ int1 );
	System.out.println(" Float Unboxing");
	float1=floatWrap;
	System.out.println(floatWrap+" "+float1);
	System.out.println("Boolean Unboxing");
	boolean1=booleanWrap;
	System.out.println(booleanWrap+" "+boolean1);
	
	}
}
