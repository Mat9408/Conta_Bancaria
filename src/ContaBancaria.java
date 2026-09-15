import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        
        double saldo = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao novo sistema eletrônico bancario.");

        System.out.println("\n***********************************");
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String tipoConta = input.nextLine();

        System.out.println("Bem vindo, " + nome+"!" + " Qual operação deseja realizar?");
        String menuPrincipal = """ 
        
        1: Verificar conta
        2: Depósito
        3: Saque
        4: Sair da aplicação""";

        System.out.println(menuPrincipal);

        int escolhaMenu = input.nextInt();

        while (escolhaMenu != 4) {

            if (escolhaMenu == 1) {
                System.out.println("\nNome: " + nome);
                System.out.println("Tipo de Conta: " + tipoConta);
                System.out.println("Saldo : R$ " + saldo);
            }

            if (escolhaMenu == 2) {
                System.out.println("Informe o valor que deseja depositar: ");
                double deposito = input.nextDouble();
                saldo = saldo + deposito;
                System.out.println("Transação realizada com sucesso.");
            }

            if (escolhaMenu == 3) {
                System.out.println("Informe o valor de saque: ");
                double saque = input.nextDouble();

                if(saldo >= saque){
                    saldo = saldo - saque;
                    System.out.println("Transação realizada com sucesso.");
                }else {
                    saldo = saldo - saque;
                    System.out.println("Atenção: Você está utilizando seu Cheque Especial.");
                }
            }

            System.out.println("\nGostaria de realizar outra operação?");
            System.out.println(menuPrincipal);
            escolhaMenu = input.nextInt();
        }
    }
}
