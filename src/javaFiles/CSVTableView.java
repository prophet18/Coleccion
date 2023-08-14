package javaFiles;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// This class was described by Dustin --->
// https://gist.github.com/dustinkredmond/4481d42011286084bff707bd15265c3d

public final class CSVTableView extends TableView<String> {
	
	Stage age9 = new Stage();					Scene csvscene;				VBox csvscored;

  public CSVTableView(String delimiter, File file) throws IOException {

      // Get CSV file lines as List
      List<String> lines = Files.readAllLines(Paths.get("./Draw_Build_Files/csvHighScores.csv"));

      // Get the header row
      String[] firstRow = {"Score", "Game Duration", "Date / Time"};

      // For each header/column, create TableColumn
      for (String columnName : firstRow) {
          TableColumn<String, String> column = new TableColumn<>(columnName);
          this.getColumns().add(column);

          column.setCellValueFactory(cellDataFeatures -> {
              String values = cellDataFeatures.getValue();
              String[] cells = values.split(delimiter);
              int columnIndex = cellDataFeatures.getTableView().getColumns().indexOf(cellDataFeatures.getTableColumn());
              if (columnIndex >= cells.length) {
                  return new SimpleStringProperty("");
              } else {
                  return new SimpleStringProperty(cells[columnIndex]);
              }
          });

          this.setItems(FXCollections.observableArrayList(lines));
          // Remove header row, as it will be added to the data at this point
          // this only works if we're sure that our CSV file has a header,
          // otherwise, we're just deleting data at this point.
          this.getItems().remove(0);
        }
      
      csvscored = new VBox(15);
      csvscored.getChildren().addAll(this);
      csvscored.setAlignment(Pos.CENTER);
      csvscored.setSpacing(15);
      csvscored.setPadding(new Insets(10, 10, 10, 10));
      csvscene = new Scene (csvscored, 800, 600);
      age9.setScene(csvscene);
      age9.setTitle("Colección Game High Scores!");
      
    }
}
