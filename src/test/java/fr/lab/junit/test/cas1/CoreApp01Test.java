package fr.lab.junit.test.cas1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoreApp01Test {

	@Test
	public void test() {
		assertEquals("Paris", CoreApp01.getVille());
	}

}
