/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerPackage;
import databaseConnectionPackage.*;

/**
 *
 * @author Abdelhalim
 */
public class Controller {
    
    DBCommands dbCommands;
    
    public Controller(){
        dbCommands = new DBCommands();
    }
    
    public void insertUser(String username, String age){
        dbCommands.insertUserCommand(username, age);
    }
}
