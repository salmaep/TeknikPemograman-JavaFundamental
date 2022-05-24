package com.polban.tekpro.monopoly;

public abstract class OwnedCell extends Cell {

	protected static Player owner;

	public OwnedCell() {
		super();
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player player) {
		this.owner = player;
	}

}