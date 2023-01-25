package org.constructorAmbiguity;

public class AmbiguityPractice {
    private int a;
    private int b;

    public AmbiguityPractice(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor integer type called");
    }
    public AmbiguityPractice(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor double type called");
    }
    public AmbiguityPractice(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor String type called");
    }
    public void doSum(){
        System.out.println(this.a+" + "+this.b+" = "+(this.a+this.b));
    }

}
