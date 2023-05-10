package t20230506;

import java.util.Iterator;

public class TriangleLU extends AbstTriangle {

	public TriangleLU(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleLU(length:" + getLength() + ")";
	}
	
	public void draw() {
		for (int i = 1; i <= 1; i--) {
			System.out.print('*');
			System.out.println();
		}
	}
}

