package ProjectHouse.PostOfficeProject;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class PostOffice {

    private double Utilities;
    private Package lastPackage;

    private Letter[] letters;

    public PostOffice() {
        this.letters = new Letter[10];
    }

    /*
    Do poczty dodaj metodę, która pozwoli nam nadawać paczki
Metoda ma wymagać przekazania paczki oraz kwoty pieniędzy
Metoda przyjmując paczkę powinna sprawdzić jej cenę, i jeśli zapłacono wystarczającą ilość pieniędzy ma zmienić jej status na “nadana” oraz zwrócić resztę.
Jeśli przekazano zbyt małą kwotę ma zwrócić tę kwotę i nie modyfikować stanu paczki.
Na koniec dodaj do poczty pole “utarg” i dodawaj do niego zarobione przez pocztę pieniądze.

     */

    public double sendThePackage(Package package1, double price) {

        if (price < package1.priceDependsFromWeightOfpackage()) {
            return price;
        }
        package1.setStatus(Status.SENT);
        Utilities += package1.priceDependsFromWeightOfpackage();
        lastPackage = package1;
        return price - package1.priceDependsFromWeightOfpackage();
    }

    public double sendTheLetter(Letter letter, double price) {
        if (price < letter.letterPrice()) {
            return price;
        }
        if (letters[letters.length - 1] != null) {
            System.out.println("Nie ma miejsca");
            return price;
        }
        for (int i = 0; i < letters.length; i++) {

            if (letters[i] == null) {
                letters[i] = letter;
//                letter.setStatus(Status.SENT);
                Utilities += letter.letterPrice();
                break;
            }

        }
        return price - letter.letterPrice();
    }


    public void postMan() {
//        for(Letter letters1: letters){
//            letters1.setStatus(Status.SENT);
//        }
        Arrays.stream(letters).forEach(letter -> letter.setStatus(Status.SENT));
    }

    /*
    Dodaj metodę pozwalającą na stworzenie i zwrócenie paczki
Ma ona zapytać w konsoli o wszystkie parametry paczki i stworzyć ją jako obiekt
na koniec zwróć utworzoną paczkę

     */


    public Package createThePackage() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Sender name: ");
        String sender = scanner.nextLine();
        System.out.println("Give Reciver name: ");
        String reciver = scanner.nextLine();
        System.out.println("Give weight in grams of the Package: ");
        double weightInGrams = scanner.nextDouble();
        System.out.println("Is the package priority? Type 'True' if the Packages is priority or 'False' if not ");
        boolean priority = false;

        try {
            priority = scanner.nextBoolean();

        } catch (InputMismatchException e) {
            System.out.println("Wrong details given, try again ");


        }

        Package newPackage = new Package(sender, reciver, weightInGrams);
        newPackage.setPackagePriority(priority);
        return newPackage;
    }

    public Package displayLastPackage() {
        return lastPackage;

    }


    public static double utility(Package package1, double price) {
        double sum = 0;

        sum += package1.priceDependsFromWeightOfpackage();

        return sum;
    }

    // double sum=0;
//       for(Package packa: packages1){
//           System.out.println(packa);
//           sum+=  packa.priceDependsFromWeightOfpackage();


    public double getUtilities() {
        return Utilities;
    }

    public void setUtilities(double utilities) {
        Utilities = utilities;
    }

    public Letter[] getLetters() {
        return letters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostOffice that = (PostOffice) o;
        return Double.compare(that.Utilities, Utilities) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Utilities);
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "Utilities=" + Utilities +
                '}';
    }
}
