package com.mars.explore.misson.model.enumerators;

public enum Direction {
	
	N("N"),W("W"),E("E"),S("S");
	
	private String movementDirection;
	
	Direction(String movementDirection) {
		this.movementDirection = movementDirection;
	}

	public String getMovementDirection() {
		return movementDirection;
	}

}