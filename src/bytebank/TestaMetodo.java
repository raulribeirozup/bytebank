package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRaul = new Conta(1, 1);
		contaDoRaul.setCliente(new Cliente("Raul", "100.100.100-10", "Programador"));
		contaDoRaul.getCliente().setNome("Raul");
		contaDoRaul.deposita(100);
		System.out.println("Saldo do Raul: R$" + contaDoRaul.getSaldo());
		
		Conta contaDaLu = new Conta(1, 2);
		contaDaLu.setCliente(new Cliente("Lu", "200.200.200-20", "Duck"));
		contaDaLu.getCliente().setNome("Lu");
		contaDoRaul.transfere(100, contaDaLu);
		System.out.println("Saldo da Lu: R$" + contaDaLu.getSaldo());
		System.out.println("Saldo do Raul: R$" + contaDoRaul.getSaldo());
	}
}