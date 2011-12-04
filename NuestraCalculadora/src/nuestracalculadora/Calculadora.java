package nuestracalculadora;

import java.util.ArrayList;

public class Calculadora {


private ArrayList<Numero> numeros;

public Calculadora(){
	//inicializar la lista (en este momento existe 0 elementos)
	numeros=new ArrayList<Numero>();
}
public void registrarDato(double dato){
	Numero num=new Numero(dato);
	numeros.add(num);
}
public int getCantidadDatos(){
	return numeros.size();
}
public double calcularSumatoria() {
	double sum=0;
	 for(int i=0;i<numeros.size(); i++){
		 sum=sum+numeros.get(i).getValor();
	 }
	
	return sum;
}

}
