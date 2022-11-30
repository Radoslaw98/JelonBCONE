package exceptions;

import enums.Rank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {
    private boolean connected;

    public FileConnection() {
        this.connected = false;
    }

    /*
Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane.
Wywołanie metody connect ma ustawiać stan obiektu na połączony,
jednak ma istnieć 25% szans na to że połączenie się nie powiedzie i zostanie rzucony Twój własny wyjątek FileConnectionException.
 */

    public void connect(){
        Random random= new Random();
        if (random.nextInt(4)==3){
           throw new  FileConnectionException("nie udało sie polaczyc ");
        }
        connected=true;
    }

    public void disconnect(){
        this.connected=false;
    }

    /*
    Stwórz również metodę umożliwiającą pobranie danych z obiektu
    (jako działanie tej metody wykorzystaj wcześniej przygotowane czytanie pliku z książkami)
     wynik zwracaj jako String lub List<String> .
    Jeśli brakuje plików lub plik tekstowy jest pusty należy również rzucić wyjątek FileDbConnectionException z odpowiednią wiadomością
     */

    public List<String> downloader(){
        List<String > listaStringow= new ArrayList<>();

                File text= new File("src/main/resources/ksiazki.txt");
        try {
            Scanner scanner = new Scanner(text);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                listaStringow.add(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("masz się zabrać za czytanie");
        }

        if(listaStringow.isEmpty()){
            throw new EmptyFileException();
        }

        return listaStringow ;
    }
}
