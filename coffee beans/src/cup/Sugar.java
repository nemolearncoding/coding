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
		System.out.println("hello nemo" + Integer.toString(args.length));

		DynamicArray tmp = new DynamicArray(8);
		for (int i = 0; i < 8; i++) {
			tmp.PushBack(i * i);
		}
		// System.out.println(tmp.Get(8));
		// System.out.println(tmp.FindNum(36));
		// System.out.println(tmp.FindNum(23));
		/*tmp.BubbleSort(false);
		for (int j = 0; j < 8; j++) {
			System.out.println(tmp.Get(j));
		}*/
		tmp.BinSort(false);
		for (int j = 0; j < 8; j++) {
			System.out.println(tmp.Get(j));
		}
	}

}
