module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;

    opens org.example to javafx.fxml;
    exports org.example;
}
