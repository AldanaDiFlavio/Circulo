package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void testQueCalculaElPerimetroDelCirculo() {
		Circulo miCirculo = new Circulo();
		Double resultadoEsperado = 25.12;
		Double resultadoObtenido = miCirculo.perimetroDelCirculo(4.0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testQueCalculaElAreaDelCirculo() {
		Circulo miCirculo = new Circulo();
		Double resultadoEsperado = 50.24;
		Double resultadoObtenido = miCirculo.areaDelCirculo(4.0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
