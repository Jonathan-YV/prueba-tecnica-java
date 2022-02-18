package problema1;

public class Carro {
	private String color;
	private String marca;
	private String chasis;
	private String duenio;
	private int velocidadMaxima;
	private int velocidadActual;
	private int numeroPuertas;
	private Boolean techoSolar;
	private int numeroMarchas;
	private Boolean transmisionAutomatica;
	private int nivelCombustible;
	private Propietario persona;
	
	Carro(Propietario persona){
		this.persona = persona;
	}
	
	public void acelera(){
		this.velocidadActual += 1;
	}
	
	public void frenar() {
		this.velocidadActual = 0;
	}
	
	public void cambio() {
		System.out.println("Cambio de marcha");
	}
	
	public void reduceMarcha() {
		if (velocidadActual <= 0) {
			System.out.println("Reducir la marcha");
		}
		else {
			System.out.println("No se puede");
		}
		
	}
	
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Boolean getTechoSolar() {
		return techoSolar;
	}

	public void setTechoSolar(Boolean techoSolar) {
		this.techoSolar = techoSolar;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	public Boolean getTransmisionAutomatica() {
		return transmisionAutomatica;
	}

	public void setTransmisionAutomatica(Boolean transmisionAutomatica) {
		this.transmisionAutomatica = transmisionAutomatica;
	}

	public int getNivelCombustible() {
		return nivelCombustible;
	}

	public void setNivelCombustible(int nivelCombustible) {
		this.nivelCombustible = nivelCombustible;
	}
	
	
	
	
}
