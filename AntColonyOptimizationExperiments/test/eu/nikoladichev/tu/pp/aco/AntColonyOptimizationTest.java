package eu.nikoladichev.tu.pp.aco;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import cern.jet.random.Uniform;
import eu.nikoladichev.tu.pp.aco.AntColonyOptimization.WalkedWay;

public class AntColonyOptimizationTest {
	

	  private static String TSP_FILE = "files/berlin52.tsp";
	  public static final double ALPHA = -0.2d;
	  public static final double BETA = 9.6d;

	  // heuristic parameters
	  public static final double Q = 0.0001d; // Value is between 0 and 1
	  public static final double PHEROMONE_PERSISTENCE = 0.3d; // Value is between 0 and 1
	  public static final double INITIAL_PHEROMONES = 0.8d; // Can be any number!

	  // use power of 2
	  public static final int NUM_AGENTS = 2048 * 20;
	  private static final int POOL_SIZE = Runtime.getRuntime().availableProcessors();

	  private Uniform uniform;

	  private static final ExecutorService THREAD_POOL = Executors
	      .newFixedThreadPool(POOL_SIZE);

	  private final ExecutorCompletionService<WalkedWay> agentCompletionService = new ExecutorCompletionService<WalkedWay>(
	      THREAD_POOL);

	
	  
	// Sanity Test !
	@Test
	public void testingSingleThread() {
		assertEquals(POOL_SIZE, 2);
		//System.out.println(POOL_SIZE);
	}
}
