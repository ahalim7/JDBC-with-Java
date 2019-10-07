/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectionPackage;

/**
 *
 * @author Abdelhalim
 */
public class DBCommands {

    public DBCommands() {
    }

    public void insertUserCommand(String username, String age) {

        String inserQuery = "insert Into users (username,age) values ('" + username + "','" + age + "')";
        try {
            DBConnection.openConnection();
            DBConnection.connection.createStatement().executeUpdate(inserQuery);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        DBConnection.closeConnection();
    }
}
