package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacao.Rendimento;

public class RendimentoBrutoTest {
	
	public static Imposto;
	
	@Test
	public void testRendimentoBruto() {
		
		double aplicacaoInicial = 1000;
		double juros = 8.5;
		double aliquota = 22.5;
		
		Rendimento rendimento = new Rendimento(aplicacaoInicial,juros,aliquota);
		
		assertTrue(Imposto.cadastraRendimento(rendimento));
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
