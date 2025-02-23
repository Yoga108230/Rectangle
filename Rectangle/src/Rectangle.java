public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width= width;
		this.height= height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return 2* (width+ height);
	}
	
	public void display() {
		System.out.println("Area of the Rectangle: "+ getArea());
		System.out.println("Perimeter of the Rectangle: "+ getPerimeter());
	}

	public static void main(String[] args) {
		Rectangle rect= new Rectangle(10, 5);
		
		rect.display();

	}

}
