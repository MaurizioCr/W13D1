import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arrayDiStringhe = new String[5];

        //array stringhe
        System.out.println("Cosa vuoi scrivere nel tuo array?");
        arrayDiStringhe[2] = scanner.nextLine();
        System.out.println(arrayDiStringhe[2]);
        //metodo per passare le stringa in 3° poszione alla 4° poszione???
        for (int i = 0; i <= arrayDiStringhe.length; i++) {
            System.out.println(arrayDiStringhe[i]);
        }
    }
}
