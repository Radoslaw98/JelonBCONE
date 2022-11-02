package postOffice;

import java.util.Scanner;

public class PostOffice {

    private double revenue;

    private Package lastSent;

    private Letter[] letters = new Letter[10];

    public double sentPackage(Package packageToSent, double money) {
        if (money < packageToSent.countPackagePrice()) {
            return money;
        }
        packageToSent.setStatus(Status.SENT);
        revenue += packageToSent.countPackagePrice();
        lastSent = packageToSent;
        return packageToSent.countPackagePrice() - money;
    }

    public Package createPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sender: ");
        String sender = scanner.nextLine();
        System.out.println("Receiver: ");
        String receiver = scanner.nextLine();
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();

        return new Package(sender, receiver, weight);
    }

    public Package getLastSent() {
        return lastSent;
    }

    public void sendLetter(Letter letter) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[letters.length - 1] != null) {
                System.out.println("Przepraszamy, poczta jest w stanie wysyłać tylko 10 listów dziennie, i co nam zrobisz?”, ");
            }
            if (letters[i] != null) {
                letters[i] = letter;
            }
        }
    }

    public void sendPostman() {
        for (Letter letter : letters) {
            letter.setStatus(Status.SENT);
        }
    }


}
