package test;

import static org.junit.Assert.*;

import org.junit.Test;

import CodeBreaker.CodeBreaker;

public class CodeBreakerTest {

	CodeBreaker codebreaker = new CodeBreaker();
	
	boolean respuestaClaveSecreta;
	
	@Test
	public void contieneTodosNumeros() {
		String respuesta = codebreaker.encontrarNumero("4381");
		respuestaClaveSecreta = respuesta.contains("XXXX");	
		assertEquals(true,respuestaClaveSecreta);
	}
	
	@Test
	public void noContieneNingunNumero() {
		String respuesta = codebreaker.encontrarNumero("2222");
		respuestaClaveSecreta = respuesta.equals("");
		assertEquals(true,respuestaClaveSecreta);
	}
	
	
	@Test
	public void contieneNumerosDesorden() {
		CodeBreaker codebreaker = new CodeBreaker();
		String respuesta = codebreaker.encontrarNumero("0000");
		boolean c;
		c = respuesta.contains("");	
		assertEquals(true,c);
	}
	
	@Test
	public void contieneDosNumerosOrden() {
		CodeBreaker codebreaker = new CodeBreaker();
		String respuesta = codebreaker.encontrarNumero("4831");
		assertEquals("XX__",respuesta);
	}
	
	@Test
	public void contieneDosOrdenDosDesorden() {
		CodeBreaker codebreaker = new CodeBreaker();
		String respuesta = codebreaker.encontrarNumero("4300");
		assertEquals("XX",respuesta);
	}
	
	@Test
	public void numeroSeisCaracteres() {
		CodeBreaker codebreaker = new CodeBreaker();
		String respuesta = codebreaker.encontrarNumero("430001");
		assertEquals("",respuesta);
	}
	
	@Test
	public void numeroLetras() {
		CodeBreaker codebreaker = new CodeBreaker();
		String respuesta = codebreaker.encontrarNumero("431a");
		assertEquals("",respuesta);
	}
	

}
