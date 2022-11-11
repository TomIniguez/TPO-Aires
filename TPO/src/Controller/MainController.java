package Controller;

import java.util.ArrayList;

import Model.AdministradorSistemas;
import Model.Administrativo;
import Model.Cliente;
import Model.OperadorCallCenter;
import Model.Tecnico;

public class MainController {
	private ArrayList<AdministradorSistemas> listaAdministradoresSistemas;
	private ArrayList<OperadorCallCenter> listaOperadoresCallCenter;
	private ArrayList<Administrativo> listaEmpleadosAdministrativos;
	private ArrayList<Tecnico> listaTecnicos;
	private ArrayList<Cliente> listaClientes;
	private static MainController instanciaMainController;
	
	private MainController() {
		this.listaAdministradoresSistemas = new ArrayList<AdministradorSistemas>();
		this.listaOperadoresCallCenter = new ArrayList<OperadorCallCenter>();
		this.listaEmpleadosAdministrativos = new ArrayList<Administrativo>();
		this.listaTecnicos = new ArrayList<Tecnico>();
		this.listaClientes = new ArrayList<Cliente>();
	}
	
	public static MainController getInstancia() {
		if (instanciaMainController == null) {
			instanciaMainController = new MainController();
		}
		return instanciaMainController;
	}
	
	public boolean checkearStockMateriales() {
		return true;
	}
	
	public static Cliente buscarCliente(int nroCliente) {
		return null;
	}
	
	public void agregarClienteAListaClientes(Cliente c) {
		this.listaClientes.add(c);
	}

	public ArrayList<AdministradorSistemas> getListaAdministradoresSistemas() {
		return listaAdministradoresSistemas;
	}

	public void setListaAdministradoresSistemas(ArrayList<AdministradorSistemas> listaAdministradoresSistemas) {
		this.listaAdministradoresSistemas = listaAdministradoresSistemas;
	}

	public ArrayList<OperadorCallCenter> getListaOperadoresCallCenter() {
		return listaOperadoresCallCenter;
	}

	public void setListaOperadoresCallCenter(ArrayList<OperadorCallCenter> listaOperadoresCallCenter) {
		this.listaOperadoresCallCenter = listaOperadoresCallCenter;
	}

	public ArrayList<Administrativo> getListaEmpleadosAdministrativos() {
		return listaEmpleadosAdministrativos;
	}

	public void setListaEmpleadosAdministrativos(ArrayList<Administrativo> listaEmpleadosAdministrativos) {
		this.listaEmpleadosAdministrativos = listaEmpleadosAdministrativos;
	}

	public ArrayList<Tecnico> getListaTecnicos() {
		return listaTecnicos;
	}

	public void setListaTecnicos(ArrayList<Tecnico> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	

}
