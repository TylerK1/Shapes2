
public class Sphere extends Shape {
	
	// Setting private variable called radius to 0.
	private float radius = 0;

	// Create super constructor and reinstate the variable.
	public Sphere(float radius) {
		super();
		this.radius = radius;
		
	}
	
	// Make private variable public.
	public float getRadius() {
		return radius;
	}
	
	// Set private variable to public.
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Creates a formula for surface area of a sphere.
	@Override
	public float surfaceArea() {
		float surface = (float) (4 * Math.PI * (radius * radius));
		return surface;
	}
	
	// Creates a formula for volume of a sphere.
	@Override
	public float volume() {
		float volume = (float) (4/3 * Math.PI * (radius * radius * radius));
		return volume;
	}
	
	// Print outcome of surface area and volume of a sphere.
	@Override
	public void render() {
		System.out.println("The surfaceArea of your Sphere is:" + surfaceArea());
		System.out.println("The volume of your Sphere is:" + volume());
		System.out.println("");
		
	}

	

	
}
