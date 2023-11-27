import java.util.Scanner;

public class Main3 {


    public static void main(String[] args) {
        double h;
        double l;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza");
        l = scanner.nextDouble();
        System.out.println(l);
        System.out.println("Inserisci la altezza");
        h = scanner.nextDouble();
        result = (h + l) * 2;
        System.out.println("Il perimetro del tuo rettangolo è: " + result);


        //Numero pari e numero dispari
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();
        result = numero % 2;
        System.out.println("Inserisci la altezza");
        if (result == 0) {
            System.out.println("Il tuo numero è pari");
        } else {
            System.out.println("Il tuo numero è dispari");

        }
    }
}
