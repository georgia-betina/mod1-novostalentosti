package teams;

import java.util.Scanner;

public class Exercicio_Nao_Repetir_Resumo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] x = new int[10];
        int contador = 0;
        int fatorial = 1;

            for (int i = 0; i < x.length; i++) {
                System.out.printf("Informe um número (X) - %d: ", i);
                x[i] = leitor.nextInt();
                if (i > 0) {
                    while (contador < i) {
                        contador++;
                        for (int ii=1; ii <= contador; ii++) {
                            fatorial *= ii;
                        }
                    }

                    System.out.println(fatorial);

                    for (int j = fatorial-1; j >= 0; j--) {
                        System.out.println(x[j]);
                        while (x[i] == x[j]) {
                            if (x[i] == x[j]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                            System.out.println(x[i]);
                            System.out.println(x[j]);
                        }}
                    }
                        
                    }}
                /* do {
                    for (int j = i - 1; j >=0; j--) {
                        if (x[i] == x[j]) {
                        System.out.printf("Número repetido. Informe outro: ");
                        x[i] = leitor.nextInt();
                        }
                } while (i <= 9 || i >= 0 && x[i] == x[j]); */
        
        //leitor.close();

                /* if (i == 1) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0]);
                } else if (i == 2) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1]);
                } else if (i == 3) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2]);
                } else if (i == 4) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3]);
                } else if (i == 5) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4]);
                } else if (i == 6) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[5]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4] || x[i] == x[5]);
                } else if (i == 7) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[5]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[6]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4] || x[i] == x[5] || x[i] == x[6]);
                } else if (i == 8) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[5]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[6]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[7]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4] || x[i] == x[5] || x[i] == x[6] || x[i] == x[7]);
                } else if (i == 9) {
                    do {
                        if (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[1]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[2]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[3]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[5]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[6]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[7]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[8]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4] || x[i] == x[5] || x[i] == x[6] || x[i] == x[7] || x[i] == x[8]);
                }
            } */
    }
}