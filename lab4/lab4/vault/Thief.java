package lab4.vault;

import java.util.ArrayList;

public class Thief {

	private String name;
	private String rank;
	private int money;
	private ArrayList<String> passwords = new ArrayList<>();

	public Thief(String name, String rank) {
		this.name = name;
		this.rank = rank;
		this.money = 0;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public ArrayList<String> getPasswords() {
		return passwords;
	}

	public void setPasswords(ArrayList<String> passwords) {
		this.passwords = passwords;
	}

	public void initializePasswords() {
		this.passwords.add("a!82POO#lab9mNsAc");
		this.passwords.add("OOPxPOO#lab11aIcNsa");
		this.passwords.add("8jafPOO#lab4askds");
	}
}
