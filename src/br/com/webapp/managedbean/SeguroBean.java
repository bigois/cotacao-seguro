package br.com.webapp.managedbean;

import javax.faces.bean.ManagedBean;

import br.com.webapp.model.Seguro;

@ManagedBean
public class SeguroBean {
	private String resposta = "erro";
	private String mensagem = "null";
	private Seguro seguro;
	
	public String home() {
		return "menu";
	}

	public String gravar() {
		// AVALIAR E CONVERTER CAMPOS
		// SE OK,  GRAVE,     CRIE MENSAGEM, CHAME SUCESSO
		// SE NÃO, NÃO GRAVE, CRIE MENSAGEM, CHAME ERRO
		return resposta;
	}
	
	public String pesquisar() {
		// AVALIAR E CONVERTER CAMPOS
		// SE OK,  PESQUISE,  RETORNE DADOS
		// SE NÃO, NÃO GRAVE, CRIE MENSAGEM, CHAME ERRO
		return resposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
}
