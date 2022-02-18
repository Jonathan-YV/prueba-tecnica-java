package problema4;

public class ConjuntoEnteros {
	//ArrayList<Boolean> valor = new ArrayList<Boolean>();
	Boolean valor[] = new Boolean[101];
	
	public ConjuntoEnteros(){
		for(int i=0; i<=100;i++) {
			valor[i] = false;
		}
	}
	
	public ConjuntoEnteros union(ConjuntoEnteros arr2) {
		ConjuntoEnteros unionArreglo = new ConjuntoEnteros();
		for(int i=0; i<arr2.valor.length;i++) {
			if(valor[i] == false && arr2.valor[i] == false) {
				unionArreglo.valor[i] = false;
			}
			else {
				unionArreglo.valor[i] = true;
			}
		}
		return unionArreglo;
	}
	
	public ConjuntoEnteros interseccion(ConjuntoEnteros arr2) {
		ConjuntoEnteros interseccionArreglo = new ConjuntoEnteros();
		for(int i=0; i<arr2.valor.length;i++) {
			if(valor[i] == true && arr2.valor[i] == true) {
				interseccionArreglo.valor[i] = true;
			}
			else {
				interseccionArreglo.valor[i] = false;
			}
		}
		return interseccionArreglo;
	}
	
	public void InsertElement(int val) {
		valor[val] = true;
	}
	
	public void deleteElement(int val) {
		valor[val] = false;
	}
	
	public String toSetString() {
		String lista = "";
		for(int i=0; i<valor.length;i++) {
			if(valor[i] == true) {
				lista += Integer.toString(i) + " ";
			}
		}
		return lista;
	}
	
	
	
	
}
