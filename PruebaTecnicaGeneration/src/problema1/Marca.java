package problema1;

public class Marca {
	private String modelo;
	private int anio;
	private int codigoIdentificador;
	
	Marca(String modelo, int anio, int codigoIdentificador){
		this.modelo = modelo;
		this.anio = anio;
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	
}
