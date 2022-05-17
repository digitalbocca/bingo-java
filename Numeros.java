public class Numeros {
    private int[] numeros;

    public Numeros(int max) {
        this.numeros = new int[max];
        this.fill(max);
    }

    public void fill(int max) {
        for (int i = 0; i < max; i++) {
            this.numeros[i] = i+1;
        }
    }

    public int[] getNumeros() {
        return this.numeros;
    }
}
