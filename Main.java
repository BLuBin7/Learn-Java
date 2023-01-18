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
    // a++ : thực thi câu lệnh (nếu thỏa) mới cộng

    // int  a = 5;
    //   System.out.println("++a = " + ++a);
    //   //  ++a : Tăng a lên rồi mới in

    //   a = 5;
    //   System.out.println("--a = " + --a);

    //   a = 5;
    //  System.out.println("a++ = " + a++);
    //   // a++ :Thực thi câu lệnh xong mới tăng a

    //   a = 5;
    //   System.out.println("a-- = " + a--);


    // ------------------------------------------------------------------------------------
    // Java 15. Toán tử điều kiện trong Java | Phần 1
    // int a = 5;
    // //                      (điều kiện) ? thỏa  :  ko thỏa
    // String ketqua = (a%2==0 )?"so chan":"so le";
    // System.out.println(ketqua);


    // ------------------------------------------------------------------------------------
    // Java 16. Lớp Math và các hàm toán học trong Java | Phần 1
    // double a = 5.5;
    // // Trị tuyệt đối
    // System.out.println("|a| = " + Math.abs(a));
    // //  Căn
    // System.out.println("√a = " + Math.sqrt(a)); 
    // float b = 10.7f  // float phải có "f"
    // // Tìm min
    // System.out.println("min(a,b) = " + Math.min(a,b));
    // // Tìm max
    // System.out.println("max(a,b) = " + Math.max(a,b));
    // // Hàm a^b
    // System.out.println("a^b = " + Math.pow(a,b));
    // // Hàm ceil: làm tròn lên
    // System.out.println("ceil(a) = " + Math.ceil(a));
    // // Hàm floor: làm tròn xuống
    // System.out.println("floor(a) = " + Math.floor(a));


    // ------------------------------------------------------------------------------------
    // Java 17. Câu lệnh điều kiện if ... else trong Java | Phần 1
    // int a = 5;
    // if(a%2 == 0)
    // {
    //   System.out.println("so chan");
    // }
    // else
    // {
    //   System.out.println("so le");
    // }


    // ------------------------------------------------------------------------------------
    // Câu lệnh switch ... case trong lập trình Java | Phần 1
  //   int a = 5;
  //   switch(a)
  //   {
  //     case 5 : 
  //     {
  //       System.out.println("a = 5");
  //       break; // làm xong 1 case nhớ "break" nếu không nó thực thi tiếp 
  //     }
  //     default :
  //     {
  //       System.out.println("a!= 5 ");
  //     }
  //   }
  // }


  // ------------------------------------------------------------------------------------
  // Java 21. Cách sử dụng vòng lặp for trong lập trình Java | Phần 1
  // int a = 5;
  // for(int i = 0; i <a;i++)
  // {
  //   System.out.println(i);
  // }


  // ------------------------------------------------------------------------------------
  // Java 23. Cách sử dụng vòng lặp while trong lập trình Java | Phần 1
  // int a = 5;
  // while(a<7)
  // {
  //   System.out.println(a);
  //   a++;
  // }


  // ------------------------------------------------------------------------------------
  // Java 24. Chuyển đổi số từ thập phân sang nhị phân | Phần 1
  // System.out.println("Nhap a : ");
  // int a = sc.nextInt();
  // String henhiPhan= "";
  // while(a>0)
  // {
  //   henhiPhan = a%2 + henhiPhan;  
  //   //(a%2) Cộng trước do khi sắp xếp sẽ đi từ dưới lên
  //   a = a/2;
  //   // 10/2=5 dư 0
  //   // 5/2=2  dư 1
  //   // 2/2=1 dư 0
  //   // 1/2=0 dư 1
  //   // lấy dư từ dưới lên : 1010
  // }
  // System.out.println("He nhi phan cua a la : "+ henhiPhan);


  // ------------------------------------------------------------------------------------
  // Vòng lặp do while trong lặp trình Java | Phần 1
  // do .. while thực thi điều kiện ÍT NHẤT 1 LẦN
  // int a =5;
  // do 
  // {
  //   System.out.println(a);
  //   a++;
  // }while(a<4);


  // ------------------------------------------------------------------------------------
  // Java 27 . Cách bắt lỗi ngoại lệ bằng try catch trong lập trình Java | Phần 1 
  try
  {
    System.out.println("Nhap a : ");
    int a = sc.nextInt();
  }
  catch(Exception e)
  {
    System.out.println("Du lieu nhap vao khong la so");
  }
  finally
  {
    System.out.println("Finally!");
  }
  System.out.println("Cau lenh nay van duoc thuc thi ");
}
}