package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[3][6];
		int i=0, j=0;
		
		while(i<3) {
			if(i==0) {
				switch(j) {
					case 0: tabla[i][j]=0;
						break;
					case 1: tabla[i][j]=30;
						break;
					case 2: tabla[i][j]=2;
						break;
					case 5: tabla[i][j]=5;
							j=0;
							i++;
						break;
				}
			}
			if(i==1) {
				switch(j) {
					case 0: tabla[i][j]=75;
						break;
					case 4: tabla[i][j]=0;
						break;
					case 5:	i++;
							j=0;
						break;
				}
			}
			if(i==2) {
				switch(j) {
				case 2: tabla[i][j]=-2;
					break;
				case 3: tabla[i][j]=9;
					break;
				case 5: tabla[i][j]=11;
						i++;
						j=0;
					break;
				}
			}
			j++;
		}
		
		System.out.println(Arrays.deepToString(tabla));
		
	}

}
