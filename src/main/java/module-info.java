module org.sysimc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires jdk.jfr;
    requires static lombok;
    requires jakarta.persistence;
    opens org.sysimc.model to javafx.base;

    opens org.sysimc to javafx.fxml;
    exports org.sysimc;
    exports org.sysimc.controller;
    opens org.sysimc.controller to javafx.fxml;
}