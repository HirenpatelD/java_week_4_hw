package homework_week_8;

public class Student5 {

    //Java program to overload constructors
        int id;
        String name;
        int age;
        //creating two arg constructor
        Student5(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        Student5(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        public void display(){System.out.println(id+" "+name+" "+age);}
        public static void main(String args[]){
            homework_week_8.Student5 s1 = new homework_week_8.Student5(111,"Karan");
            homework_week_8.Student5 s2 = new homework_week_8.Student5(222,"Aryan",25);
            s1.display();
            s2.display();
        }
    }


