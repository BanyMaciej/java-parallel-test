package matrix;

import java.lang.Runnable;

public class Car implements Runnable {
  int speed; // in m/s
  String name;
  private Race race;
  int distance = 0;

  public Car(int speed, String name) {
      this.speed = speed;
      this.name = name;
  }

  public void setRace(Race race) {
    this.race = race;
  }

  @Override
  public void run() {
    for (int i = 0; i < this.race.length && !this.race.finished; i++) {
      distance += 1;
      this.race.printResults();
      try {
        Thread.sleep((int) 1000/this.speed);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.race.finished = true;
  }  


}