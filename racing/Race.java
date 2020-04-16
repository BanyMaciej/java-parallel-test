package matrix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Race {
  int length; // in metres
  List<Car> cars = new ArrayList<>();

  public boolean finished = false;

  public Race(List<Car> cars, int length) {
    this.length = length;
    this.cars = cars;
  }

  void start() {
    this.cars.forEach(c -> {
      c.setRace(this);
      new Thread(c).start();
    });
  }

  synchronized void printResults() {
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (InterruptedException | IOException e) {
      // e.printStackTrace();
      
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
    cars.forEach(c -> {
      System.out.print(c.name + "\t");
      for(int i = 0; i < c.distance; i++) {
        System.out.print(" ");
      }
      System.out.print("O");
      System.out.println();
    });
  }
}