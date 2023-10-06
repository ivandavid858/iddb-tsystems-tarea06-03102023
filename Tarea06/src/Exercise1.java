

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		String figure = JOptionPane.showInputDialog("Introduce name of figure");
		
		Scanner sc = new Scanner(System.in);
		
		int radio = 5;
		int base = 4;
		int high = 7;
		int side = 3;
		
		if (figure.equals("circle"))
			System.out.println(calculateAreaCircle(radio));
		if (figure.equals("triangle"))
			System.out.println(calculateAreaTriangle(base, high));
		if (figure.equals("square"))
			System.out.println(Math.pow(side, 2));	

	}
	
	public static double calculateAreaCircle(int radio) {
		return Math.pow(radio, 2)*Math.PI;
	}
	
	public static double calculateAreaTriangle(int base, int high) {
		return base*high/2;
	}
	
	public static double calculateAreaSquare(int side) {
		return Math.pow(side, 2);
	}

}
