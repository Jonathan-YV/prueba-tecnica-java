package problema2;

public class Factura {
	private String numero;
	private String descripcion;
	private int cantidadComprada;
	private double precio;
	
	Factura(String numero, String descripcion, int cantidadComprada, double precio){
		if (precio >= 0) {
			this.precio = precio;
		}
		else {
			this.precio = 0;
		}
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadComprada = cantidadComprada;
		
	}
	
	public double getTotalFatura() {
		double total;
		total = cantidadComprada * precio;
		if (total >=0) {
			return total;
		}
		total = 0;
		return total;
		
	}
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
		else {
			this.precio = 0;
		}
		
	}
	
	
	
}
