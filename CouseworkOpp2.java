package cousework.opp2;
import java.util.ArrayList;
import java.util.Scanner;

public class CouseworkOpp2 {

     public static void main(String[] args) {
    ArrayList<String>name=new ArrayList();
    Scanner nam=new Scanner(System.in);
    System.out.println("enter Students name(enter exit when done)");
    int x=1;
    String y = nam.next();
    while(true){
       
        System.out.println("enter students name"+x+"");
        y=nam.next();
        if(y.toLowerCase().equals("exit")){
           break;
        }else
             
        
        
       
            
      
            x++;      
        int mark[]=new int[6];
        int i;
        String grd;
        float sum =0,avg;
                Scanner scan=new Scanner(System.in);
                System.out.println("enter the first course unit");
                String a=scan.next();
                System.out.println("hve entered"+a);
                
                System.out.println("enter the first course unit");
                String b=scan.next();
                System.out.println("hve entered"+b);
                
                System.out.println("enter the first course unit");
                String c=scan.next();
                System.out.println("hve entered"+c);
                
                System.out.println("enter the first course unit");
                String d=scan.next();
                System.out.println("hve entered"+d);
                
                System.out.println("enter the first course unit");
                String e=scan.next();
                System.out.println("hve entered"+e);
                
                System.out.println("enter the first course unit");
                String f=scan.next();
                System.out.println("hve entered"+f);
                
                System.out.print("Enter marks obtained in above 6 course units:");
                for(i=0;i<6;i++)
                {
                    mark[i]=scan.nextInt();
                    sum= sum +mark[i];
                }
                avg=sum/6;
                
                System.out.print("your grade is"+avg);
                if(avg>=80&&avg<=100){
                    grd="A";
                    System.out.println("A");
                }
                
                else if(avg>=60&&avg<80){
                    grd="B";
                 System.out.println("B");
                    
                }
                else if(avg>=60&&avg<80){
                    grd="C";
                 System.out.println("C");
                    
                }
                else if(avg>=60&&avg<80){
                    grd="D";
                 System.out.println("D");
                    
                }
                else if(avg>40&&avg<50)
                {
                    System.out.println("F");
                }
                else{System.out.println("invalid");
               
                }
                
    
            
       
    }
     }
     }

