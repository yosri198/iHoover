package ihoover.direction;

import ihoover.aspirateur.Aspirateur;

public class East implements Direction {
	public Direction Right() {
		return new South();
	}

	public Direction Left() {
		return new North();
	}

	public void move(Aspirateur aspirateur) {
		aspirateur.setCoordinateY(aspirateur.getCoordinateY() + 1);
	}

}
