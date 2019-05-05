import com.ra.jokeserver.JokeServer;

module com.ra.jokeapp.ui {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires com.ra.jokeserver;

    uses JokeServer;
    opens com.ra.jokeapp.ui to javafx.fxml, javafx.graphics;
}