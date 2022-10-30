package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Contas;

public class Program {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Contas contaFonseca = new Contas();
		contaFonseca.titular = new Cliente();
		
		System.out.println("Informe o qual conta deseja acessar?");
		contaFonseca.conta = sc.nextInt();
		
		System.out.println("Quem sera o titular da conta?");
		contaFonseca.titular.nome = sc.next();
		
		perguntaSeQueDepositar();
		String resposta = sc.nextLine();
		while(resposta != "y") {
			while(resposta != "n") {
				notificaErro();
				setResposta(sc);
			}
		}
		
		iniciaProcessoDeDeposito(sc, contaFonseca, resposta);		
		
		sc.close();
	}
	
	public static String setResposta (Scanner sc) {
		String resposta = sc.nextLine();
		return resposta;
	}
	
	public static void iniciaProcessoDeDeposito(Scanner sc,Contas contaUser, String resposta) {
		//if(validaResposta(resposta)) {
			if(resposta.contentEquals("y")) {
				iniciaDeposito(sc, contaUser);
				getInfConta(contaUser);
			}else if(resposta.contentEquals("n")){
				getInfConta(contaUser);
			}else {
				notificaErro();
			}
		}
	//}
	
	//public static Boolean validaResposta (String resposta) {
		//if ) {
		//	return false;
		//}else {
		//	return true;
	//	}
	//}
	
	public static void getInfConta (Contas contaUser) {
		System.out.println("Conta = " + contaUser.conta);
		System.out.println("Cliente = " + contaUser.titular.nome);
		System.out.println("Saldo = " + contaUser.saldo);
	}
	
	public static void notificaErro() {
		System.out.println("Resposta invalida. Informe uma resposta valida");
	}
	
	public static void perguntaSeQueDepositar() {
		System.out.println("deseja depositar algum valor?");
		System.out.println("Y/N");
	}
	
	public static void iniciaDeposito (Scanner sc, Contas contaFonseca) {
			System.out.println("Informe o valor a ser depositado:");
			Double valor = setValorDeposito(sc);
			contaFonseca.deposito(valor);
		System.out.println("Conta = " + contaFonseca.conta);
		System.out.println("Cliente = " + contaFonseca.titular.nome);
		System.out.println("Saldo = " + contaFonseca.saldo);
		
	}
	
	public static Double setValorDeposito (Scanner sc) {
		Double valor = sc.nextDouble();
		return valor;
	}

}