package teams;

import java.util.Scanner;

public class Exercicio_Nao_Repetir_Elementos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] x = new int[5];
        //boolean falsificador = false;

        for (int i = 0; i < x.length; i++) {
            System.out.printf("Informe um número (X): ");
            if (i == 0) {
                x[i] = leitor.nextInt();
            } else if (i == 1) {
                x[i] = leitor.nextInt();
                do {
                    if (x[i] == x[0]) {
                        System.out.printf("Número repetido. Informe outro: ");
                        x[i] = leitor.nextInt();
                    }
                } while (x[i] == x[0]);
            } else if (i == 2) {
                x[i] = leitor.nextInt();
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
                x[i] = leitor.nextInt();
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
                x[i] = leitor.nextInt();
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
            }
        }

            /* for (int i = 0; i < 5; i++) {
                System.out.printf("Informe um número (X): ");
                if (i == 0) {
                    x[i] = leitor.nextInt();
                } else if (i == 1) {
                    while (falsificador == false) {
                    if (x[i] == x[0]) {
                        while (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro:");
                            x[i] = leitor.nextInt();
                        }
                    }

                    if (x[i] != x[0]) {
                        falsificador = true;
                    }
                }
                } else if (i == 2) {
                    while (falsificador == false) {
                    if (x[i] == x[0]) {
                        while (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    }

                    if (x[i] == x[1]) {
                        while (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    }

                    if (x[i] != x[0] && x[i] != x[1]) {
                        falsificador = true;
                    }
                } else if (i == 3) {
                    while (falsificador == false) {}
                }
                }
                while (falsificador == false) {
                    for (int j = 1; j <= i ; j++)
                    if (x[i] == x[0]) {
                        while (x[i] == x[0]) {
                            System.out.printf("Número repetido. Informe outro:");
                            x[i] = leitor.nextInt();
                        }
                    }

                    if (x[i] != x[0]) {
                        falsificador = true;
                    }  
                }
                
            } */

        leitor.close();
    }
}
