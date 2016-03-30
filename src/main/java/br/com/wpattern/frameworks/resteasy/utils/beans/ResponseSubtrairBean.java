package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseSubtrairBean extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private int result;
	
	public ResponseSubtrairBean() {
		// TODO Auto-generated constructor stub
	}

	public ResponseSubtrairBean(int result) {
		super();
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
