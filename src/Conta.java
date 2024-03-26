public class Conta {
    private String numerodaConta; 
    private double saldo; 
    private String Saque; 
     
        double limite; 

        void depositar(double valor){
            saldo = saldo + valor; 
        }
        void sacar(double valor){
            saldo = saldo - valor;
        }
    
    }




