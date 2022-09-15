package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRaul = new Conta();
		contaDoRaul.setCliente(new Cliente());
		contaDoRaul.getCliente().setNome("Raul");
		contaDoRaul.deposita(100);
		System.out.println("Saldo do Raul: R$" + contaDoRaul.getSaldo());
		
		Conta contaDaLu = new Conta();
		contaDaLu.setCliente(new Cliente());
		contaDaLu.getCliente().setNome("Lu");
		contaDoRaul.transfere(100, contaDaLu);
		System.out.println("Saldo da Lu: R$" + contaDaLu.getSaldo());
		System.out.println("Saldo do Raul: R$" + contaDoRaul.getSaldo());
	}
}