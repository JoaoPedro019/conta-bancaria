public class ContaBancaria {
private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getInfo() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
               "Sua agência é " + agencia + ", conta " + numero + 
               " e seu saldo " + saldo + " já está disponível para saque.";
    }
}
