package matrix;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Main {

  public static void main(final String[] args) throws InterruptedException, IOException {
    
    List<Car> cars = new ArrayList<>();
    
    cars.add(new Car(1, "a")); 
    cars.add(new Car(4, "b"));
    cars.add(new Car(8, "c"));
    cars.add(new Car(10, "d"));
    cars.add(new Car(5, "e"));
    Race race = new Race(cars, 100);

    race.start();
  }  

}