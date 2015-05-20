public class SortableStringVector extends StringVector {

	public SortableStringVector(int sz) {
		// 親クラスのコンストラクタ
		super(sz);
	}

	public SortableStringVector() {
		this(100);
	}

	// バブルソート
	// 上の要素と比較し、上のほうが大きければ互いに交換する
	// 下から順番にやると、小さい数字は交換されて上に順々に上がる。
	// 一番下から一番上まで1回通ると、一番小さい数字が一番上に上がってくる。
	void sort() {
		//int j = m_size - 1;
		int flag = m_size;

		// 下から上に順番に比較
		for(int j = m_size - 1 ; j > 0 && flag != 0 ; j--) {

			//int i = 0;
			flag = 0;

			// 上の方が大きければ入れ替え
			for (int i = 0 ; j > i ; i++) {

				if (m_vector[i] != null && m_vector[i+1] != null
					 && m_vector[i+1].compareTo(m_vector[i]) > 0 ) {
					// compareTo 辞書順に比較 後ろが大きければ正

					String a = m_vector[i+1];
					m_vector[i+1] = m_vector[i];
					m_vector[i] = a;
					flag = 1;
				}
			}
		}
	}

}