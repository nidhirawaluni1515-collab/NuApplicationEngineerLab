package edu.nue.mgen;

import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {
        

// Lab 1
// Programming Assignment
// Lab 1 part 1 - Array
// Initiate two integer arrays, x, and y, each containing 5 numbers.
// Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
// Organize a nice-looking output to the terminal that looks like the following:
// Array x = { array x values here separated by coma }

// Array y = { array y values here separated by coma }

// Array z = x + y = { array z values here separated by coma }
        // ===== PART 1: Array =====        
        // Two arrays with 5 numbers
        int[] x = {3, 7, 2, 9, 5};
        int[] y = {5, 4, 8, 1, 6};
        
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            if (x[i] > y[i]) {
                z[i] = x[i];
            } else {
                z[i] = y[i];
            }
        }
        
        String xStr = "";
        for (int i = 0; i < 5; i++) {
            xStr += x[i];
            if (i < 4) xStr += ", ";
        }
        System.out.println("Array x = { " + xStr + " }");
        
        String yStr = "";
        for (int i = 0; i < 5; i++) {
            yStr += y[i];
            if (i < 4) yStr += ", ";
        }
        System.out.println("Array y = { " + yStr + " }");
        
        String zStr = "";
        for (int i = 0; i < 5; i++) {
            zStr += z[i];
            if (i < 4) zStr += ", ";
        }
        System.out.println( "Array z = max(x, y) = { " + zStr +" }");
//         Lab 1 part 2 - ArrayList
// Initiate an ArrayList that contain 5 names
// Switch the first and last letters in each name in the ArrayList. Do not forget that each name begins with a capital letter, but the other letters are lowercase. The names with switched letters should follow the same rule as there are new names.
// Organize a nice-looking output to the terminal that looks like the following:
// Names = { list of names here separated by coma }

// Names (switched) = { list of names with switched first and last letters here separated by coma }
        
        // PART 2: ArrayList =====
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Robert");
        names.add("Emma");
        names.add("Daniel");
        names.add("Sophia");
        
        // Switch first and last letters
        ArrayList<String> switched = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String newName = switchLetters(name);
            switched.add(newName);
        }
        
        // Print names
        String namesStr = "";
        for (int i = 0; i < names.size(); i++) {
            namesStr += names.get(i);
            if (i < names.size() - 1) namesStr += ", ";
        }
        System.out.println("Names = { " + namesStr + " }");
        
        String switchedStr = "";
        for (int i = 0; i < switched.size(); i++) {
            switchedStr += switched.get(i);
            if (i < switched.size() - 1) switchedStr += ", ";
        }
        System.out.println("Names (switched) = { " + switchedStr + " }");
    }
    
    public static String switchLetters(String name) {
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        
        String middle = "";
        if (name.length() > 2) {
            middle = name.substring(1, name.length() - 1);
        }
        
        char newFirst = Character.toUpperCase(last);
        char newLast = Character.toLowerCase(first);
        
        return newFirst + middle + newLast;
    }
}
