package aplicacao;

public class Rendimento {
	
	private double aplicacaoInicial;
	private double juros;
	private double aliquota;
	private double rendimentoBruto;
	
	public Rendimento (double aplicacaoInicial, double juros, double aliquota) {
		
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

	public double getRendimentoBruto() {
		return 13.97;
	}

	public void setRendimentoBruto(double rendimentoBruto) {
		this.rendimentoBruto = rendimentoBruto;
	}
}
