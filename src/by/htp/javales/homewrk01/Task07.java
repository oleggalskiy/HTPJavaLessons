package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double rez;
		a = readFromConsole("������� �������� �:");
		b = readFromConsole("������� �������� b:");
		c = readFromConsole("������� �������� c:");
		d = readFromConsole("������� �������� d:");
		rez = (a / c * b / d) - (a * b - c) / (c * d);
		// ��� �������� ������� ��������
		/*System.out.println("�������� ��������� a/c=" + (a / c));
		System.out.println("�������� ��������� b/d=" + (b / d));
		System.out.println("�������� ��������� a*b-c=" + (a * b - c));
		System.out.println("�������� ��������� c*d =" + (c * d));*/
		System.out.println("�������� ��������� =" + rez);

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
