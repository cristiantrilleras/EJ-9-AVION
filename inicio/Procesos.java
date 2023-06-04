//paquete importado

package inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//intanciacion de la clase procesos
public class Procesos {

	
	public void iniciar() {
		
		

		 ArrayList<Avion> listaAviones = new ArrayList<>();

	        int opcion = 0;
	        while (opcion != 3) {
	            String opcionStr = JOptionPane.showInputDialog(
	                "----- Menú -----\n" +
	                "1. Crear avión\n" +
	                "2. Mostrar aviones\n" +
	                "3. salir\n" +
	                
	                "Seleccione una opción:"
	            );
	            opcion = Integer.parseInt(opcionStr);

	            switch (opcion) {
	                case 1:
	                    Avion avion = crearAvion();
	                    listaAviones.add(avion);
	                    JOptionPane.showMessageDialog(null, "Avión creado y almacenado en la lista.");
	                    break;
	                case 2:
	                    mostrarAviones(listaAviones);
	                    break;
	                case 3:
	                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
	            }
	        }
	    }

	  private void mostrarAviones(ArrayList<Avion> listaAviones) {
		  if (listaAviones.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "No hay aviones almacenados en la lista.");
	        } else {
	            StringBuilder mensaje = new StringBuilder("Aviones almacenados:\n");
	            for (Avion avion : listaAviones) {
	                mensaje.append("- Modelo: ").append(avion.getModelo()).append("\n");
	                mensaje.append("  Capacidad de pasajeros: ").append(avion.getCapacidadPasajeros()).append("\n");
	                mensaje.append("  Velocidad máxima: ").append(avion.getVelocidadMaxima()).append(" km/h").append("\n");
	            }
	            JOptionPane.showMessageDialog(null, mensaje.toString());
	        }
		
	}

	private static Avion crearAvion() {
	        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del avión:");
	        int capacidadPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de pasajeros del avión:"));
	        int velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad máxima del avión:"));

	        return new Avion(modelo, capacidadPasajeros, velocidadMaxima);
	    }
}
/*
//creacion del objeto avion1 a partir de la clase Avion 
Avion avion1 = new Avion();
System.out.println(avion1);
avion1.ingresarDatos();
avion1.imprimirDatos();
avion1.despegar();
avion1.aumentarAltitud(1000);

Avion avion2 = new Avion("AIRBUS", "blanco", 200, 1000);
avion2.imprimirDatos();

Avion avion3 = new Avion();
avion3.imprimirDatos();

System.out.println();

//creacion de un arraylist llamado listAviones
ArrayList<Avion> listAviones = new ArrayList<Avion>();
listAviones.add(avion1);
listAviones.add(avion2);
listAviones.add(avion3);

System.out.println(listAviones);

//uso del ciclo for each para la lista listAviones
for (Avion elemento : listAviones) {
	//impresion de los modelos de aviones de la lista creada
	System.out.println("lista de modelos: "+elemento.getModelo());
*/