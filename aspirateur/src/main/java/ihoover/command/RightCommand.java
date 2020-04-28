package ihoover.command;

import ihoover.aspirateur.Aspirateur;

public class RightCommand implements Command{
	public void execute(Aspirateur aspirateur) {
		aspirateur.Right();
	}

}
