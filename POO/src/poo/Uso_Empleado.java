package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("Paco G?mez",85000,1990,12,17);
		misEmpleados[1] = new Empleado("Ana L?pez",95000,1995,06,02);
		misEmpleados[2] = new Empleado("Mar?a Martin",105000,2002,03,15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		//for(Empleado e: misEmpleados) {
			
		for(int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].setSubeSueldo(5);
			System.out.println(misEmpleados[i].getDatos());
			
		}	
		
		 System.out.println(Empleado.getIdSiguiente()); 
		
	}
	
}

class Empleado{
	
	public Empleado(String nom, double sue, int dia, int mes, int anio) {
		id = idSiguiente;
		idSiguiente++;
		nombre = nom;
		sueldo = sue;
		
		//construyo un objeto calendario para construir una fecha
		var calendario = new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom){
		this(nom,30000,01,01,2000); //el this invoca al otro constructor
		id = idSiguiente;
		idSiguiente++;	
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {	
		return nombre;	
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getFechaContrato() {
		return altaContrato;
	}
	
	public void setSubeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getDatos() {
		return "ID: " + id + ", nombre: " + nombre + ", sector: " + sector + ", sueldo: " + sueldo + 
				", fecha de contrato: " + altaContrato;
	}
	
	public static String getIdSiguiente() {
		return "El ID siguiente es: " + idSiguiente;
	}

	private int id;
	private static int idSiguiente = 1; //static pertenece a la clase, no se producen copias al instanciar la clase
	private final String nombre; //final define una constante
	private double sueldo;
	private String sector = "Administraci?n";
	private Date altaContrato;
	
}

class Jefatura extends Empleado {

	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);	
	}
	
	private double incentivo;
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo(); //El super hace que llame al m?todo del mismo nombre pero que est? en la clase padre
		return sueldoJefe + incentivo;
	}
	
}
