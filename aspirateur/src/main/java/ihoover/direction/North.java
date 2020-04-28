package ihoover.direction;

import ihoover.aspirateur.Aspirateur;

public class North implements Direction {

	public Direction Right() {
		return new East();
	}

	public Direction Left() {
		return new West();
	}

	public void move(Aspirateur aspirateur) {
		aspirateur.setCoordinateY(aspirateur.getCoordinateY() + 1);
	}

}
