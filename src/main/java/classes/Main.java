package classes;

public class Main {

    public static void main(String[] args) {

Equation dodawanie =new Equation() {
    @Override
    public int execute(int jeden, int dwa) {
        return jeden+dwa;
    }
};

        Equation odejmowanie =new Equation() {
            @Override
            public int execute(int jeden, int dwa) {
                return jeden-dwa;
            }

        };


        Odejmowanie odejmowanie1= new Odejmowanie();
        odejmowanie1.execute(1,1);


        odejmowanie.execute(1,2);


    }
}
