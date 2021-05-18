package caixa_eletronico_ac2;

import java.util.Scanner;

public class Caixa_Eletronico_AC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cpf, senha = null;
        int escolha = 0;
        float saldo = 1000f, deposito = 0f, saque = 0f;
        int tentativas = 0, chances = 3, sistema = 0;

        do{
        System.out.println("Seja Bem-Vindo!"); //Menu de Bem-Vindo

        System.out.print("Digite seu CPF: "); //Colher informaçao do CP
        cpf = sc.nextLine();
 
       
        if ("123.456.789.00".equals(cpf)) { //Colhe e verifica o CPF

            System.out.print("Digite sua Senha: "); // Colhe e verifica a senha
            senha = sc.nextLine();
        } else {
            System.out.println("Acesso Negado!");
            System.exit(0);
        }

        if ("01020304".equals(senha)) { // Exibe o menu

            do {
                System.out.println("======Menu======");
                System.out.println("1 - Saldo");
                System.out.println("2 - Depósito");
                System.out.println("3 - Saque");
                System.out.println("0 - Sair");
                System.out.println("===============");
                System.out.print("Digite uma opção:");
                escolha = sc.nextInt();

                switch (escolha) { // Opões do Menu

                    case 0:
                        System.out.println("Até logo! :D");
                        break;
                    case 1:
                        System.out.println("==========================");
                        System.out.println("Opção Escolhida: Saldo");
                        System.out.println("==========================");
                        System.out.println("Seu saldo atual é: " + saldo);
                        System.out.println("==========================");
                        System.out.println("Voltar ao menu inicial?: ");
                        System.out.println("==========================");
                        sistema = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("==========================");
                        System.out.println("Opção Escolhida: Depósito");
                        System.out.println("==========================");
                        System.out.print("Digite o valor a ser depositado: ");
                        deposito = sc.nextInt();
                        saldo = saldo + deposito;
                        System.out.println("==========================");
                        System.out.println("Saldo atual: " + saldo);
                        System.out.println("==========================");
                        System.out.println("Voltar ao menu inicial?: ");
                        System.out.println("==========================");
                        sistema = sc.nextInt();
                        

                        break;
                    case 3:
                        System.out.println("==========================");
                        System.out.println("Opção Escolhida: Saque");
                        System.out.println("==========================");
                        System.out.print("Digite o valor a ser sacado: ");
                        saque = sc.nextInt();
                        if (saque > saldo) {
                            System.out.println("Saldo Insuficiente!");
                        } else {
                            saldo = saldo - saque;
                            System.out.println("==========================");
                            System.out.println("Saldo atual: " + saldo);
                            System.out.println("==========================");
                            System.out.println("Voltar ao menu inicial?: ");  
                        sistema = sc.nextInt();
                        }
                        break;

                    default:
                        System.out.println("Opção invalida! Tente novamente");
                        break;

                }
            } while (escolha != 0);

        } else {

            do {
                System.out.print("Digite sua Senha: "); // Colhe e verifica a senha
                senha = sc.nextLine();
                System.out.println("Senha Incorreta, Digite Novamente!");
                tentativas++;
                System.out.println("Tentativas: " + tentativas);
            } while (tentativas <= chances);
            System.out.println("Acesso não permitido! ");
        }
        } while (sistema != 0);
    }

}
