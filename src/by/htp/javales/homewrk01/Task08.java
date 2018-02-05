package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		double num;
		double rez;
		
		for (int i = 0; i < 3; i++) {
			num = readFromConsole("������� �������� �����:");
			if (num > 0) {
				rez = Math.pow(num, 2);
				System.out.println("������� ����� �����: " + rez);
			}
			if (num < 0) {
				rez = Math.pow(num, 4);
				System.out.println("����� � ��������� ������� �����: " + rez);
			}

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
