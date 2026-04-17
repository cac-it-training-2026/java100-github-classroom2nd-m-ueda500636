/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double num4 = Double.parseDouble(string1);

		System.out.println("ショコラ　　>");
		String string2 = reader.readLine();
		//		入力された、購入するショコラの個数を格納する変数をnum5とする。
		double num5 = Double.parseDouble(string2);

		System.out.println("ピスターシュ　 >");
		String string3 = reader.readLine();
		//		入力された、購入するピスターシュの個数を格納する変数をnum6とする。
		double num6 = Double.parseDouble(string3);

		System.out.println("シトロン    　" + num4 + "個");
		System.out.println("ショコラ      " + num5 + "個");
		System.out.println("ピスターシュ　" + num6 + "個");

		//合計個数を表す変数をnum7とする。
		double num7 = num4 + num5 + num6;
		//合計金額を表す変数をnum8とする。
		int num8 = (int) (250 * num4 + 280 * num5 + 320 * num6);

		System.out.println("\n合計個数 " + num7 + "個");
		System.out.println("合計金額　" + num8 + "円");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。\n");

		//シトロンの残り個数を表す変数をnum9、ショコラの残り個数を表す変数をnum10、ピスターシュの残り個数を表す変数をnum11とする。
		int num9 = (int) (num1 - num4);
		int num10 = (int) (num2 - num5);
		int num11 = (int) (num3 - num6);

		System.out.println("シトロン    　\\250　・・・残り" + num9 + "個");
		System.out.println("ショコラ      \\280　・・・残り" + num10 + "個");
		System.out.println("ピスターシュ  \\320　・・・残り" + num11 + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		//合計金額を表す変数は、num8。
		System.out.println("売上合計　　　\\" + num8 + "");

		System.out.println("\n内訳");
		System.out.println("シトロン　　 \\" + (int) (250 * num4) + "  ・・・" + (int) (250 * num4 / num8 * 100) + "% ");
		System.out.println("ショコラ　　 \\" + (int) (280 * num5) + "　・・・" + (int) (280 * num5 / num8 * 100) + "%");
		System.out.println("ピスターシュ \\" + (int) (320 * num6) + "　・・・" + (int) (320 * num6 / num8 * 100) + "%");
	}

}
