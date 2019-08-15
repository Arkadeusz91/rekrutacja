import java.util.ArrayList;
import java.util.List;

class Cykl {
    private long suma;
    List<Integer> wartosci;
    long minimum;

    Cykl() {
        this.wartosci = new ArrayList<>();
    }

    void wyznaczParametry(int[] m) {
        this.suma = 0;
        this.minimum = Integer.MAX_VALUE;
        for (Integer e : this.wartosci) {
            this.suma += m[e];
            this.minimum = Math.min(this.minimum, m[e]);
        }

    }

    long metoda1(){
        return this.suma + (this.wartosci.size() - 2) * this.minimum;
    }

    long metoda2(long minimumGlobalne){
        return this.suma + this.minimum + (this.wartosci.size() - 1) * minimumGlobalne;
    }
}
