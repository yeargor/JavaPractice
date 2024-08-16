public class Main {

    public static void main(String[] args)
    {

        Employee emp = new Employee("John", 23, Gender.MALE, 0, 2300);
        System.out.println(emp.toString());
        emp.sing();
        emp.play();

        Employee mgr = new Manager("Desmond", 19, Gender.values()[0], 1, 2600, "Tesla Model S");
        System.out.println(mgr.toString());
        mgr.sing();
        mgr.play();

    }

    public static class Manager extends Employee {

        private String vehicle;

        public Manager(String name, int age, Gender gender, int ID, int salary, String vehicle) {
            super(name, age, gender, ID, salary);
            this.vehicle = vehicle;
        }

        public String getVehicle() {
            return vehicle;
        }

        @Override
        public void play() {
            System.out.println("playing");
        }

        @Override
        public String toString() {
            return "Manager{" +
                    "vehicle='" + vehicle + '\'' +
                    ", ID=" + getID() +
                    ", salary=" + getSalary() +
                    ", name='" + getName() + '\'' +
                    ", age=" + getAge() +
                    ", gender='" + getGender() + '\'' +
                    '}';
        }

    }

    public static class Employee extends Role
    {

        public int getSalary() {
            return salary;
        }

        public int getID() {
            return ID;
        }

        private int ID;
        private int salary;


        public Employee(String name, int age, Gender gender, int ID, int salary) {

            super(name , age, gender);
            this.ID = ID;
            this.salary = salary;
        }

        public void play() {
            System.out.println("playing");
        }

        public String toString() {
            return "Employee{" +
                    "ID=" + ID +
                    ", salary=" + salary +
                    ", name='" + getName() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    ", age=" + getAge() +
                    '}';
        }

    }

    public static abstract class Role
    {

        private String name;
        private int age;
        private Gender gender;

        public Role(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public abstract void play();

        public void sing()
        {
            System.out.println("singing");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

    }

    public enum Gender
    {
        MALE,
        FEMALE
    }

}