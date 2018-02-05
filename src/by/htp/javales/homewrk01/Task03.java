package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double rezbc;
		double rezabc;

		a = readFromConsole("������� ����� a:");
		b = readFromConsole("������� ����� b:");

		if (a > b) {
			c = readFromConsole("������� ����� �");
			rezbc = b + c;
			System.out.println("��������� b+c:=" + rezbc);
		}

		if (a == b) {
			System.out.println("�����");
		}
		if (a < b) {
			c = readFromConsole("������� ����� �");
			rezabc = a + b + c;
			System.out.println("a+b+c=" + rezabc + " ����� ���!");
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
