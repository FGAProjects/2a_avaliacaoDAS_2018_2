package aplicacao;

import java.util.ArrayList;

public class Imposto {
	
	public static ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();
	
	public static boolean cadastraRendimento(Rendimento rendimento) {
		
		boolean resposta = rendimentos.add(rendimento);
		
		return resposta;
	}
	
	public static double calculaAliquota(Rendimento rendimento) {
		
		double aliquota = 0;
		
		if(rendimento.getDias() <=180) {
			
			rendimento.setAliquota(22.5);
		} else if(rendimento.getDias() > 180 && rendimento.getDias() <= 360) {
			
			rendimento.setAliquota(20);
		} else if(rendimento.getAliquota() > 360 && rendimento.getAliquota() <= 720) {
			
			rendimento.setAliquota(17.5);
		} else {
			
			rendimento.setAliquota(15);
		}
		
		aliquota = (double) rendimento.getAliquota() / 100;
		
		return aliquota;
	}
	
	public static double totalAplicacao(Rendimento rendimento) {
		
		double total = 0;
		for(int aux = 0; aux < rendimentos.size(); aux ++) {
			
			total += rendimentos.get(aux).getAplicacaoInicial();
		}
		
		return total;
	}
	
	/*public static double calculaRendimentoBruto(Rendimento rendimento) {
		
		double rendimentoBruto = 0;
		
		
		rendimentoBruto = rendimento.getAplicacaoInicial() * (rendimento.getJuros()/100);
		
		return 0;
	}*/
}
