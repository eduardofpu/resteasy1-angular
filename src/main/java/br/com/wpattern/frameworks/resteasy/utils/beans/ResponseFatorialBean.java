package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseFatorialBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	private int resposta;
	
	public ResponseFatorialBean() {
		// TODO Auto-generated constructor stub
	}

	public ResponseFatorialBean(int resposta) {
		super();
		this.resposta = resposta;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	
}
