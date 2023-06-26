// File for GUI

package frameworks;

import java.util.*;
import java.io.*;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane; 
import javafx.scene.image.*;
import javafx.stage.Stage;

public class ColecciónGUI extends Application {
	
	public static void main(String[] args) {				
        launch(args);
    }
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		/*
    	 * Creating cards for game by instantiating CardInfo.java with appropriate constructor
    	 */
		
		// "C://Users//deane//MEGAsync/Colección/Parallelograms/Colección_Blue_Parallelogram_1.png"
    	
    	CardInfo blueParallelogram1 = new CardInfo("Blue", 1, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_1.png");	
    	CardInfo blueParallelogram2 = new CardInfo("Blue", 2, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_2.png");   
    	CardInfo blueParallelogram3 = new CardInfo("Blue", 3, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_3.png");
    	CardInfo blueParallelogramE1 = new CardInfo("Blue", 1, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_1.png");	
    	CardInfo blueParallelogramE2 = new CardInfo("Blue", 2, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_2.png");   
    	CardInfo blueParallelogramE3 = new CardInfo("Blue", 3, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_E_3.png");
    	CardInfo blueParallelogramS1 = new CardInfo("Blue", 1, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_1.png");	
    	CardInfo blueParallelogramS2 = new CardInfo("Blue", 2, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_2.png");   
    	CardInfo blueParallelogramS3 = new CardInfo("Blue", 3, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Blue_Parallelogram_S_3.png");
    	
    	CardInfo greenParallelogram1 = new CardInfo("Green", 1, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_1.png");	
    	CardInfo greenParallelogram2 = new CardInfo("Green", 2, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_2.png");   
    	CardInfo greenParallelogram3 = new CardInfo("Green", 3, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_3.png");
    	CardInfo greenParallelogramE1 = new CardInfo("Green", 1, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_1.png");	
    	CardInfo greenParallelogramE2 = new CardInfo("Green", 2, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_2.png");   
    	CardInfo greenParallelogramE3 = new CardInfo("Green", 3, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_E_3.png");
    	CardInfo greenParallelogramS1 = new CardInfo("Green", 1, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_1.png");	
    	CardInfo greenParallelogramS2 = new CardInfo("Green", 2, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_2.png");   
    	CardInfo greenParallelogramS3 = new CardInfo("Green", 3, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Green_Parallelogram_S_3.png");
    	
    	CardInfo orangeParallelogram1 = new CardInfo("Orange", 1, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_1.png");	
    	CardInfo orangeParallelogram2 = new CardInfo("Orange", 2, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_2.png");   
    	CardInfo orangeParallelogram3 = new CardInfo("Orange", 3, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_3.png");
    	CardInfo orangeParallelogramE1 = new CardInfo("Orange", 1, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_1.png");	
    	CardInfo orangeParallelogramE2 = new CardInfo("Orange", 2, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_2.png");   
    	CardInfo orangeParallelogramE3 = new CardInfo("Orange", 3, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_E_3.png");
    	CardInfo orangeParallelogramS1 = new CardInfo("Orange", 1, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_1.png");	
    	CardInfo orangeParallelogramS2 = new CardInfo("Orange", 2, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_2.png");   
    	CardInfo orangeParallelogramS3 = new CardInfo("Orange", 3, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Orange_Parallelogram_S_3.png");
    	
    	CardInfo redParallelogram1 = new CardInfo("Red", 1, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_1.png");	
    	CardInfo redParallelogram2 = new CardInfo("Red", 2, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_2.png");   
    	CardInfo redParallelogram3 = new CardInfo("Red", 3, "Parallelogram", "Solid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_3.png");
    	CardInfo redParallelogramE1 = new CardInfo("Red", 1, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_1.png");	
    	CardInfo redParallelogramE2 = new CardInfo("Red", 2, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_2.png");   
    	CardInfo redParallelogramE3 = new CardInfo("Red", 3, "Parallelogram", "Empty", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_E_3.png");
    	CardInfo redParallelogramS1 = new CardInfo("Red", 1, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_1.png");	
    	CardInfo redParallelogramS2 = new CardInfo("Red", 2, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_2.png");   
    	CardInfo redParallelogramS3 = new CardInfo("Red", 3, "Parallelogram", "Grid", "C://Users//deane//MEGAsync//Colección//Parallelograms//Colección_Red_Parallelogram_S_3.png");
    	
    	
    	
    	CardInfo blueRectangle1 = new CardInfo("Blue", 1, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_1.png");	
    	CardInfo blueRectangle2 = new CardInfo("Blue", 2, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_2.png");   
    	CardInfo blueRectangle3 = new CardInfo("Blue", 3, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_3.png");
    	CardInfo blueRectangleE1 = new CardInfo("Blue", 1, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_1.png");	
    	CardInfo blueRectangleE2 = new CardInfo("Blue", 2, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_2.png");   
    	CardInfo blueRectangleE3 = new CardInfo("Blue", 3, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_E_3.png");
    	CardInfo blueRectangleS1 = new CardInfo("Blue", 1, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_1.png");	
    	CardInfo blueRectangleS2 = new CardInfo("Blue", 2, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_2.png");   
    	CardInfo blueRectangleS3 = new CardInfo("Blue", 3, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Blue_Rectangle_S_3.png");
    	
    	CardInfo greenRectangle1 = new CardInfo("Green", 1, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_1.png");	
    	CardInfo greenRectangle2 = new CardInfo("Green", 2, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_2.png");   
    	CardInfo greenRectangle3 = new CardInfo("Green", 3, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_3.png");
    	CardInfo greenRectangleE1 = new CardInfo("Green", 1, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_1.png");	
    	CardInfo greenRectangleE2 = new CardInfo("Green", 2, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_2.png");   
    	CardInfo greenRectangleE3 = new CardInfo("Green", 3, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_E_3.png");
    	CardInfo greenRectangleS1 = new CardInfo("Green", 1, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_1.png");	
    	CardInfo greenRectangleS2 = new CardInfo("Green", 2, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_2.png");   
    	CardInfo greenRectangleS3 = new CardInfo("Green", 3, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Green_Rectangle_S_3.png");
    	
    	CardInfo orangeRectangle1 = new CardInfo("Orange", 1, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_1.png");	
    	CardInfo orangeRectangle2 = new CardInfo("Orange", 2, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_2.png");   
    	CardInfo orangeRectangle3 = new CardInfo("Orange", 3, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_3.png");
    	CardInfo orangeRectangleE1 = new CardInfo("Orange", 1, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_1.png");	
    	CardInfo orangeRectangleE2 = new CardInfo("Orange", 2, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_2.png");   
    	CardInfo orangeRectangleE3 = new CardInfo("Orange", 3, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_E_3.png");
    	CardInfo orangeRectangleS1 = new CardInfo("Orange", 1, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_1.png");	
    	CardInfo orangeRectangleS2 = new CardInfo("Orange", 2, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_2.png");   
    	CardInfo orangeRectangleS3 = new CardInfo("Orange", 3, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Orange_Rectangle_S_3.png");
    	
    	CardInfo redRectangle1 = new CardInfo("Red", 1, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_1.png");	
    	CardInfo redRectangle2 = new CardInfo("Red", 2, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_2.png");   
    	CardInfo redRectangle3 = new CardInfo("Red", 3, "Rectangle", "Solid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_3.png");
    	CardInfo redRectangleE1 = new CardInfo("Red", 1, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_1.png");	
    	CardInfo redRectangleE2 = new CardInfo("Red", 2, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_2.png");   
    	CardInfo redRectangleE3 = new CardInfo("Red", 3, "Rectangle", "Empty", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_E_3.png");
    	CardInfo redRectangleS1 = new CardInfo("Red", 1, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_1.png");	
    	CardInfo redRectangleS2 = new CardInfo("Red", 2, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_2.png");   
    	CardInfo redRectangleS3 = new CardInfo("Red", 3, "Rectangle", "Grid", "C://Users//deane//MEGAsync//Colección//Rectangles//Colección_Red_Rectangle_S_3.png");
    	
    	
    	
    	CardInfo blueSemicircle1 = new CardInfo("Blue", 1, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_1.png");	
    	CardInfo blueSemicircle2 = new CardInfo("Blue", 2, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_2.png");   
    	CardInfo blueSemicircle3 = new CardInfo("Blue", 3, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_3.png");
    	CardInfo blueSemicircleE1 = new CardInfo("Blue", 1, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_1.png");	
    	CardInfo blueSemicircleE2 = new CardInfo("Blue", 2, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_2.png");   
    	CardInfo blueSemicircleE3 = new CardInfo("Blue", 3, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_E_3.png");
    	CardInfo blueSemicircleS1 = new CardInfo("Blue", 1, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_1.png");	
    	CardInfo blueSemicircleS2 = new CardInfo("Blue", 2, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_2.png");   
    	CardInfo blueSemicircleS3 = new CardInfo("Blue", 3, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Blue_Semicircle_S_3.png");
    	
    	CardInfo greenSemicircle1 = new CardInfo("Green", 1, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_1.png");	
    	CardInfo greenSemicircle2 = new CardInfo("Green", 2, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_2.png");   
    	CardInfo greenSemicircle3 = new CardInfo("Green", 3, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_3.png");
    	CardInfo greenSemicircleE1 = new CardInfo("Green", 1, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_1.png");	
    	CardInfo greenSemicircleE2 = new CardInfo("Green", 2, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_2.png");   
    	CardInfo greenSemicircleE3 = new CardInfo("Green", 3, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_E_3.png");
    	CardInfo greenSemicircleS1 = new CardInfo("Green", 1, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_1.png");	
    	CardInfo greenSemicircleS2 = new CardInfo("Green", 2, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_2.png");   
    	CardInfo greenSemicircleS3 = new CardInfo("Green", 3, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Green_Semicircle_S_3.png");
    	
    	CardInfo orangeSemicircle1 = new CardInfo("Orange", 1, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_1.png");	
    	CardInfo orangeSemicircle2 = new CardInfo("Orange", 2, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_2.png");   
    	CardInfo orangeSemicircle3 = new CardInfo("Orange", 3, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_3.png");
    	CardInfo orangeSemicircleE1 = new CardInfo("Orange", 1, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_1.png");	
    	CardInfo orangeSemicircleE2 = new CardInfo("Orange", 2, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_2.png");   
    	CardInfo orangeSemicircleE3 = new CardInfo("Orange", 3, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_E_3.png");
    	CardInfo orangeSemicircleS1 = new CardInfo("Orange", 1, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_1.png");	
    	CardInfo orangeSemicircleS2 = new CardInfo("Orange", 2, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_2.png");   
    	CardInfo orangeSemicircleS3 = new CardInfo("Orange", 3, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Orange_Semicircle_S_3.png");
    	
    	CardInfo redSemicircle1 = new CardInfo("Red", 1, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_1.png");	
    	CardInfo redSemicircle2 = new CardInfo("Red", 2, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_2.png");   
    	CardInfo redSemicircle3 = new CardInfo("Red", 3, "Semicircle", "Solid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_3.png");
    	CardInfo redSemicircleE1 = new CardInfo("Red", 1, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_1.png");	
    	CardInfo redSemicircleE2 = new CardInfo("Red", 2, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_2.png");   
    	CardInfo redSemicircleE3 = new CardInfo("Red", 3, "Semicircle", "Empty", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_E_3.png");
    	CardInfo redSemicircleS1 = new CardInfo("Red", 1, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_1.png");	
    	CardInfo redSemicircleS2 = new CardInfo("Red", 2, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_2.png");   
    	CardInfo redSemicircleS3 = new CardInfo("Red", 3, "Semicircle", "Grid", "C://Users//deane//MEGAsync//Colección//Semicircles//Colección_Red_Semicircle_S_3.png");
    	
    	
    	
    	CardInfo blueTriangle1 = new CardInfo("Blue", 1, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_1.png");	
    	CardInfo blueTriangle2 = new CardInfo("Blue", 2, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_2.png");   
    	CardInfo blueTriangle3 = new CardInfo("Blue", 3, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_3.png");
    	CardInfo blueTriangleE1 = new CardInfo("Blue", 1, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_1.png");	
    	CardInfo blueTriangleE2 = new CardInfo("Blue", 2, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_2.png");   
    	CardInfo blueTriangleE3 = new CardInfo("Blue", 3, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_E_3.png");
    	CardInfo blueTriangleS1 = new CardInfo("Blue", 1, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_1.png");	
    	CardInfo blueTriangleS2 = new CardInfo("Blue", 2, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_2.png");   
    	CardInfo blueTriangleS3 = new CardInfo("Blue", 3, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Blue_Triangle_S_3.png");
    	
    	CardInfo greenTriangle1 = new CardInfo("Green", 1, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_1.png");	
    	CardInfo greenTriangle2 = new CardInfo("Green", 2, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_2.png");   
    	CardInfo greenTriangle3 = new CardInfo("Green", 3, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_3.png");
    	CardInfo greenTriangleE1 = new CardInfo("Green", 1, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_1.png");	
    	CardInfo greenTriangleE2 = new CardInfo("Green", 2, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_2.png");   
    	CardInfo greenTriangleE3 = new CardInfo("Green", 3, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_E_3.png");
    	CardInfo greenTriangleS1 = new CardInfo("Green", 1, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_1.png");	
    	CardInfo greenTriangleS2 = new CardInfo("Green", 2, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_2.png");   
    	CardInfo greenTriangleS3 = new CardInfo("Green", 3, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Green_Triangle_S_3.png");
    	
    	CardInfo orangeTriangle1 = new CardInfo("Orange", 1, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_1.png");	
    	CardInfo orangeTriangle2 = new CardInfo("Orange", 2, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_2.png");   
    	CardInfo orangeTriangle3 = new CardInfo("Orange", 3, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_3.png");
    	CardInfo orangeTriangleE1 = new CardInfo("Orange", 1, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_1.png");	
    	CardInfo orangeTriangleE2 = new CardInfo("Orange", 2, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_2.png");   
    	CardInfo orangeTriangleE3 = new CardInfo("Orange", 3, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_E_3.png");
    	CardInfo orangeTriangleS1 = new CardInfo("Orange", 1, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_1.png");	
    	CardInfo orangeTriangleS2 = new CardInfo("Orange", 2, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_2.png");   
    	CardInfo orangeTriangleS3 = new CardInfo("Orange", 3, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Orange_Triangle_S_3.png");
    	
    	CardInfo redTriangle1 = new CardInfo("Red", 1, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_1.png");	
    	CardInfo redTriangle2 = new CardInfo("Red", 2, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_2.png");   
    	CardInfo redTriangle3 = new CardInfo("Red", 3, "Triangle", "Solid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_3.png");
    	CardInfo redTriangleE1 = new CardInfo("Red", 1, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_1.png");	
    	CardInfo redTriangleE2 = new CardInfo("Red", 2, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_2.png");   
    	CardInfo redTriangleE3 = new CardInfo("Red", 3, "Triangle", "Empty", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_E_3.png");
    	CardInfo redTriangleS1 = new CardInfo("Red", 1, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_1.png");	
    	CardInfo redTriangleS2 = new CardInfo("Red", 2, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_2.png");   
    	CardInfo redTriangleS3 = new CardInfo("Red", 3, "Triangle", "Grid", "C://Users//deane//MEGAsync//Colección//Triangles//Colección_Red_Triangle_S_3.png");
    	    	
    	/*
    	 * Creating (and adjusting) images for the cards 
    	 */    	
    	
    	Image blueP1i = new Image(new FileInputStream(blueParallelogram1.filePath));		ImageView blueP1 = new ImageView(blueP1i);		blueP1.setFitHeight(300); blueP1.setFitWidth(200);
    	Image blueP2i = new Image(new FileInputStream(blueParallelogram2.filePath));		ImageView blueP2 = new ImageView(blueP2i);		blueP2.setFitHeight(300); blueP2.setFitWidth(200);
    	Image blueP3i = new Image(new FileInputStream(blueParallelogram3.filePath));		ImageView blueP3 = new ImageView(blueP3i);		blueP3.setFitHeight(300); blueP3.setFitWidth(200);
    	Image blueP1ei = new Image(new FileInputStream(blueParallelogramE1.filePath));		ImageView blueP1e = new ImageView(blueP1ei);		blueP1e.setFitHeight(300); blueP1e.setFitWidth(200);
    	Image blueP2ei = new Image(new FileInputStream(blueParallelogramE2.filePath));		ImageView blueP2e = new ImageView(blueP2ei);		blueP2e.setFitHeight(300); blueP2e.setFitWidth(200);
    	Image blueP3ei = new Image(new FileInputStream(blueParallelogramE3.filePath));		ImageView blueP3e = new ImageView(blueP3ei);		blueP3e.setFitHeight(300); blueP3e.setFitWidth(200);
    	Image blueP1gi = new Image(new FileInputStream(blueParallelogramS1.filePath));		ImageView blueP1g = new ImageView(blueP1gi);		blueP1g.setFitHeight(300); blueP1g.setFitWidth(200);
    	Image blueP2gi = new Image(new FileInputStream(blueParallelogramS2.filePath));		ImageView blueP2g = new ImageView(blueP2gi);		blueP2g.setFitHeight(300); blueP2g.setFitWidth(200);
    	Image blueP3gi = new Image(new FileInputStream(blueParallelogramS3.filePath));		ImageView blueP3g = new ImageView(blueP3gi);		blueP3g.setFitHeight(300); blueP3g.setFitWidth(200);
    	
    	Image greenP1i = new Image(new FileInputStream(greenParallelogram1.filePath));		ImageView greenP1 = new ImageView(greenP1i);		greenP1.setFitHeight(300); greenP1.setFitWidth(200);
    	Image greenP2i = new Image(new FileInputStream(greenParallelogram2.filePath));		ImageView greenP2 = new ImageView(greenP2i);		greenP2.setFitHeight(300); greenP2.setFitWidth(200);
    	Image greenP3i = new Image(new FileInputStream(greenParallelogram3.filePath));		ImageView greenP3 = new ImageView(greenP3i);		greenP3.setFitHeight(300); greenP3.setFitWidth(200);
    	Image greenP1ei = new Image(new FileInputStream(greenParallelogramE1.filePath));		ImageView greenP1e = new ImageView(greenP1ei);		greenP1e.setFitHeight(300); greenP1e.setFitWidth(200);
    	Image greenP2ei = new Image(new FileInputStream(greenParallelogramE2.filePath));		ImageView greenP2e = new ImageView(greenP2ei);		greenP2e.setFitHeight(300); greenP2e.setFitWidth(200);
    	Image greenP3ei = new Image(new FileInputStream(greenParallelogramE3.filePath));		ImageView greenP3e = new ImageView(greenP3ei);		greenP3e.setFitHeight(300); greenP3e.setFitWidth(200);
    	Image greenP1gi = new Image(new FileInputStream(greenParallelogramS1.filePath));		ImageView greenP1g = new ImageView(greenP1gi);		greenP1g.setFitHeight(300); greenP1g.setFitWidth(200);
    	Image greenP2gi = new Image(new FileInputStream(greenParallelogramS2.filePath));		ImageView greenP2g = new ImageView(greenP2gi);		greenP2g.setFitHeight(300); greenP2g.setFitWidth(200);
    	Image greenP3gi = new Image(new FileInputStream(greenParallelogramS3.filePath));		ImageView greenP3g = new ImageView(greenP3gi);		greenP3g.setFitHeight(300); greenP3g.setFitWidth(200);
    	
    	Image orangeP1i = new Image(new FileInputStream(orangeParallelogram1.filePath));		ImageView orangeP1 = new ImageView(orangeP1i);		orangeP1.setFitHeight(300); orangeP1.setFitWidth(200);
    	Image orangeP2i = new Image(new FileInputStream(orangeParallelogram2.filePath));		ImageView orangeP2 = new ImageView(orangeP2i);		orangeP2.setFitHeight(300); orangeP2.setFitWidth(200);
    	Image orangeP3i = new Image(new FileInputStream(orangeParallelogram3.filePath));		ImageView orangeP3 = new ImageView(orangeP3i);		orangeP3.setFitHeight(300); orangeP3.setFitWidth(200);
    	Image orangeP1ei = new Image(new FileInputStream(orangeParallelogramE1.filePath));		ImageView orangeP1e = new ImageView(orangeP1ei);		orangeP1e.setFitHeight(300); orangeP1e.setFitWidth(200);
    	Image orangeP2ei = new Image(new FileInputStream(orangeParallelogramE2.filePath));		ImageView orangeP2e = new ImageView(orangeP2ei);		orangeP2e.setFitHeight(300); orangeP2e.setFitWidth(200);
    	Image orangeP3ei = new Image(new FileInputStream(orangeParallelogramE3.filePath));		ImageView orangeP3e = new ImageView(orangeP3ei);		orangeP3e.setFitHeight(300); orangeP3e.setFitWidth(200);
    	Image orangeP1gi = new Image(new FileInputStream(orangeParallelogramS1.filePath));		ImageView orangeP1g = new ImageView(orangeP1gi);		orangeP1g.setFitHeight(300); orangeP1g.setFitWidth(200);
    	Image orangeP2gi = new Image(new FileInputStream(orangeParallelogramS2.filePath));		ImageView orangeP2g = new ImageView(orangeP2gi);		orangeP2g.setFitHeight(300); orangeP2g.setFitWidth(200);
    	Image orangeP3gi = new Image(new FileInputStream(orangeParallelogramS3.filePath));		ImageView orangeP3g = new ImageView(orangeP3gi);		orangeP3g.setFitHeight(300); orangeP3g.setFitWidth(200);
    	
    	Image redP1i = new Image(new FileInputStream(redParallelogram1.filePath));		ImageView redP1 = new ImageView(redP1i);		redP1.setFitHeight(300); redP1.setFitWidth(200);
    	Image redP2i = new Image(new FileInputStream(redParallelogram2.filePath));		ImageView redP2 = new ImageView(redP2i);		redP2.setFitHeight(300); redP2.setFitWidth(200);
    	Image redP3i = new Image(new FileInputStream(redParallelogram3.filePath));		ImageView redP3 = new ImageView(redP3i);		redP3.setFitHeight(300); redP3.setFitWidth(200);
    	Image redP1ei = new Image(new FileInputStream(redParallelogramE1.filePath));		ImageView redP1e = new ImageView(redP1ei);		redP1e.setFitHeight(300); redP1e.setFitWidth(200);
    	Image redP2ei = new Image(new FileInputStream(redParallelogramE2.filePath));		ImageView redP2e = new ImageView(redP2ei);		redP2e.setFitHeight(300); redP2e.setFitWidth(200);
    	Image redP3ei = new Image(new FileInputStream(redParallelogramE3.filePath));		ImageView redP3e = new ImageView(redP3ei);		redP3e.setFitHeight(300); redP3e.setFitWidth(200);
    	Image redP1gi = new Image(new FileInputStream(redParallelogramS1.filePath));		ImageView redP1g = new ImageView(redP1gi);		redP1g.setFitHeight(300); redP1g.setFitWidth(200);
    	Image redP2gi = new Image(new FileInputStream(redParallelogramS2.filePath));		ImageView redP2g = new ImageView(redP2gi);		redP2g.setFitHeight(300); redP2g.setFitWidth(200);
    	Image redP3gi = new Image(new FileInputStream(redParallelogramS3.filePath));		ImageView redP3g = new ImageView(redP3gi);		redP3g.setFitHeight(300); redP3g.setFitWidth(200);
    	
    	//
    	
    	Image blueR1i = new Image(new FileInputStream(blueRectangle1.filePath));		ImageView blueR1 = new ImageView(blueR1i);		blueR1.setFitHeight(300); blueR1.setFitWidth(200);
    	Image blueR2i = new Image(new FileInputStream(blueRectangle2.filePath));		ImageView blueR2 = new ImageView(blueR2i);		blueR2.setFitHeight(300); blueR2.setFitWidth(200);
    	Image blueR3i = new Image(new FileInputStream(blueRectangle3.filePath));		ImageView blueR3 = new ImageView(blueR3i);		blueR3.setFitHeight(300); blueR3.setFitWidth(200);
    	Image blueR1ei = new Image(new FileInputStream(blueRectangleE1.filePath));		ImageView blueR1e = new ImageView(blueR1ei);		blueR1e.setFitHeight(300); blueR1e.setFitWidth(200);
    	Image blueR2ei = new Image(new FileInputStream(blueRectangleE2.filePath));		ImageView blueR2e = new ImageView(blueR2ei);		blueR2e.setFitHeight(300); blueR2e.setFitWidth(200);
    	Image blueR3ei = new Image(new FileInputStream(blueRectangleE3.filePath));		ImageView blueR3e = new ImageView(blueR3ei);		blueR3e.setFitHeight(300); blueR3e.setFitWidth(200);
    	Image blueR1gi = new Image(new FileInputStream(blueRectangleS1.filePath));		ImageView blueR1g = new ImageView(blueR1gi);		blueR1g.setFitHeight(300); blueR1g.setFitWidth(200);
    	Image blueR2gi = new Image(new FileInputStream(blueRectangleS2.filePath));		ImageView blueR2g = new ImageView(blueR2gi);		blueR2g.setFitHeight(300); blueR2g.setFitWidth(200);
    	Image blueR3gi = new Image(new FileInputStream(blueRectangleS3.filePath));		ImageView blueR3g = new ImageView(blueR3gi);		blueR3g.setFitHeight(300); blueR3g.setFitWidth(200);
    	
    	Image greenR1i = new Image(new FileInputStream(greenRectangle1.filePath));		ImageView greenR1 = new ImageView(greenR1i);		greenR1.setFitHeight(300); greenR1.setFitWidth(200);
    	Image greenR2i = new Image(new FileInputStream(greenRectangle2.filePath));		ImageView greenR2 = new ImageView(greenR2i);		greenR2.setFitHeight(300); greenR2.setFitWidth(200);
    	Image greenR3i = new Image(new FileInputStream(greenRectangle3.filePath));		ImageView greenR3 = new ImageView(greenR3i);		greenR3.setFitHeight(300); greenR3.setFitWidth(200);
    	Image greenR1ei = new Image(new FileInputStream(greenRectangleE1.filePath));		ImageView greenR1e = new ImageView(greenR1ei);		greenR1e.setFitHeight(300); greenR1e.setFitWidth(200);
    	Image greenR2ei = new Image(new FileInputStream(greenRectangleE2.filePath));		ImageView greenR2e = new ImageView(greenR2ei);		greenR2e.setFitHeight(300); greenR2e.setFitWidth(200);
    	Image greenR3ei = new Image(new FileInputStream(greenRectangleE3.filePath));		ImageView greenR3e = new ImageView(greenR3ei);		greenR3e.setFitHeight(300); greenR3e.setFitWidth(200);
    	Image greenR1gi = new Image(new FileInputStream(greenRectangleS1.filePath));		ImageView greenR1g = new ImageView(greenR1gi);		greenR1g.setFitHeight(300); greenR1g.setFitWidth(200);
    	Image greenR2gi = new Image(new FileInputStream(greenRectangleS2.filePath));		ImageView greenR2g = new ImageView(greenR2gi);		greenR2g.setFitHeight(300); greenR2g.setFitWidth(200);
    	Image greenR3gi = new Image(new FileInputStream(greenRectangleS3.filePath));		ImageView greenR3g = new ImageView(greenR3gi);		greenR3g.setFitHeight(300); greenR3g.setFitWidth(200);
    	
    	Image orangeR1i = new Image(new FileInputStream(orangeRectangle1.filePath));		ImageView orangeR1 = new ImageView(orangeR1i);		orangeR1.setFitHeight(300); orangeR1.setFitWidth(200);
    	Image orangeR2i = new Image(new FileInputStream(orangeRectangle2.filePath));		ImageView orangeR2 = new ImageView(orangeR2i);		orangeR2.setFitHeight(300); orangeR2.setFitWidth(200);
    	Image orangeR3i = new Image(new FileInputStream(orangeRectangle3.filePath));		ImageView orangeR3 = new ImageView(orangeR3i);		orangeR3.setFitHeight(300); orangeR3.setFitWidth(200);
    	Image orangeR1ei = new Image(new FileInputStream(orangeRectangleE1.filePath));		ImageView orangeR1e = new ImageView(orangeR1ei);		orangeR1e.setFitHeight(300); orangeR1e.setFitWidth(200);
    	Image orangeR2ei = new Image(new FileInputStream(orangeRectangleE2.filePath));		ImageView orangeR2e = new ImageView(orangeR2ei);		orangeR2e.setFitHeight(300); orangeR2e.setFitWidth(200);
    	Image orangeR3ei = new Image(new FileInputStream(orangeRectangleE3.filePath));		ImageView orangeR3e = new ImageView(orangeR3ei);		orangeR3e.setFitHeight(300); orangeR3e.setFitWidth(200);
    	Image orangeR1gi = new Image(new FileInputStream(orangeRectangleS1.filePath));		ImageView orangeR1g = new ImageView(orangeR1gi);		orangeR1g.setFitHeight(300); orangeR1g.setFitWidth(200);
    	Image orangeR2gi = new Image(new FileInputStream(orangeRectangleS2.filePath));		ImageView orangeR2g = new ImageView(orangeR2gi);		orangeR2g.setFitHeight(300); orangeR2g.setFitWidth(200);
    	Image orangeR3gi = new Image(new FileInputStream(orangeRectangleS3.filePath));		ImageView orangeR3g = new ImageView(orangeR3gi);		orangeR3g.setFitHeight(300); orangeR3g.setFitWidth(200);
    	
    	Image redR1i = new Image(new FileInputStream(redRectangle1.filePath));		ImageView redR1 = new ImageView(redR1i);		redR1.setFitHeight(300); redR1.setFitWidth(200);
    	Image redR2i = new Image(new FileInputStream(redRectangle2.filePath));		ImageView redR2 = new ImageView(redR2i);		redR2.setFitHeight(300); redR2.setFitWidth(200);
    	Image redR3i = new Image(new FileInputStream(redRectangle3.filePath));		ImageView redR3 = new ImageView(redR3i);		redR3.setFitHeight(300); redR3.setFitWidth(200);
    	Image redR1ei = new Image(new FileInputStream(redRectangleE1.filePath));		ImageView redR1e = new ImageView(redR1ei);		redR1e.setFitHeight(300); redR1e.setFitWidth(200);
    	Image redR2ei = new Image(new FileInputStream(redRectangleE2.filePath));		ImageView redR2e = new ImageView(redR2ei);		redR2e.setFitHeight(300); redR2e.setFitWidth(200);
    	Image redR3ei = new Image(new FileInputStream(redRectangleE3.filePath));		ImageView redR3e = new ImageView(redR3ei);		redR3e.setFitHeight(300); redR3e.setFitWidth(200);
    	Image redR1gi = new Image(new FileInputStream(redRectangleS1.filePath));		ImageView redR1g = new ImageView(redR1gi);		redR1g.setFitHeight(300); redR1g.setFitWidth(200);
    	Image redR2gi = new Image(new FileInputStream(redRectangleS2.filePath));		ImageView redR2g = new ImageView(redR2gi);		redR2g.setFitHeight(300); redR2g.setFitWidth(200);
    	Image redR3gi = new Image(new FileInputStream(redRectangleS3.filePath));		ImageView redR3g = new ImageView(redR3gi);		redR3g.setFitHeight(300); redR3g.setFitWidth(200);
    	
    	//
    	
    	Image blueS1i = new Image(new FileInputStream(blueSemicircle1.filePath));		ImageView blueS1 = new ImageView(blueS1i);		blueS1.setFitHeight(300); blueS1.setFitWidth(200);
    	Image blueS2i = new Image(new FileInputStream(blueSemicircle2.filePath));		ImageView blueS2 = new ImageView(blueS2i);		blueS2.setFitHeight(300); blueS2.setFitWidth(200);
    	Image blueS3i = new Image(new FileInputStream(blueSemicircle3.filePath));		ImageView blueS3 = new ImageView(blueS3i);		blueS3.setFitHeight(300); blueS3.setFitWidth(200);
    	Image blueS1ei = new Image(new FileInputStream(blueSemicircleE1.filePath));		ImageView blueS1e = new ImageView(blueS1ei);		blueS1e.setFitHeight(300); blueS1e.setFitWidth(200);
    	Image blueS2ei = new Image(new FileInputStream(blueSemicircleE2.filePath));		ImageView blueS2e = new ImageView(blueS2ei);		blueS2e.setFitHeight(300); blueS2e.setFitWidth(200);
    	Image blueS3ei = new Image(new FileInputStream(blueSemicircleE3.filePath));		ImageView blueS3e = new ImageView(blueS3ei);		blueS3e.setFitHeight(300); blueS3e.setFitWidth(200);
    	Image blueS1gi = new Image(new FileInputStream(blueSemicircleS1.filePath));		ImageView blueS1g = new ImageView(blueS1gi);		blueS1g.setFitHeight(300); blueS1g.setFitWidth(200);
    	Image blueS2gi = new Image(new FileInputStream(blueSemicircleS2.filePath));		ImageView blueS2g = new ImageView(blueS2gi);		blueS2g.setFitHeight(300); blueS2g.setFitWidth(200);
    	Image blueS3gi = new Image(new FileInputStream(blueSemicircleS3.filePath));		ImageView blueS3g = new ImageView(blueS3gi);		blueS3g.setFitHeight(300); blueS3g.setFitWidth(200);
    	
    	Image greenS1i = new Image(new FileInputStream(greenSemicircle1.filePath));		ImageView greenS1 = new ImageView(greenS1i);		greenS1.setFitHeight(300); greenS1.setFitWidth(200);
    	Image greenS2i = new Image(new FileInputStream(greenSemicircle2.filePath));		ImageView greenS2 = new ImageView(greenS2i);		greenS2.setFitHeight(300); greenS2.setFitWidth(200);
    	Image greenS3i = new Image(new FileInputStream(greenSemicircle3.filePath));		ImageView greenS3 = new ImageView(greenS3i);		greenS3.setFitHeight(300); greenS3.setFitWidth(200);
    	Image greenS1ei = new Image(new FileInputStream(greenSemicircleE1.filePath));		ImageView greenS1e = new ImageView(greenS1ei);		greenS1e.setFitHeight(300); greenS1e.setFitWidth(200);
    	Image greenS2ei = new Image(new FileInputStream(greenSemicircleE2.filePath));		ImageView greenS2e = new ImageView(greenS2ei);		greenS2e.setFitHeight(300); greenS2e.setFitWidth(200);
    	Image greenS3ei = new Image(new FileInputStream(greenSemicircleE3.filePath));		ImageView greenS3e = new ImageView(greenS3ei);		greenS3e.setFitHeight(300); greenS3e.setFitWidth(200);
    	Image greenS1gi = new Image(new FileInputStream(greenSemicircleS1.filePath));		ImageView greenS1g = new ImageView(greenS1gi);		greenS1g.setFitHeight(300); greenS1g.setFitWidth(200);
    	Image greenS2gi = new Image(new FileInputStream(greenSemicircleS2.filePath));		ImageView greenS2g = new ImageView(greenS2gi);		greenS2g.setFitHeight(300); greenS2g.setFitWidth(200);
    	Image greenS3gi = new Image(new FileInputStream(greenSemicircleS3.filePath));		ImageView greenS3g = new ImageView(greenS3gi);		greenS3g.setFitHeight(300); greenS3g.setFitWidth(200);
    	
    	Image orangeS1i = new Image(new FileInputStream(orangeSemicircle1.filePath));		ImageView orangeS1 = new ImageView(orangeS1i);		orangeS1.setFitHeight(300); orangeS1.setFitWidth(200);
    	Image orangeS2i = new Image(new FileInputStream(orangeSemicircle2.filePath));		ImageView orangeS2 = new ImageView(orangeS2i);		orangeS2.setFitHeight(300); orangeS2.setFitWidth(200);
    	Image orangeS3i = new Image(new FileInputStream(orangeSemicircle3.filePath));		ImageView orangeS3 = new ImageView(orangeS3i);		orangeS3.setFitHeight(300); orangeS3.setFitWidth(200);
    	Image orangeS1ei = new Image(new FileInputStream(orangeSemicircleE1.filePath));		ImageView orangeS1e = new ImageView(orangeS1ei);		orangeS1e.setFitHeight(300); orangeS1e.setFitWidth(200);
    	Image orangeS2ei = new Image(new FileInputStream(orangeSemicircleE2.filePath));		ImageView orangeS2e = new ImageView(orangeS2ei);		orangeS2e.setFitHeight(300); orangeS2e.setFitWidth(200);
    	Image orangeS3ei = new Image(new FileInputStream(orangeSemicircleE3.filePath));		ImageView orangeS3e = new ImageView(orangeS3ei);		orangeS3e.setFitHeight(300); orangeS3e.setFitWidth(200);
    	Image orangeS1gi = new Image(new FileInputStream(orangeSemicircleS1.filePath));		ImageView orangeS1g = new ImageView(orangeS1gi);		orangeS1g.setFitHeight(300); orangeS1g.setFitWidth(200);
    	Image orangeS2gi = new Image(new FileInputStream(orangeSemicircleS2.filePath));		ImageView orangeS2g = new ImageView(orangeS2gi);		orangeS2g.setFitHeight(300); orangeS2g.setFitWidth(200);
    	Image orangeS3gi = new Image(new FileInputStream(orangeSemicircleS3.filePath));		ImageView orangeS3g = new ImageView(orangeS3gi);		orangeS3g.setFitHeight(300); orangeS3g.setFitWidth(200);
    	
    	Image redS1i = new Image(new FileInputStream(redSemicircle1.filePath));		ImageView redS1 = new ImageView(redS1i);		redS1.setFitHeight(300); redS1.setFitWidth(200);
    	Image redS2i = new Image(new FileInputStream(redSemicircle2.filePath));		ImageView redS2 = new ImageView(redS2i);		redS2.setFitHeight(300); redS2.setFitWidth(200);
    	Image redS3i = new Image(new FileInputStream(redSemicircle3.filePath));		ImageView redS3 = new ImageView(redS3i);		redS3.setFitHeight(300); redS3.setFitWidth(200);
    	Image redS1ei = new Image(new FileInputStream(redSemicircleE1.filePath));		ImageView redS1e = new ImageView(redS1ei);		redS1e.setFitHeight(300); redS1e.setFitWidth(200);
    	Image redS2ei = new Image(new FileInputStream(redSemicircleE2.filePath));		ImageView redS2e = new ImageView(redS2ei);		redS2e.setFitHeight(300); redS2e.setFitWidth(200);
    	Image redS3ei = new Image(new FileInputStream(redSemicircleE3.filePath));		ImageView redS3e = new ImageView(redS3ei);		redS3e.setFitHeight(300); redS3e.setFitWidth(200);
    	Image redS1gi = new Image(new FileInputStream(redSemicircleS1.filePath));		ImageView redS1g = new ImageView(redS1gi);		redS1g.setFitHeight(300); redS1g.setFitWidth(200);
    	Image redS2gi = new Image(new FileInputStream(redSemicircleS2.filePath));		ImageView redS2g = new ImageView(redS2gi);		redS2g.setFitHeight(300); redS2g.setFitWidth(200);
    	Image redS3gi = new Image(new FileInputStream(redSemicircleS3.filePath));		ImageView redS3g = new ImageView(redS3gi);		redS3g.setFitHeight(300); redS3g.setFitWidth(200);
    	
    	//
    	
    	Image blueT1i = new Image(new FileInputStream(blueTriangle1.filePath));		ImageView blueT1 = new ImageView(blueT1i);		blueT1.setFitHeight(300); blueT1.setFitWidth(200);
    	Image blueT2i = new Image(new FileInputStream(blueTriangle2.filePath));		ImageView blueT2 = new ImageView(blueT2i);		blueT2.setFitHeight(300); blueT2.setFitWidth(200);
    	Image blueT3i = new Image(new FileInputStream(blueTriangle3.filePath));		ImageView blueT3 = new ImageView(blueT3i);		blueT3.setFitHeight(300); blueT3.setFitWidth(200);
    	Image blueT1ei = new Image(new FileInputStream(blueTriangleE1.filePath));		ImageView blueT1e = new ImageView(blueT1ei);		blueT1e.setFitHeight(300); blueT1e.setFitWidth(200);
    	Image blueT2ei = new Image(new FileInputStream(blueTriangleE2.filePath));		ImageView blueT2e = new ImageView(blueT2ei);		blueT2e.setFitHeight(300); blueT2e.setFitWidth(200);
    	Image blueT3ei = new Image(new FileInputStream(blueTriangleE3.filePath));		ImageView blueT3e = new ImageView(blueT3ei);		blueT3e.setFitHeight(300); blueT3e.setFitWidth(200);
    	Image blueT1gi = new Image(new FileInputStream(blueTriangleS1.filePath));		ImageView blueT1g = new ImageView(blueT1gi);		blueT1g.setFitHeight(300); blueT1g.setFitWidth(200);
    	Image blueT2gi = new Image(new FileInputStream(blueTriangleS2.filePath));		ImageView blueT2g = new ImageView(blueT2gi);		blueT2g.setFitHeight(300); blueT2g.setFitWidth(200);
    	Image blueT3gi = new Image(new FileInputStream(blueTriangleS3.filePath));		ImageView blueT3g = new ImageView(blueT3gi);		blueT3g.setFitHeight(300); blueT3g.setFitWidth(200);
    	
    	Image greenT1i = new Image(new FileInputStream(greenTriangle1.filePath));		ImageView greenT1 = new ImageView(greenT1i);		greenT1.setFitHeight(300); greenT1.setFitWidth(200);
    	Image greenT2i = new Image(new FileInputStream(greenTriangle2.filePath));		ImageView greenT2 = new ImageView(greenT2i);		greenT2.setFitHeight(300); greenT2.setFitWidth(200);
    	Image greenT3i = new Image(new FileInputStream(greenTriangle3.filePath));		ImageView greenT3 = new ImageView(greenT3i);		greenT3.setFitHeight(300); greenT3.setFitWidth(200);
    	Image greenT1ei = new Image(new FileInputStream(greenTriangleE1.filePath));		ImageView greenT1e = new ImageView(greenT1ei);		greenT1e.setFitHeight(300); greenT1e.setFitWidth(200);
    	Image greenT2ei = new Image(new FileInputStream(greenTriangleE2.filePath));		ImageView greenT2e = new ImageView(greenT2ei);		greenT2e.setFitHeight(300); greenT2e.setFitWidth(200);
    	Image greenT3ei = new Image(new FileInputStream(greenTriangleE3.filePath));		ImageView greenT3e = new ImageView(greenT3ei);		greenT3e.setFitHeight(300); greenT3e.setFitWidth(200);
    	Image greenT1gi = new Image(new FileInputStream(greenTriangleS1.filePath));		ImageView greenT1g = new ImageView(greenT1gi);		greenT1g.setFitHeight(300); greenT1g.setFitWidth(200);
    	Image greenT2gi = new Image(new FileInputStream(greenTriangleS2.filePath));		ImageView greenT2g = new ImageView(greenT2gi);		greenT2g.setFitHeight(300); greenT2g.setFitWidth(200);
    	Image greenT3gi = new Image(new FileInputStream(greenTriangleS3.filePath));		ImageView greenT3g = new ImageView(greenT3gi);		greenT3g.setFitHeight(300); greenT3g.setFitWidth(200);
    	
    	Image orangeT1i = new Image(new FileInputStream(orangeTriangle1.filePath));		ImageView orangeT1 = new ImageView(orangeT1i);		orangeT1.setFitHeight(300); orangeT1.setFitWidth(200);
    	Image orangeT2i = new Image(new FileInputStream(orangeTriangle2.filePath));		ImageView orangeT2 = new ImageView(orangeT2i);		orangeT2.setFitHeight(300); orangeT2.setFitWidth(200);
    	Image orangeT3i = new Image(new FileInputStream(orangeTriangle3.filePath));		ImageView orangeT3 = new ImageView(orangeT3i);		orangeT3.setFitHeight(300); orangeT3.setFitWidth(200);
    	Image orangeT1ei = new Image(new FileInputStream(orangeTriangleE1.filePath));		ImageView orangeT1e = new ImageView(orangeT1ei);		orangeT1e.setFitHeight(300); orangeT1e.setFitWidth(200);
    	Image orangeT2ei = new Image(new FileInputStream(orangeTriangleE2.filePath));		ImageView orangeT2e = new ImageView(orangeT2ei);		orangeT2e.setFitHeight(300); orangeT2e.setFitWidth(200);
    	Image orangeT3ei = new Image(new FileInputStream(orangeTriangleE3.filePath));		ImageView orangeT3e = new ImageView(orangeT3ei);		orangeT3e.setFitHeight(300); orangeT3e.setFitWidth(200);
    	Image orangeT1gi = new Image(new FileInputStream(orangeTriangleS1.filePath));		ImageView orangeT1g = new ImageView(orangeT1gi);		orangeT1g.setFitHeight(300); orangeT1g.setFitWidth(200);
    	Image orangeT2gi = new Image(new FileInputStream(orangeTriangleS2.filePath));		ImageView orangeT2g = new ImageView(orangeT2gi);		orangeT2g.setFitHeight(300); orangeT2g.setFitWidth(200);
    	Image orangeT3gi = new Image(new FileInputStream(orangeTriangleS3.filePath));		ImageView orangeT3g = new ImageView(orangeT3gi);		orangeT3g.setFitHeight(300); orangeT3g.setFitWidth(200);
    	
    	Image redT1i = new Image(new FileInputStream(redTriangle1.filePath));		ImageView redT1 = new ImageView(redT1i);		redT1.setFitHeight(300); redT1.setFitWidth(200);
    	Image redT2i = new Image(new FileInputStream(redTriangle2.filePath));		ImageView redT2 = new ImageView(redT2i);		redT2.setFitHeight(300); redT2.setFitWidth(200);
    	Image redT3i = new Image(new FileInputStream(redTriangle3.filePath));		ImageView redT3 = new ImageView(redT3i);		redT3.setFitHeight(300); redT3.setFitWidth(200);
    	Image redT1ei = new Image(new FileInputStream(redTriangleE1.filePath));		ImageView redT1e = new ImageView(redT1ei);		redT1e.setFitHeight(300); redT1e.setFitWidth(200);
    	Image redT2ei = new Image(new FileInputStream(redTriangleE2.filePath));		ImageView redT2e = new ImageView(redT2ei);		redT2e.setFitHeight(300); redT2e.setFitWidth(200);
    	Image redT3ei = new Image(new FileInputStream(redTriangleE3.filePath));		ImageView redT3e = new ImageView(redT3ei);		redT3e.setFitHeight(300); redT3e.setFitWidth(200);
    	Image redT1gi = new Image(new FileInputStream(redTriangleS1.filePath));		ImageView redT1g = new ImageView(redT1gi);		redT1g.setFitHeight(300); redT1g.setFitWidth(200);
    	Image redT2gi = new Image(new FileInputStream(redTriangleS2.filePath));		ImageView redT2g = new ImageView(redT2gi);		redT2g.setFitHeight(300); redT2g.setFitWidth(200);
    	Image redT3gi = new Image(new FileInputStream(redTriangleS3.filePath));		ImageView redT3g = new ImageView(redT3gi);		redT3g.setFitHeight(300); redT3g.setFitWidth(200);
    	
		//
		
		
		GridPane cardGrid = new GridPane();		cardGrid.setMinSize(1900, 1000);		cardGrid.setPadding(new Insets(10, 10, 10, 10));
				 cardGrid.setVgap(10);			cardGrid.setHgap(10);				cardGrid.setAlignment(Pos.CENTER);
				 // cardGrid.add(blueParallelogram1.shapeInfo(), 0, 0);					cardGrid.add(blueParallelogram2.shapeInfo(), 0, 1);

		redTriangleS3.imad(redT3gi);
		
		Image ipooted = redTriangleS3.cardImage;

		ImageView ipt2 = new ImageView(ipooted);
		
		// Create buttons for grid
		Button loc00 = new Button();	Button loc01 = new Button();	Button loc02 = new Button();
		Button loc10 = new Button();	Button loc11 = new Button();	Button loc12 = new Button();
		Button loc20 = new Button();	Button loc21 = new Button();	Button loc22 = new Button();
		Button loc30 = new Button();	Button loc31 = new Button();	Button loc32 = new Button();

		Random randomizer = new Random();	int randomize = randomizer.nextInt(50);		randomize += 1;
		
		
				
		
		Label bP1 = new Label(blueParallelogram1.shapeType); Label bP2 = new Label(blueParallelogram1.shapeFill);
		
		cardGrid.add(greenP3, 0, 0);		cardGrid.add(blueP2, 0, 1);		cardGrid.add(blueP3, 0, 2);		 cardGrid.add(blueP1e, 1, 0);
		 cardGrid.add(redP1, 1, 1);		cardGrid.add(redP2, 1, 2);		cardGrid.add(redP3, 2, 0);		 cardGrid.add(greenP1e, 2, 1);
		 cardGrid.add(orangeP1, 2, 2);		cardGrid.add(greenP2, 3, 0);		cardGrid.add(orangeP3, 3, 1);		 cardGrid.add(redP1e, 3, 2);
		
		/*
		
		 cardGrid.add(blueP1, 0, 0);		cardGrid.add(blueP2, 0, 1);		cardGrid.add(blueP3, 0, 2);		 cardGrid.add(blueP1e, 0, 3);
		 cardGrid.add(redP1, 1, 0);		cardGrid.add(redP2, 1, 1);		cardGrid.add(redP3, 1, 2);		 cardGrid.add(greenP1e, 1, 3);
		 cardGrid.add(orangeP1, 0, 0);		cardGrid.add(greenP2, 0, 1);		cardGrid.add(orangeP3, 0, 2);		 cardGrid.add(redP1e, 0, 4);
		 
		*/
		
		Scene sceneTwo = new Scene(cardGrid, 1200, 800);
		
		Image bamboo1 = new Image(new FileInputStream("C://Users//deane//MEGAsync//Colección//MET_DP202557_CRD.jpg"));
		
		BackgroundImage bgImg1 = new BackgroundImage(bamboo1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));

		Background bgImg2 = new Background(bgImg1);
		
		cardGrid.setBackground(bgImg2);
		
        primaryStage.setScene(sceneTwo);

        primaryStage.setTitle("Colección");
        primaryStage.show();
        
        redParallelogram1.shapeInfo();
        
        
        
        
    	
		
	}
	
	
	

	
}
