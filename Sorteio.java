import java.util.ArrayList;
import java.util.Collections;

public class Sorteio {
    private int[] numeros;
    private int pointer;

    public Sorteio(int[] numeros) {
      this.pointer = 0;
      this.numeros = new int[numeros.length];

      ArrayList<Integer> list = new ArrayList<Integer>();

      for (int i = 0; i < numeros.length; i++) {
        list.add(numeros[i]);
      }

      Collections.shuffle(list);

      for (int i = 0; i < list.size(); i++) {
        this.numeros[i] = list.get(i);
      }
    }

    private void incrementPointer() {
      this.pointer++;
    }

    public void sortear() {
      if (this.pointer < this.numeros.length) {
        System.out.println("");
        System.out.println("Número Sorteado: " + this.numeros[this.pointer]);
        System.out.println("");

        System.out.print("SEQUENCIA: ");

        for (int i = 0; i <= this.pointer; i++) {
          System.out.print(this.numeros[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        this.incrementPointer();
      } else {
        System.out.println("FIM DO SORTEIO !!!");
      }
    }

    public int[] getNumeros() {
      return this.numeros;
    }

}
