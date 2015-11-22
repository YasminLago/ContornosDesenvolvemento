package refactorizar;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class Refactorizar {

    public static void main(String[] args) {
        boolean esPrimo = false;
        int numDigitos = 4;
        int ndigitos = 0;
        
        introducirNumDigitos(numDigitos);
        for (int numComparar = 1; numComparar <= 99999; numComparar++) {
            int contador = contadorNumDigitos(numComparar);
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (numComparar < 4) {
                    esPrimo = true;
                } else {
                    if (numComparar % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (numComparar - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        esPrimo = contadorDivisiones(i1, limite, numComparar, contador1, esPrimo);
                    }
                }

                if (esPrimo == true) {
                    System.out.println(numComparar);
                }
            }
        }
    }

    public static boolean contadorDivisiones(int i1, int limite, int numComparar, int contador1, boolean esPrimo) {
        while (i1 <= limite) {
            if (numComparar % i1 == 0) {
                contador1++;
            }
            i1 += 2;
            if (contador1 == 2) {
                i1 = limite + 1;
            }
        }
        if (contador1 == 1) {
                            esPrimo = true;
                        }
        return esPrimo;
    }

    public static int contadorNumDigitos(int numComparar) {
        int divisionEntera = numComparar;
        int contador = 0;
        while (divisionEntera != 0) {
            divisionEntera = divisionEntera / 10;
            contador++;
        }
        return contador;
    }

    public static void introducirNumDigitos(int numDigitos) {
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }

}
