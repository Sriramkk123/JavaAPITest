package com.sriram.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/tests")
public class TestResources 
{
	
	TestRepository testrepo = new TestRepository();
	
	
	@GET
    @Produces(MediaType.APPLICATION_XML)
	public List<TestAPI> getAllTestAPI()
	{
		System.out.print("Running");
		return testrepo.getTests();
	}
	
	@GET
	@Path("test")
	@Produces(MediaType.APPLICATION_XML)
	
	public TestAPI getAPI(int id)
	{
		return testrepo.getAPI(id);
	}
	
	@POST
	@Path("test")
	public TestAPI createAPI(TestAPI createnewAPI)
	{
		System.out.print(createnewAPI);
		testrepo.create(createnewAPI);
		return createnewAPI;
	}

}
