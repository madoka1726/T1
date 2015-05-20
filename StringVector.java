import java.util.Arrays;
public class StringVector{
	protected int m_size; // �z��T�C�Y
	protected String m_vector[]; // �z��

	public StringVector( int sz) {
		m_size = sz;

		// size��int�z�����������Ɋ��蓖��
		m_vector = new String[m_size];
	}

	public StringVector() {
		this(100);
	}

	// ���
	public void at(int n, String value) {
//System.out.println("n:" + n);
//System.out.println("v:" + value);
//System.out.println("m_size:" + m_size);

		if (n >= m_size || n < 0) {
			System.err.println("invalid0 index");
			System.exit(1);
		}

		m_vector[n] = value;
//System.out.println(Arrays.toString(m_vector));
	}

	// �擾
	public String at(int n) {
		if (n >= m_size || n < 0) {
			System.err.println("invalid1 index");
			System.exit(1);
		}
		return m_vector[n];
	}

	// ���݂̔z��T�C�Y�擾
	public int getLength() {
		return m_size;
	}

}