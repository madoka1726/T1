class TailLine {
// �W�����͂���P�s���ǂݍ��݁A�Ō�̂T�s��\������v���O�������쐬
// Ctrl + Z�������ꂽ�� �I������
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

	// 1�s�ǂݍ����String�^�ŕԂ�
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