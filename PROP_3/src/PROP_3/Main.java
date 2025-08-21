package PROP_3;
import java.util.Scanner;

public class Main {
	static float menor(float a, float b, float c) {
		if (a<=b && a<=c) return a;
		if (b<=c && b<=a) return b;
		else return c;	//tiene que haber un return para todos los casos.
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero: ");
		float n1 = ss.nextFloat();
		
		System.out.print("Ingrese el segundo numero: ");
		float n2 = ss.nextFloat();
		
		System.out.print("Ingrese el tercero numero: ");
		float n3 = ss.nextFloat();
		
		float men = menor(n1, n2, n3);
		System.out.println("El menos de los tres numeros es: "+men);
	}
}
