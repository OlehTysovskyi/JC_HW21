package First_Task;

public class House {
	@MyAnnotation(params = "House - type annotation", value = "name of building type(String)")
	private String type;
	@MyAnnotation(params = "House - square annotation", value = "building square(int)")
	private int square;
	private int amountOfFloors;
	@MyAnnotation(params = "House - modern annotation")
	private boolean modern;
	public House(String type, int square, int amountOfFloors, boolean modern) {
		super();
		this.type = type;
		this.square = square;
		this.amountOfFloors = amountOfFloors;
		this.modern = modern;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	public int getAmountOfFloors() {
		return amountOfFloors;
	}
	public void setAmountOfFloors(int amountOfFloors) {
		this.amountOfFloors = amountOfFloors;
	}
	public boolean isModern() {
		return modern;
	}
	public void setModern(boolean modern) {
		this.modern = modern;
	}
	@Override
	public String toString() {
		return "House [type='" + type + "'; square=" + square + "m^2' amountOfFloors=" + amountOfFloors + ", modern=" + modern + "]";
	}
	
	
	
}
