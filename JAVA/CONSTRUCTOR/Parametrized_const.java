class Student {
    String name;
    int roll;
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        // System.out.println("Name: " + this.name);
        // System.out.println("Age: " + this.roll);
    }
}

class Parametrized_const {
    public static void main(String[] args) {
        Student s1 = new Student("Shyam", 67);
        System.out.println("Name: "+s1.name);
        System.out.println("Name: "+s1.roll);

    }
}