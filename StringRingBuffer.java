public class StringRingBuffer {
	StringVector m_vect; // 配列本体(m_vector)を操作するインスタンスの入れ物
	int	m_nSize; // バッファーサイズ
	int	m_nIndexAdd; // 次の格納する場所のインデックス
	int	m_nIndexGet; // 一番古いデータが格納されているインデックス
	int	m_nLength; // 現在格納されている要素数

	public StringRingBuffer(int size) {
		m_vect = new StringVector(size);
		m_nSize = size;
		m_nIndexAdd = 0;
		m_nIndexGet = 0;
		m_nLength = 0;
	}

	// データを格納
	void add(String value) {
		// データを格納
		m_vect.at(m_nIndexAdd++ , value);

		// 次に格納するインデックスを更新
			// 複合代入演算子
			// m_nIndexAddをm_nSizeで割った余り=>m_nSize-m_nIndexAdd
//System.out.println("size:"+m_nSize);
//System.out.println("add1:"+m_nIndexAdd);

		m_nIndexAdd %= m_nSize;
//System.out.println("add1:"+m_nIndexAdd);


		// 格納されている要素数を増やす
		if (m_nLength < m_nSize) {
			m_nLength++;
		}

		// 一番古いデータを示すインデックスを更新
		m_nIndexGet = m_nLength == m_nSize ? m_nIndexAdd : 0;
	}

	// データを取得
	String get(int index) {
		// 引数チェック
		if (m_nLength <= index) {
			System.err.println("Out of Range");
			System.exit(1);
		}

		return m_vect.at((m_nIndexGet + index) % m_nSize);
	}

	// 要素数を返す
	int getLength() {
		return m_nLength;
	}
}