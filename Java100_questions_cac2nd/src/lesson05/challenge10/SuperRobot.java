package lesson05.challenge10;

public class SuperRobot {
	//フランベをするアルコールの量	
	int alcohol;
	//フランベをする時間	
	int flametime;

	void pourAlcohol() {
		System.out.println("お酒を" + alcohol + "cc入れます");
	}

	//フランベに使うアルコールの適量は、30cc～45cc。それを、ランダムで出力する。	
	void randomAlcohol() {
		alcohol = (int) (Math.random() * (45 - 30 + 1)) + 30;
	}

	//フランベを行う時間は、10分から20分が適切。それを、ランダムで出力する。	
	void randomFlametime() {
		flametime = (int) (Math.random() * (20 - 10 + 1)) + 10;
	}

	void flambe(int alcohol, int flametime) {
		System.out.println(flametime + "分、フランベを行います。");

	}

}
