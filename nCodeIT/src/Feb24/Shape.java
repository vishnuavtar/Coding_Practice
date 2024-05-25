package Feb24;


interface Shape {
	double area();
	double perimeter();
}

class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {

		return length * breadth;
	}

	@Override
	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}

