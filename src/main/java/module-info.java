module co.edu.javeriana.proyectofinalbd
{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens co.edu.javeriana.proyectofinalbd to javafx.fxml;
    exports co.edu.javeriana.proyectofinalbd;
}