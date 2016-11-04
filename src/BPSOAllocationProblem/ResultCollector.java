/*
 * Boxiong Tan (Maximus Tann)
 * Title:        PSO algorithm framework
 * Description:  PSO algorithm framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * ResultCollector.java - collect the results for Hai's paper
 */
package BPSOAllocationProblem;

import java.util.ArrayList;

import dataCollector.DataCollector;
/**
 * 
 * @author Boxiong Tan (Maximus Tann)
 * @since PSO framework 1.0
 */
public class ResultCollector extends DataCollector {
	private long start, end;

	/**
	 * add Double fitness value
	 */
	public void collect(Object data) {
		resultData.add((Double) data);
	}

	/**
	 * @return resultData result data
	 */
	public ArrayList<Double> getResult(){
		return resultData;
	}
	
	/**
	 * start recording
	 */
	public void collectTime(int gen){
		if(gen == 0) start = System.nanoTime();
		else { 
			end = System.nanoTime();
			timeData.add(new Double(Math.floor((end - start) / 10000000.0)) / 100.0);
		}
	}
	

	/**
	 * print all fitness results
	 */
	public void printResult(){
		for(int i = 0; i < resultData.size(); i++){
			System.out.println(resultData.get(i));
		}
		System.out.println();
	}
	

	
	/**
	 * collect populations, have not finished
	 */
	public void collectParticle(double[][] particle) {
		// TODO Auto-generated method stub
		
	}
	
	public void mean(int runs){
		int size = resultData.size();
		int gen = size / runs;
		double best = 0;
		for(int i = 1; i <= runs; i++) {
			best += resultData.get(i * gen - 1);
		}
		System.out.println(best / runs);
	}

}
