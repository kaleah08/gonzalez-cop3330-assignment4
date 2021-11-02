package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //get user input
        //create if statements for each specified user input
        //call all functions
        //close if statement
        launch();
    }
}
/* public static list addList(list){
      Initialize new List
      return new list
}
 */


/*public static list addItem(list){
   initialize a list of item in to do list
   add user input items
   return new list
}
 */

/*public static list removeItem(list){
    loop through items
    search for item
    delete item
    return new list
}
 */


/*public static void removeList(list){
    find list
    delete list
}
 */

/*public static editList(list){
    find list
    find description
    edit description

    find due date
    edit due date

    find title
    edit title

    return new list
}
 */


/*public static void displayItems(list){
    find list
    return items from list
}
 */

/* public static list displayList(list){
    find list
    return list
}
 */

/*public static list markItem(list){
    find list
    find item
    mark item as true
    return new list
}
 */

/*public static void load(list){
    use files.walk to open files


}
 */

/*public static saveToFile(list, file name){
    create new file with user input
    write to file
    return file
}
 */



