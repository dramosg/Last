package nuestracalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deberiaRegistrarDatoIngresado() {
		
		//Arrange:prepararescenario
		double dato = 10;
		Calculadora calculadora = new Calculadora();
		
		//Act:ejecutarprueba
		calculadora.registrarDato(dato);
		
		int devuelto = calculadora.getCantidadDatos();
		//Assert verificar datos ingresados
		int esperado=1;
		assertEquals(esperado,devuelto);
		
	}
	@Test
	public void deberiaRegistrarVariosDatos(){
		
		//Arrange
		double n1=10, n2=20, n3=30;
		double esperado=3;
		Calculadora calculadora= new Calculadora();
		//Act
		calculadora.registrarDato(n1);
		calculadora.registrarDato(n2);
		calculadora.registrarDato(n3);
		double devuelto=calculadora.getCantidadDatos();
		
		//Assert
		assertEquals(esperado,devuelto,0);
		
	}
	@Test
	public void deberiaCalcularSumatoriaDatosIngresados(){
		//Arrange
		double n1=10,n2=20,n3=30;
		double esperado=60;
		//Act
		Calculadora calculadora= new Calculadora();
		calculadora.registrarDato(n1);
		calculadora.registrarDato(n2);
		calculadora.registrarDato(n3);
		double devuelto = calculadora.calcularSumatoria();
		//Assert
		assertEquals(esperado,devuelto,0);
		
	}
	
	
	
	
}
