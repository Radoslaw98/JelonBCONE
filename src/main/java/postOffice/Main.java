package postOffice;

public class Main {

    public static void main(String[] args) {
//        final Package package1 = new Package("Tomek", "Patryk", 200);
//        final Package package2 = new Package("Zbyszek", "Kuba", 4000);
//        Package package3 = new Package();
//        Package package4 = new Package();
//
//        final Package packageNull = package1;
//
//        System.out.println(package1);
//        System.out.println(package2);
//        System.out.println(packageNull);
//        System.out.println(package1.countPackagePrice());
//        System.out.println(package2.countPackagePrice());
//        System.out.println(packageNull.countPackagePrice());

        Package[] packagesTableOne = new Package[]{new Package(), new Package(), new Package()};
        Package[] packagesTableTwo = new Package[100];
        double totalPrice = 0.0;

        for (int i = 0; i < 100; i++) {
            packagesTableTwo[i] = new Package();
        }

        for (Package pa: packagesTableTwo) {
            System.out.println(pa);
            totalPrice += pa.countPackagePrice();
        }

        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        System.out.println(totalPrice);

    }
}
