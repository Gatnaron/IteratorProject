package com.example.iteratorproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button button1;
    @FXML
    private ImageView ImageView1;
    @FXML
    private BorderPane pane;

    public Image imageView(){
        FileChooser fileChooser = new FileChooser();

        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File file = fileChooser.showOpenDialog(new Stage());

        if (file == null) return null;

        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream)){

            Image image = new Image(fileInputStream);
            return image;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView1 = new ImageView();
        pane.getChildren().add(ImageView1);
        list = new ArrayList<>();

    }
ArrayList <Image>  list;
    @FXML
    public void drowImage1()
    {
        ImageView1.setImage(imageView());
    }
    for(int i =0; i<list.count;i++)
    {
        list.append();
    }
}