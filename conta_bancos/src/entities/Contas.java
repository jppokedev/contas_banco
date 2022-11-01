package entities;

import java.util.Scanner;

import application.Program;

public class Contas {
	
	private Integer conta;
	private Double saldo = 0D; 
	private Cliente titular;
	private String resp;
	
	public Integer getConta() {
		return conta;
	}
	
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
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
	
	
	public void resp(String resposta, Scanner sc) {
		this.resp = resposta;
		if(resp != "n" || resp != "y") {
			Program.notificaErro();
			if(resp == "n" || resp == "y") {
				resp(resposta, sc);
			}
		}
		
	}
	
}
