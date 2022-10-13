
public class Libro {
	
	private String nombreDelLibro, añoPublicacion;
	private int cantidadEjemplares, costo;
	private Editorial editorial;
	private Autor autor;
	public Libro(String nombreDelLibro, String añoPublicacion, int cantidadEjemplares, int costo, Editorial editorial,
			Autor autor) {
		super();
		this.nombreDelLibro = nombreDelLibro;
		this.añoPublicacion = añoPublicacion;
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
	public String getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
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
		return "Libro [nombreDelLibro=" + nombreDelLibro + ", añoPublicacion=" + añoPublicacion
				+ ", cantidadEjemplares=" + cantidadEjemplares + ", costo=" + costo + ", /neditorial=" + editorial.getNombre()
				+ ", autor=" + autor.getNombre() + " " + autor.getApellido() + "]";
	}
	
	
	
	

}
