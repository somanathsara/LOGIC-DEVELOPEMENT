class Animal {
    void m1() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void m2() {
        System.out.println("Barking...");
    }
}

class Cat extends Dog {
    void m3() {
        System.out.println("Meow...");
    }
}

class Multi_level {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        c1.m1();
        d1.m1();
    }
}