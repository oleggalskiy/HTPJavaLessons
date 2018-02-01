package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rezab;
		double rezabc;

		a = readFromConsole("Введите число a:");
		b = readFromConsole("Введите число b:");

		if (a == b) {
			System.out.println("Новый Год!");
		}else {
			
			c = readFromConsole("Введите число с");
			rezab = Math.pow(a, 2)+Math.pow(b, 2);
			rezabc = a + b + c;
			System.out.println("a+b+c=" +rezabc +" "+rezab+ " моя любимая футбольная команда");
		}
	}

	public static double readFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Введите валидное значение!" + message);
		}
		x = sc.nextDouble();
		return x;
	}
}
