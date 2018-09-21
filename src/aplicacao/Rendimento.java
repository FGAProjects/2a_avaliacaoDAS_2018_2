package aplicacao;

public class Rendimento {
	
	private double aplicacaoInicial;
	private double juros;
	private double aliquota;
	private int dias;
	
	public Rendimento (double aplicacaoInicial,int dias,double juros) {
		
		setAplicacaoInicial(aplicacaoInicial);
		setDias(dias);
		setJuros(juros);
	}

	public double getAplicacaoInicial() {
		return aplicacaoInicial;
	}

	public void setAplicacaoInicial(double aplicacaoInicial) {
		this.aplicacaoInicial = aplicacaoInicial;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
}
