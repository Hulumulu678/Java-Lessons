package by.bsu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /** Scanner num = new Scanner(System.in);
        System.out.println("Введите число");
        int n=num.nextInt();
        int ans=0;
        for(int i=0;i<n;i++) {

        ans+=i;

        }
        System.out.println(ans);
        }
        **/


      /** int k=0;
       int b=1;
       int n=11;
       for(int i=0;i<n;i++){
           int ans=0;
           ans= k+b;
           k=b;
           b=ans;
System.out.println(ans);
       }

**/
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите сумму");
        float m=num1.nextFloat();

        Scanner num = new Scanner(System.in);
        System.out.println("Введите число месяцев");
        int n=num.nextInt();

for(int i=0;i<n;i++){
    m+=0.07*m;


}
System.out.println(m);


    }
    }

