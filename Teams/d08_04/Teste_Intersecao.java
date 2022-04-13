package Teams.d08_04;

public class Teste_Intersecao {
    public static void main(String[] args) {
        int[] listaNumeros = new int[]{2,3,4,5};
        int[] listaNumeros2 = new int[]{2,4,9,8};
        int contador1 = 0;

        while (contador1 != 4) {
            for (int i = 0; i < listaNumeros.length; i++) {
                if (listaNumeros[contador1] == listaNumeros2[i]) {
                    break;
                } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                    System.out.println(listaNumeros[contador1]);
                    break;
                }
            }
            contador1++;
        }
        /*for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                break;
            } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                System.out.println(listaNumeros[contador1]);
            }
        }
        contador1++;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                break;
            } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                System.out.println(listaNumeros[contador1]);
                break;
            }
        }
        contador1++;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                break;
            } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                System.out.println(listaNumeros[contador1]);
                break;
            }
        }
        contador1++;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                break;
            } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                System.out.println(listaNumeros[contador1]);
                break;
            }
        } */

        /*while (contador1 < listaNumeros.length) {
            for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[contador1] == listaNumeros2[i]) {
                contador1++;
                break;
            } else if (listaNumeros[contador1] != listaNumeros2[i]) {
                System.out.println(listaNumeros[contador1]);
            }
            contador1++;
        }

    }*/
}
}
