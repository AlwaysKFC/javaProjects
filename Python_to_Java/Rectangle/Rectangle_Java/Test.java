public class Test {
	public static void main(String[] args) {
		// TODO code application logic here
		Rectangle screen = new Rectangle(20, 15);
		Rectangle table = new Rectangle(30, 20);
		Rectangle board = new Rectangle(45, 25);
		
		System.out.println("Area: " + screen.area() + ", Perimeter: " + screen.perimeter());
		System.out.println("Area: " + table.area() + ", Perimeter: " + table.perimeter());
		System.out.println("Area: " + board.area() + ", Perimeter: " + board.perimeter());
		}
	
}
