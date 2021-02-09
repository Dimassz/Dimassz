    package com.calculator;

    import java.util.Scanner;

    public class Main {
      public static void main(String[] args) {

        Scanner input;
        float a,b,result;
        char operator;

        input=new Scanner(System.in);

            System.out.println("CALCULATOR X,/,+,-");
            System.out.print("a=");
            a =input.nextFloat();
            System.out.print("operator=");
            operator=input.next().charAt(0);
            System.out.print("b=");
            b=input.nextFloat();

            System.out.println(a+ " " +operator+ " " + b);

            //----------------------

            if(operator == 'x'){
                result=a * b;
                System.out.println("result= "+ result );
            }else if(operator == '/') {
                if(b == 0){
                    System.out.println("not found");
                }else{
                result = a / b;
                System.out.println("result= " + result);}
            }else if(operator == '+'){
                result=a + b;
                System.out.println("result= "+ result );
            }else if(operator == '-'){
                result=a - b;
                System.out.println("result= "+ result );
            }



                }
            }
