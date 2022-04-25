package Week3Day1;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw=new BMW();
		System.out.println(bmw);
int carWheelsCount = bmw.carWheelsCount;
bmw.driveVehicle();
bmw.applyBrake();
bmw.applyGear();
bmw.enableAirBag();
Audi audi=new Audi();
System.out.println("audi");
int carWheelsCount2 = audi.carWheelsCount;
audi.applyBrake();
audi.applyGear();

	}

}
