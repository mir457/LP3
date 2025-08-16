package PROP_2;

public class Main {
	public static void main(String[] args) {
		int[] frecuencia = new int[6];
		
		for(int i=0; i<20000; i++) {
			int cara = (int)(Math.random()*6); //escoge un numero del 1 al 6
			frecuencia[cara]++;
		}
		
		for(int i=0; i<frecuencia.length; i++) {//length no lleva()
			System.out.println("La frecuencia del numero "+(i+1)+" es: "+frecuencia[i]);
		}
	}

}
