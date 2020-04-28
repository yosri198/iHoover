package ihoover.aspirateur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import ihoover.command.Command;
import ihoover.command.Instructions;
import ihoover.direction.Direction;
import ihoover.direction.DirectionInstruction;




public class InputTxt {
	public static ArrayList<String> parseInputFromFile(InputStream fileLocation) throws IOException {
		ArrayList<String> inputsFromFile = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileLocation));
		String fileLine;

		while ((fileLine = bufferedReader.readLine()) != null)
			inputsFromFile.add(fileLine);

		bufferedReader.close();
		return inputsFromFile;
	}

	public static Grid parseGridInput(String gridInput) {
		String[] inputArray = gridInput.split(" ");
		int gridUpperCoordinateX = Integer.parseInt(inputArray[0]);
		int gridUpperCoordinateY = Integer.parseInt(inputArray[1]);
		return new Grid(gridUpperCoordinateX, gridUpperCoordinateY);
	}

	public static Aspirateur parsePositionInput(String positionInput, Grid grid) throws Exception{
		String[] inputArray = positionInput.split(" ") ;
		int LandingCoordinateX = Integer.parseInt(inputArray[0]);
		int LandingCoordinateY = Integer.parseInt(inputArray[1]);
		Direction direction = DirectionInstruction.valueOf(inputArray[2]).getDirection();
		return new Aspirateur(grid, LandingCoordinateX, LandingCoordinateY, direction);
	}

	public static ArrayList<Command> parseCommandInput(String command) {
		char[] inputArray = command.toCharArray();
		ArrayList<Command> commandArrayList = new ArrayList<Command>();

		for (char c : inputArray) {

			Command currentCommand = Instructions.valueOf(Character.toString(c)).getCommand();
			commandArrayList.add(currentCommand);
		}

		return commandArrayList;
	}

}



