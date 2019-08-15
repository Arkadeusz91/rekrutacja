import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pobranie danych
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] m = Utils.parseToArray(scanner.nextLine());
        int[] a = Utils.parseToArray(scanner.nextLine());
        int[] b = Utils.parseToArray(scanner.nextLine());
        scanner.close();

        //konstrukcja permutacji
        Permutacja permutacja = new Permutacja(a,b,n);


        //rozkład na cykle proste
        permutacja.wyznaczCykle(n);

        //wyznaczenie parametrów cykli
        long minimumGlobalne = Long.MAX_VALUE;

        for (int i = 0; i < permutacja.cykle.size(); i++) {
            permutacja.cykle.get(i).wyznaczParametry(m);
            minimumGlobalne = Math.min(minimumGlobalne, permutacja.cykle.get(i).minimum);
        }

        //obliczanie wyniku
        long w = 0;
        for (int i = 0; i < permutacja.cykle.size(); i++) {
            w += Math.min(permutacja.cykle.get(i).metoda1(), permutacja.cykle.get(i).metoda2(minimumGlobalne));
        }

        System.out.println(w);
    }
}
