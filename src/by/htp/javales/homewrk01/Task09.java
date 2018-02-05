package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;

		a = readFromConsole("������� �������� �:");
		b = readFromConsole("������� �������� b:");
		h = readFromConsole("������� �������� ���� h:");
		x = a;

		while (x <= b) {

			System.out.printf("[%2f] | [%2f] %n", x, (2 * Math.tan(x / 2) + 1));


			x = x + h;
		}
	}

	public static double readFromConsole(String message) {

		double x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("������� ���������� ��������!");
		}
		x = sc.nextDouble();
		while (x == 0) {
			System.out.println("�������� ������ ���� �� ������ 0!");
			sc.next();
			x = sc.nextDouble();
		}
		return x;
	}
}
