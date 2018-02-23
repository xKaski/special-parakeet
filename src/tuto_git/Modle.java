package tuto_git;

import java.util.Observable;

public class Modle extends Observable {

	int compte;
	
	public Modle() {
		this.compte = 0;
	}

	public void incremente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
