package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int countNumb;
		int countRez = 0;
		double tmp;

		countNumb = enterCountNumb();
		for (int i = 0; i < countNumb; i++) {
			tmp = enterNumb();
			if (Math.floor(tmp) % 2 == 0) {
				if (Math.floor(tmp) > 15) {
					countRez++;
				}
			}

		}
		System.out.println("���������� ������ ����� � ����� >15:= " + countRez);

	}

	public static int enterCountNumb() { // ������ ���������� ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int b;

		System.out.println("������� ���������� ����:");
		while (!sc.hasNextInt()) {
			System.out.println("������� ����� �����");
			sc.next();
		}
		b = sc.nextInt();
		while (b <= 0) {
			System.out.println("������� ������������� �����!!!:");
			b = sc.nextInt();
		}
		return b;
	}

	public static double enterNumb() { // ������ ��������� ���� � �������
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		double d;

		System.out.println("������� �����:");
		while (!sc2.hasNextDouble()) {
			System.out.println("������� ������������ �����");
			sc2.next();
		}
		d = sc2.nextDouble();
		return d;
	}
}
