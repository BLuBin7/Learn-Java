import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    // System.out.println("Hello World");
    Scanner sc = new Scanner(System.in);
    // System.out.println("Ten : ");
    // String g = sc.nextLine();
    // System.out.println("Nhap mssv : ");
    // long l = sc.nextLong();
    // System.out.println("Nhap vao diem thi : ");
    // float x = sc.nextFloat();
    // System.out.println("Ten : "+g);
    // System.out.println("MSSV :" + l);
    // System.out.println("Diem :" +x);


    // ------------------------------------------------------------------------------------
    // Java 11. Các phép toán cơ bản trong Java 
    // System.out.println("Nhap a : ");
    // int a = sc.nextInt();
    // System.out.println("Nhap b : ");
    // int b = sc.nextInt();
    // int tong = a + b;
    // System.out.println( a + " + " + b + " = " + tong);
    // int hieu = a - b;
    // System.out.println( a + " - " + b + " = " + hieu);
    // int tich = a * b;
    // System.out.println(a + " * " + b + " = " + tich);
    // // phải ép kiểu cho thương
    // float thuong =(float)a /b;
    // System.out.println(a + " / " + b + " = " + thuong);
    // int soDu = a % b;
    // System.out.println(a + " % " + b + " = " + soDu);


    // ------------------------------------------------------------------------------------
    // Java 12 Các phép toán một ngôi trong lập trình Java | Phần 1

    // ++a : cộng trước rồi mới thực thi câu lệnh 
    // a++ : thực thi câu lệnh (nếu thỏa mới cộng)

    int  a = 5;
      System.out.println("a++ = " + ++a);
      a = 5;
      System.out.println("--a = " + --a);
      a = 5;
     System.out.println("a++ = " + a++);
      a = 5;
      System.out.println("a-- = " + a--);
  }
}