package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// [1][2][3][4][5][6][7]
		//El araray de dos dimenciones pasa de ser un estructura lineas
		//a un concepto de tabla contando ahora no solo con una fila de
		//datos, sino tambien con columnas
		
		//Array -vector de datos
		//Array de dos dimenciones -matriz
		//0[0,0] [0,1] [0,2]
		//1[1,0] [1,1] [1,2]
		//2[2,0] [2,1] [2,2]
		
		//Declarando un array de dos dimenciones:
		
		//                  filas,columnas
		int[][]matriz=new int [3][3];
		//Asignamos valores a la matriz, de acuerdo a cada posicion
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		//Declarando una matriz con sus valores desde un inicio
		int [][]matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Recorrer los datos de nuestra matriz y mostrarlos en pantalla
		//con el uso de dos ciclos anidados
		
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
	}

}
