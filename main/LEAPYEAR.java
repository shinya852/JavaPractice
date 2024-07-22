package main;

import java.util.Scanner;


public class LEAPYEAR {
	private static int number;
	public static void main(String[] args) {
		while (true) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("検証したい年を入力してください");
			String strNum = scanner.next();
			//数値の判定
			try{
				number = Integer.parseInt(strNum);
				//数値以外
			} catch (NumberFormatException e) {
				System.out.println("数値を入力してください");
			}
			//終了コードの判定→閏年の判定メソッド
			if(number == 0) {
				break;
			} else {
				boolean result = checkLeapYear(number);
				if(result == true) {
					System.out.println("入力値は閏年です");
				} else {
					System.out.println("入力値は閏年ではありません");
				}
			}
		}
		System.out.println("終了コードが入力されてたためプログラムを終了いたします");
	}
	public static boolean checkLeapYear(int iYear) {
		//メモ
		//閏年の条件
		//4年で割り切れる
		//100で割り切れるときは閏年ではない(400年は例外)
		if (iYear % 4 != 0) {
			return false;
		}else if (iYear % 100 != 0) {
			return true;
		}else if (iYear % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
}