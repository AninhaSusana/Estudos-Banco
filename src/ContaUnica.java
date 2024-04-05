import java.util.Scanner;

public class ContaUnica{
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in ); 

        String aux;
        int opcao;
        double valor; 

        System.out.println("Digite o titular da conta");
        aux = entrada.nextLine();


        Conta c1 = new Conta (aux); 

        do{
             System.out.println("");
            System.out.println(" --- MENU --- ");
            System.out.println("1)Dados Bancarios");
            System.out.println("2)Deposito ");
            System.out.println("3) Saque ");
            System.out.println("0) Sair");

            System.out.print(" Opção: ");
           opcao = entrada.nextInt();

                if(opcao == 1){
                    c1.DadosBancarios();
                }
                else if(opcao == 2 ){
                    System.out.println("Digite o valor do Deposito: ");
                    valor = entrada.nextDouble();

            c1.Depositar(valor);
           }
           else if(opcao == 3 ){
            System.out.println("Digite o valor do Deposito: ");
            valor = entrada.nextDouble();

            c1.Sacar(valor);
           }
           else if(opcao !=0){
            System.out.println("Opção Invalida: ");
           }

           System.out.println("");



        } while(opcao != 0 );

    }
}