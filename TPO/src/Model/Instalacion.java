package Model;

import java.util.ArrayList;
import java.util.Map;

public class Instalacion {
	private static int nroVisita;
    private Tecnico tecnicoDeInstalacion;
    private boolean solicitudInstalacionConfirmada;
    private String diaSemana;
    private String horarioPactadoInicio;
    private String horarioPactadoFinal;
    private int tiempoTrabajado;
    private ArrayList<Material>materialesParaInstalacion;
    private Map<String, Double> listaOtrosMateriales;
    private EstadoVisita estadoDeInstalacion;
    private boolean almuerzo;
    private double costoFinal;

}
