module com.example.iteratorproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.iteratorproject to javafx.fxml;
    exports com.example.iteratorproject;
}