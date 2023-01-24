package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[][] = new int[4][5];
		int x=0, max=0, min=10, media=1;
		
		while(x<4) {
			for(int i=0;i<=4;i++) {
				System.out.println("Introduzca las notas del Alumno"+(x+1));
				tabla[x][i] = sc.nextInt();
			}
			x++;
		}
		System.out.println(Arrays.deepToString(tabla));
		x=0;
		
		while(x<4) {
			for(int i=0;i<=4;i++) {
				if(tabla[x][i]>max) {
					max=tabla[x][i];
				}
				if(tabla[x][i]<min) {
					min=tabla[x][i];
				}
				media+=tabla[x][i];
			}
			media/=5;
			System.out.println("Media Alumno"+(x+1)+": "+media);
			x++;
			media=1;
		}
		System.out.println("Nota minima: "+min);
		System.out.println("Nota minima: "+max);
		
	}

}
