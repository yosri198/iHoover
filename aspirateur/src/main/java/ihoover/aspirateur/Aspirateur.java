package ihoover.aspirateur;
import java.util.ArrayList;
import java.util.List;

import ihoover.command.Command;
import ihoover.direction.Direction;



public class Aspirateur {

	private Direction direction;
	private int coordinateX;
	private int coordinateY;
	private final Grid grid;



	public Aspirateur(Grid grid, int coordinateX, int coordinateY, Direction direction) throws Exception {

		this.grid = grid;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.direction = direction;
		validateLocation();
	}

	private Grid getGrid() {
		return grid;
	}
	public void Left() {
		direction = getDirection().Left();

	}

	public Direction getDirection() {
		return direction;
	}  

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	public void Right() {
		direction = getDirection().Right();
	}
	public void move() {
		getDirection().move(this);
		try {
			validateLocation();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws Exception {

		ArrayList <String>  inputFileAsList = InputTxt.parseInputFromFile(Aspirateur.class.getResourceAsStream("/input.txt"));
		List<String> aspiInput = inputFileAsList.subList(1, inputFileAsList.size());

		System.out.println("Input:" + "\n");
		for (String line : inputFileAsList)
			System.out.println(line);

		System.out.println("\n" + "Output:" + "\n");
		Grid grid = InputTxt.parseGridInput(inputFileAsList.get(0));
		for (int i = 0; i < aspiInput.size(); i += 2) {
			Aspirateur aspirateur = InputTxt.parsePositionInput(aspiInput.get(i), grid);
			ArrayList<Command> commands = InputTxt.parseCommandInput(aspiInput.get(i + 1));
			aspirateur.executeCommandList(commands);
			System.out.println(aspirateur.broadcastLocation());
		}
	}

	public String broadcastLocation() {
		return coordinateX + " "
				+ coordinateY + " "
				+ Character.toString(getDirection().getClass().getSimpleName().charAt(0));
	}
	private void executeCommandList(ArrayList<Command> commands) {
		for (Command command : commands)
			command.execute(this);

	}
	private void validateLocation() throws Exception {
		if (this.getCoordinateX() > this.getGrid().getUpperCoordinateX()
				|| this.getCoordinateY() > this.getGrid().getUpperCoordinateY()
				|| this.getCoordinateX() < this.getGrid().getLowerCoordinateX()
				|| this.getCoordinateY() < this.getGrid().getLowerCoordinateY());


	};    



}