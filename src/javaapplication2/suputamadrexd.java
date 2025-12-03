
package javaapplication2;

import java.util.Scanner;


public class suputamadrexd {
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     String no1, no2, no3, no4;
     int e1, e2, e3, e4, edadm;
     System.out.println("nombre 1");
     no1 = leer.next();
        System.out.println("edad 1");
        e1= leer.nextInt();
      System.out.println("nombre 2");
     no2 = leer.next();
     System.out.println("edad 2");
        e2= leer.nextInt();
      System.out.println("nombre 3");
     no3 = leer.next();
     System.out.println("edad 3");
        e3= leer.nextInt();
      System.out.println("nombre 4");
     no4 = leer.next();
     System.out.println("edad 4");
        e4= leer.nextInt();
        
      if (e1<e2){
            edadm=e2;
            System.out.println("es mayor "+edadm);
        }else if(e1==e2){
            System.out.println(e1+" son iguales "+e2);
        }else if(e1<e3){
            edadm=e3;
            System.out.println("mayor "+edadm);
        }else if (e1==e3){
            System.out.println(e1+" dd "+e3);
        }else if (e1<e4){
            edadm=e4;
            System.out.println("mayor "+edadm);
        }else if(e1==e4){
            System.out.println(e1+" c "+e4);
        }//22222222222222222222222222222222222222222222222222222222222
        else if (e2<e1){
            edadm=e1;
            System.out.println("es mayor "+edadm);
        }else if(e2==e1){
            System.out.println(e2+" son iguales "+e1);
        }else if(e2<e3){
            edadm=e3;
            System.out.println("mayor "+edadm);
        }else if (e2==e3){
            System.out.println(e2+" dd "+e3);
        }else if (e2<e4){
            edadm=e4;
            System.out.println("mayor "+edadm);
        }else if(e2==e4){
            System.out.println(e2+" c "+e4);
        }//333333333333333333333333333333333333333333333333333333333333
         else if (e3<e1){
            edadm=e1;
            System.out.println("es mayor "+edadm);
        }else if(e3==e1){
            System.out.println(e3+" son iguales "+e1);
        }else if(e3<e2){
            edadm=e2;
            System.out.println("mayor "+edadm);
        }else if (e3==e2){
            System.out.println(e3+" dd "+e2);
        }else if (e3<e4){
            edadm=e4;
            System.out.println("mayor "+edadm);
        }else if(e3==e4){
            System.out.println(e3+" c "+e4);
        }//44444444444444444444444444444444444444444444444444444444444
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
    }
    
}
