package eu.nikoladichev.tu.pp.aco;

import java.io.IOException;

import org.junit.Test;

public class AgentsEffectivenessTest extends ACOBaseTestUtil {

	@Test
	public void tinyAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 2048);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void smallAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 10240);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void mediumAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 40960);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void largeAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 81920);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void veryLargeAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 163840);
		startProcess(antColonyOptimization);
	}
	
	@Test
	public void hugeAmountOfAgentsTest() throws IOException {
		initializeInputFile();
		AntColonyOptimization antColonyOptimization = new AntColonyOptimization((short) Runtime.getRuntime().availableProcessors(), 327680);
		startProcess(antColonyOptimization);
	}
}
