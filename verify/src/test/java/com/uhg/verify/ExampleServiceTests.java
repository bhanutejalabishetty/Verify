package com.uhg.verify;

import com.uhg.verify.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world to india!", service.getMessage());
	}

}
