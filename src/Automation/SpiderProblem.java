package Automation;

public class SpiderProblem {
	
public static void main(String...abc) {
	
	double spi1,spi2, spi3;
	
	double probAllSpiInClkwiseDirection;double probAllSpiInAntiClkDirection;
	double totalProbability;
	//A indicates anticlock wise and C indicates anti clockwise
	
	spi1=0.5;//probablity of ant1 go in one direction
	spi2=0.5;//probablity of ant1 go in one direction
	spi3=0.5;//probablity of ant1 go in one direction
	//If A indicates anticlock wise and C indicates clockwise there are
	//AAA, AAC, ACA, ACC, CAA, CAC, CCA & CCC -> These many possibilities
	//Out of the above 8 possibilities, only two are applicable for us
	//ie. either all spiders in clock wise dierection or all in anticlockwise dierction
	probAllSpiInClkwiseDirection=(spi1*spi2*spi3);
	System.out.println("Probality that all the spiders go in clockwise direction is" + probAllSpiInClkwiseDirection);
	
	probAllSpiInAntiClkDirection=(spi1*spi2*spi3);
	System.out.println("probability that all the spiders go in anticlockwise direction is" +probAllSpiInAntiClkDirection);
	
	totalProbability=probAllSpiInClkwiseDirection+probAllSpiInAntiClkDirection;
	
	System.out.println("Total Probability that there is no collision  "+totalProbability);
	
		
}
}
