package eu.nikoladichev.tu.pp.aco;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class ThreadsTest extends ACOBaseTestUtil {
	/**
	 * Testing with 1 core (CPU is Intel Core i7 -hyperthreading enabled)
	 * 
	 * @throws IOException
	 */
	@Test
	public void testingWithSingleThread() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(
				(short) 1);
		startProcess(antColonyOptimization);
	}

	/**
	 * Testing with 2 cores
	 * 
	 * @throws IOException
	 */
	@Test
	public void testingWithTwoThreads() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 2));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(
				(short) 2);
		startProcess(antColonyOptimization);
	}

	/**
	 * Testing with 4 cores On testing machine CPU has hyperthreading enabled by
	 * default which makes total of 8 cores! When testing with 4 cores this
	 * means that hyperthreading is disabled!
	 * 
	 * @throws IOException
	 */
	@Test
	public void testingWithFourThreads() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 4));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(
				(short) 4);
		startProcess(antColonyOptimization);
	}

	/**
	 * Testing with 8 cores (On testing machine hyperthreading is enabled!)
	 * 
	 * @throws IOException
	 */
	@Test
	public void testingWithEightTreads() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 8));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(
				(short) 8);
		startProcess(antColonyOptimization);
	}

	/**
	 * Testing with maximum cores (On testing machine this test should be equal
	 * to the previous one and that's why it's skipped )
	 * 
	 * @throws IOException
	 */
	@Test
	public void testingWithMaximumTreads() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() > 8));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(
				(short) Runtime.getRuntime().availableProcessors());
		startProcess(antColonyOptimization);
	}
}
