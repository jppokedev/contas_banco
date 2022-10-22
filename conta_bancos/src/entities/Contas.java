package entities;

public class Contas {

	public Integer conta;
	public Double saldo ; 
	public String cliente;
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo-= valor;
	}
}
