import java.util.Scanner;
import java.io.*;
import java.lang.* ;

public class Start {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        Student s[] = new Student[20];
        Teacher t[] = new Teacher[20];
        Book b[] = new Book[20];
        Author a[] = new Author [20];
        Publisher p[] = new Publisher [20];

        StudentOperations s1 = new  StudentOperations();
        TeacherOperations t1 = new TeacherOperations();
        BookOperations b1 = new BookOperations();

        FileReadWrite fileObject = new FileReadWrite();

        int numOfStudentsAdded = 0;
        int numOfTeachersAdded = 0;
        int numOfBooksAdded = 0;

        int condition1 = 1;
        while (condition1 != 0){
           System.out.print("1.Student Management\n2.Teacher Management\n3.Book Management\n4.Basic Operations\n5.Exit\n\nChoose an Option: ");
           int choice = input.nextInt();
           System.out.println(" ");

           switch (choice) {
             case 1:
             System.out.print("1.Insert New Students\n2.Search Student\n3.Remove Existing Student\n4.Show All Student\n\nChoose an Option: ");
             int choice2 = input.nextInt();

             switch (choice2){
                case 1:
                System.out.print("How many Student: ");
                int size = input.nextInt();

                try{
                    for (int i=0;i<size;i++){
                        System.out.println(" ");

                        System.out.print("Enter Patron ID: ");
                        int pid = input.nextInt();
                        System.out.print("Enter Student Name: ");
                        String name = input.next();
                        System.out.print("Enter Student Id: ");
                        String sid = input.next();
                        System.out.print("Enter Student Department Name: ");
                        String department = input.next();
                        System.out.print("Enter Student Contact No: ");
                        String contactNo = input.next();
                        System.out.print("Enter Student Email: ");
                        String email = input.next();
                        System.out.print("Enter Student Address: ");
                        String address = input.next();
                        System.out.print("Enter Student Guardian Name: ");
                        String guardianName = input.next();
                        System.out.print("Enter Student Guardian Contact No: ");
                        String guardianContactNo = input.next();
                        System.out.print("Enter Fined Amount: ");
                        double amount = input.nextDouble();

                        s[i] = new Student(pid, sid, name, department, email, contactNo, address, guardianName, guardianContactNo, amount);
                        numOfStudentsAdded++;
                        s1.insertStudent(s);
                        System.out.println(" ");
                        fileObject.createDirectory();
                        fileObject.writeInFile("Patron id: "+pid+"\nStudent Name: "+name+"\nStudent Id: "+sid+"\nStudent Department Name: "+department+"\nStudent Contact No: "+contactNo+"\nStudent Email:"+email+"\nAddress: "+address+"\nGuardian Name: "+guardianName+"\nGuardian Contact No: "+guardianContactNo+"\nFined Amount: "+amount+"\n") ;
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;

                case 2:
                try{
                    System.out.print ("Which Student? : ");
                    int n = input.nextInt();
                    s1.getStudent(n);
                }
                catch(Exception e){
                    System.out.println(e);
                } 
                break;

                case 3:
                System.out.println(" ");
                System.out.print("Enter ID to delete: ");
                int del = input.nextInt();
                s1.removeStudent(del);

                try{
                    for (int i=del;i<numOfStudentsAdded;i++){
                        s[i] = s[i+1];
                    }
                    numOfStudentsAdded--;
                }
                catch (Exception e){
                    System.out.println (e);
                }
                break;

                case 4:
                try{
                    System.out.println ("Total Students: "+numOfStudentsAdded);
                    System.out.println (" ");
                    s1.showAllStudents();
                }
                catch(Exception e){
                    System.out.println (" ");
                }
                break;
                default:
                System.out.println ("Please choose correct option.");
                break;
            }
            break;

            case 2:
            System.out.print("1.Insert New Teachers\n2.Search Teacher\n3.Remove Existing Teacher\n4.Show All Teacher\n\nChoose an Option: ");
            int choice3 = input.nextInt();

            switch (choice3){
                case 1:
                System.out.print("How many Teachers: ");
                int size = input.nextInt();

                try{
                    for (int i=0;i<size;i++){
                        System.out.println(" ");

                        System.out.print("Enter Patron ID: ");
                        int pid = input.nextInt();
                        System.out.print("Enter Teacher Name: ");
                        String name = input.next();
                        System.out.print("Enter Teacher Id: ");
                        String tid = input.next();
                        System.out.print("Enter Teacher Department Name: ");
                        String department = input.next();
                        System.out.print("Enter Teacher Contact No: ");
                        String contactNo = input.next();
                        System.out.print("Enter Teacher Email: ");
                        String email = input.next();
                        System.out.print("Enter Teacher Address: ");
                        String address = input.next();
                        System.out.print("Enter Fined Amount: ");
                        double amount = input.nextDouble();

                        t[i] = new Teacher(pid, tid, name, department, email, contactNo, address, amount);
                        numOfTeachersAdded++;
                        t1.insertTeacher(t);
                        System.out.println(" ");
                        fileObject.createDirectory();
                        fileObject.writeInFile("Patron id: "+pid+"\nTeacher Name: "+name+"\nTeacher Id: "+tid+"\nTeacher Department Name: "+department+"\nTeacher Contact No: "+contactNo+"\nTeacher Email:"+email+"\nAddress: "+address+"\nFined Amount: "+amount+"\n") ;
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;

                case 2:
                try{
                    System.out.print ("Which Teacher? : ");
                    int n = input.nextInt();
                    t1.getTeacher(n);
                }
                catch(Exception e){
                    System.out.println (e);
                }

                break;

                case 3:
                System.out.println(" ");
                System.out.print("Enter ID to delete: ");
                int del = input.nextInt();
                t1.removeTeacher(del);

                try{
                    for (int i=del;i<numOfTeachersAdded;i++){
                        t[i] = t[i+1];
                    }
                    numOfTeachersAdded--;
                }
                catch (Exception e){
                    System.out.println (e);
                }
                break;

                case 4:
                try{
                    System.out.println ("Total Teachers: "+numOfTeachersAdded);
                    System.out.println (" ");
                    t1.showAllTeachers();
                }
                catch(Exception e){
                    System.out.println (" ");
                }
                break;
                default:
                System.out.println ("Please choose correct option.");
                break;
            }
            break;

            case 3:
            System.out.print("1.Insert New Books\n2.Search Book\n3.Remove Existing Book\n4.Show All Books\n\nChoose an Option: ");
            int choice4 = input.nextInt();

            switch (choice4){
                case 1:
                System.out.print("How many Books: ");
                int size = input.nextInt();

                try{
                    for (int i=0;i<size;i++){
                        System.out.println(" ");

                        System.out.print("Enter Book ID: ");
                        int bid = input.nextInt();
                        System.out.print("Enter Title: ");
                        String title = input.next();
                        System.out.print("Enter Subtitle: ");
                        String subtitle = input.next();
                        System.out.print("Enter Author Name: ");
                        String aname = input.next();
                        System.out.print("Enter Author ID: ");
                        int aid = input.nextInt();
                        System.out.print("Enter Author Email: ");
                        String email = input.next();
                        System.out.print("Enter Publisher Name: ");
                        String pname = input.next();
                        System.out.print("Enter Publisher ID: ");
                        int pid = input.nextInt();
                        System.out.print("Enter Publisher Contact No: ");
                        String contactNo = input.next();
                        System.out.print("Enter Number of Copies: ");
                        int noOfCopy = input.nextInt();
                        System.out.print("Enter Price: ");
                        double price = input.nextDouble();

                        a[i] = new Author (aid,aname,email);
                        p[i] = new Publisher (pid,pname,contactNo);


                        b[i] = new Book(bid, title, subtitle, a[i], p[i], noOfCopy, price);
                        numOfBooksAdded++;
                        b1.insertBook(b);
                        System.out.println(" ");
                        fileObject.createDirectory();
                        fileObject.writeInFile("Book id: "+bid+"\nBook Title: "+title+"\nBook Subtitle: "+subtitle+"\nBook Author: "+aname+"\nAuthor ID: "+aid+"\nAuthor Email:"+email+"\nPublisher Name: "+pname+"\nPublisher ID: "+pid+"Publisher Contact: "+contactNo+"\nBook Copies: "+noOfCopy+"\nPrice: "+price+"\n") ;
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
                break;

                case 2:
                try{
                    System.out.print ("Which Book? : ");
                    int n = input.nextInt();
                    b1.getBook(n);
                }
                catch (Exception e){
                    System.out.println(e);
                }   
                break;

                case 3:
                System.out.println(" ");
                System.out.print("Enter ID to delete: ");
                int del = input.nextInt();
                b1.removeBook(del);

                try{
                    for (int i=del;i<numOfBooksAdded;i++){
                        b[i] = b[i+1];
                    }
                    numOfBooksAdded--;
                }
                catch (Exception e){
                    System.out.println (e);
                }
                break;

                case 4:
                try{
                    System.out.println ("Total Books: "+numOfBooksAdded);
                    System.out.println (" ");
                    b1.showAllBooks();
                }
                catch(Exception e){
                    System.out.println (" ");
                }
                break;
                default:
                System.out.println ("Please choose correct option.");
                break;
            }
            break;

            case 4:
            System.out.print("1.Borrow Books\n2.Return Books\n3.Add Fine\n\nChoose an Option: ");
            int choice5 = input.nextInt();
            switch (choice5){
                case 1:
                System.out.print ("\nWho are you?\n\n1.Student\n2.Teacher\n\nChoose an Option: ");
                int x = input.nextInt();
                try{
                    if (x==1){
                        System.out.print ("Enter Student Number: ");
                        int x1 = input.nextInt();
                        System.out.println (" ");
                        System.out.println ("Available Books in Libray: ");
                        System.out.println (" ");
                        for (int i=0;i<numOfBooksAdded;i++){
                            b[i].showInfo();
                        }
                        System.out.println (" ");
                        System.out.print("Which Book you want to Borrow, put the number: ");
                        int x2 = input.nextInt();
                        System.out.print("How many Copies?(***NOT MORE THAN 2***)");
                        int x3 = input.nextInt();

                        if (x3>2){
                            System.out.print("YOU CAN NOT ISSUE MORE THAN 2 BOOKS");
                        }
                        else{
                            b[x2 - 1].setNoOfCopy(b[x2 - 1].getNoOfCopy() - x3);
                            s[x1-1].borrow(s[x1-1],b[x2-1]);
                        }

                    }
                    else{
                        System.out.print ("Enter Teacher Number: ");
                        int x1 = input.nextInt();
                        System.out.println (" ");
                        System.out.println ("Available Books in Libray: ");
                        for (int i=0;i<numOfBooksAdded;i++){
                            b[i].showInfo();
                        }
                        System.out.print("Which Book you want to Borrow, put the number: ");
                        int x2 = input.nextInt();
                        System.out.print("How many Copies?(***NOT MORE THAN 2***)");
                        int x3 = input.nextInt();

                        if (x3>2){
                            System.out.print("YOU CAN NOT ISSUE MORE THAN 2 BOOKS");
                        }
                        else{
                            b[x2 - 1].setNoOfCopy(b[x2 - 1].getNoOfCopy() - x3);
                            s[x1-1].borrow(s[x1-1],b[x2-1]);
                        }

                    }
                }
                catch(Exception e){
                    System.out.println (e);
                }
                break;

                case 2:
                System.out.print ("\nWho are you?\n\n1.Student\n2.Teacher\n\nChoose an Option: ");
                int in = input.nextInt();
                try{
                    if (in==1){
                        System.out.print ("Enter Student Number: ");
                        int x1 = input.nextInt();
                        System.out.print("Which Book you want to Return, put the number: ");
                        int x2 = input.nextInt();
                        System.out.print("How many Copies?");
                        int x3 = input.nextInt();
                        b[x2 - 1].setNoOfCopy(b[x2 - 1].getNoOfCopy() + x3);
                        s[x1-1].ret(s[x1-1],b[x2-1]);
                    }
                    else
                    {
                        System.out.println("Teacher No :");
                        int x1 = input.nextInt();
                        System.out.print("Which Book you want to Return, put the number: ");
                        int x2 = input.nextInt();
                        System.out.print("How many Copies?");
                        int x3 = input.nextInt();
                        b[x2 - 1].setNoOfCopy(b[x2 - 1].getNoOfCopy() + x3);
                        s[x1-1].ret(s[x1-1],b[x2-1]);
                    }
                }   
                catch (Exception e) {
                    System.out.println(e);
                }
                break;

                case 3:
                System.out.print ("\nWhom do you want to Fine?\n\n1.Student\n2.Teacher\n\nChoose an Option: ");
                int me = input.nextInt();
                try{
                    if (me==1){
                        System.out.print ("Enter Student Number: ");
                        int x1 = input.nextInt();
                        System.out.print("Amount:  ");
                        double x2 = input.nextDouble();
                        s[x1-1].fine(s[x1-1],x2);
                    }
                    else
                    {   
                        System.out.print ("Enter Teacher Number: ");
                        int x1 = input.nextInt();
                        System.out.print("Amount:  ");
                        double x2 = input.nextDouble();
                        t[x1-1].setAmount(x2);
                        t[x1-1].fine(t[x1-1],x2);
                    }
                }
                catch (Exception e) {
                    System.out.println("***NO STUDENTS OR TEACHERS AVAILABLE RIGHT NOW***");
                    System.out.println (" ");
                }
                break;   
            }

            case 5:
            System.out.println("SUCCESSFULLY EXITED FROM SYSTEM");
            condition1 = 0;
            break;
        }

    }
  }
}