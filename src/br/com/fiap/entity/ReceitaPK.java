package br.com.fiap.entity;

import java.io.Serializable;


public class ReceitaPK implements Serializable{
	
	private int medico;
	
	private int paciente;

	public ReceitaPK() {
		super();
	}

	public ReceitaPK(int medico, int paciente) {
		super();
		this.medico = medico;
		this.paciente = paciente;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		this.medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	
	

}
