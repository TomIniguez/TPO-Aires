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
    private ArrayList<Material> materialesParaInstalacion;
    private Map<String, Double> listaOtrosMateriales;
    private EstadoVisita estadoDeInstalacion;
    private boolean almuerzo;
    private double costoFinal;
    
    public int calcularTiempoTrabjado() {
    	int trabajoTotal = 0;
    	trabajoTotal = getTiempoTrabajado() * getTecnicoDeInstalacion().getCostoPorHora();
    	return trabajoTotal;
    }
    
	public static int getNroVisita() {
		return nroVisita;
	}
	public static void setNroVisita(int nroVisita) {
		Instalacion.nroVisita = nroVisita;
	}
	public Tecnico getTecnicoDeInstalacion() {
		return tecnicoDeInstalacion;
	}
	public void setTecnicoDeInstalacion(Tecnico tecnicoDeInstalacion) {
		this.tecnicoDeInstalacion = tecnicoDeInstalacion;
	}
	public boolean isSolicitudInstalacionConfirmada() {
		return solicitudInstalacionConfirmada;
	}
	public void setSolicitudInstalacionConfirmada(boolean solicitudInstalacionConfirmada) {
		this.solicitudInstalacionConfirmada = solicitudInstalacionConfirmada;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getHorarioPactadoInicio() {
		return horarioPactadoInicio;
	}
	public void setHorarioPactadoInicio(String horarioPactadoInicio) {
		this.horarioPactadoInicio = horarioPactadoInicio;
	}
	public String getHorarioPactadoFinal() {
		return horarioPactadoFinal;
	}
	public void setHorarioPactadoFinal(String horarioPactadoFinal) {
		this.horarioPactadoFinal = horarioPactadoFinal;
	}
	public int getTiempoTrabajado() {
		return tiempoTrabajado;
	}
	public void setTiempoTrabajado() {
		this.tiempoTrabajado = Integer.parseInt(getHorarioPactadoInicio()) - Integer.parseInt(getHorarioPactadoFinal());
	}
	public ArrayList<Material> getMaterialesParaInstalacion() {
		return materialesParaInstalacion;
	}
	public void setMaterialesParaInstalacion(ArrayList<Material> materialesParaInstalacion) {
		this.materialesParaInstalacion = materialesParaInstalacion;
	}
	public Map<String, Double> getListaOtrosMateriales() {
		return listaOtrosMateriales;
	}
	public void setListaOtrosMateriales(Map<String, Double> listaOtrosMateriales) {
		this.listaOtrosMateriales = listaOtrosMateriales;
	}
	public EstadoVisita getEstadoDeInstalacion() {
		return estadoDeInstalacion;
	}
	public void setEstadoDeInstalacion(EstadoVisita estadoDeInstalacion) {
		this.estadoDeInstalacion = estadoDeInstalacion;
	}
	public boolean isAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(boolean almuerzo) {
		this.almuerzo = almuerzo;
	}
	public double getCostoFinal() {
		return costoFinal;
	}
	public void setCostoFinal(double costoFinal) {
		this.costoFinal = costoFinal;
	}
    
    
    

}
