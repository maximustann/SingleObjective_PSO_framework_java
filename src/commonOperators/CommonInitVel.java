/*
 * Boxiong Tan (Maximus Tann)
 * Title:        PSO algorithm framework
 * Description:  PSO algorithm framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * CommonInitVel.java - An common way of initialization of velocity.
 */

package commonOperators;

import algorithms.InitVelocity;
/**
 * Initialization of velocity
 * 
 * @author Boxiong Tan (Maximus Tann) 
 * @since PSO framework 1.0
 */
public class CommonInitVel implements InitVelocity{
    /**
     * Generate an 2D-array of velocity, 
     * first dimension is the size of population, 
     * second dimension is the number of variable of a particle
     * 
     * @param popSize population size
     * @param maxVar the number of variable of a particle
     * @return 2D-array of velocity
     */
	@Override
	public double[][] init(int popSize, int maxVar) {
		double[][] velocity = new double[popSize][maxVar];
		for(int i = 0; i < popSize; i++){
			for(int j = 0; j < maxVar; j++){
				velocity[i][j] = 0.0;
			}
		}
		return velocity;
	}

}
