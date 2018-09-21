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
		assertEquals(60, imposto.calculaAliquota(rendimento),0f);
	}
	
 /*
  @Test
	public void test2opasso_CadastrarRendimentoDuplicado() throws RendimentosNulosException {
		String descricao = "Salario"; 
		float valor = 3000f;
		
		System.out.println(2 + " " + irpf);
		Rendimento r = new Rendimento(descricao, valor);
		
		assertTrue(irpf.cadastrarRendimento(r));
		assertEquals(8000f, irpf.totalRendimentos(), 0f);
		assertEquals(1, irpf.numRendimentos());
	}
  */

}
