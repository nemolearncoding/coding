/**
 * 
 */
package cup;

/**
 * @author Nemo
 *
 */


public class Sugar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello nemo"+ Integer.toString(args.length));

		DynamicArray tmp = new DynamicArray(8);
		for(int i=0; i< 10; ++i)
		{
			tmp.PushBack(i * i);
		}
		System.out.println(tmp.Get(8));
		System.out.println(tmp.FindNum(36));
		System.out.println(tmp.FindNum(23));
	}

	
}
