package ihoover.direction;

import ihoover.aspirateur.Aspirateur;

public interface Direction {
	public abstract Direction Right();

	public abstract Direction Left();

	public abstract void move(Aspirateur aspirateur);


}
