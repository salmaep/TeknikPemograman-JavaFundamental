package com.polban.tekpro.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	public String getName() {
		return name;
	}

	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public String toString() {
        return name;
    }
}
