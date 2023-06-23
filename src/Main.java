import java.util.Scanner;

//Dados cadastrais
//Tipo de conta
//Saldo
//Consultar saldo
//Receber valor
//Transferir valor
//Sair
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeDeUsuario = "Pedro França";
        String tipoDeConta = "Conta corrente";
        double saldo = 4000;
        int opcao = 0;


        System.out.println("================================");
        System.out.println("Bem-Vindos ao banco BRB!");
        System.out.println();
        System.out.println("Para continuar coloque os dados do usuário.");
        System.out.println("================================");
        System.out.println("Nome de usuário: ");
        sc.nextLine();
        System.out.println("Senha: ");
        int senha = sc.nextInt();
        System.out.println();
        System.out.println("Acesso liberado!");
        System.out.println();
        System.out.println("Tipo de conta: " + tipoDeConta + ".");
        System.out.println();
        System.out.println("Operações: ");
        System.out.println();
        System.out.println("Saldo disponível: " + saldo + ".");
        System.out.println();

        String Menu = """
                ==================
                1)Consultar saldos.
                                
                2)Transferir valor.                  
                                
                3) Receber valor.
                                
                4)Sair.
                ==================
                                
                """;

        while (opcao != 4) {
            System.out.println(Menu);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir? ");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Voce não possui saldo o suficiente pra realizar essa transferencia !");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao > 4) {
                System.out.println("Comando inexistente, tente novamente. ");
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar o nosso banco.");
                System.out.println();
                System.out.println("Volte sempre!");
            }
        }
    }
}