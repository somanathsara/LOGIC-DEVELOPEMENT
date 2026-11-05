//this can be passed as an argument in method call.
class thisdemo{
    void m1(thisdemo ob1){
        System.out.println("I am from this method.");
    }
    void m2(){
        m1(this);
    }
}
class Pro8{
    public static void main(String[] args){
        thisdemo ob1 = new thisdemo();
        ob1.m2();
    }
}