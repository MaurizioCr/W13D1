import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
        //moltiplica + concatena + esercizio due
        int a;
        int b;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero da moltiplicare");
        a = scanner.nextInt();
        System.out.println("Inserisci il secondo numero da moltiplicare");
        b = scanner.nextInt();
        result = a * b;

        System.out.println("Il risultato della tua moltiplicazione è " + result);
        System.out.println("hai inserito prima " + a + " e poi " + b);
        //ordine inverso
        System.out.println("moltiplicando " + b + " per " + a + " otterrai lo stesso risultato");

    }

}