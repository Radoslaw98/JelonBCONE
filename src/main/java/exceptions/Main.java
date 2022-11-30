package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String nulers =null;
//
//
//
//        try {
//            nulers.toUpperCase();
//        } catch(NullPointerException e){
//            System.out.println("Obkiet nie moze byc nullem");
//        }


        //Stwórz Scanner, poproś o podanie liczby. W sytuacji
        // gdy wystąpi wyjątek wyświetl “Podano litery , nie można przekonwertować do typu int”


//        Scanner scanner=new Scanner(System.in);
////        System.out.println("Podaj liczbe: ");
////        try {
////            int x = scanner.nextInt();
////        }catch (InputMismatchException e){
////            System.out.println("Podano litery , nie można przekonwertować do typu int");
////        }


        /*Bezpośrednio w ścieżce projektu stwórz plik “ksiazki.txt” w pliku tym wypisz conajmniej 3 tytuły książek
        dot. programowania które czytasz lub zamierzasz przeczytać.
        Napisz program który wyświetla wszystkie tytuły w tym pliku wykorzystując Scanner a w razie braku pliku wyświetla komunikat,
        że masz się zabrać za czytanie :)
         */

//
//        File text= new File("src/main/resources/ksiazki.txt");
//        try {
//            Scanner scanner = new Scanner(text);
//
//            while(scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//        }catch (FileNotFoundException e){
//            System.out.println("masz się zabrać za czytanie");
//        }

/*
Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane.
Wywołanie metody connect ma ustawiać stan obiektu na połączony,
jednak ma istnieć 25% szans na to że połączenie się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.
 */
        FileConnection fileConnection = new FileConnection();
        fileConnection.connect();
        try{
        fileConnection.downloader();
            System.out.println("LALA");
        }catch (EmptyFileException e){
            System.out.println("Pusta lista");
        }finally {
            fileConnection.disconnect();
            System.out.println("Finally");

        }

    }
}
