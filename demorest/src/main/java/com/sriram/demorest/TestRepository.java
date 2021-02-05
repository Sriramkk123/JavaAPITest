package com.sriram.demorest;

import java.util.ArrayList;
import java.util.List;

public class TestRepository {
	
	
	List<TestAPI> tests;
	
	public TestRepository()
	{
		tests = new ArrayList<>();
		
		TestAPI test1 = new TestAPI();
		test1.setId(1);
		test1.setName("Sriram");
		test1.setPoints(50); 
		
		
		TestAPI test2 = new TestAPI();
		test2.setId(2);
		test2.setName("ABCD");
		test1.setPoints(60);
		
		tests.add(test1);
		tests.add(test2);
	}
	
	public List<TestAPI> getTests()
	{
		return tests;
	}
	
	public TestAPI getAPI(int id)
	{
		for(TestAPI a : tests)
		{
			if(a.getId() == id)
				return a;
		}
		return null;
	}

	public void create(TestAPI createnewAPI) {
		tests.add(createnewAPI);
		
	}
}
