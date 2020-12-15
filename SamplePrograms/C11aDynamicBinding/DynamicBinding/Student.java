public class Student extends Person {
	private String[] classesTaken;	// where should  my grade hold, how about credit hours?
  private int vacant;

  public Student(String name, String id, String address) {
    this(name, id, address, 10);
  }

	public Student(String name, String id, String address, int capacity) {
		super(name, id, address);

		classesTaken = new String[capacity];
    vacant = 0;
	}

	public boolean addClassTaken(String className) {
    if (vacant < classesTaken.length) {
      classesTaken[vacant] = className;
      vacant ++;
      return true;
    } else {
      return false;
    }
	}

	public void showClassesTaken() {
		System.out.println(name + " has taken " + vacant + " classes.");
		for (int i=0; i<vacant; i++) {
			System.out.println("\t\t" + classesTaken[i]);
		}
	}

	public String toString() {
		return "Student (name=" + name + ", id=" + id + ", address=" + address
				+ ", coursesTaken=[" + String.join(", ", classesTaken) + "])";
	}
}
