/* You will be given a partially completed code in the editor where the main method takes the name of a state (i.e., WestBengal, or 
 * AndhraPradesh) and prints the national flower of that state using the classes and methods written by you.
 *
 * For more detail see: https://www.hackerrank.com/challenges/java-covariance/problem
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
    public String whatsYourName() {
        return "Could be anything!";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}

