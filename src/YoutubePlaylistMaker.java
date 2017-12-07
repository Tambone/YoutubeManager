import Computer.*;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;


public class YoutubePlaylistMaker {
    public static Pane youtubePlaylist() {
        BorderPane border = new BorderPane();
        border.setPadding(new Insets(20,0,20,20));
        border.setCenter((addSearch()));

        return border;
    }
    private static GridPane addSearch() {
        GridPane pane = new GridPane();
        HBox searchBox = new HBox();

        TextField searchBar = new TextField();

        Button searchBut = new Button();
        searchBut.setPrefSize(40,40);


        Label searchTitle = new Label("Search");

        searchBox.getChildren().addAll(searchBar,searchBut);
        pane.getChildren().addAll(searchTitle,searchBox);

        return pane;
    }

}
