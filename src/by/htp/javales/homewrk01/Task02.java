package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double frm;
		System.out.println("��������� �������: a^2-(b-c)^2+ln(b^2-1)");
		a = readFromConsole("������� ����� a:");
		b = readFromConsole("������� ����� b:");
		c = readFromConsole("������� ����� �");
		frm = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);
		System.out.println("���������:=" + frm);
	}

	public static double readFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("������� �������� ��������!" + message);
		}
		x = sc.nextDouble();
		return x;
	}

}
