package ar.com.educacionit.entidades;

public class Pata {
	private String posicion;
	private boolean funcional;
	
	//constructor default
	public Pata() {}
	//constructor parametrizado
	public Pata(String posicion, boolean funcional) {
		this.posicion = posicion;
		this.funcional = funcional;
	}
	
	void apoyar() {
		if(funcional) {
			System.out.println("Pata " + this.posicion + "apoyada");
		}else {
			System.out.println("Pata " + this.posicion + "leasionada");
		}
	}

	//Metodos getters and setters
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public boolean isFuncional() {
		return funcional;
	}
	public void setFuncional(boolean funcional) {
		this.funcional = funcional;
	}

	//Sobreescribo el metodo toString
	@Override
	public String toString() {
		return "Pata [posicion=" + posicion + ", funcional=" + funcional + "]";
	}
	
	
}
