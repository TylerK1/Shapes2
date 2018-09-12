
public class Cylinder extends Shape {
	
	// Setting a private variable called radius to 0.
	private float radius = 0;
	
	// Setting a private variable called height to 0.
	private float height = 0;

	// Create a super constructor and reinstate the variables.
	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
		
	}
	
	// Make private variables public.
	public float getRadius() {
		return radius;
	}
	
	// Set private variable to public.
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Make private variables public.
	public float getHeight() {
		return height;
	}
	
	// Set private variable to public.
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Creates a formula for the surface area of a cylinder.
	@Override
	public float surfaceArea() {
		float surface = (float) (2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius));
		return surface;
	}
	
	// Creates a formula for the volume of a cylinder.
	@Override
	public float volume() {
		float volume = (float) (Math.PI * (radius * radius) * height);
		return volume;
	}
	
	// Print outcome of surface area and volume of cylinder.
	@Override
	public void render() {
		System.out.println("The surfaceArea of your Cylinder is:" + surfaceArea());
		System.out.println("The volume of your Cylinder is:" + volume());
		System.out.println("");
		
	}



	

}
