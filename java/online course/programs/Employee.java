class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        setName(name);
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class PlacementOfficer extends Employee {
    private int experienceYears;

    public PlacementOfficer(String name, String department, int experienceYears) {
        super(name, department);
        setExperienceYears(experienceYears);
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Nikhil Badoni", "Data Analyst");
        PlacementOfficer placementOfficer = new PlacementOfficer("Priya Tyagi", "Placement", 5);

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());

        System.out.println();

        System.out.println("Placement Officer Details:");
        System.out.println("Name: " + placementOfficer.getName());
        System.out.println("Department: " + placementOfficer.getDepartment());
        System.out.println("Experience Years: " + placementOfficer.getExperienceYears());
    }
}