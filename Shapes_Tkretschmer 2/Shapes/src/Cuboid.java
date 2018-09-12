
public class Cuboid extends Shape {
	
	// Setting a private variable called width to 0.
	private float width = 0;
	
	// Setting a private variable called height to 0.
	private float height = 0;
	
	// Setting a private variable called depth to 0.
	private float depth = 0;
	
	// Create a super constructor and reinstate variables.
	public Cuboid(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// Make private variables public
	public float getWidth() {
		return width;
	}
	
	// Set private variables public
	public void setWidth(float width) {
		this.width = width;
	}
	
	// Make private variables public
	public float getHeight() {
		return height;
	}
	
	// Set private variables public
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Make private variables public 
	public float getDepth() {
		return depth;
	}
	
	// Set private variables to public
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	// Creates a formula for surface area of a cuboid.
	@Override
	public float surfaceArea() {
		float surface = 6 * this.height;
		return surface;
	}
	
	// Creates a formula for volume of a cuboid.
	@Override
	public float volume() {
		float volume = height * width * depth;
		return volume;
	}

	// Print outcome of Surface Area and Volume of cuboid.
	@Override
	public void render() {
		System.out.println("The surfaceArea of your Cuboid is:" + surfaceArea());
		System.out.println("The volume of your Cuboid is:" + volume());
		System.out.println("");
		
	}



	




	
	
	




}
