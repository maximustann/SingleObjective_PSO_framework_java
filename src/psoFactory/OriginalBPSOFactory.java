package psoFactory;

import BPSO.BPSOInitPop;
import BPSO.BPSOupPop;
import algorithms.InitPop;
import algorithms.InitVelocity;
import algorithms.UpPop;
import algorithms.UpdateGbest;
import commonOperators.CommonInitVel;
import commonOperators.CommonUpGbest;
import commonOperators.CommonUpPbest;
import algorithms.*;

// In this case, only the initialization of population and update population are different from common version of PSO.
public class OriginalBPSOFactory implements PSOFactory{

	@Override
	public InitPop getInitPopMethod() {
		return new BPSOInitPop();
	}

	@Override
	public InitVelocity getInitVelMethod() {
		return new CommonInitVel();
	}

	@Override
	public UpdateGbest getUpGbestMethod() {
		return new CommonUpGbest();
	}

	@Override
	public UpdatePbest getUpPbestMethod() {
		return new CommonUpPbest();
	}

	@Override
	public UpPop getUpPopMethod() {
		return new BPSOupPop();
	}

}
