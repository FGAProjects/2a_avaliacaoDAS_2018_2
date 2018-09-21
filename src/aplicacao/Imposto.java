package aplicacao;

import java.util.ArrayList;

public class Imposto {
	
	static ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();
	
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
}
