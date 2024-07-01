/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author A-3
 */
public class DatabaseStorage implements DbStorage {
    private Connection connection;
public DatabaseStorage(String databasePath) throws SQLException {
try {
Class.forName("org.sqlite.JDBC");
connection = DriverManager.getConnection("jdbc:sqlite:" +

databasePath);
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}
@Override
public void writeData(String data) {
try (PreparedStatement statement = connection.prepareStatement("INSERTINTO data (value) VALUES (?)")) {
statement.setString(1, data);
statement.executeUpdate();
} catch (SQLException e) {
e.printStackTrace();
}
}
@Override
public String readData() {
StringBuilder sb = new StringBuilder();
try (Statement statement = connection.createStatement();ResultSet resultSet = statement.executeQuery("SELECT value FROM data")) {

while (resultSet.next()) {
sb.append(resultSet.getString("value"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return sb.toString();
}
}
