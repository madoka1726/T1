public class SortableStringVector extends StringVector {

	public SortableStringVector(int sz) {
		// �e�N���X�̃R���X�g���N�^
		super(sz);
	}

	public SortableStringVector() {
		this(100);
	}

	// �o�u���\�[�g
	// ��̗v�f�Ɣ�r���A��̂ق����傫����Ό݂��Ɍ�������
	// �����珇�Ԃɂ��ƁA�����������͌�������ď�ɏ��X�ɏオ��B
	// ��ԉ������ԏ�܂�1��ʂ�ƁA��ԏ�������������ԏ�ɏオ���Ă���B
	void sort() {
		//int j = m_size - 1;
		int flag = m_size;

		// �������ɏ��Ԃɔ�r
		for(int j = m_size - 1 ; j > 0 && flag != 0 ; j--) {

			//int i = 0;
			flag = 0;

			// ��̕����傫����Γ���ւ�
			for (int i = 0 ; j > i ; i++) {

				if (m_vector[i] != null && m_vector[i+1] != null
					 && m_vector[i+1].compareTo(m_vector[i]) > 0 ) {
					// compareTo �������ɔ�r ��낪�傫����ΐ�

					String a = m_vector[i+1];
					m_vector[i+1] = m_vector[i];
					m_vector[i] = a;
					flag = 1;
				}
			}
		}
	}

}