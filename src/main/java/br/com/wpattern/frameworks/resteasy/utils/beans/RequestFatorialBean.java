package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestFatorialBean extends BaseBean{
	private static final long serialVersionUID = 1L;
	private int fatorial;
	
	public RequestFatorialBean() {
		// TODO Auto-generated constructor stub
	}

	public RequestFatorialBean(int fatorial) {
		super();
		this.fatorial = fatorial;
	}

	public int getFatorial() {
		return fatorial;
	}

	public void setFatorial(int fatorial) {
		this.fatorial = fatorial;
	}
	
}
