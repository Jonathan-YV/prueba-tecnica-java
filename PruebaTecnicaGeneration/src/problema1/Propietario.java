package problema1;

public class Propietario {
	private String nombre;
	private int cpf;
	private int rg;
	private String fechaNacimiento;
	private Direccion direccion;
	
	Propietario(String nombre, int cpf, int rg, Direccion d1){
		this.nombre = nombre;
		this.cpf = cpf;
		this.rg = rg;
		this.direccion = d1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
