//With use of this keyword.
//This can be used to refer currrent class instance variable.
class Test{
    int roll = 0;
    String name = "";
    String course = "";
    static String College = "NIT";
    void data(int roll, String name,String course){
        this.roll = roll;
        this.name = name;
        this.course = course;
        System.out.println("Student Roll No:"+this.roll+"\n"+"Student Name:"+this.name+"\nCollege name:"+College);
    }
    void info(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(course);
        System.out.println(College);
    }
}
class Pro1{
    public static void main(String[] args){
        Test ob1 = new Test();
        ob1.data(14,"Ram","B.tech");
        ob1.info();
    }
}