package task1;

public class Vault {

    private static final int maxTries = 3;

    public boolean checkPassword(String password) {
        String hidden = password.substring(4, 12);  // 12 in loc de 11
        // variabila hidden nu avea niciodata lungimea buna => conditia de la if mereu falsa
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
                System.out.println("You have " + (3 - i) + " tries left until vault is self destroying");
                System.out.println("Access failed...");
            }
        }
    }
}
