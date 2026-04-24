package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		String[] yamanotesen = { "東京", "新宿", "新橋", "御徒町", "五反田",
				"秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町",
				"目黒", "大崎", "原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里",
				"西日暮里", "駒込", "田端", "高田馬場", "神田", "鶯谷",
				"代々木", "新大久保", "巣鴨", "高縄ゲートウェイ" };

		boolean[] loopFlag = new boolean[yamanotesen.length];

		Arrays.fill(loopFlag, true);

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("ゲームスタート！");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//コンピューターの回答を、ランダムで出力する。		
		Random rand = new Random();

		//正解したときに、trueになる。		
		boolean answerFlag = false;

		//実行回数を数える変数をcountとする。		
		int count = 0;

		do {

			String str = reader.readLine();

			for (int i = 0; i < yamanotesen.length; i++) {
				//equals()メソッドは、二つの変数が同じオブジェクトを参照しているかを判定するもの。
				//文字列の比較を行うため、equals()メソッドを用いる。入力された駅名が、配列内の駅名と一致するかを判断。
				if (yamanotesen[i].equals(str)) {
					if (loopFlag[i]) {

						answerFlag = true;
						//一度答えた駅名は、trueにする。
						loopFlag[i] = false;

						break;
					} else {
						break;
					}
				}

			}

			//成功、失敗に関わらず、ゲームの実行回数を増やす。
			count++;

			//プレイヤーが誤答した場合　or 全ての駅名が入力された場合、ループを抜けて最後のif文に飛ぶ。			
			if (!answerFlag || (count == yamanotesen.length)) {

				break;
			}

			answerFlag = false;

			//answerFlagがtrueになるまで（正答するまで）繰り返す。コンピューター側の処理。			
			while (!answerFlag) {
				//全駅数の範囲で乱数を取得する				
				int num = rand.nextInt(yamanotesen.length);
				//その駅がすでに入力されたかを判定し、既出でなければ出力する。、				
				if (loopFlag[num]) {
					System.out.println(yamanotesen[num]);
					loopFlag[num] = false;
					answerFlag = true;
				}
			}
			count++;
			answerFlag = false;

			//駅名が全て入力されるまで繰り返す。			
		} while (count != yamanotesen.length);

		//駅名が全て入力されたら		
		if (count == yamanotesen.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}
}
