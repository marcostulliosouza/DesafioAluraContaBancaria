import java.util.Scanner;

public class Main {
    private double saldoInicial = 2500.0;
    private double saldo = saldoInicial;
    public class Conta{
        void recebePix(double valor){
            saldo += valor;
        }
        public void enviaPix(double valor){
            if (saldo < valor){
                System.out.println("Não há saldo suficiente para fazer essa transferência.");
            }else {
                saldo -= valor;
            }
        }

    }
    public void main(String[] args) {
        boolean condicao = true;
        String nome = "Marcos Tullio Silva de Souza";
        String tipoConta = "Corrente";
        String textoDados;
        String textoMenu;
        Scanner leitura = new Scanner(System.in);
        Conta conta = new Conta();

        while(condicao){
            textoDados = """
                    ***********************
                    Dados iniciais do cliente:
                    
                    Nome: %s
                    Tipo conta: %s
                    Saldo inicial: R$ %.2f
                    ***********************
                    """.formatted(nome, tipoConta, saldoInicial);
            textoMenu = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """;

            System.out.printf(textoDados);
            System.out.printf(textoMenu);
            int menu = leitura.nextInt();

            switch (menu){
                case 1:{
                    System.out.println(String.format("Saldo atualizado R$ %.2f", saldo));
                    continue;
                }
                case 2:{
                    System.out.println("Informe o valor a receber:");
                    double deposito = leitura.nextDouble();
                    conta.recebePix(deposito);
                    continue;
                }
                case 3:{
                    System.out.println("Informe o valor que deseja transferir: ");
                    double transferencia = leitura.nextDouble();
                    conta.enviaPix(transferencia);
                    continue;
                }
                case 4:{
                    condicao = false;
                    break;
                }
                default:{
                    System.out.println("Opção inválida!");
                }
            }
        }
    }
}