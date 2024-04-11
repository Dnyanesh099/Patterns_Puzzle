
public class Programs {
	public static void main(String[] args) {
		Pattern1();
	}

//--------------------------------------------------------------------------------------------
	public static void Pattern1() {
	/*  *
		**
		***
		****
		*****   */


		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//--------------------------------------------------------------------------------------------- 

  /* *****
	 ****
	 ***
	 **
	 *   */
	public static void Pattern2() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

// ------------------------------------------------------------------

}
