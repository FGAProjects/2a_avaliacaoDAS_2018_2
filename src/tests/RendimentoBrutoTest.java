package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Imposto;
import aplicacao.Rendimento;

public class RendimentoBrutoTest {
	
	static Imposto imposto;
	
	@Test
	public void testRendimentoBruto() {
		
		double aplicacaoInicial = 1000;
		double juros = 8.5;
		int dias = 60;
		
		Rendimento rendimento = new Rendimento(aplicacaoInicial,dias,juros);
		
		assertTrue(imposto.cadastraRendimento(rendimento));
		assertEquals(1000, imposto.totalAplicacao(rendimento),0f);
	}
}
