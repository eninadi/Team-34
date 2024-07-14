task 1. (Girta)
// added to existing code:
  
@GetMapping("/fruits")
public String[] fruits() {
String[] fruitsArray = {"Apple", "Banana", "Cherry", "Date", "Orange"};
return fruitsArray;
// http://localhost:8080/fruits
}

task 2. (Girta)
// added to existing code:
         
@GetMapping("/student")
public Student student(@RequestParam(value = "name", defaultValue = "Mari") String name,
                   @RequestParam(value = "gender", defaultValue = "girl") String gender,
                   @RequestParam(value = "age", defaultValue = "8") int age) {
    return new Student(name, gender, age);
    // http://localhost:8080/student
    // http://localhost:8080/student?name=Jaan&gender=boy&age=10 


Student.java
  
package com.datorium.Datorium.API;

public class Student {
    private String name;
    private String gender;
    private int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // geters, seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




