package com.generation;

import problema4.ConjuntoEnteros;

public class Main {

	public static void main(String[] args) {
		ConjuntoEnteros arr1 = new ConjuntoEnteros();
		
		arr1.InsertElement(1);
		arr1.InsertElement(10);
		arr1.InsertElement(15);
		arr1.InsertElement(5);
		arr1.InsertElement(50);
		arr1.InsertElement(80);
		arr1.deleteElement(10);
		String datos1 = arr1.toSetString();
		System.out.println(datos1);
		
		ConjuntoEnteros arr2 = new ConjuntoEnteros();
		
		arr2.InsertElement(1);
		arr2.InsertElement(10);
		arr2.InsertElement(15);
		arr2.InsertElement(5);
		arr2.InsertElement(90);
		String datos2 = arr2.toSetString();
		System.out.println(datos2);
		
		ConjuntoEnteros unionArreglos = arr1.union(arr2);
		String datos3 = unionArreglos.toSetString();
		System.out.println(datos3);
		
		ConjuntoEnteros interArreglos = arr1.interseccion(arr2);
		String datos4 = interArreglos.toSetString();
		System.out.println(datos4);
	}

}
