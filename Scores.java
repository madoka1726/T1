public class Scores {
	public static void main(String[] args) {
		//int[] scores;
		int[] scores = new int[]{1,2,3,4};

		int cnt = scores.length;
		for (int i = 0; i < cnt; i++) {
			System.out.println(scores[i]);
		}

//		String a = "";
		for (int i=1; i < 10; i++) {
		String a = "";

			for (int j=1; j < 10; j++) {
				a += i * j + "";
			}
			//System.out.println(a);
		}

		sub();
	}

	public static void sub() {
		System.out.println("Sub!");
	}
}