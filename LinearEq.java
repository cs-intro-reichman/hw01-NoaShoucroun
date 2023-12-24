public class LinearEq {
	public static void main(String args[]) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double C = Double.parseDouble(args[2]);
		double X = (C - b) / a;
		System.out.println(a + " * x" + " + " + b + " = " + C);
		System.out.println("x = " + X);

	}
}