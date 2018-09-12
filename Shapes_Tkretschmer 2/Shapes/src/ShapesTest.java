
public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generates the math for each shape using these numbers.
		Cuboid cuboid = new Cuboid(3, 7, 9);
		Cylinder cylinder = new Cylinder(5, 3);
		Sphere sphere = new Sphere(2);
		
		// Prints the shapes by calling render.
		cuboid.render();
		cylinder.render();
		sphere.render();
		
		
		

	}

}
