public class Main {
    public static void cleanConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void command(Sorteio sorteio) {
        System.out.println("ENTER para sortear | S para sair");
        String command = System.console().readLine();
        cleanConsole();
        if (command.equals("")) {
            System.out.println("Sorteando...");
            sorteio.sortear();
        } else if (command.equals("S") || command.equals("s")) {
            System.out.println("Saindo...");
            System.exit(0);
        } else {
            System.out.println("Comando inválido");
        }
        command(sorteio);
    }
    public static void main(String[] args) {
        Numeros numeros = new Numeros(75);

        // for (int i = 0; i < numeros.getNumeros().length; i++) {
            // System.out.println(numeros.getNumeros()[i]);
        // }

        Sorteio sorteio = new Sorteio(numeros.getNumeros());

        // for (int i = 0; i < sorteio.getNumeros().length; i++) {
            // System.out.println(sorteio.getNumeros()[i]);
        // }

        command(sorteio);
    }
}
