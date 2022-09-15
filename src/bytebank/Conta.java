package bytebank;

public class Conta {
	double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public double saca(double valor) {
    	if (saldo >= valor) {
    		this.saldo -= valor;
    		return valor;
    	}
    	return 0;
    }
    
    public boolean transfere(double valor, Conta destino) {
    	if (this.saldo >= valor) {
    		destino.deposita(this.saca(valor));
    		return true;
    	}
    	return false;
    }
}