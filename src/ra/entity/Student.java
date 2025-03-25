package ra.entity;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private  float score;

 	public Student() {}


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setScore(float score) {
        this.score = score;
    }

    public void  inputData(Scanner scanner){
        scanner.nextLine();
        System.out.println("Enter id: ");
        id = scanner.nextLine();
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        System.out.println("Enter score: ");
        score = scanner.nextFloat();
    }

    public String toString(){
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
