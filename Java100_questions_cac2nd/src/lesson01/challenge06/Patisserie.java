/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");
		//		シトロンの個数を格納する変数をnum1とする。
		int num1 = 30;
		//		ショコラの個数を格納する変数をnum2とする。
		int num2 = 30;
		//		ピスターシュの個数を格納する変数をnum3とする。
		int num3 = 30;

		System.out.println("\n 本日のおすすめ商品です。\n");
		System.out.println("シトロン    　\\250　・・・残り" + num1 + "個");
		System.out.println("ショコラ      \\280　・・・残り" + num2 + "個");
		System.out.println("ピスターシュ  \\320　・・・残り" + num3 + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン　 >");
		String string1 = reader.readLine();
		//		入力された、購入するシトロンの個数を格納する変数をnum4とする。
		int num4 = Integer.parseInt(string1);

		System.out.println("ショコラ　　>");
		String str2 = reader.readLine();
		//		入力された、購入するショコラの個数を格納する変数をnum5とする。
		int num5 = Integer.parseInt(str2);

		System.out.println("ピスターシュ　 >");
		String str3 = reader.readLine();
		//		入力された、購入するピスターシュの個数を格納する変数をnum6とする。
		int num6 = Integer.parseInt(str3);

		System.out.println("シトロン    　" + num4 + "個");
		System.out.println("ショコラ      " + num5 + "個");
		System.out.println("ピスターシュ　" + num6 + "個");

		//合計個数を表す変数をnum7とする。
		int num7 = num4 + num5 + num6;
		//		合計金額を表す変数をnum8とする。
		int num8 = 250 * num4 + 280 * num5 + 320 * num6;

		System.out.println("\n合計個数 " + num7 + "個");
		System.out.println("合計金額　" + num8 + "円");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		//シトロンの残り個数を表す変数をnum9、ショコラの残り個数を表す変数をnum10、ピスターシュの残り個数を表す変数をnum11とする。
		int num9 = num1 - num4;
		int num10 = num2 - num5;
		int num11 = num3 - num6;

		System.out.println("シトロン    　\\250　・・・残り" + num9 + "個");
		System.out.println("ショコラ      \\280　・・・残り" + num10 + "個");
		System.out.println("ピスターシュ  \\320　・・・残り" + num11 + "個");

	}

}
