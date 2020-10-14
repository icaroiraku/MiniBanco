package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ContaCorrenteService  {
	
	
	
	

	public void abreConta(Conta conta){
		
	
		
		
	 List<Conta> contas = new ArrayList<Conta>();
		
	 	conta = new Conta();
	
	 	conta.setNumeroConta(1234123456789L);
		System.out.print("Adicionando numero  da conta:");
		
		
		conta.getNumeroAgenciaConta();
		System.out.print("Adicionando numero  da Agencia:");
		
		conta.getSaldoDisponivel();
		System.out.print("Adicionando saldo:");
		
		contas.add(conta);
	}
	
	

	   public BigDecimal debitaValorConta(BigDecimal valor, Conta conta){
	       
		   BigDecimal novoSaldoDisponivel = conta.getSaldoDisponivel().subtract(valor);

		   if(novoSaldoDisponivel.compareTo(BigDecimal.ZERO) < 0) {
		   System.out.println("Saldo Indisponivel");
		   }
		   conta.setSaldoDisponivel(novoSaldoDisponivel);
		   return novoSaldoDisponivel;

		   }
		   
	   
	   
	   public void creditaValorConta(BigDecimal valor,Conta conta){
		   
		   BigDecimal debitaValorConta = conta.getSaldoDisponivel().add(valor);
		  
		   if(debitaValorConta.compareTo(BigDecimal.ZERO) == 0) {
			   System.out.println("Credito indisponivel");
		   }
		   conta.setSaldoDisponivel(debitaValorConta);
		   
		   return ;

		   }
		   
		   
		
		   
	
	   
	   
	   public static int extraiNumeroConta(long numeroConta) {
		   
		   return(int) numeroConta;
	   }



	   

	   
	   
	   
	   
}