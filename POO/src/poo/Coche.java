package poo;

public class Coche {
	
	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;
	private String color;
	private boolean asientos_cuero, climatizador;
		
	public Coche() {	
		ruedas = 4;		
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;	
	}
	
	public int getRuedas() {
		return ruedas;
	}
	
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getDimeDatosGenerales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
		"cm y un peso de plataforma de " + peso_plataforma + " kg";
	}
	
	public String getDimeAsientos() {
		if(asientos_cuero) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void setConfigura_asientos_cuero(String asientos_cuero) {		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero = false;
		}
	}
	
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	
	public String getDimeClimatizador() {
		
		if(climatizador) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	//Se desaconseja hacer un set/get
	public String setgetdime_peso_coche() {
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {
			peso_total += 50;
		}
		
		if(climatizador) {
			peso_total += 20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	public int getPrecio_coche() {
		int precio_final = 10000;
		
		if(asientos_cuero) {
			precio_final += 2000;
		}
		
		if(climatizador) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
	
}
