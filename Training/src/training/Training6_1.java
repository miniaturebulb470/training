package training;

import training2_12.CenterForward;

public class Training6_1 {

	public static void main(String[] args) {
		CenterForward cf = new CenterForward("name",28);
		cf.info();
	
	}

	public static int fibo2(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibo2(n - 2) + fibo2(n - 1);
	}

	public static int[] fiboA(int c) {
		int[] a = new int[c];
		if (a.length == 1) {
			a[0] = 0;
			return a;
		} else if (a.length == 2) {
			a[0] = 0;
			a[1] = 1;
			return a;
		} else {
			a[0] = 0;
			a[1] = 1;
			for (int i = 2; i < c; i++) {
				a[i] = a[i - 1] + a[i - 2];
			}
		}
		return a;
	}

	public static boolean checkSosu(int a) {
		if (a <= 3) {
			return true;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] makeArray(int a, int b) {
		int c = b - a + 1;
		int[] s = new int[c];
		for (int i = 0; i < c; i++) {
			s[i] = a + i;
		}
		return s;
	}

	public static void printn() {
		System.out.println();
	}

	public static void print(String a) {
		System.out.print(a);
	}

	public static void print(int a) {
		System.out.print(a);
	}

	public static void print(int[] a) {
		for (int value : a) {
			print(value);
			printn();
		}
	}

}
