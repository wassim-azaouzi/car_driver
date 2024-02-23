
public class Driver extends Car {
	public void drive() {
		System.out.println("You drive the car");
		gaz-=1;
		status();
		
	}
	public void boost(){ 
		if (gaz > 3 ) {
		System.out.println("You boost the car");
		 gaz-=3;}
		else {
			System.out.println("You can't boost the car");
		}
		
		status();
	}
	public void  refuel(){
		if(gaz < 8 ) {
			System.out.println("You're fueling the car");
			gaz+=2;
		}
		else {
			System.out.println("You can't fuel the car");
		}
		status();
	}
}
