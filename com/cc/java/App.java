package com.cc.java;

import java.util.ArrayList;
import java.util.Collections;


public class App {
    
    public static void main(String[] args) {

        // Arraylist (AL) anlegen ...
        ArrayList<String> carMakers = new ArrayList<>();
     
        output("AL: " + carMakers);
        output("Elementenanzahl: " + carMakers.size());

        // AL dynamisch füllen (JS --> push() / J --> add())
        carMakers.add("Volvo");
        carMakers.add("BMW");
        carMakers.add("Ford");
        carMakers.add("Honda");
        carMakers.add("Tesla");

        output("AL: " + carMakers);
        output("Elementenanzahl: " + carMakers.size());

        //Daten aus Al lesen
        output("1. Element: " + carMakers.get(0));
        output("Letztes Element: " + carMakers.get(carMakers.size()  - 1));

        output(" ");
        output("-------- Iteration ----------");

        for (int i = 0; i < carMakers.size(); i++){
            System.out.print(carMakers.get(i) + " ");
        }
        output(" ");
        output("-------- Iteration 2 ----------");

        for (String element : carMakers){
            System.out.print(element + " "); 
        }

        //Daten in Al ersetzen / Überschreiben

        output(" ");
        carMakers.set(1,"MB");
        output("AL: " + carMakers);

        output(" ");
        output("-------- Sortierung ----------");

        Collections.sort(carMakers);
        output("Al: " + carMakers);
        output("1. Element: " + carMakers.get(0));

        //Daten entfernen (JS --> pop(); J --> remove )
        carMakers.remove(0);
        output("AL: " + carMakers);
        carMakers.remove(carMakers.size() -1);
        output("AL: " + carMakers);

        //AL leeren ...
        carMakers.clear();
        output("AL: " + carMakers);



    }

    public static void output(String outputStr) {
        System.out.print(outputStr);
        }



}

