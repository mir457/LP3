package PROP_1_JAVA;

public class Main {
	static void sumarArreglo(float[] a){
		float acum = 0;
		for(float i : a) {
			acum += i;
		}
		System.out.println("La suma total del arreglo: "+acum);
	}
	static float[] numeros = {1,2,3,4,5};
	
	public static void main(String[] args) {
		sumarArreglo(numeros);
	}
}



