package com.dwivedi.Java8;

public class LambdaExample {
    public static void main(String[] args) {
     /*   LamdaExpressions le=new LamdaExpressions(){
            public void header(String value){
                System.out.println("hi " + value);
            }
        };
        LamdaExpressions le2=new LamdaExpressions() {
            @Override
            public void header(String value) {
                System.out.println("hello"+ value);
            }
        };*/

        LamdaExpressions le=(value)-> {System.out.println("hi " + value );};
        //or
        //LamdaExpressions le1=(value,age)-> System.out.println("hi " + value  + " age ->" + age);
        LamdaExpressions le2=(value)-> System.out.println("hi " + value.toUpperCase());
        LamdaExpressions le3=(n)-> {System.out.println("hi " + n.length());};

        //le1.header("facebook",20);
        le2.header("Neelima");
        le3.header("Google");




    }
}
