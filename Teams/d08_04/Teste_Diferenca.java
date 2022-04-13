package Teams.d08_04;

public class Teste_Diferenca {
    public static void main(String[] args) {
        int[] listaNumeros = new int[] { 1, 2, 3, 4 };
        int[] listaNumeros2 = new int[] { 4, 3, 2, 5 };
        int contador1 = 0;

        for (int i = 0; i < 4; i++) {
            if (listaNumeros[contador1] == listaNumeros2[0]) {
            } else if (listaNumeros[contador1] == listaNumeros2[1]) {
            } else if (listaNumeros[contador1] == listaNumeros2[2]) {
            } else if (listaNumeros[contador1] == listaNumeros2[3]) {
            } else {
                System.out.println(listaNumeros[contador1]);
            }
            contador1++;
        }

        contador1 = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                break;
            }
        }

        /*
         * while (contador1 != 4) {
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * break;
         * }
         * }
         * contador1++;
         * }
         */

        /*
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * break;
         * }
         * }
         * contador1++;
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * break;
         * }
         * }
         * contador1++;
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * break;
         * }
         * }
         * contador1++;
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * break;
         * }
         * }
         */

        /*
         * while (contador1 < listaNumeros.length) {
         * for (int i = 0; i < listaNumeros.length; i++) {
         * if (listaNumeros[contador1] == listaNumeros2[i]) {
         * contador1++;
         * break;
         * } else if (listaNumeros[contador1] != listaNumeros2[i]) {
         * System.out.println(listaNumeros[contador1]);
         * }
         * contador1++;
         * }
         * 
         * }
         */
    }
}
