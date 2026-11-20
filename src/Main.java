// TP1 - Sistema de Gestão de Biblioteca Universitária
// Laura Cristina Gomides Jubé - Desenvolvimento Back-End [26E4_5]
// Programa simples: calcula atraso e multa de um empréstimo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PRAZO = 14;              // prazo do empréstimo em dias
        final int LIMITE_EMPRESTIMOS = 3;  // máximo de empréstimos ativos
        final double MULTA_DIA = 1.0;      // valor da multa por dia de atraso

        int opcao;

        System.out.println("=== Biblioteca Universitária - TP1 ===");

        do {
            System.out.println();
            System.out.println("1 - Verificar se pode fazer empréstimo");
            System.out.println("2 - Calcular multa de devolução");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Quantos empréstimos ativos o membro tem? ");
                int ativos = sc.nextInt();

                if (ativos < LIMITE_EMPRESTIMOS) {
                    System.out.println("Empréstimo permitido. Prazo de devolução: " + PRAZO + " dias.");
                } else {
                    System.out.println("Empréstimo negado: o membro já tem " + LIMITE_EMPRESTIMOS + " empréstimos.");
                }

            } else if (opcao == 2) {
                System.out.print("Quantos dias o membro ficou com o livro? ");
                int dias = sc.nextInt();

                if (dias < 0) {
                    System.out.println("Número de dias inválido.");
                } else if (dias <= PRAZO) {
                    System.out.println("Devolução no prazo. Sem multa.");
                } else {
                    int atraso = dias - PRAZO;
                    double multa = atraso * MULTA_DIA;
                    System.out.println("Devolução com " + atraso + " dia(s) de atraso.");
                    System.out.printf("Multa: R$ %.2f%n", multa);
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
