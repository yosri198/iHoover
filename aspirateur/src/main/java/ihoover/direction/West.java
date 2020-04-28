package ihoover.direction;

import ihoover.aspirateur.Aspirateur;

public class West implements Direction{
	public Direction Right() {
		return new North();
	}

	public Direction Left() {
		return new South();
	}

	public void move(Aspirateur aspirateur) {
		aspirateur.setCoordinateY(aspirateur.getCoordinateY() + 1);
	}


}



