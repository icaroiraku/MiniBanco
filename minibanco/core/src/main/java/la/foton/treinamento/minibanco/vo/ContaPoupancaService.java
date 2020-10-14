package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;




public class ContaPoupancaService  {
	
	






	public void aplicarValor(BigDecimal valor, Conta conta){
		
	
		
		BigDecimal novoSaldo = conta.getSaldoDisponivel().add(valor);
		conta.setSaldoDisponivel(novoSaldo);
		
		System.out.println("Conta criada com sucesso!");
       
    }
	


	public BigDecimal resgataValor(BigDecimal valor,Conta conta) {
		
		

		
		BigDecimal novoResgate =  conta.getSaldoDisponivel();
		
		if( novoResgate.compareTo(BigDecimal.ZERO) == 0 ||  novoResgate.compareTo(valor) <  0) {  
			
		}else {
			
		
		conta.setSaldoDisponivel(novoResgate.subtract(valor) );
		}
		
		return  conta.getSaldoDisponivel();
		
		}

		
		
	
	
	
	
	
	public void abreConta(ContaPoupanca contaPoupanca) {
		
		
		 List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
			
		 contaPoupanca = new ContaPoupanca();
		 	
			contaPoupanca.getNomeDaPoupanca();
			System.out.print("Adicionando numero  da conta:");
			
			
			contaPoupanca.getVariacaoPoupanca();
			System.out.print("Adicionando numero  da Agencia:");
			
			contaPoupanca.getSaldoDisponivel();
			System.out.print("Adicionando saldo:");
			
			contas.add(contaPoupanca);
		}
		
		
	}
	


