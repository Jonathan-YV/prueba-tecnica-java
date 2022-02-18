package problema3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado emp1 = new Empleado("Jonathan","Vazquez",30000);
	Empleado emp2 = new Empleado("Yair","Uriostegui",40000);
	
	Empresa empresa = new Empresa();
	
	@Test
	void aumentoSalario() {
		emp1.aumento(.10);
		assertEquals(33000,emp1.getSalarioMensual());
	}
	
	@Test
	void cantidadEmpleados() {
		empresa.agregarEmpleado(emp1);
		empresa.agregarEmpleado(emp2);
		assertEquals(2,empresa.numeroEmpleados());
	}
	
	@Test
	void sueldoMensual() {
		emp1.aumento(.10);
		double salario = emp1.salarioAnual();
		assertEquals(33000*12,salario);
	}
	
	
	
	
	
	

}
