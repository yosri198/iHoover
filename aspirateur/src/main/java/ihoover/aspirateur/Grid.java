package ihoover.aspirateur;

public class Grid {
	private final int lowerCoordinateX = 0;
	private final int lowerCoordinateY = 0;
	private final int UpperCoordinateX;
	private final int UpperCoordinateY;

	public Grid(int UpperCoordinateX, int UpperCoordinateY) {
		this.UpperCoordinateX = UpperCoordinateX;
		this.UpperCoordinateY = UpperCoordinateY;
	}

	public int getUpperCoordinateX() {
		return UpperCoordinateX;
	}

	public int getUpperCoordinateY() {
		return UpperCoordinateY;
	}

	public int getLowerCoordinateX() {
		return lowerCoordinateX;
	}

	public int getLowerCoordinateY() {
		return lowerCoordinateY;
	}

}
