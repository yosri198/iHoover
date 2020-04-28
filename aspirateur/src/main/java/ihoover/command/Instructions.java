package ihoover.command;



public enum Instructions  {

	G (new RightCommand()),

	D (new LeftCommand()),

	A (new MoveCommand());



	private final Command command;

	Instructions(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

}
