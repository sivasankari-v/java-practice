public class Operators{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("add=" + (a+b));
        System.out.println("sub=" + (a-b));
        System.out.println("mul=" + (a*b));
        System.out.println("div=" + (a/b));
        System.out.println("rem=" + (a%b));
        System.out.println("Relational operators:");
        if(a>b){
          System.out.println("A is greater");}
        else if(a<b){
            System.out.println("B is greater");
        }
        else{
            System.out.println("Both are equal");
        }
        System.out.println("Logical operator:");
        if(a>0 && b<50){
          System.out.println("both are positive");}
        else{
          System.out.println("one is positive");}
        System.out.println("Unary operator:");
                int x= a--;
                 int y= --b;
        System.out.println(x);
        System.out.println(y);
        System.out.println("Assignment operator");
        int w = a+=5;
        int  z = b-=5;
        System.out.println(w);
        System.out.println(z);

    }
}