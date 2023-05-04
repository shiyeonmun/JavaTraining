package t20230504;

import t20230503.Day;

public class ExCarTester2 {

	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2025,12,24));
		myCar.putSpec();
	}
}
