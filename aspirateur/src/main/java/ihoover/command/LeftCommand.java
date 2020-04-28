package ihoover.command;

import ihoover.aspirateur.Aspirateur;

public class LeftCommand implements Command {
	public void execute(Aspirateur aspirateur) {
		aspirateur.Left();
	}


}
