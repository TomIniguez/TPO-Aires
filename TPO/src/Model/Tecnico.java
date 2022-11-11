package Model;

import java.util.List;

public class Tecnico  extends Agenda{
	
	private List<Instalacion> listaInstalacionAsig;
	private String nombre;
	private String apellido;
	private int id;
	
	public List<Instalacion> getListaInstalacionAsig() {
		return listaInstalacionAsig;
	}
	
	public void setListaInstalacionAsig(List<Instalacion> listaInstalacionAsig) {
		this.listaInstalacionAsig = listaInstalacionAsig;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
