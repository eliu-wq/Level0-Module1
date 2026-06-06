package _05_for_loops._2_badgers;

public class Badgers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int verse = 0; verse < 2; verse++) {
			for (int b = 0; b < 12; b++) {
				System.out.print("Badger");
				if (b < 11) {
					System.out.print(", ");
				}
			}
			
			System.out.println();
			
			for (int m = 0; m < 2; m++) {
				System.out.print("Mushroom");
				if (m < 1) {
					System.out.print(", ");
				}
			}
			
			System.out.println();
			System.out.println();
		}
		System.out.print("A Snake!!!");
	}

}
