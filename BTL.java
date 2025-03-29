import java.util.Scanner;

public class BTL {
    private String stn1,stn2;
    public BTL(String stn1,String stn2){
        this.stn1 = stn1;
        this.stn2 = stn2;
    }
    public String getStn1(){
        return stn1;
    }
    public String getStn2(){
        return stn2;
    }
    public String Sum(String stn1,String stn2){
        while (stn1.length() < stn2.length()) {
            stn1 = "0" + stn1;
        }
        while (stn2.length() < stn1.length()) {
            stn2 = "0" + stn2;
        }
        int tong = 0;
        int bonho = 0;
        StringBuilder result = new StringBuilder();
        
        for (int i = stn1.length() - 1; i >= 0; i--) {
            int chuso1 = Character.getNumericValue(stn1.charAt(i));
            int chuso2 = Character.getNumericValue(stn2.charAt(i));
            tong = chuso1 + chuso2 + bonho;
            result.append(tong % 10);
            bonho = tong / 10;
        }
        
        if (bonho > 0) {
            result.append(bonho);
        }
        
        return result.reverse().toString();
    } 
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        String stn1 = sc.nextLine();
        System.out.println("Nhập số thứ hai: ");
        String stn2 = sc.nextLine();
        BTL btl = new BTL(stn1,stn2);
        System.out.println("tong cua ban la "+btl.Sum(stn1,stn2));
    }
}