import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListingFilesSimple {
  public static void main(String[] args) throws FileNotFoundException {
    if (args.length != 2) {
      System.out.println("Usage: ListingFiles <Directory_To_List_Files> <Word_To_Search>");
       // only do this, when you are certain that resources are closed
      System.exit(1);
    }

    File file = new File(args[0]);
    if (!file.isDirectory()) {
      System.out.println("It is expected that " + args[0] + " should be a directory.");
       // only do this, when you are certain that resources are closed
      System.exit(2);
    } else if (!file.exists()) {
      System.out.println("The directory " + args[0] + " does not exists.");
      System.exit(3);
    } else if (!file.canRead()) {
      System.out.println("The directory " + args[0] + " isn't readable.");
      System.exit(4);
    }

    if (args[1].length() == 0) {
      System.out.println("The word to search cannot be of length 0.");
      System.exit(4);
    }

    listFiles(file, args[1]);
  }

  public static void listFiles(File dir, String target) throws FileNotFoundException {
    File[] fileArray = dir.listFiles();
    for (File f: fileArray) {
      if (f.isDirectory()) {
        // do nothing
      } else {
        if (containWord(f, target)) {
          System.out.println(f.toString());
        }
      }
    }
  }

  public static boolean containWord(File f, String target) throws FileNotFoundException {
    try (Scanner sc = new Scanner(f)) {
      while (sc.hasNext()) {
        String word = sc.next();
        if (word.equals(target)) {
          return true;
        }
      }
      return false;
    }
  }
}
