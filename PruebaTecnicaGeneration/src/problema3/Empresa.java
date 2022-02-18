package problema3;

import java.util.ArrayList;

public class Empresa {
	
	ArrayList<Empleado> numEmpleados = new ArrayList<Empleado>();
	
	public int numeroEmpleados() {
		return numEmpleados.size();
	}
	
	public void agregarEmpleado(Empleado emp1) {
		numEmpleados.add(emp1);
	}
}
