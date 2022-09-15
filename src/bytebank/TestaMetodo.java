package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta raul = new Conta();
		raul.deposita(100);
		System.out.println(raul.saldo);
		
		Conta lu = new Conta();
		raul.transfere(100, lu);
		System.out.println(lu.saldo);
		System.out.println(raul.saldo);
	}
}