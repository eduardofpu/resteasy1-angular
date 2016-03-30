package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestSubtrairBean extends BaseBean{

	private static final long serialVersionUID = 1L;
	
	private int value1;
	private int value2;
	
	public RequestSubtrairBean() {
		// TODO Auto-generated constructor stub
	}

	public RequestSubtrairBean(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
}
