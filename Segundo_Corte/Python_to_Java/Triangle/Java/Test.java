public class Test {
	public static void main(String[] args) {
		// TODO code application logic here
		Triangle half_pizza = new Triangle(10, 20);
		Triangle half_piramid_face = new Triangle(100, 500);
		Triangle half_signal = new Triangle(20, 40);
		
		System.out.println("Area: " + half_pizza.area() + ", Perimeter: " + half_pizza.perimeter());
		System.out.println("Area: " + half_piramid_face.area() + ", Perimeter: " + half_piramid_face.perimeter());
		System.out.println("Area: " + half_signal.area() + ", Perimeter: " + half_signal.perimeter());
		}
	
}
