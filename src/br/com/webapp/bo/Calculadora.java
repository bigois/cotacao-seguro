package br.com.webapp.bo;

public class Calculadora {
	public Double calcularSeguro(Double valor, Integer qtdDias) {
		return (valor * 1.015) * qtdDias;
	}
}
