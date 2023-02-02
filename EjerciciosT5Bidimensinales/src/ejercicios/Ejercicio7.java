package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int tabla[][] = new int[4][4]; 
		int aux=0, naruto=1;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				tabla[i][j] = naruto;
				naruto++;
			}
		}

		for (int i=0; i<tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				aux = tabla[i][j];
				tabla[i][j] = tabla[j][i];
				tabla[j][i] = aux;
			}
		}
		
		for (int i=0; i<tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
		
		
	}

}
