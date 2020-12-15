// import java.util.ArrayList;

public class AnimalsApp
{
    // TODO 1: Implementing interfaces
    public static void main( String[] args )
    {
        Animal ginger = new Cat("Ginger");
        ginger.makeNoise();

        System.out.println("My name is " + ginger.getName());
        ((Cat)ginger).walk(new Direction(36., 0.), 2., 10.);

        Animal feather = new Dove("Feather");
        feather.makeNoise();
        System.out.println("My name is " + feather.getName());
        ((Dove)feather).fly(new Direction(36., 0.), 2., 10.);
    }


    // TODO 2: Aggregating behaviors by implementing various interfaces
    // public static void main(String[] args) {
    //     FlyingCat tuxedo = new FlyingCat("Tuxedo");
    //     tuxedo.walk(new Direction(36., 0), 2., 10.);
    //     tuxedo.fly(new Direction(36., 36.), 2., 10.);
    // }

    // TODO 3a: Use interface to write generic method
    // public static void main(String[] args) {
    //     ArrayList<FlyMotion> flyingAnimals = new ArrayList<FlyMotion>();
    //
    //     flyingAnimals.add(new Dove("Feather"));
    //     flyingAnimals.add(new Owl("Awe"));
    //     flyAll(flyingAnimals);
    // }
    //
    //  public static void flyAll(ArrayList<FlyMotion> flyingAnimals) {
    //      for(FlyMotion bird: flyingAnimals) {
    //          bird.fly(new Direction(36., 36.), 2., 10.);
    //      }
    //  }

    // TODO 3b: Use interface to write generic method
    // public static void main(String[] args) {
    //     Animal ginger = new Cat("Ginger");
    //     Animal feather = new Dove("Feather");
    //
    //     move(ginger);
    //     move(feather);
    // }
    //
    // public static void move(Animal animal) {
    //     if (animal instanceof FlyMotion) {
    //         ((FlyMotion) animal).fly(new Direction(36., 36.), 3., 8.);
    //     } else if (animal instanceof FelineMotion) {
    //         ((FelineMotion) animal).walk(new Direction(36., 36.), 3., 8.);
    //     }
    //
    //     if (animal instanceof Cat) {
    //         ((Cat)animal).tap(new Dove("feather"));
    //     }
    // }
}
