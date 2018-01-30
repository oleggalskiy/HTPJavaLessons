package by.htp.javales.unit01.les03;
import java.util.Scanner;

public class list05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите x:");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		System.out.print("Введите y:");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
			}
		double temp;
		temp = Math.cos(x)-x/3;
		if (temp != 0) {
			z = Math.log(x) + y/temp;
		}else {
			System.out.println("Вывод");
			z = Double.NaN;
		}
		System.out.println("z="+z);
	}

}