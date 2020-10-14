package la.foton.treinamento.minibanco.vo;


import java.util.Scanner;

public class Principal {

	
	
	
	public static void main(String[] args)  {
		
		System.out.println("****Mini Banco***");
	
		try (Scanner input = new Scanner(System.in)) {
			
			int op;
			int oc;
			
			ContaPoupanca cp = null;
			ContaCorrente  ci = null;
			
			do {
				
				System.out.println("1-Abrir Conta");
				
				
				op = input.nextInt();
				
				
				if(op==1) {
					
					System.out.println("Qual tipo de conta?\n1.Poupança\n2 Corrente");
					oc = input.nextInt();
					if(oc==1) {
						  cp = new ContaPoupanca();
						
					}else {
						 ci = new ContaCorrente ();
						 
						
					}
					
					
						
					}else if(op==2){
						
						System.out.println("Qual tipo de conta?\n1.Poupança\n2 Corrente");
						oc = input.nextInt();
						if(oc==2) {
							 ci = new ContaCorrente ();
							 
							
						}
						
						
					}else if(op==3){
						
						
						System.out.println("Qual tipo de conta?\n1.Poupança\n2 Corrente");
						
						oc = input.nextInt();
						
						if( oc ==1) {
							System.out.println("Saldo da sua conta  Poupança é:"+ cp.getSaldoDisponivel());
						}else {
							
							System.out.println("Saldo da sua conta  Corrente é:"+ ci.getSaldoDisponivel());
							
						}
						
						
							
					
					}	
				
				
				
				
			
			}while(op!=1);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		String nomeDaPoupanca;
		BigDecimal debitaValorConta;
		Scanner entrada = new Scanner(System.in);
		Random numero = new Random();
		int conta = 1 + numero.nextInt(1123);
		 
		
		System.out.println("Cadastrando novo Cliente.");
		System.out.print("Entre com seu nome:");
		nomeDaPoupanca = entrada.nextLine();
		
		
		System.out.print("Entre com o valor inicial depositado");
		debitaValorConta = entrada.nextBigDecimal();
		
		
		Conta abreConta = new Conta(nomeDaPoupanca, conta, debitaValorConta);
		abreConta.;
		
		
		
		
		
		System.out.println("2-Debita Conta Corrente");
				System.out.println("3-Credita Conta Corrente");
				System.out.println("4-Consulta saldo conta corrente");
				System.out.println("5-Aplica Conta Poupança");
				System.out.println("6-Resgata Conta Poupança");
				System.out.println("7-Consulta saldo Conta Poupança");
	*/
	
	}
	
}
	
	
	
	
	
	





