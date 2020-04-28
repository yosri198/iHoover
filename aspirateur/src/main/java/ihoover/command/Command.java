package ihoover.command;

import ihoover.aspirateur.Aspirateur;

public interface Command {

	public abstract void execute(Aspirateur aspirateur);
}