package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import aplicacao.Imposto;
import aplicacao.Rendimento;

public class RendimentosTest {
	
	double aplicacaoInicial;
	int dias;
	double juros;
	double totalRendimentos;
	
	ParametrosRendimentosTest[] parametrosRendimentosTests;
	
	public RendimentosTest(double aplicacaoInicial,int dias,double juros,
							ParametrosRendimentosTest[] parametrosRendimentosTests,double totalRendimentos) {
		
		this.aplicacaoInicial = aplicacaoInicial;
		this.dias = dias;
		this.juros = juros;
		this.parametrosRendimentosTests = parametrosRendimentosTests;
		this.totalRendimentos = totalRendimentos;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		ParametrosRendimentosTest[] rendimentos1 = new ParametrosRendimentosTest[] {
				
				new ParametrosRendimentosTest(1000, 60, 8.5)		
		};
		Object[] parametros1 = new Object[]{1000,60,8.5,rendimentos1,1000};

		ParametrosRendimentosTest[] rendimentos2 = new ParametrosRendimentosTest[] {
				new ParametrosRendimentosTest(500, 120, 8)
		};
		Object[] parametros2 = new Object[]{500,120,8,rendimentos2,1500};
		
		ParametrosRendimentosTest[] rendimentos3 = new ParametrosRendimentosTest[] {
				new ParametrosRendimentosTest(3000, 240, 9)
		};
		Object[] parametros3 = new Object[]{3000,240,9,rendimentos3,1500};
		
		return Arrays.asList(new Object[][] {
			
			parametros1,parametros2,parametros3
		});
	}
}
