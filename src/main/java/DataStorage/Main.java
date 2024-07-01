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
public class Main {
    public static void main(String[] args) {
// Contoh penggunaan MemoryStorage
// Contoh penggunaan FileStorage
FileStorage fileStorage = new FileStorage("data.txt");
fileStorage.writeData("Data stored in file");
System.out.println("File storage: " + fileStorage.readData());
}

    private static class DataStorage {

        public DataStorage() {
            MemoryStorage memoryStorage = new MemoryStorage();
memoryStorage.writeData("Data stored in memory");
System.out.println("Memory storage: " + memoryStorage.readData());
        }
    }
}