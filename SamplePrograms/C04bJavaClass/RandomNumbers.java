import java.util.Random;

class RandomNumbers {
  public static void main(String[] args) {
    Random random1 = new Random(3);
    System.out.print("From random1: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random1.nextInt(1000) + " ");
    }

    Random random2 = new Random(3);
    System.out.print("\nFrom random2: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random2.nextInt(1000) + " ");
    }

    Random random3 = new Random(4);
    System.out.print("\nFrom random3: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random3.nextInt(1000) + " ");
    }

    Random random4 = new Random();
    System.out.print("\nFrom random4: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random4.nextInt(1000) + " ");
    }

    Random random5 = new Random();
    System.out.print("\nFrom random5: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(random5.nextInt(1000) + " ");
    }
  }
}
