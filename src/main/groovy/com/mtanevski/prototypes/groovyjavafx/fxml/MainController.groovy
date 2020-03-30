package com.mtanevski.prototypes.groovyjavafx.fxml

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TextField

import java.util.logging.Logger

class MainController implements Initializable {

    private static final Logger logger = Logger.getLogger(MainController.class.getName())

    @FXML //  fx:id="artifactId"
    private TextField artifactId// Value injected by FXMLLoader

    void checkArtifactPresence(ActionEvent event) {
        println artifactId.getCharacters()

    }

    @Override
    void initialize(URL url, ResourceBundle rb) {
    }
}
