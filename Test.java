import java.io.*;

class Test {

	public static void main(String args[]) {


// 標準入力から１行ずつ読み込み、逆順にして表示 Ctrl+ZorCで終了
		StringStack stack = new StringStack(10);
		String str;

		// Ctrl+ZorC で0(false)がくる
		while(true) {
			str = readLine();
			if (str.length() == 0) {
				break;
			}
			stack.push(str);
		}
		System.out.println("---end---");
		System.out.println("len:" + stack.getLength());

		while(stack.getLength() > 0) {
			System.out.print("pop :"+ stack.pop());
			System.out.print("peek:"+ stack.peek());
		}
	}



/*
// 名前を読み込んで表示

		byte meibo[][] = new byte[4][];
		int i;

		for (i = 0; i < 4; i++) {
			System.out.print((i+1)+"人目の名前を入力してください");
			meibo[i] = readName();
		}
		for (i=0; i < meibo.length; i++) {
			System.out.println((i+1)+"人目は："+ new String(meibo[i]));
		}
*/

/*
// 配列
		int i;
		char a[] = {'A','B','C','D','E','F','G','H','I','J'};

		System.out.println("0から9までの数字を入力してください：");
		i = readNumber();

		if (0 <= i && i <= 9) {
			System.out.println(i+"--"+a[i]);
		}
*/
/*
// 数あてゲーム
		int seikai = 1484;
		int count;
		int inp = -1;

		for (count = 1; count <= 10; count ++) {
			inp=-1;
			while (inp < 0 || inp > 9999) {
				inp = readNumber();
			}

			if (inp == seikai) {
				System.out.println(count + "回目で正解ですね");
				break;
			}
			if (inp < seikai) {
				System.out.println("小さい");
			}
			if (inp > seikai) {
				System.out.println("大きい");
			}
		}

		if (inp != seikai) {
				System.out.println("Game Over");
		}
*/

/*
// 入力した月の日数
		int month;
		System.out.println("月を入力してください");
		month = readNumber();

		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"月は31日です");
				break;
			case 2:
				System.out.println(month+"月は28-29日です");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"月は30日です");
				break;
			default:
				System.out.println("1-12を入力してください");
		}
	}
*/
	public static int readNumber() {
		byte b[] = new byte[100];
		try {
			System.in.read(b);
			// 文字は0になる
			return Integer.parseInt((new String(b)).trim());
		}catch(Exception e){
			return 0;
		}
	}

	public static byte[] readName() {
		byte b[] = new byte[20];
		try {
			System.in.read(b);
		} catch(Exception e) {
		}

		// 文字列を配列に変換する
		//byte [] bb="string".getBytes();  // byte配列への変換
		//char [] cc="string".toCharArray();  // char配列への変換

		return (new String(b)).trim().getBytes();
	}

	public static String readLine() {
		byte b[] = new byte[1024];
		try {
			System.in.read(b);
		} catch(Exception e) {
			return null;
		}

		int i;
		for (i = 0; b[i] != 0 && i < b.length; i++);
		return new String(b , 0, i);
	}
}
