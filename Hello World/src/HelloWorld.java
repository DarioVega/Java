import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		
//		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
		
		System.out.println("Ingrese su nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		System.out.println("Hola " + nombre);

	}

}
