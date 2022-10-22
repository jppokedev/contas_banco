package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Contas;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Contas contaFonseca = new Contas();
		
		System.out.println("Informe o qual conta deseja acessar?");
		contaFonseca.conta = sc.nextInt();
		
		System.out.println("Quem sera o titular da conta?");
		contaFonseca.cliente = sc.next();
		
		System.out.println("deseja depositar algum valor?");
		System.out.println("Y/N");
		char resposta = 0;
		resposta = sc.next().charAt(0);
		if (resposta == 'n') {
			System.out.println("Conta = " + contaFonseca.conta);
			System.out.println("Cliente = " + contaFonseca.cliente);
			System.out.println("Saldo = " + contaFonseca.saldo);
		}else {
			System.out.println("Informe o valor a ser depositado");
			double valor;
			valor = sc.nextDouble();
			contaFonseca.deposito(valor);
		}
		if (resposta != 'n') {
		System.out.println("Conta = " + contaFonseca.conta);
		System.out.println("Cliente = " + contaFonseca.cliente);
		System.out.println("Saldo = " + contaFonseca.saldo);
		}
		
		sc.close();
	}

}