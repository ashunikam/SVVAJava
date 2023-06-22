package coreJava5;

public class Triangle extends Figure{
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
		
	}

	
	double area() {
		
		return (0.5*dim1*dim2);
	}
	

}
