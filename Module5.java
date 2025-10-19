import java.util.Scanner;
class Student{
    int id;
    String name;
    int age;
    float gpa;
    void add(int id,String name,int age,float gpa){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        System.out.println("student added successfully");
    }
    void view(){
        if (name==null){
            System.out.println("no student found");
            return;
        }
        System.out.println("\n...STUDENT MANAGEMNET SYSTEM...");
        System.out.println("ID" +id);
        System.out.println("name:" +name);
        System.out.println("age:" +age);
        System.out.println("gpa:" +gpa);

       }
       void remove(){
        if(name == null){
            System.out.println("no student to remove.");
            return;

        }
        id = 0;name = null;age=0;gpa=0;
        System.out.println("student removed successfuly.");
    }
    void searchByName(String q){
        if(name == null){
            System.out.println("no student available to search.");
            return;
        }if (name.equalsIgnoreCase(q)){
            System.out.println("student found");
            view();
        }else{
            System.out.println("student not found:" +q);
        }

    }
}
public class Module5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student st= new Student();
        int choice;
        do{
            System.out.println("\n ...STUDENT MANAGEMNT SYSTEM...");
            System.out.println("1.add student");
            System.out.println("2.view student");
            System.out.println("3.remove student");
            System.out.println("4.search student.");
            System.out.println("5.exit");
            System.out.println("enter your choice.");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("enter id:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("enter name:");
                String name=sc.nextLine();
                System.out.println("enter age:");
                int age = sc.nextInt();
                System.out.println("enter gpa:");
                float gpa = sc.nextFloat();
                sc.nextLine();
                st.add(id,name,age,gpa);
                break;
                case 2:
                st.view();
                break;
                case 3:
                st.remove();
                break;
                case 4:
                System.out.println("enter name to search:");
                String q=sc.nextLine();
                st.searchByName(q);
                break;
                case 5:
                System.out.println("exiting..");
                break;
                default:
                System.out.println("invalid choice.");
            }
        } while(choice!=5);
        sc.close();
    }
}