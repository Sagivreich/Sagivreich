

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Label label;
	TextField txt;
	
	HBox hb1;
	HBox hb2;
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager dataman;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */

     
	FXMainPane() {
		
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
         txt = new TextField();
        
         b1= new Button ("Hello");
         b2= new Button ("Howdy");
         b3= new Button ("Chinese");
         b4= new Button ("Clear");
         b5= new Button ("Exit");
         label = new Label ("Feedback");
    	
         
	    hb1 = new HBox();
        hb2 = new HBox();
		
		b1.setOnAction (new ButtonHandler());
		b2.setOnAction (new ButtonHandler());
		b3.setOnAction (new ButtonHandler()); 
		b4.setOnAction (new ButtonHandler());
		b5.setOnAction (new ButtonHandler());

		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		 dataman =new DataManager();

		 
		 hb1.setAlignment(Pos.CENTER);
		 hb2.setAlignment(Pos.CENTER);
		 
		 Insets inset = new Insets(4,4,6,7);
		 HBox.setMargin(b1, inset); 
		 HBox.setMargin(b2, inset); 
		 HBox.setMargin(b3, inset); 
		 HBox.setMargin(b4, inset); 
		 HBox.setMargin(b5, inset); 
			
		//student Task #3:
				//  add the label and textfield to one of the HBoxes
				//  add the buttons to the other HBox
				//  add the HBoxes to this FXMainPanel (a VBox)
	
		 hb1.getChildren().add(txt);
		 hb1.getChildren().add(label);
		 
		 hb2.getChildren().add(b1);
		 hb2.getChildren().add(b2);
		 hb2.getChildren().add(b3);
		 hb2.getChildren().add(b4);
		 hb2.getChildren().add(b5);

		  
	getChildren().add(hb1); 
	getChildren().add(hb2); 
		 
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks

	
	
	private class ButtonHandler implements EventHandler<ActionEvent>
	{


		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
		
			if (event.getTarget()==b1)
			{
				txt.setText(dataman.getHello());
			}
		
			else if (event.getTarget()==b2)
			{
				txt.setText(dataman.getHowdy());
			}
			else if (event.getTarget()==b3)
			{
				txt.setText(dataman.getChinese());
			}
			else if (event.getTarget()==b4)
			{
				txt.setText("  ");
			}
			else if (event.getTarget()==b5)
			{
				Platform.exit();
				System.exit(0);
			}
		
			
		}
		
		
	}
		
	
	
	
}	


