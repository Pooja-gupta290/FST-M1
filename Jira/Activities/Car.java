
public class Car {
	
	String color;
	String model;
	String Transmission;
	int tyres;
	int speed;
	//Constructor
	public Car(String color, String model, String Transmission, int tyres, int speed) {
				
		this.color= color;
		this.model=model;
		this.Transmission=Transmission;
		this.tyres=tyres;
		this.speed=speed;
				
	}
	public void display() {
		System.out.println("Color:"+ color + ", Model:"+ model +", Transmission:"+Transmission +", tyres:"+tyres +", Speed:"+speed);
		
	}


}
