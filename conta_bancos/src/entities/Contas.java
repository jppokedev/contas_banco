package entities;

public class Contas {

	public Integer conta;
	public Double saldo = 0D; 
	public Cliente titular;
	
	public void deposito (Double valor) {
		this.saldo += valor;
	}
	
	public void saque (Double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.saldo-= valor;
		}		
	}
	
}
