package refactorizar;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        boolean p = false;
        int numDigitos = 4;
        int ndigitos;
        
        
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;

                        System.out.println(i);
                    }
                }
            }
        }
    }

}
