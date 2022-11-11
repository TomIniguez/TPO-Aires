package Controller;

import Model.Cliente;
import Model.Instalacion;

public class CallCenterController {
	private CallCenterController instanciaCallCenterController;
	private MainController instanciaMainController = MainController.getInstancia();
	
	private CallCenterController() {
		
	}
	
	public CallCenterController getInstanciaCallCenter() {
		if(instanciaCallCenterController == null) {
			instanciaCallCenterController = new CallCenterController();
		}
		 return instanciaCallCenterController;
	}
	
	public void programarInstalacionACliente(int nroCliente) {
		if(MainController.buscarCliente(nroCliente) != null) {
			
		}
	}
	
	public void darDeAltaCliente(String nombre, int cuit_cuil,String direccion,String telefono) {
		Cliente c = new Cliente();
		
	}
	
	public void darDeAltaCliente(String nombre, int cuit_cuil, String direccion, String telefono,String mail) {
		Cliente c = new Cliente();
	}
	
	public Instalacion programarInstalacion(String date, int idCliente) {
		return null;
	}
}
