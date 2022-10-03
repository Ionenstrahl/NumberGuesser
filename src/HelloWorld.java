import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number Guesser");

        boolean duHastDasSpielGewonnen = false;
        while ( duHastDasSpielGewonnen == false ) {
            System.out.print("Eingabe: ");
            String input = br.readLine();
            Integer a = Integer.parseInt(input);
            Integer zufaelligeZahl = (int) (Math.random() * 10);

            if (a == zufaelligeZahl) {
                System.out.println("Hallo Cockblock");
                duHastDasSpielGewonnen = true;
            } else {
                System.out.println("Die richtige Zahl war " + zufaelligeZahl);
            }
        }

    }

    private static void teil1() {
        String name = "Dschonnes";
        Integer alter = 30;
        Integer gewicht = 150;
        double schuhgroesse = 43.5;
        Integer zufaelligeZahl = (int) (Math.random() * 10);

        System.out.println("Hello " + name);
        System.out.println("Ich bin " + alter + " Jahre alt ");
        System.out.println("Ich will " + berechneSumme(alter, berechneGewinn(gewicht)) + " Euro zum Geburtstags");
        System.out.println("zufällige Zahl:  " + zufaelligeZahl);
    }

    static Integer berechneGewinn(Integer x) {
        return x * 2 + 5 - 17;
    }

    static Integer berechneSumme(Integer x, Integer y) {
        return x + y;
    }
}
