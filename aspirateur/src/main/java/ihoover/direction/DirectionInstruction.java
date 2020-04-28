package ihoover.direction;


public enum DirectionInstruction {
	N (new North()),

	E (new East()),

	S (new South()),

	W (new West());

	private final Direction direction;

	DirectionInstruction(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return direction;
	}

}
