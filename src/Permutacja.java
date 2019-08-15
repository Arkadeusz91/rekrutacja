import java.util.ArrayList;
import java.util.List;

class Permutacja {
    private int[] p;
    List<Cykl> cykle;

    Permutacja(int[] a, int[] b, int n) {
        this.p = new int[n];
        for (int i = 0; i < n; i++) {
            this.p[b[i] - 1] = a[i] - 1;
        }
    }

    void wyznaczCykle(int n){
        boolean[] odw = new boolean[n];
        int c = 0;
        this.cykle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!odw[i]) {
                c += 1;
                int x = i;
                this.cykle.add(new Cykl());
                while (!odw[x]) {
                    odw[x] = true;
                    this.cykle.get(c - 1).wartosci.add(x);
                    x = this.p[x];
                }
            }
        }
    }
}
