import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name = "Gabriel Silva";
        String account = "Corrente";
        double money = 1500;
        int select = 0;

        System.out.println("-------------------------");
        System.out.println("\nNome do cliente: " + name);
        System.out.println("Tipo de conta: " + account);
        System.out.println("Saldo atual: " + money);
        System.out.println("\n-------------------------");

        String menu = """
                
                Selecione uma opção:
                1- Consultar Saldo
                2- Transferir Valor
                3- Depositar Valor
                4- Sair
                
                """;
        Scanner reading = new Scanner(System.in);

        while (select != 4) {
            System.out.println(menu);
            select = reading.nextInt();

            if (select == 1) {
                System.out.println("\nO saldo atualizado é " + money);
            } else if (select == 2) {
                System.out.println("\nQual o valor que deseja transferir?");
                double valor = reading.nextDouble();
                if (valor > money) {
                    System.out.println("\nNão é possível realizar essa transação.");
                } else {
                    money -= valor;
                    System.out.println("\nSaldo atual: " + money);
                }
            } else if (select == 3) {
                System.out.println("\nValor recebido: ");
                double valor = reading.nextDouble();
                money += valor;
                System.out.println("\nNovo saldo: " + money);
            } else if (select != 4) {
                System.out.println("\nOpção invalida, tente novamente.");
            }
        }
    }
}
