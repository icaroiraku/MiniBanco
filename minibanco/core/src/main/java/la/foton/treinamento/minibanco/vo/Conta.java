package la.foton.treinamento.minibanco.vo;

import java.math.BigDecimal;

public class Conta {
	
	
	protected Long numeroConta = 1234123456789L;

	private Integer numeroAgenciaConta;

	private BigDecimal saldoDisponivel;
	

	private boolean inativa;
	
	
	
	

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Integer getNumeroAgenciaConta() {
		return numeroAgenciaConta;
	}

	public void setNumeroAgenciaConta(Integer numeroAgenciaConta) {
		this.numeroAgenciaConta = numeroAgenciaConta;
	}

	public BigDecimal getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(BigDecimal saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	
	public int getnumeroConta(){
		
		 return ContaCorrenteService.extraiNumeroConta(numeroConta);
		
	}
	

	
	public  boolean inativa() {
		
		return inativa;
		
	}

	public boolean isInativa() {
		return inativa;
	}

	public void setInativa(boolean inativa) {
		this.inativa = inativa;
	}
	
	
	




	public  enum TipoBloqueio {
		
		SEM_BLOQUEIO(0),
		BLOQUEIO_TOTAL(1),
		BLOQUEIO_DEBITO(2),
		BLOQUEIO_CREDITO(3);
		
		
		public final int tipoBloqueio;	
		
		private TipoBloqueio (int tipoBloqueio) {
			this.tipoBloqueio = tipoBloqueio;
		}
		
		public static void main(String[] args) {
			
			long numeroConta = 1234123456789L;
			System.out.println("Numero da Conta" + numeroConta );
			int conta =(int)(numeroConta % 1000000000L);
			System.out.println("Conta:"+ conta);
			
		}
	
		
		
		 
	}
	
}
