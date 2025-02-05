package mirai_engineer_blog;

public class Main2_16 {

	public static void main(String[] args) {

		try {
			// 分子変数
			int numerator = 4200;
			// 分母変数
			int denominator = 0;
			// コマンドライン引数を整数値に変換する
			denominator = Integer.parseInt(args[0]);
			// 割り算結果変数に代入
			int result = numerator / denominator;
			System.out.println("割り算の結果は" + result + "です");

		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (NumberFormatException e) {
			System.out.printf("コマンドライン引数には整数を指定してください%n");
		} catch (ArithmeticException e) {
			System.out.printf("コマンドライン引数には0以外の整数を指定してください%n");
		}finally{
			System.out.printf("プログラムを終了します%n");

		}

	}

}
