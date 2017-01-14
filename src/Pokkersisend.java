import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.shape.Circle;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pokkersisend extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox(); //aken kuhu see ilmub
        Scene login = new Scene(vbox, 400, 100);
        primaryStage.setScene(login);
        primaryStage.show();   //näita
        Label pealkiri = new Label("Kui tahad sissepääsu, kirjuta siia oma nimi!");
        TextField paroolf = new TextField();
        Button anna = new Button("vihje :-), kirjuta: oma nimi");
        vbox.getChildren().addAll(pealkiri, paroolf, anna);

        Ellipse lopergune = new Ellipse(400, 200);
        Pane pane = new Pane();
        pane.getChildren().add(lopergune);
        Scene uus = new Scene(pane, 800, 400);
        System.out.println("kontroll kas teeb loperguse ");


//mis tahan: et tekiks uus kast lopergune whatever, kus ta annab teate, et õige valik!
// Mitte aga et oleks eraldi lopergune kast
        paroolf.setOnAction(event -> {
            // Tegevus siia textfield paroolf
            String parool = paroolf.getText();
            if (parool.equals("oma nimi")) {
                System.out.println("õige valik");
                primaryStage.setScene(uus);
            } else {
                System.out.println("vali muu puu");
            }
        });
        System.out.println("kontroll The End");
    }
}
