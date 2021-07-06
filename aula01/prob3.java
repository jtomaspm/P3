package aula01;

class prob3 {
		
	public static void main (String args[]){
		Point p0 = new Point(0, 0);	
		Point p1 = new Point(0, 3);	
		Point p2 = new Point(2, 6);	
		Point p3 = new Point(5, 1);	
		Point p4 = new Point(13, 57);
		Circle c0 = new Circle(1, p0);
		Circle c1 = new Circle(3, p1);
		Circle c2 = new Circle(1, p4);
		Square s = new Square(4, p2);
		Rectangle r = new Rectangle(2, 5, p3);
		
		System.out.println("circle0:\n" + c0.toString() + "\n");
		System.out.println("circle1:\n" + c1.toString() + "\n");
		System.out.println("circle2:\n" + c2.toString() + "\n");
		System.out.println("c0.compareTo(c1):\n" + c0.compareTo(c1) + "\n");
		System.out.println("c0.interception(c1):\n" + c0.interception(c1) + "\n");
		System.out.println("c0.interception(c2):\n" + c0.interception(c2) + "\n");
		System.out.println("square:\n" + s.toString() + "\n");
		System.out.println("rectangle:\n" + r.toString());
		
		
		
	}
}

