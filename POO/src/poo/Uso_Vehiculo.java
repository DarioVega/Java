package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
//		Coche Renault = new Coche();	
//		System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas.");
//				
//		Coche miCoche = new Coche();
//		
//		miCoche.setColor(JOptionPane.showInputDialog("Ingrese el color en que desea el coche"));
//	
//		System.out.println("El color del coche es " + miCoche.getColor());
//		
//		System.out.println(miCoche.getDimeDatosGenerales());
//		
//		miCoche.setConfigura_asientos_cuero(JOptionPane.showInputDialog("Desea asientos de cuero? (si/no)"));
//		
//		System.out.println(miCoche.getDimeAsientos());
//		
//		miCoche.setClimatizador(JOptionPane.showInputDialog("Desea climatizador? (si/no)"));
//		
//		System.out.println(miCoche.getDimeClimatizador());
//		
//		System.out.println(miCoche.setgetdime_peso_coche());
//		
//		System.out.println("El precio final del coche es: " + miCoche.getPrecio_coche());
//
// **********************************************************************************************************
		
		Coche micoche1 = new Coche();
		
		micoche1.setColor("violeta");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7,580);
		
		mifurgoneta1.setColor("azul");
		
		mifurgoneta1.setConfigura_asientos_cuero("si");
		
		mifurgoneta1.setClimatizador("si");
		
		System.out.println(micoche1.getDimeDatosGenerales() + ", color " + micoche1.getColor());
		
		System.out.println(mifurgoneta1.getDimeDatosGenerales() + ". " + mifurgoneta1.getDatosFurgoneta());
		
		
		
	}

}
