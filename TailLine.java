class TailLine {
// 標準入力から１行ずつ読み込み、最後の５行を表示するプログラムを作成
// Ctrl + Zが押されたら 終了する
// with StringVectore
// with StringRingBuffer

	public static void main(String args[]) {
		StringRingBuffer buffer = new StringRingBuffer(5);

		String str;

		while(true){
			str = readLine();
			if (str.length() == 0) {
				break;
			}
//System.out.println(str);
			buffer.add(str);
		}

		System.out.println("--add--");

		for (int i = 0; i < buffer.getLength(); i++) {
			System.out.print(buffer.get(i));
		}
	}

	// 1行読み込んでString型で返す
	public static String readLine(){
		byte b[] = new byte[1024];
		try {
			System.in.read(b);
		}catch(Exception e){
			return null;
		}

		int i;
		for (i = 0; b[i] != 0 && i < b.length; i++);
			return new String(b,0,i);
	}
}