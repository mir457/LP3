package PROP_5_JAVA;
import java.util.Scanner;
public class Main {
	static float cobro(float a) {
		float acum = 0;
		
		if(a>= 19) {
			 acum= 12;
			 return acum;
		 }
		
		while(a>0) {
			if(a<= 1) {
				acum+=3;
			}
			else
				acum+=0.5;
				a--;
		}
		return acum;		//si se hace if con return, todos los if tienen que tener un return
	}
	
	
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de horas que estuvo: ");
		float horas = ss.nextFloat();
		
		float pago = cobro(horas);
		System.out.println("Lo que debe de pagar es: "+pago);
	}
}


