package Tema1y4;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class HolaMundoGrafico {
	public static void main(String[] args) {

			//Creamos una ventana

			JFrame miVentana = new JFrame("Ventana hola mundo");

			//Creamos un campo de texto

			JTextPane miCampoDeTexto = new JTextPane();

			miCampoDeTexto.setText("HOLA MUNDO");

			//ahora metemos el campo de texto en la ventana

			miVentana.add(miCampoDeTexto);

			//Ponemos como tamaño de ventana el mínimo necesario para que se vea todo lo que contiene

			miVentana.pack();

			//Decimos que la ventana sea visible

			miVentana.setVisible(true);
	}
}