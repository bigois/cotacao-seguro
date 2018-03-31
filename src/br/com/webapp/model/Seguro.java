package br.com.webapp.model;

public class Seguro {
	private Segurado segurado;
	private Bem bem;
	private Integer qtdDias;
	private Double valor;

	public Seguro() {
	}

	public Seguro(Segurado segurado, Bem bem, Integer qtdDias, Double valor) {
		this.segurado = segurado;
		this.bem = bem;
		this.qtdDias = qtdDias;
		this.valor = valor;
	}

	public Segurado getSegurado() {
		return segurado;
	}

	public void setSegurado(Segurado segurado) {
		this.segurado = segurado;
	}
	
	public Bem getBem() {
		return bem;
	}

	public void setBem(Bem bem) {
		this.bem = bem;
	}

	public Integer getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(Integer qtdDias) {
		this.qtdDias = qtdDias;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
