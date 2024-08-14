module com.example.finaltestpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finaltestpractice to javafx.fxml;
    exports com.example.finaltestpractice;
}