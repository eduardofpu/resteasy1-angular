package br.com.wpattern.frameworks.resteasy.utils.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.com.wpattern.frameworks.resteasy.utils.ServiceName;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestFatorialBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestSubtrairBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseFatorialBean;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseSubtrairBean;


@Path(ServiceName.MATH_SERVICE)
@Produces(MediaType.APPLICATION_JSON)//Content-Type:application/json
@Consumes(MediaType.APPLICATION_JSON)//Content-Type:application/json
public interface IMathRestService {
	@GET
	public String hello();

	// REQUEST = {"requestBean":{"value1":10,"value2":20}}
	// RESPONSE = {"responseBean":{"result":30}}
	@POST
	@Path("/ex1")
	public ResponseBean hello(RequestBean requestBean);
	
	@POST
	@Path("/ex2")
	public ResponseSubtrairBean s(RequestSubtrairBean requestSubtrairBean);
	
	@POST
	@Path("/ex3")
	public ResponseFatorialBean f(RequestFatorialBean requestFatorialBean);
	
	

	@GET
	@Path("/exemplo1")
	public String exemplo1(@QueryParam("a") int valorA,
			@QueryParam("b") int valorB);

	@GET
	@Path("/exemplo2/{b}/{a}")
	public String exemplo2(@PathParam("a") int valorA,
			@PathParam("b") int valorB);
	
	@GET
	@Path("/exemplo3/{a}")
	public String exemplo3(@PathParam("a") int a);

}
