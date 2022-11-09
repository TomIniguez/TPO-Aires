package Controller;

public class TecnicoController  {
	private TecnicoController instanciaTecnicoController;
	private MainController instanciaMainController;
	
	private TecnicoController() {
		this.instanciaMainController = instanciaMainController.getInstancia();
	}
	
	public TecnicoController getInstanciaTecnicoController() {
		if(instanciaTecnicoController == null) {
			instanciaTecnicoController = new TecnicoController();
		}
		return instanciaTecnicoController;
	}
}
