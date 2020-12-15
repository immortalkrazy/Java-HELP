public class TowerOfHanoi {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: TowerOfHanoi <the number of disks>");
      System.exit(1);
    }

    solveTowerOfHanoi(Integer.valueOf(args[0]));
  }

  public static void solveTowerOfHanoi(int n) {
    moveDisks(n, 'A', 'B', 'C');
  }

  // helper method
  private static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
    if (n == 1) { // base case
      System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
    } else {
      // move n-1 disks to the aux. tower
      moveDisks(n-1, fromTower, auxTower, toTower);
      // move n-th disk (largest) to toTower
      System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
      // move n-1 disks from the aux. tower to the to-tower
      moveDisks(n-1, auxTower, toTower, fromTower);
    }
  }
}
