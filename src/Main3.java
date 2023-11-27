import java.util.Scanner;

public class Main3 {


    public static void main(String[] args) {
        double h;
        double l;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del tuo rettangolo");
        l = scanner.nextDouble();
        System.out.println(l);
        System.out.println("Inserisci l'altezza del tuo rettangolo");
        h = scanner.nextDouble();
        result = (h + l) * 2;
        System.out.println("Il perimetro del tuo rettangolo è: " + result);


        //Numero pari e numero dispari
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();
        result = numero % 2;
        System.out.println("Inserisci la altezza");
        if (result == 0) {
            System.out.println("Il tuo numero è pari " + result);
        } else {
            System.out.println("Il tuo numero è dispari " + result);

        }

        System.out.println("Inserisci la lunghezza del tuo triangolo equilatero");
        l = scanner.nextDouble();
        System.out.println(l);
        System.out.println("Inserisci l'altezza");
        h = scanner.nextDouble();
        result = (h * l) / 2;
        System.out.println("L'area del tuo triangolo è: " + result);
    }
}
