//package memoriasAsociativas;

public class MemAsociativas {
	

	public static void main(String[] args){
		MemAsociativas ma = new MemAsociativas();
		ma.aprendizaje();
	}

	int[][] matriz1, matriz2, minimo, maximo, betaMinJ, betaMaxJ, betaMinC, betaMaxC;
	int[][] matrizJ = { {1, 1, 1}, // J
						{0, 1, 0},
						{0, 1, 0},
						{1, 1, 0}
					};

    int[][] matrizC = {	{1, 1, 1}, // C
    					{1, 0, 0},
    					{1, 0, 0},
    					{1, 1, 1}
    				};

	int[] vectorLetra = new int[12];
	int[] vectorLetraC = new int[12];
	int[] vFinalMinJ = new int[12];
	int[] vFinalMaxJ = new int[12];
	int[] vFinalMinC = new int[12];
	int[] vFinalMaxC = new int[12];

	private int[][] alfa(int[][] letra){
		int n = 0;
		int [][] matrizAlfa = new int[12][12];

		System.out.println(" MATRIZ INICIAL ");
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print(letra[i][j]);
				vectorLetra[n] = letra[i][j];
				n++;
			}
			System.out.print("\n");
		}

		System.out.println("\nVECTOR");
		for( int i=0; i<vectorLetra.length; i++ ){
			System.out.print( vectorLetra[i] );
			System.out.print( vectorLetraC );
		}

		System.out.println("\n\nMATRIZ TRANSPUESTA");
		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				
				if( vectorLetra[i] == 0 && vectorLetra[j] == 0 ) { matrizAlfa[i][j] = 1; }
				if( vectorLetra[i] == 0 && vectorLetra[j] == 1 ) { matrizAlfa[i][j] = 0; }
				if( vectorLetra[i] == 1 && vectorLetra[j] == 0 ) { matrizAlfa[i][j] = 2; }
				if( vectorLetra[i] == 1 && vectorLetra[j] == 1 ) { matrizAlfa[i][j] = 1; }
				System.out.print(matrizAlfa[i][j]);
			}
			System.out.print("\n");
		}
		return matrizAlfa;
	}

	private int[][] minimo( int[][] matrizAlfa1, int[][] matrizAlfa2 ){
		int[][] minimo = new int[12][12];
		for( int i=0; i<12; i++){
			for( int j=0; j<12; j++ ){
				if( matrizAlfa1[i][j] == matrizAlfa2[i][j] ){
					minimo[i][j] = matrizAlfa1[i][j];
				} else {
					if( matrizAlfa1[i][j] < matrizAlfa2[i][j] ){
						minimo[i][j] = matrizAlfa1[i][j];
					} else {
						minimo[i][j] = matrizAlfa2[i][j];
					}
				}
				System.out.print(minimo[i][j]);
			}
			System.out.print("\n");
		}
		return minimo;
	}

	private int[][] maximo( int[][] matrizAlfa1, int[][] matrizAlfa2 ){
		int[][] maximo = new int[12][12];

		for( int i=0; i<12; i++){
			for( int j=0; j<12; j++ ){
				if( matrizAlfa1[i][j] == matrizAlfa2[i][j] ){
					maximo[i][j] = matrizAlfa1[i][j];
				} else {
					if( matrizAlfa1[i][j] > matrizAlfa2[i][j] ){
						maximo[i][j] = matrizAlfa1[i][j];
					} else {
						maximo[i][j] = matrizAlfa2[i][j];
					}
				}
				System.out.print(maximo[i][j]);
			}
			System.out.print("\n");
		}
		return maximo;
	}

	private int[][] beta( int[][] minMax, int[] vectorLetra ){
		int[][] matrizBeta = new int[12][12];
		System.out.println("\n\n MATRIZ BETA \n\n");

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( minMax[i][j] == 0 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 0 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 1 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 0; }
				if( minMax[i][j] == 1 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 1; }
				if( minMax[i][j] == 2 && vectorLetra[i] == 0 ) { matrizBeta[i][j] = 1; }
				if( minMax[i][j] == 2 && vectorLetra[i] == 1 ) { matrizBeta[i][j] = 1; }

				System.out.print( matrizBeta[i][j] );
			}
			System.out.print("\n");
		}
		return matrizBeta;
	}

	private int[] recuperacionMaximo( int[][] max ){
		int[] betaFinal = new int[12];

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( max[i][j] == max[i][j] ){
					betaFinal[i] = max[i][j];
				} else {
					if( max[i][j] > max[i][j] ){
						betaFinal[i] = max[i][j];
					} else {
						betaFinal[i] = max[i][j];
					}
				}
			}
		}
		return betaFinal;
	}

	private int[] recuperacionMinimo( int[][] max ){
		int[] betaFinal = new int[12];

		for( int i=0; i<12; i++ ){
			for( int j=0; j<12; j++ ){
				if( max[i][j] == max[i][j] ){
					betaFinal[i] = max[i][j];
				} else {
					if( max[i][j] < max[i][j] ){
						betaFinal[i] = max[i][j];
					} else {
						betaFinal[i] = max[i][j];
					}
				}
			}
		}
		return betaFinal;
	}

	private void aprendizaje(){

		matriz1 = alfa( matrizJ );
		matriz2 = alfa( matrizC );

		minimo = minimo( matriz1, matriz2 );
		maximo = maximo( matriz1, matriz2 );

		betaMinJ = beta( minimo, vectorLetra );
		betaMaxJ = beta( maximo, vectorLetra );
		betaMinC = beta( minimo, vectorLetraC );
		betaMaxC = beta( maximo, vectorLetraC );

		vFinalMinJ = recuperacionMinimo( betaMinJ );
		vFinalMaxJ = recuperacionMaximo( betaMaxJ );

		vFinalMinC = recuperacionMinimo( betaMinC );
		vFinalMaxC = recuperacionMaximo( betaMaxC );

		System.out.println( "\n" );
		int[][] ha = new int[4][3];
		int n = 0;
		System.out.println( "\nBETA MINIMO...\n\n" );
		
		//imprime el minimo de beta de la letra C
		for( int i=0; i<4; i++ ){
			for( int j=0; j<3; j++){
				ha[i][j] = vFinalMinJ[n];
				System.out.print(ha[i][j]);
				n++;
			}
			System.out.print("\n");
		}
	}
}
