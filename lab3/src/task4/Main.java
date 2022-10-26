package task4;

public class Main {
    public static void main(String[] args) {

        CandyBag presentBag = new CandyBag();

		for (int i = 0; i < presentBag.getCandies().size(); i++) {
			System.out.println(presentBag.getCandies().get(i));
		}
    }
}
