package ar.com.educacionit.entidad;

public class Motor {
	
	int cilindrada;
	int caballos;
	String combustible;
	
	
	public Motor() {
		
	}

	//constructor parametrizado
	public Motor(int cilindrada, int caballos, String combustible) {
		this.cilindrada = cilindrada;
		this.caballos = caballos;
		this.combustible = combustible;
	}


	//SObrescribimos el toString() de object
	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", caballos=" + caballos + ", combustible=" + combustible + "]";
	}

	
}