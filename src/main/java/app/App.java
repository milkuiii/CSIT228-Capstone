package app;

import data.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player p = loadData();
        Game ssGame = new Game(p);

        // include the logic for the start game (like buttons n shi)
    }

    public void startGame(){

    }

    public static Player loadData(){
        Player p = new Player();

        // checking if an existing file exists
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("player.ser"))){
            p = (Player) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // writing to file if none exists at the moment
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("player.ser"))){
            out.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return p;
    }
}