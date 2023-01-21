package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[10][10];
		int num=1;
		
		for(int i=0; i<=10-1;i++) {
			int x=0;
			while(x<=10-1) {
				tabla[x][i] = num*(x+1);
				x++;
			}
			num++;
		}
		
		System.out.println(Arrays.deepToString(tabla));
	}

}
