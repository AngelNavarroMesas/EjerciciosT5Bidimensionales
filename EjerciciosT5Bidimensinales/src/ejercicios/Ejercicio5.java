package ejercicios;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[4][5];
		int aux[][] = new int[5][6];
		int con1=0,con2=0, suma=0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				tabla[i][j] = (int) (Math.random()*900+100+1);
				aux[i][j]=tabla[i][j];
			}
		}
		
		while(con1<5) {
			if(con2>=5) {
				aux[con1][con2]=suma;
				con1++;
				con2=0;
				suma=0;
			}else {
				suma += aux[con1][con2];
				con2++;
			}
		}
		
		con1=0;
		con2=0;
		suma=0;
		while(con2<5) {
			if(con1>=4) {
				aux[con1][con2]=suma;
				con2++;
				con1=0;
				suma=0;
			}else {
				suma += aux[con1][con2];
				con1++;
			}
		}
		
		con1=0;
		con2=0;
		suma=0;
		while(con2<5) {
			if(con1==4&&con2==5) {
				aux[con1][con2]=suma;
			}else {
				suma += aux[con1][con2];
				con1++;
			}
		}
		
		
		for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print(aux[i][j] + " ");
            }
            System.out.println();
        }
        
	}

}
