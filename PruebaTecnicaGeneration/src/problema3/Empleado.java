package problema3;

public class Empleado {
	String nombre;
	String apellido;
	double salarioMensual;
	
	Empleado(String nombre, String apellido, double salarioMensual){
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
	}
	
	public double salarioAnual() {
		salarioMensual *=12;
		return salarioMensual;
	}
	
	public void aumento(double procentaje) {
		this.salarioMensual = this.salarioMensual * (1 + procentaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
	
}
