module com.coc.run_little_cat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.coc.run_little_cat to javafx.fxml;
    exports com.coc.run_little_cat;
}