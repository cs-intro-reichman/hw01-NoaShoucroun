public class Triangle {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double C = Double.parseDouble(args[2]);

		if ((a + b > C) && (b + C > a) && (a + C > b)) {
			System.out.println(a + ", " + b + ", " + C + ": true");
		} else {
			System.out.println(a + ", " + b + ", " + C + ": false");
		}
	}
}
