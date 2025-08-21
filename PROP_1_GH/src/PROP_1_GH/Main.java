package PROP_1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);	//crear objeto para ingreso
		float[] uni = new float[10];
		
		for(int i=0; i<uni.length; i++) {
			if(i==0){
				System.out.print("Ingrese el primer valor: ");
				uni[i] = ss.nextFloat();	
			}
			else {
				do {
					System.out.print("Ingrese un numero mayor al anterior, el anterior es "+uni[i-1]+": "); //para concatenar en Java se usa +
					uni[i] = ss.nextFloat();
				}while (uni[i]<uni[i-1]);
			}
		}
		
		System.out.println("El arreglo es: ");
		for(float j: uni) {
			System.out.println(j);
		}
		
	}
}

