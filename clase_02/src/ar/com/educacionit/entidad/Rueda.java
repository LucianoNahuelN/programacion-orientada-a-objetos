package ar.com.educacionit.entidad;

public class Rueda {
	String marcaRueda;
	int presionAire;
	
	public Rueda() {}
	
	//constructor parametrizado
	public Rueda(String marcaRueda, int presionAire) {
		this.marcaRueda = marcaRueda;
		this.presionAire = presionAire;
	}

	//Sobrescribo el toString de object
	@Override
	public String toString() {
		return "Rueda [marcaRueda=" + marcaRueda + ", presionAire=" + presionAire + "]";
	}

	
}