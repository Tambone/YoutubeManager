import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class YoutubeRunner extends Application {
    public static void main(String args[]) {
        launch(YoutubeRunner.class, args);
    }
    @Override
    public void start(Stage stage) {
        TabPane tabs = new TabPane();
        Tab playlist = new Tab();
        playlist.setText("Youtube Playlist Maker");
        playlist.setContent(YoutubePlaylistMaker.youtubePlaylist());

        tabs.getTabs().addAll(playlist);

        Scene scene = new Scene(tabs, 300, 400);
        stage.setScene(scene);
        stage.setTitle("Youtube Manager");
        stage.show();
    }
}
