package inicio;

import javax.swing.JOptionPane;

//uso de encapsulacion para los atributos del objeto avion
//atributos
public class Avion {
	private String modelo;
	private String color;
	private int capacidadPasajeros;
	private int velocidadMaxima;
	private int altitud;
	private int velocidadActual;

	

	//constructor con parametros
	public Avion(String modelo, int capacidadPasajeros, int velocidadMaxima) {
		this.modelo = modelo;
		this.color=color;
		this.capacidadPasajeros = capacidadPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.altitud = altitud;
		this.velocidadActual = velocidadActual;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getAltitud() {
		return altitud;
	}
	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	/*
	//constructor sin parametros (pordefecto)
	public Avion() {
		System.out.println("Ingresa al constuctor sin parametros (datos por defecto)");
		modelo="Zuzuki";
		capacidadPasajeros= 5;
		velocidadMaxima=200;
		altitud=1000;
		velocidadActual=0;
		color="blanco";	
	}
	*/
	//metodos
	public void despegar() {
		System.out.println("El avión " + modelo + " ha despegado.");
	}

	public void aterrizar() {
		System.out.println("El avión " + modelo + " ha aterrizado.");
	}

	public void aumentarAltitud(int incremento) {
		altitud += incremento;
		System.out.println("el avion aumenta su altitud");
	}

	public void disminuirAltitud(int decremento) {
		altitud -= decremento;
		System.out.println("el avion disminuye su altitud");
	}
	
	public void apagar() {
		System.out.println("el avion se apaga");
	}
	//metodo para el ingreso de datos
	public void ingresarDatos() {
		modelo = JOptionPane.showInputDialog("Ingrese el modelo");
		color= JOptionPane.showInputDialog("ingresa el color");
		capacidadPasajeros = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CAPACIDAD DE PASAJEROS"));
		velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA velocidad maxima"));

		
	}

	public void imprimirDatos() {
		String msj="*******************DATOS AVION******************\n";
		msj+="Modelo: "+modelo+", Capacidad de pasajeros: "+capacidadPasajeros+"\n";
		msj+="Color: "+color+", velocidad maxima: "+velocidadMaxima+"\n";
		msj+="*******************************************************\n";
		
		System.out.println(msj);
		
	}

	
}
	
	/*

	
	public void aumentarVelocidad(int incremento) {
		if (velocidadActual + incremento <= velocidadMaxima) {
			velocidadActual += incremento;
		} else {
			System.out.println("No se puede aumentar la velocidad más allá de la velocidad máxima.");
		}
	}

	public void disminuirVelocidad(int decremento) {
		if (velocidadActual - decremento >= 0) {
			velocidadActual -= decremento;
		} else {
			System.out.println("No se puede disminuir la velocidad por debajo de cero.");
		}
	}

	public int obtenerAltitud() {
		return altitud;
	}

	public int obtenerVelocidadActual() {
		return velocidadActual;
	}

	public static void main(String[] args) {
		Avion miAvion = new Avion("Boeing 747", 300, 900);

		miAvion.despegar();

		miAvion.aumentarAltitud(10000);
		System.out.println("Altitud actual: " + miAvion.obtenerAltitud());

		miAvion.aumentarVelocidad(200);
		System.out.println("Velocidad actual: " + miAvion.obtenerVelocidadActual());

		miAvion.disminuirVelocidad(100);
		System.out.println("Velocidad actual: " + miAvion.obtenerVelocidadActual());

		miAvion.aterrizar();
	}


}

*/
