package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[6][10];
		int min=1000, max=0, fMin=0, cMin=0, fMax=0, cMax=0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				tabla[i][j] = (int) (Math.random()*1000);
			}
		}
		
		for (int i=0; i<tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				if(tabla[i][j]>max) {
					max=tabla[i][j];
					fMax=i;
					cMax=j;
				}else if(tabla[i][j]<min) {
					min=tabla[i][j];
					fMin=i;
					cMin=j;
				}
			}
		}
		System.out.println();
		System.out.println("El numero mayor es "+max+" Esta en la fila:"+fMax+" Columna:" +cMax);
		System.out.println("El numero menor es "+min+" Esta en la fila:"+fMin+" Columna:" +cMin);
		
		
		
	}

}
