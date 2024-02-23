

public class Car {
	public int gaz = 10 ;
	public void status() {
		System.out.println("Gas remaining: "+gaz+"/10");
		if (gaz==0) {
			System.out.println("Game Over!");
		}
	}

}
