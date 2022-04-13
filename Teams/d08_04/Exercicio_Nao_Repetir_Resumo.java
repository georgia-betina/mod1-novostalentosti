package Teams.d08_04;

import java.util.Scanner;

public class Exercicio_Nao_Repetir_Resumo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] x = new int[10];

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
                } else if (i == 5) {
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
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4]);
                } else if (i == 6) {
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
                        } else if (x[i] == x[4]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        } else if (x[i] == x[5]) {
                            System.out.printf("Número repetido. Informe outro: ");
                            x[i] = leitor.nextInt();
                        }
                    } while (x[i] == x[0] || x[i] == x[1] || x[i] == x[2] || x[i] == x[3] || x[i] == x[4] || x[i] == x[5]);
                } else if (i == 7) {
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
            }
    }
}
