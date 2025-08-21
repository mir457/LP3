package PROP_5;
import java.util.Scanner;

public class Main {
	static int convertidor(int h, int m, int s) {
		int totalseg = 0;
		
		totalseg += h*3600;
		totalseg += m*60;
		totalseg += s;
		
		return totalseg;
	}
	
	
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.print("Ingrese las horas: ");
		int hh= ss.nextInt();
		System.out.print("Ingrese los minutos: ");
		int mm= ss.nextInt();
		System.out.print("Ingrese los segundos: ");
		int s= ss.nextInt();
		
		int total=convertidor(hh,mm,s);
		
		System.out.println("Los segundos totales son: "+total);
	}
}
