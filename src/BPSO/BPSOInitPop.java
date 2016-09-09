package BPSO;

import algorithms.InitPop;
import algorithms.StdRandom;

public class BPSOInitPop implements InitPop{

	@Override
	public double[][] init(int popSize, int maxVar, double lbound, double ubound) {
		double[][] realVar = new double[popSize][maxVar];

		// initialize population
		for(int i = 0; i < popSize; i++){
			for(int j = 0; j < maxVar; j++){
				realVar[i][j] = (double) StdRandom.uniform(lbound, ubound);
			}
		}
		return realVar;
	}
}
