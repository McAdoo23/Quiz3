public abstract class Triangle extends GeometricObject {
	//Data fields with default values
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
	//no arg constructor
	
	}
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;	
	}
	//getters for side1 2 and 3
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	//My setters for side 1 2 and 3
	public void setside1(double side1){
		this.side1 = side1;
	}
	public void setside2(double side2){
		this.side2 = side2;
	}
	public void setside3(double side3){
		this.side3 = side3;
	}
	
	public double getArea() {
		//Heron's triangle equation area = (a+b+c)/2
		return (side1 + side2 + side3)/2;
	}
	
	public double getPerimeter() {
		//Perimeter equation
		return side1 + side2 + side3;
	}
	public String toString(){
		return "For this triangle side1 ="+ side1 + "side2 =" + side2 + "side3 = " + side3;
	}
		
	}
