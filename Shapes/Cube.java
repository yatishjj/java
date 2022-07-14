package stream.Shapes;

public class Cube extends Shape{
	@Override
	void draw() {
		System.out.println("Cube");
	}
	
	public static void main(String[] args) {
		Cube cube = new Cube();
		cube.draw();
	}
}
