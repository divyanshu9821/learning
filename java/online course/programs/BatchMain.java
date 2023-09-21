import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

// student object class
class Java {

	private int id;
	private String name;
	private String email;

	// setter and getter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Java() {
		super();

	}

	public Java(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {

		return id + "\t\t\t" + name + "\t\t\t" + email;
	}

}

// main business logics will be kept here
class BookService {

	Scanner sc = new Scanner(System.in);
	ArrayList<Java> alist = new ArrayList<>();

	// method to save/create new java student details
	public void saveJavaStudentDetails() {
		System.out.print("\nEnter student id: ");
		int id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter student name: ");
		String name = sc.nextLine();

		System.out.print("Enter student email: ");
		String email = sc.nextLine();

		alist.add(new Java(id, name, email));
		System.out.println("Record Created");
	}

	// method to print all the student details enrolled for java
	public void getAllJavaStudentDetails() {
		System.out.println("\n   ID\t\t\t   Name\t\t\t   Email");
		Iterator<Java> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// method to fetch a student details using the id
	public void getJavaStudentDetailById() {
		System.out.println("\nEnter the id to search:");
		int id = sc.nextInt();
		boolean flag = false;

		for (Java j : alist) {
			if (j.getId() == id) {
				System.out.println(j);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Student details not found. Please check the id again.");
		}

	}

	// method to update a Java student details using the id
	public void updateJavaStudentDetails() {
		System.out.println("\nEnter the id to search:");
		int id = sc.nextInt();
		boolean flag = false;

		for (Java j : alist) {
			if (j.getId() == id) {
				sc.nextLine();
				System.out.println("\nEnter new student name:");
				String name = sc.nextLine();

				System.out.println("Enter new student email:");
				String email = sc.nextLine();

				j.setName(name);
				j.setEmail(email);

				System.out.println("Student details have been updated successfully.");
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Student details not found. Please check the id again.");
		}
	}

	// method to delete a java student using id
	public void deleteJavaStudentDetails() {
		System.out.println("\nEnter the id to search:");
		int id = sc.nextInt();
		boolean flag = false;
		ArrayList<Java> newList = new ArrayList<>();
		for (Java j : alist) {
			if (j.getId() != id) {
				newList.add(j);
				flag = true;
			}
		}
		alist = newList;
		if (flag == false) {
			System.out.println("Student details not found. Please check the id again.");
		} else {
			System.out.println("Student Record is deleted");
		}
	}

}

// driver class
class BatchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, ch;
		BookService bService = new BookService();

		System.out.println("\nWelcome to Anudip");
		do {
			System.out.println("\n1) JAVA  2) Others 3) Exit");
			System.out.print("choice?[1/2/3] ");
			choice = sc.nextInt();

			switch (choice) {

				case 1:
					do {
						System.out.println("\n---JAVA---");
						System.out.println("1) Save new student details\n"
								+ "2) Get All Student Details\n"
								+ "3) Get Student Details Using Id\n"
								+ "4) Update Student Details Using Id\n"
								+ "5) Delete Student Details Using Id\n"
								+ "6) Go back to Main Menu");
						System.out.print("choice?[1/2/3/4/5/6] ");
						ch = sc.nextInt();
						switch (ch) {
							case 1:
								bService.saveJavaStudentDetails();
								break;

							case 2:
								bService.getAllJavaStudentDetails();
								break;

							case 3:
								bService.getJavaStudentDetailById();
								break;

							case 4:
								bService.updateJavaStudentDetails();
								break;

							case 5:
								bService.deleteJavaStudentDetails();
								break;
						}
						

					} while (ch != 6);

					break;

				case 2:
					System.out.println("\n----Others----");
					sc.nextLine();
					System.out.println("\nEnter course name");
					String course = sc.nextLine();
					course.toLowerCase();
					try {
						if (course.equals("java")) {
							System.out.println("\nThe course is available with us");
						} else
							throw new Exception(
									"\nThe course you are looking for is not with us. Please check again\u00A0next\u00A0time.");

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println();
					}

					break;

				case 3:
					System.out.println("\nThank you for visiting!");
					System.exit(0);
					break;

			}
		} while (choice != 3);

		sc.close();
	}

}