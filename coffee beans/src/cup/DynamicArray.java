package cup;

public class DynamicArray {

	private int[] data_;
	private int size_;

	public DynamicArray(int num) {
		if (num < 1)
			data_ = null;
		else {
			data_ = new int[num];
			size_ = 0;

		}

	}

	public void PushBack(int value) {
		if (size_ >= data_.length) {
			int[] data = new int[data_.length * 2];
			for (int i = 0; i < data_.length; ++i) {
				data[i] = data_[i];
			}
			data_ = data;

		}
		data_[size_] = value;
		size_++;
	}

	public void Set(int index, int value) {
		data_[index] = value;
	}

	public int Get(int index) {
		return data_[index];
	}

	public int FindNum(int value) {

		int middle = data_.length / 2;
		int left = 0;
		int right = data_.length;

		while (true) {
			if (left == right) {
				return -1;
			}
			if (value < data_[middle]) {
				right = middle;
				middle = (left + right) / 2;
			} else if (value > data_[middle]) {
				left = middle + 1;
				middle = (left + right) / 2;
			} else {
				return middle;
			}
		}

	}

	public void BubbleSort(boolean k) {
		int tmp = 0;
		if (k == true) {
			for (int i = size_ - 1; i > 0; i--)
				for (int j = 0; j < i; j++) {
					if (data_[j] > data_[j + 1]) {
						tmp = data_[j + 1];
						data_[j + 1] = data_[j];
						data_[j] = tmp;
					}
				}
		} else if (k == false) {
			for (int i = size_ - 1; i > 0; i--)
				for (int j = 0; j < i; j++) {
					if (data_[j] < data_[j + 1]) {
						tmp = data_[j + 1];
						data_[j + 1] = data_[j];
						data_[j] = tmp;
					}
				}
		}
	}

	public void BinSort(boolean k) {
		int max = data_[0];
		for (int i = 0; i < size_; i++) {
			if (data_[i] > max) {
				max = data_[i];
			}
		}
		max++;
		int[] data = new int[max];
		for (int count = 0; count < max; count++) {
			data[count] = -1;
		}
		if (k == true) {
			for (int i = 0; i < size_; i++) {
				for (int j = 0; j < max; j++) {
					if (j == data_[i])
						data[j] = data_[i];

				}
			}
			int m = 0;
			for (int n = 0; n < max; n++) {
				if (data[n] != -1) {
					data_[m] = data[n];
					m++;
				}
			}
		} else if (k == false) {
			for (int i = 0; i < size_; i++) {
				for (int j = 0; j < max; j++) {
					if (j == data_[i])
						data[j] = data_[i];

				}
			}
			int m = 0;
			for (int n = max - 1; n >= 0; n--) {
				if (data[n] != -1) {
					data_[m] = data[n];
					m++;
				}
			}

		}

	}
}
