public class StringRingBuffer {
	StringVector m_vect; // �z��{��(m_vector)�𑀍삷��C���X�^���X�̓��ꕨ
	int	m_nSize; // �o�b�t�@�[�T�C�Y
	int	m_nIndexAdd; // ���̊i�[����ꏊ�̃C���f�b�N�X
	int	m_nIndexGet; // ��ԌÂ��f�[�^���i�[����Ă���C���f�b�N�X
	int	m_nLength; // ���݊i�[����Ă���v�f��

	public StringRingBuffer(int size) {
		m_vect = new StringVector(size);
		m_nSize = size;
		m_nIndexAdd = 0;
		m_nIndexGet = 0;
		m_nLength = 0;
	}

	// �f�[�^���i�[
	void add(String value) {
		// �f�[�^���i�[
		m_vect.at(m_nIndexAdd++ , value);

		// ���Ɋi�[����C���f�b�N�X���X�V
			// ����������Z�q
			// m_nIndexAdd��m_nSize�Ŋ������]��=>m_nSize-m_nIndexAdd
//System.out.println("size:"+m_nSize);
//System.out.println("add1:"+m_nIndexAdd);

		m_nIndexAdd %= m_nSize;
//System.out.println("add1:"+m_nIndexAdd);


		// �i�[����Ă���v�f���𑝂₷
		if (m_nLength < m_nSize) {
			m_nLength++;
		}

		// ��ԌÂ��f�[�^�������C���f�b�N�X���X�V
		m_nIndexGet = m_nLength == m_nSize ? m_nIndexAdd : 0;
	}

	// �f�[�^���擾
	String get(int index) {
		// �����`�F�b�N
		if (m_nLength <= index) {
			System.err.println("Out of Range");
			System.exit(1);
		}

		return m_vect.at((m_nIndexGet + index) % m_nSize);
	}

	// �v�f����Ԃ�
	int getLength() {
		return m_nLength;
	}
}