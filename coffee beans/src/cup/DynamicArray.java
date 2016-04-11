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
	public void PushBack(int value)
	{
		if(size_ >= data_.length)
		{
			int[] data = new int[data_.length * 2];
			for(int i = 0; i<data_.length; ++i)
			{
				data[i] = data_[i];
			}
			data_ = data;
					
					
		}
		data_[size_] = value;
		size_++;
	}
	public void Set(int index,int value)
	{
		data_[index] = value;
	}
	public int Get(int index)
	{
		return data_[index];
	}
	public int FindNum(int value)
	{
		
		int middle = data_.length / 2;
		int left = 0;
		int right = data_.length;
		
		while(true)
		{
			if(left == right)
			{
				return -1;
			}
			if(value < data_[middle])
			{
				right = middle;
				middle = (left + right)/2;
			}
			else if(value > data_[middle])
			{
				left = middle+1;
				middle = (left + right)/2;
			}
			else
			{
				return middle;
			}
		}
		
	}
}
