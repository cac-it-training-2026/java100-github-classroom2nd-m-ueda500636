/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {

		int lastnum = item.length() - 1;
		//charAtは、引数の位置の文字を返すメソッド。
		//番号は0から始まるため、文字列の長さから1を引いた値が、文字列の末尾を指す数値になる。			
		char lastch = item.charAt(lastnum);
		//changeLastChar。ここでは、受け取った数字を英語表記に変換して戻すメソッド。		
		String changeStr = changeLastChar(lastch);

		if (changeStr != null) {
			StringBuffer str = new StringBuffer(item);
			str.replace(lastnum, lastch + 1, changeStr);
			this.item = new String(str);
		} else {
			this.item = item;
		}
	}

	//switch文を使い、数字を、それぞれの対応する英語に直す処理。
	private String changeLastChar(char ch) {
		String changeStr = null;
		switch (ch) {
		case '0':
			changeStr = "zero";
			break;

		case '1':
			changeStr = "one";
			break;

		case '2':
			changeStr = "two";
			break;

		case '3':
			changeStr = "three";
			break;

		case '4':
			changeStr = "four";
			break;

		case '5':
			changeStr = "five";
			break;

		case '6':
			changeStr = "six";
			break;

		case '7':
			changeStr = "seven";
			break;

		case '8':
			changeStr = "eight";
			break;

		case '9':
			changeStr = "nine";
			break;

		}
		return changeStr;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する

		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
