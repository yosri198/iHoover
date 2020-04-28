package ihoover.command;

import ihoover.aspirateur.Aspirateur;

public class MoveCommand implements Command {
	public void execute(Aspirateur aspirateur) {
		aspirateur.move();
	}

}
