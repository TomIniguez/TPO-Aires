package Controller;

import java.util.ArrayList;

import Model.Factura;
import Model.Instalacion;

public class AdministrativoController {
	private MainController instanciaMainController;
	private AdministrativoController instanciaAdministrativoController;
	private ArrayList<Factura> listaFacturasEmitidas;
	
	public AdministrativoController() {
		MainController.getInstancia();
		
	}
	
	public AdministrativoController getInstanciaAdministrativoController() {
		if(instanciaAdministrativoController == null) {
			instanciaAdministrativoController = new AdministrativoController();
			listaFacturasEmitidas = new ArrayList<Factura>();
		}
		return instanciaAdministrativoController;
	}
	
	public Factura generarFactura(Instalacion i) {
		
		return null;
	}
	
	public void imprimirFactura(Factura f) {
		
	}
	
	public void modificarFactura(Factura f) {
		
	}

	public ArrayList<Factura> getListaFacturasEmitidas() {
		return listaFacturasEmitidas;
	}

	public void setListaFacturasEmitidas(ArrayList<Factura> listaFacturasEmitidas) {
		this.listaFacturasEmitidas = listaFacturasEmitidas;
	}
	
}