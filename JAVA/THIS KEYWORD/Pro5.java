//With the help  of this keyword.
//this can be passed as an argument in Constructor call.
class Test{
    Test(){
        System.out.println("I am from a Constructor.");
        this(10);       
    }
    Test(int x){
        System.out.println(x);
    }
}
class Pro5{
    public static void main(String[] args){
        Test t1 = new Test();
    }
}