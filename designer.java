/*© Steven Radomski November 12th, 2015*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.collections.ObservableList;
import javafx.stage.WindowEvent;
import javafx.application.Platform;

public class designer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flow chart maker");

		/*CREATING ANDROID SHAPED WINDOW
		*******************************/
		/*creating editing text area*/
		TextArea t = new TextArea();
		t.setPrefRowCount(10);            
		t.setText("Hello world!");
		t.setPrefSize(240, 320);
		t.setLayoutX(40);
		t.setLayoutY(40);

		/*creating button*/
        Button btn = new Button();
        btn.setText("Button txt");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            }
        });
        
		btn.setLayoutX(40);
		btn.setLayoutY(370);

		/*CREATING EDIT WINDOW
		*********************/
		/*Add button*/
        Button addb = new Button();
        addb.setText("Button+");
		addb.setLayoutX(340);
		addb.setLayoutY(20);
		/*Remove button*/
        Button remb = new Button();
        remb.setText("-");
		remb.setLayoutX(420);/*BLAZE IT*/
		remb.setLayoutY(20);

		/*Add page button*/
        Button addp = new Button();
        addp.setText("Page+");
		addp.setLayoutX(460);
		addp.setLayoutY(20);
		/*Remove page button*/
        Button remp = new Button();
        remp.setText("-");
		remp.setLayoutX(530);
		remp.setLayoutY(20);

		ListView<String> editpage = new ListView<String>();
		editpage.setEditable(true);
		editpage.setPrefWidth(280);
		editpage.setPrefHeight(160);
		editpage.setLayoutX(340);
		editpage.setLayoutY(60);

		/*CREATING LIST WINDOW
		**********************/
		ListView<String> pagelist = new ListView<String>();
		pagelist.setPrefWidth(280);
		pagelist.setPrefHeight(200);
		pagelist.setLayoutX(340);
		pagelist.setLayoutY(260);

		/*SETTING UP ENTIRE WINDOW
		**************************/
		/*creating visual dividers*/
		Line divider1 = new Line();

		divider1.setStartX(320);
		divider1.setStartY(0);
		divider1.setEndX(320);
		divider1.setEndY(480);
		divider1.setFill(Color.RED);
		divider1.setStrokeWidth(0.1f);

		Line divider2 = new Line();
		divider2.setStartX(320);
		divider2.setStartY(240);
		divider2.setEndX(640);
		divider2.setEndY(240);
		divider2.setFill(Color.RED);
		divider2.setStrokeWidth(0.1f);

		Pane pane = new Pane();
		pane.getChildren().add(addp);
		pane.getChildren().add(remp);
		pane.getChildren().add(addb);
		pane.getChildren().add(remb);
		pane.getChildren().add(editpage);
		pane.getChildren().add(divider1);
		pane.getChildren().add(divider2);
		pane.getChildren().add(t);
		pane.getChildren().add(btn);
		pane.getChildren().add(pagelist);

		primaryStage.setScene(new Scene(pane, 640, 480));
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				Platform.exit();
				System.exit(0);
			}
		});
		primaryStage.show();
    }
}

