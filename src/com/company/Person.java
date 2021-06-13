package com.company;

public class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person (String name,String position,String email,String phone,int salary,int age){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Info(){
            System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }
}
