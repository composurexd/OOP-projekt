module org.runtimeterror {
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires javafx.fxml;
    opens org.runtimeterror;
    exports org.runtimeterror;
}