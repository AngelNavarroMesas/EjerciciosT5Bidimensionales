package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[5][5];
		int n=0,m=0;
		
		while(m<=4) {
			if(n==4) {
				tabla[n][m]=10*n+m;
				m++;
				n=0;
			}else {
				tabla[n][m]=10*n+m;
				n++;
			}
			
		}
		
		System.out.println(Arrays.deepToString(tabla));
	}

}
