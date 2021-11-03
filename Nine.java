package rick.edu.one;

/*/
 * Rick Howell
 * 
 * Here I use for loops as a counter on the principle that a < b < c (all positive ints)
 * Using two conditional if statements I can fill a solution array with the correct numbers
 * I then return the product abc
 * 
 */

public class Nine {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0, index = 1, sum = 0, index1 = 2, mult;
		int[] solution = new int[3];
		
		for (int i = 0; i < index1; ++i) {
			//c = 0;
			System.out.println(" == INDEX " + index + " ==");
			System.out.println();
			for (int j = 0; j < index; ++j) {
				++c;
				//System.out.println("c: " + c);
				b = 0;
				for (int k = 0; k < c - 1; ++k) {
					++b;
					//System.out.println("b: " + b);
					a = 0;
					for (int l = 0; l < b - 1; ++l) {
						++a;
						//System.out.println("a: " + a);
						if ((a*a) + (b*b) == (c*c)) {
							System.out.println("========" + a + " " + b + " " + c);
							sum = (a+b+c);
							System.out.println(sum);
							if (sum == 1000) {
								solution[0] = a;
								solution[1] = b;
								solution[2] = c;
							}
						}
					}
				}
			}
			if (sum >= 1000) {
				break;
			} else {
				++ index1;
			}
			++ index;
		} // end outer for
		
		System.out.println();
		mult = solution[1] * solution[2] * solution[0];
		System.out.println("a, b, c: ");
		for (int i = 0; i < solution.length; ++i) {
			System.out.println(solution[i]);
		}
		System.out.println("Which multiplies to: " + mult);
	} // end main method

} // end class
