public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // estrutura condicional simples 
        if (valorSolicitado <saldo) {
            saldo = saldo - valorSolicitado;
        System.out.println("novo saldo: " + saldo);
            
        }else{
            System.out.println("saldo insuficiente");
        }

    }
}
