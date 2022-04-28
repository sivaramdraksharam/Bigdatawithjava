
public class Car {
	//instance variable - class variables
	public String carNumber;
	public String carColor;
	private boolean keyStatus;
	private String engine;
	public static int wheels;
	public int seats;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public boolean isKeyStatus() {
		return keyStatus;
	}

	public void setKeyStatus(boolean keyStatus) {
		this.keyStatus = keyStatus;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	//non-static method - constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	//static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void start()
	{
		System.out.println("Car starts");
	}
	public static void stop()
	{
		System.out.println("Car stops!");
	}

}
