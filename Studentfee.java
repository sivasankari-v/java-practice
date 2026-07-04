public class Studentfee {
    public static void main(String[] args) {
        int tuitionfee=20000;
        int busfee=10000;
        int bookfee=5000;
        int examfee=3000;
        int total=tuitionfee+busfee+bookfee+examfee;
        double discount=total*10/100;
        System.out.println("total fees="+total);
        System.out.println("discount amount="+discount);
        
    }
    
}
