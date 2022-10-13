
public class Libro {
	
	private String nombreDelLibro, a�oPublicacion;
	private int cantidadEjemplares, costo;
	private Editorial editorial;
	private Autor autor;
	public Libro(String nombreDelLibro, String a�oPublicacion, int cantidadEjemplares, int costo, Editorial editorial,
			Autor autor) {
		super();
		this.nombreDelLibro = nombreDelLibro;
		this.a�oPublicacion = a�oPublicacion;
		this.cantidadEjemplares = cantidadEjemplares;
		this.costo = costo;
		this.editorial = editorial;
		this.autor = autor;
	}
	public String getNombreDelLibro() {
		return nombreDelLibro;
	}
	public void setNombreDelLibro(String nombreDelLibro) {
		this.nombreDelLibro = nombreDelLibro;
	}
	public String getA�oPublicacion() {
		return a�oPublicacion;
	}
	public void setA�oPublicacion(String a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}
	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [nombreDelLibro=" + nombreDelLibro + ", a�oPublicacion=" + a�oPublicacion
				+ ", cantidadEjemplares=" + cantidadEjemplares + ", costo=" + costo + ", /neditorial=" + editorial.getNombre()
				+ ", autor=" + autor.getNombre() + " " + autor.getApellido() + "]";
	}
	
	
	
	

}
