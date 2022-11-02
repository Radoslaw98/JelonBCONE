package projektPoczta;

public class Main {

    public static void main(String[] args) throws NoSenderOrReceiverException,WeightIsOutOfScopeException {




        Package packageOne= new Package ("Radoslaw Zboralski"," Tomasz Tworek",5200);
//Package packageTest = new Package("Radoslaw",null,100);
//Package packageTest2 = new Package(null,"Radoslaw",100);
//Package packageTest3 = new Package("Radoslaw","Radoslaw",101_000);


        for (int i = 0; i <5 ; i++) {
            Package packageRandomNamesAndWeightOfPackage= new Package();
            System.out.println(packageRandomNamesAndWeightOfPackage);
        }
        System.out.println(packageOne);
        System.out.println(packageOne.PriceDependsFromWeightOfpackage());


    }
}
