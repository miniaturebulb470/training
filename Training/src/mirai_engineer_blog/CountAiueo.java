package mirai_engineer_blog;

import java.util.Scanner;

public class CountAiueo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;

		System.out.printf("アルファベットを入力してください%n");
		String message = scan.nextLine();
		
		String sMessage = message.toLowerCase();//文字を小文字に統一する

		
		
		
		for (int i = 0; i < sMessage.length(); i++) {
			if (sMessage.charAt(i) == 'a') {
				counter++;
			}
			if (sMessage.charAt(i) == 'i') {
				counter++;
			}
			if (sMessage.charAt(i) == 'u') {
				counter++;
			}
			if (sMessage.charAt(i) == 'e') {
				counter++;
			}
			if (sMessage.charAt(i) == 'o') {
				counter++;
			}
		}


		
		
		char[] c = { 'a', 'i', 'u', 'e', 'o' };
		System.out.printf("%d%n", counter);
		counter = 0;
		for (int i = 0; i < sMessage.length(); i++) {
			for (int j = 0; j < c.length; j++) {
				if (sMessage.charAt(i) == c[j]) {
					counter++;
				}
			}
		}
		System.out.printf("%d%n", counter);
	}

}
