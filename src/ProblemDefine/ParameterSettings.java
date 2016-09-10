package ProblemDefine;

// Provide some basic PSO parameter settings
public class ParameterSettings {
	private double w, c1, c2, lbound, ubound;
	private int optimization, popSize, maxGen, maxVar;

	public ParameterSettings(double w, double c1, double c2, double lbound, double ubound,
								int optimization, int popSize, int maxGen, int maxVar){
		this.c1 = c1;
		this.c2 = c2;
		this.lbound = lbound;
		this.ubound = ubound;
		this.optimization = optimization;
		this.popSize = popSize;
		this.maxGen = maxGen;
		this.maxVar = maxVar;
	}

	public int getMaxVar(){
		return maxVar;
	}
	public double getW() {
		return w;
	}
	public double getC1() {
		return c1;
	}
	public double getC2() {
		return c2;
	}
	public double getLbound() {
		return lbound;
	}
	public double getUbound() {
		return ubound;
	}
	public int getOptimization() {
		return optimization;
	}
	public int getPopSize() {
		return popSize;
	}
	public int getMaxGen() {
		return maxGen;
	}

}
