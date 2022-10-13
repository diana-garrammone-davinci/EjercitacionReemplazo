import javax.swing.JOptionPane;

public class EjercicioDeReemplazo {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido al programa");
		
		Editorial planeta = new Editorial("Planeta","1154265123", "Avenida Corrientes 2037", "editorialplaneta@gmail.com", "232545623245");
		
		Autor cortazar = new Autor("Julio", "Cortazar", "1914", "masculino", "juliocortazae@gmail.com");
		
		/*public Libro(String nombreDelLibro, String añoPublicacion, int cantidadEjemplares, int costo, Editorial editorial,
				Autor autor) {*/
		Libro rayuela = new Libro("Rayuela", "1963", 100, 1000, planeta, cortazar);
		Libro bestiario = new Libro("Bestiario", "1970", 50, 900, planeta, cortazar);
		Libro unTalLucas = new Libro("Un Tal Lucas", "1975", 30, 800, planeta, cortazar);

		JOptionPane.showMessageDialog(null, rayuela);
			
			
	}

}
