package by.htp.javales.homewrk01;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int countNumb;
		int tmp = 0;
		int countModless3 = 0;
		int sumMul3 = 0;
		int countEven = 0;

		countNumb = enterCountNumb();
		for (int i = 0; i < countNumb; i++) {
			tmp = enterNumb();
			if (tmp % 2 == 0) {
				countEven++;
			}
			if (tmp % 3 == 0) {
				sumMul3 = sumMul3 + tmp;
			}
			if (Math.abs(tmp) < 3) {
				countModless3++;
			}

		}
		System.out.println("����������� ������ �����:= " + countEven);
		System.out.println("����� ������� 3 := " + sumMul3);
		System.out.println("���������� ����� ������ ������� < 3:= " + countModless3);
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

	public static int enterNumb() { // ������ ��������� ���� � �������
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int d;

		System.out.println("������� �����:");
		while (!sc2.hasNextInt()) {
			System.out.println("������� ����� �����");
			sc2.next();
		}
		d = sc2.nextInt();
		return d;
	}

}
