public class Conta {
    private int numero; 
    private String titular; 
    private double saldo; 

    static int qtdContas =  0; 

    public Conta (String pTitular) {
        this.titular = pTitular; 
        qtdContas++; 
        this.numero = qtdContas; 
        this.saldo = 0; 

    }
    public void  DadosBancarios (){
        System.out.println("");
        System.out.println(" Dados Bancarios");
        System.out.println("- Numero:" + this.numero);
        System.out.println("- Titular"   + this.titular);
        System.out.println(  "Saldo"       + this.saldo);

        System.out.println("Fim Dados Bancarios");
        System.out.println("");
    }

        public void Depositar( double pValor) {
            System.out.println("");
            System.out.println(" --- Realizando Deposito --- ");
            System.out.println("Saldo Anterior" + this.saldo);


            this.saldo += pValor; // this.saldo = this.saldo + pValor;

            System.out.println(" --- Saldo Posterior:" + this.saldo );
            System.out.println(" --- Fim do Deposito----");
            System.out.println("");

        }

        public void Sacar ( double pValor) {
            System.out.println("");
            System.out.println(" --- Realizando Saque ----  ");
            System.out.println(" --- Saldo Anterior:" + this.saldo );

            if(pValor <= this.saldo){ // caso eu tenha saldo 
                this.saldo -= pValor;
                System.out.println(" --- Saldo Posterior: " + this.saldo );
            }
            else { // caso eu não tenha nada de saldo
               System.out.println("Saldo Insuficiente "); 
            }

            System.out.println(" --- Fim do Saque --- ");
            System.out.println("");
       
         

        }


}



