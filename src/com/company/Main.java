package com.company;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Lead Engineer", "ppetrov@mailbox.com", "89261112233", 80000, 41);
        persArray[2] = new Person("Fedorov Fedor", "Director", "ffedorov@mailbox.com", "89252221133", 130000, 50);
        persArray[3] = new Person("Kiselev Kisel", "Manager", "kkiselev@mailbox.com", "89033332211", 90000, 28);
        persArray[4] = new Person("Dmitriev Dmitriy", "System Engineer", "ddmitriev@mailbox.com", "89152223311", 50000, 35);

        for(int i = 0; i < 4; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].Info();
            }
        }
    }
}
