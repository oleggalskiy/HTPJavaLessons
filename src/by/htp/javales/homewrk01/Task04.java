package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rezab;
		double rezabc;

		a = readFromConsole("������� ����� a:");
		b = readFromConsole("������� ����� b:");

		if (a == b) {
			System.out.println("����� ���!");
		}else {
			
			c = readFromConsole("������� ����� �");
			rezab = Math.pow(a, 2)+Math.pow(b, 2);
			rezabc = a + b + c;
			System.out.println("a+b+c=" +rezabc +" "+rezab+ " ��� ������� ���������� �������");
		}
	}

	public static double readFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double d = 0;
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}
		d = sc.nextDouble();
		while (d <= 0) {
			System.out.println("������� �������� ������ ��� �� ������ ����!" + message);
			d = sc.nextDouble();
		}
		System.out.println("�������� �������.");
		return d;
	}
}
