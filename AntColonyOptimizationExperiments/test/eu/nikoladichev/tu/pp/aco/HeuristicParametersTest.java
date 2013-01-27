package eu.nikoladichev.tu.pp.aco;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class HeuristicParametersTest extends ACOBaseTestUtil {
	
	/*
	 * Next 3 tests test how greedy the algorithm can be.
	 */
	
	@Test
	public void testLitleMoreGreedyAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.5d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testMoreGreedyAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.75d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testMuchMoreGreedyAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-1.0d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	/*
	 * Next 3 tests are using different rapid selection	
	 */
	
	@Test
	public void testSlowRapidSelectionAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testNormalRapidSelectionAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testFastRapidSelectionAlgorithm() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 0.3d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	/*
	 * Next 3 methods are testing the pheromone persistence
	 */
	
	@Test
	public void testWithSmallInitialPheromones() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 0.1d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testWithLitleMoreInitialPheromones() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 0.5d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testWithLargeInitialPheromones() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 9.6d, 0.0001d, 1.0d, 0.8d);
		startProcess(antColonyOptimization);
	}
	
	/*
	 * Next 3 methods are testing the initial pheromones
	 */
	
	@Test
	public void testWithSmallPheromonePersistence() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 5.0d, 0.0001d, 0.3d, 0.5d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testWithLitleMorePheromonePersistence() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 10.0d, 0.0001d, 0.3d, 1.0d);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void testWithLargePheromonePersistence() throws IOException {
		assertEquals(true, (Runtime.getRuntime().availableProcessors() >= 1));
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization(-0.2d, 15.0d, 0.0001d, 0.3d, 1.5d);
		startProcess(antColonyOptimization);
	}
}
