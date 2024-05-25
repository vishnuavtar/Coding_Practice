package com.test;

public class test1 {
	
	
	private CAlculator c;
	
	@BeforeEach
	public void f1() {
		c = new CAlculator();
	}
	
	
	@Test
	public void testAdd() {
		
		//CAlculator cc = new CAlculator();
		int c = c.add(5,5);
		assertEqual(c,result);
	}

}
