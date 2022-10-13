package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		
		double parameterOne = 0.5;
		double parameterTwo = 0.5;
		double parameterThree = 0.35;
		double parameterFour = 0.2;
		
		StdDraw.setPenColor(255, 109,182);
		StdDraw.filledRectangle(parameterOne,parameterTwo, parameterThree, parameterFour);
		
		StdDraw.setPenColor(0, 0,255);
		StdDraw.filledRectangle(parameterOne,parameterTwo, parameterThree/2, parameterFour/2);
		
		StdDraw.setPenColor(0, 255,0);
		StdDraw.filledEllipse(parameterOne,parameterTwo, parameterThree/3, parameterFour/3);
	}
}