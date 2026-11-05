class thisdemo1{
    thisdemo1(thisdemo5 ob1){
        System.out.println("I am in this constructor.");
    }
}
class thisdemo5{
    void m2(){
        thisdemo1 t = new thisdemo1(this);
    }
}
class Pro9{
    public static void main(String[] args){
        thisdemo5 ob1 = new thisdemo5();
        ob1.m2();
    }
}
