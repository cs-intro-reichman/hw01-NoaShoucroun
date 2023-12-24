public class Coins {
	public static void main(String[] args) {
		int centsNumbers = Integer.parseInt(args[0]);
		System.out.println("Use" + " " + (centsNumbers / 25) + " quarters and " + (centsNumbers % 25) + " cents");
	}

}