/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamulithread;

import java.util.Scanner;

/**
 *
 * @author My dom
 */
public class Javamulithread1 {

    /**
     */
    public static class Register implements Runnable{

  
        @Override
        public void run(){
            Scanner x=new Scanner(System.in);
            Scanner fName = new Scanner(System.in);
            Scanner lName = new Scanner(System.in);
            Scanner age= new Scanner(System.in);
            Scanner sex = new Scanner(System.in);
            Scanner dep = new Scanner(System.in);
            Scanner gd = new Scanner(System.in);
            
            //Getting student information from the user        
            System.out.println("Please enter the first name of the student");
                String fName1=fName.nextLine();
            System.out.println("Please enter the last name of the student");
                String lName1=lName.nextLine();
            System.out.println("please enter the age of the student ");
                int age_=age.nextInt();
            System.out.println("pleaase enter 'M' for male and 'F' for female");
                String sex_=sex.nextLine();
            System.out.println("Please enter the department");
                String dep_=dep.nextLine();
            System.out.println("Please enter 12th grade for eligibiity check");
                int gd_=gd.nextInt();
            
                                
            
            System.out.println("The newly register student down below confirm information");
            for(int i=0;i<61;i++){
            System.out.print(".");
            System.out.println("\n Name-"+fName1+""+lName1);
            System.out.println("Age-"+age_);
            System.out.println("Sex-"+sex_);
            System.out.println("Department-"+dep_);
            if(gd_<350){
                    //String sex_=Male;
                    System.out.println("Eligibiity-Accepted");
                }
                else{
                    System.out.println("Eligibiity-Sorry not accepted");
                }
            
            
            for(int a=0;a<61;i++){
            System.out.print("-");
            System.out.println("\n ");
            }
        }
        
            
                    
        }
    }
    public static class Sort implements Runnable{

  
        @Override
        public void run(){
            System.out.println("Thread 5 is wait for THread 1 to start the sorting agorithm");
            
        }
    }
    public static class Acces implements Runnable{

  
        @Override
        public void run(){
            for(int i=0;i<61;i++){
            System.out.print("-");
        }
            System.out.println("\n Listes of registerd students below");
            for(int i=0;i<61;i++){
            System.out.print("~");
            for(int a=0;a<9;a++){
            //System.out.print(a+1 +fName_+lName_+age_+sex_+dep_);
        }
        }
        }
    }
    public static class Edit implements Runnable{

  
        @Override
        public void run(){
            System.out.println("this is creazy right");
        }
    }
    public static class Search implements Runnable{

  
        @Override
        public void run(){
            System.out.println("this is creazy right");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t Welcome to the regestral system");
        for(int i=0;i<61;i++){
            System.out.print("-");
        }
        System.out.println("\n  Please enter a nubmber for your priferd choice from below");
        for(int i=0;i<61;i++){
            System.out.print("~");
        }
        System.out.println("\n1...To register a new student");
        System.out.println("2...To acces a registered list");
        System.out.println("3...To Edit registered student list");
        System.out.println("4...Search regestered list");
        System.out.println("\nPlease enter a nubmber for your priferd choice from below");
        int x= sc.nextInt();  
        switch(x){
            case 1:
                  Thread thread5=new Thread(new Sort());
                  thread5.start();
                  Thread thread1=new Thread(new Register());
                  thread1.start();
                  
                 
                  break;
            case 2:
                  Thread thread2=new Thread(new Acces());
                  thread2.start();
                  break;
            case 3:
                  Thread thread3=new Thread(new Edit());
                  thread3.start();
                  break;
            case 4:
                  Thread thread4=new Thread(new Search());
                  thread4.start();
                  break;
            default:
                System.out.println("Error due to invaid input");
                System.out.println("Please restart the application and reenter your choise");
        }       
                
    }
    }
    

