/**
 *
 * @author Ryo112358
 *
 */

public class LazyTriangle {

	public static void main(String[] args) {

		int number = 0;

		try {
			number = Integer.parseInt(args[1]);

		} catch (NumberFormatException nfe) {
			System.exit(2);
		}

		//--------------------------------------

		if (args[0].equals("lazy")) {
			int result = lazyCaterer(number);
			System.out.println("The lazy caterer brings your bill...");
			System.out.println("Lazy(" + number + ") = " + result + "!!!");
		} else if (args[0].equals("triangle")){
			int result = triangle(number);
			System.out.println("The triangle ran out of edges... ");
			System.out.println("Tri(" + number + ") = " + result);
		} else {
			System.exit(1);
		}

	}


	public static int triangle(int number) {

		int total = 0;

		while(number != 0) {
			total += number;
			number--;
		}

		return total;
	}

	public static int lazyCaterer(int number){

		int total = 0;

		if(number == 0) {

		} else {
			//total = (int) Math.pow(number, 2);
			total = number * 2;
		}

		return total;
	}

}
