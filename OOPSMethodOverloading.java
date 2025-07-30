class Shape {
	
	public int area(int side) {
		System.out.println("Square");
		return side * side;
	}
	
	public int area(int l, int b) {
		System.out.println("Rectangle");
		return l * b;
	}
	
	public float area(float radius) {
		System.out.println("Circle");
		return 3.14f * radius * radius;
	}
}
public class OOPSMethodOverloading {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		
		System.out.println("Area of square: " + s1.area(10) + "sq.units");
		System.out.print("\n");
		
		System.out.println("Area of rectangle: " + s1.area(10, 20) + "sq.units");
		System.out.print("\n");
		
		System.out.println("Area of circle: " + s1.area(10.00f) + "sq.units");
		
	}
}
