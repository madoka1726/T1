import java.io.*;

class Test {

	public static void main(String args[]) {


// �W�����͂���P�s���ǂݍ��݁A�t���ɂ��ĕ\�� Ctrl+ZorC�ŏI��
		StringStack stack = new StringStack(10);
		String str;

		// Ctrl+ZorC ��0(false)������
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
// ���O��ǂݍ���ŕ\��

		byte meibo[][] = new byte[4][];
		int i;

		for (i = 0; i < 4; i++) {
			System.out.print((i+1)+"�l�ڂ̖��O����͂��Ă�������");
			meibo[i] = readName();
		}
		for (i=0; i < meibo.length; i++) {
			System.out.println((i+1)+"�l�ڂ́F"+ new String(meibo[i]));
		}
*/

/*
// �z��
		int i;
		char a[] = {'A','B','C','D','E','F','G','H','I','J'};

		System.out.println("0����9�܂ł̐�������͂��Ă��������F");
		i = readNumber();

		if (0 <= i && i <= 9) {
			System.out.println(i+"--"+a[i]);
		}
*/
/*
// �����ăQ�[��
		int seikai = 1484;
		int count;
		int inp = -1;

		for (count = 1; count <= 10; count ++) {
			inp=-1;
			while (inp < 0 || inp > 9999) {
				inp = readNumber();
			}

			if (inp == seikai) {
				System.out.println(count + "��ڂŐ����ł���");
				break;
			}
			if (inp < seikai) {
				System.out.println("������");
			}
			if (inp > seikai) {
				System.out.println("�傫��");
			}
		}

		if (inp != seikai) {
				System.out.println("Game Over");
		}
*/

/*
// ���͂������̓���
		int month;
		System.out.println("������͂��Ă�������");
		month = readNumber();

		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"����31���ł�");
				break;
			case 2:
				System.out.println(month+"����28-29���ł�");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"����30���ł�");
				break;
			default:
				System.out.println("1-12����͂��Ă�������");
		}
	}
*/
	public static int readNumber() {
		byte b[] = new byte[100];
		try {
			System.in.read(b);
			// ������0�ɂȂ�
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

		// �������z��ɕϊ�����
		//byte [] bb="string".getBytes();  // byte�z��ւ̕ϊ�
		//char [] cc="string".toCharArray();  // char�z��ւ̕ϊ�

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
