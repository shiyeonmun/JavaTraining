package t20230504;

import t20230503.Day;

public class ExCar extends Car{
	private double totalMileage;

	ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}
	
	public double getTotalMileage() {
		return totalMileage;
	}
	
	public void putSpec() {
		super.putSpec();
		System.out.printf("총 주행거리: %.2fkm\n", totalMileage);
	}
	
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy*dy);
		if(!super.move(dx, dy))
			return false;
		else {
			totalMileage += dist;
			return true;
		}
	}

}
