public class GenThree {
	public static void main(String args[]) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int num1 = ((int) (Math.random() * (max - min)) + min);
		int num2 = ((int) (Math.random() * (max - min)) + min);
		int num3 = ((int) (Math.random() * (max - min)) + min);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		if (num1 < num2 && num1 < num3) {
			System.out.println("The minimal generated number was: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("The minimal generated number was: " + num2);
		} else
			System.out.println("The minimal generated number was: " + num3);
	}

}
