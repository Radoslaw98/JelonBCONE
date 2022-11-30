package ProjectHouse.PostOfficeProject;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSenderOrReceiverException,WeightIsOutOfScopeException {




        Package packageOne= new Package("Radoslaw Zboralski"," Tomasz Tworek",5200);
//Package packageTest = new Package("Radoslaw",null,100);
//Package packageTest2 = new Package(null,"Radoslaw",100);
//Package packageTest3 = new Package("Radoslaw","Radoslaw",101_000);


//        for (int i = 0; i <5 ; i++) {
//            Package packageRandomNamesAndWeightOfPackage= new Package();
//            System.out.println(packageRandomNamesAndWeightOfPackage);
//        }
//        System.out.println(packageOne);
//        System.out.println(packageOne.PriceDependsFromWeightOfpackage());
//
        Package package1=new Package();
        Package package2=new Package();
//        Package package3=package1;
//
//        package1.PriceDependsFromWeightOfpackage();
//        package2.PriceDependsFromWeightOfpackage();
//        package3.PriceDependsFromWeightOfpackage();
//        System.out.println(package1);
//        System.out.println(package2);
//        System.out.println(package3);
//        System.out.println(package3.PriceDependsFromWeightOfpackage());
//        Package[] packages= new Package[]{new Package(),new Package(),new Package()};
//        System.out.println(packages[0]);
//        Package[] packages1= new Package[100];
//        for (int i=0; i<packages1.length; i++){
//         packages1[i]=new Package();
//        }
//        double sum=0;
//       for(Package packa: packages1){
//           System.out.println(packa);
//           sum+=  packa.priceDependsFromWeightOfpackage();
//       }
//
//        System.out.println("Sum of price of all Packages: "+ sum +" Pln");

//
       PostOffice postOffice= new PostOffice();
//        System.out.println(package2);
//        System.out.println(package1);
//        System.out.println(postOffice.sendThePackage(package2, 80));
//        System.out.println(postOffice.getUtilities());
//        System.out.println(postOffice.sendThePackage(package1, 80));
//        System.out.println(postOffice.getUtilities());

//Package createdPackage= postOffice.createThePackage();
//        System.out.println(postOffice.sendThePackage(createdPackage, 100));

        Adress adress= new Adress("ala","32b","72-100");
        System.out.println(adress);
        Letter letter= new Letter(adress,adress);
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));
        System.out.println(postOffice.sendTheLetter(letter, 50));

        postOffice.postMan();
        Arrays.stream(postOffice.getLetters()).forEach(System.out::println);
    }
}
