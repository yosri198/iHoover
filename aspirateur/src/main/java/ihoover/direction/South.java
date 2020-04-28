package ihoover.direction;

import ihoover.aspirateur.Aspirateur;

public class South implements Direction {

	public Direction Right() {
		return new West();
	}

	public Direction Left() {
		return new East();
	}

	public void move(Aspirateur aspirateur) {
		aspirateur.setCoordinateY(aspirateur.getCoordinateY() + 1);
	}


}
