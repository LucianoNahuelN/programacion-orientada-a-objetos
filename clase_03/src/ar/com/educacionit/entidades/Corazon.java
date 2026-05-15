package ar.com.educacionit.entidades;

public class Corazon {
	private int latidosPorMinuto;
	
	
	
	public Corazon() {}

	public Corazon(int latidosPorMinuto) {
		this.latidosPorMinuto = latidosPorMinuto;
	}

	public void latir() {
		System.out.println("El corazon late a: " + this.latidosPorMinuto + "bpm");
	}
	
	

	public int getLatidosPorMinuto() {
		return latidosPorMinuto;
	}

	public void setLatidosPorMinuto(int latidosPorMinuto) {
		this.latidosPorMinuto = latidosPorMinuto;
	}
	
	//Sobreescribo el metodo toString
	@Override
	public String toString() {
		return "Corazon [latidosPorMinuto=" + latidosPorMinuto + "]";
	}
	
}
