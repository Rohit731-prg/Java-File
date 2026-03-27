class Person {
    String name;
    int age;

    void getData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("\nName : " + name);
        System.out.println("\nAge : " + age);
    }
}

public class File1 {
    public static void main(String[] arg) {
        String name;
        int age;

        Person p = new Person();
        name = "Rohit Singha";
        age = 24;

        p.getData(name, age);
        p.display();
        
        name = "Souvik Karmokar";
        age = 58;
        
        p.getData(name, age);
        p.display();
    }    
}
