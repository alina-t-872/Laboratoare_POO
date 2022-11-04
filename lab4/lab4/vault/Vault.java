package lab4.vault;

public class Vault {

	private static final int maxTries = 3;

	public boolean checkPassword(String password) {
		String hidden = password.substring(4, 12);
		if (hidden.equals("POO#lab4")) {
			System.out.println("Access granted!");
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Vault vault = new Vault();
		Thief Gigel = new Thief("Gigel", "Expert");
		Gigel.initializePasswords();

		for (int i = 0; i < maxTries; i++) {

			boolean isVaultCorrupted = vault.checkPassword(Gigel.getPasswords().get(i));
			if (isVaultCorrupted == true) {
				Gigel.setMoney(9999);
			} else {
				System.out.println("You have " + (3 - i) + " tries left until lab4.vault is self destroying");
				System.out.println("Access failed...");
			}
		}
	}
}
