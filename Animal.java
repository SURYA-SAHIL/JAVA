class Animal {
    void sound() {
        System.out.println("ANIMAL SOUND");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
