//Without use of this keyword.
class Test {
    int roll = 0;
    String name;
    String course ;
    static String College = "NIT";

    void data(int roll, String name, String course) {
        System.out.println("Student Roll No:" + roll + "\n" + "Student Name:" + name + "\nCollege name:" + College);
    }

    void info() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(course);
        System.out.println(College);
    }
}

class Pro2 {
    public static void main(String[] args) {
        Test ob1 = new Test();
        ob1.data(14, "Ram", "B.tech");
        ob1.info();
    }
}