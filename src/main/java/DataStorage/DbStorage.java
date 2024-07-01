/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStorage;

/**
 *
 * @author A-3
 */
public interface DbStorage {
    void writeData(String data);
String readData();
}
