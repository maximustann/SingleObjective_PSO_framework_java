/*
 * Boxiong Tan (Maximus Tann)
 * Title:        PSO algorithm framework
 * Description:  PSO algorithm framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * RingCPSOFactory.java - A factory to assemble different parts
 */
package psoFactory;

import commonOperators.CommonDynamicW;
import commonOperators.InitRealParticle;
import commonOperators.CommonInitVel;
import commonOperators.RealUpLocalPop;
import commonOperators.CommonUpPbest;
import commonOperators.CommonVelocityClamping;
import dataCollector.DataCollector;
import topology.Ring;
import algorithms.*;
/**
 * RingCPSOFactory
 *
 *
 * @author Boxiong Tan (Maximus Tann)
 * @since PSO framework 1.0
 */
public class RingCPSOFactory implements PSOFactory{
	private DataCollector collector;

	/**
	 * Constructor
	 * @param collector is the data collector
	 */
	public RingCPSOFactory(DataCollector collector){
		this.collector = collector;
	}

	@Override
	public InitPop getInitPopMethod() {
		return new InitRealParticle();
	}

	@Override
	public InitVelocity getInitVelMethod() {
		return new CommonInitVel();
	}

	@Override
	public UpdatePbest getUpPbestMethod() {
		return new CommonUpPbest();
	}

	@Override
	public UpPop getUpPopMethod(double clampFactor) {
		return new RealUpLocalPop(getVelocityClamper(clampFactor));
	}

	@Override
	public UpdateGLbest getUpGIbestMethod() {
		return new Ring();
	}

	@Override
	public DataCollector getDataCollector() {
		return collector;
	}

	@Override
	public VelocityClamping getVelocityClamper(double clampFactor) {
		return new CommonVelocityClamping(clampFactor);
	}

	@Override
	public DynamicW getDynamicW(double balance, int maxGen, double lboundW, double uboundW) {
		return new CommonDynamicW(balance, maxGen, lboundW, uboundW);
	}



}
