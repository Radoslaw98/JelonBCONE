package collections.lists;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        String a= "a";
        String b= "b";
        String c= "c";
        String d= "d";
      List myArrayList= new MyArrayList();
        System.out.println(myArrayList.add(a));
        System.out.println(myArrayList.add(b));
        System.out.println(myArrayList.add(c));
        System.out.println(myArrayList.add(d));
        System.out.println(myArrayList.add(a));
        System.out.println(myArrayList.add(b));
        System.out.println(myArrayList.add(c));
        System.out.println(myArrayList);
    }
}
