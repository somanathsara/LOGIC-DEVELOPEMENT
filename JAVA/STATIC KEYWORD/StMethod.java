class Method2{
    static void sum(int a, int b){
        System.out.println("The sum of the 2 number is : "+(a+b));
        }
}
class StMethod{
    public static void main(String[] args){
        Method2  m1 = new Method2();
        m1.sum(52,52);
    }
}