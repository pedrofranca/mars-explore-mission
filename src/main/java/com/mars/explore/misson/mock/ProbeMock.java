package com.mars.explore.misson.mock;

import java.util.ArrayList;
import java.util.List;

import com.mars.explore.misson.model.Probe;
import com.mars.explore.misson.model.enumerators.Direction;

public class ProbeMock {
	
	private static List<Probe> probes = new ArrayList<>();
	
	public static List<Probe> getMockProbes() {
		
		Probe prob1 = new Probe();
		prob1.setDirection(Direction.N);
		prob1.setId(1);
		prob1.setPositionX(1);
		prob1.setPositionY(4);
		
		Probe prob2 = new Probe();
		prob2.setDirection(Direction.E);
		prob2.setId(2);
		prob2.setPositionX(2);
		prob2.setPositionY(3);
		
		Probe prob3 = new Probe();
		prob3.setDirection(Direction.W);
		prob3.setId(3);
		prob3.setPositionX(5);
		prob3.setPositionY(5);
		
		probes.add(prob1);
		probes.add(prob2);
		probes.add(prob3);
		
		return probes;
		
	}
	
}
