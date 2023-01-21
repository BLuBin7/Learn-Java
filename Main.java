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
    // try
    // {
    //   System.out.println("Nhap a : ");
    //   int a = sc.nextInt();
    // }
    // catch(Exception e)
    // {
    //   System.out.println("Du lieu nhap vao khong la so");
    // }
    // finally
    // {
    //   System.out.println("Finally!");
    // }
    // System.out.println("Cau lenh nay van duoc thuc thi ");


    // ------------------------------------------------------------------------------------
    // Java 27a. Giới thiệu về mảng trong lập trình Java | Phần 1
    // double mang1[];
    // //  cách 2 : double[] mang1;
    // System.out.println("Nhap so luong phan tu cua mang : ");
    // int n = sc.nextInt();
    // mang1 = new double[n];

    // // Nhập mảng
    // for(int i = 0 ; i < mang1.length ; i++)
    // {
    //   System.out.println("Nhap phan tu thu " + i + " : ");
    //   mang1[i] = sc.nextDouble();
    // }

    // // Xuất mảng
    // for(int i = 0 ; i < mang1.length ; i++)
    // {
    //   System.out.println("phan tu thu " + i + " : " + (int)mang1[i]);
    // }


    // ------------------------------------------------------------------------------------
    // Java 30. Cách xây dựng lớp và phương thức khởi tạo Constructor | Phần 2
    // Java30 date = new Java30(19 , 1 , 2023);
    // date.printDay();
    // date.printMonth();
    // date.printYear();


    // ------------------------------------------------------------------------------------
    // Java 31. Hiểu rõ về phương thức trong lập trình Java | Phần 2
    // HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen" , 100.000 , 1.5);
    // HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen" , 100.000 , 5.5);
    // System.out.println("Tong tien :" + hd.tinhTongTien());
    // System.out.println("KiemtraKhoiLuong > 2kg :" + hd.KiemTraKhoiLuong(2));
    // System.out.println("Kiem tra gia tien co > 500k khong : " + hd.KiemTraGiaTienLonHon500k());
    // System.out.println("So tien sau khi giam gia cua khach hang 1 : " + hd.GiamGia(5));
    // System.out.println("So tien sau khi giam gia cua khach hang 2 : " + hd2.GiamGia(5));


    // ------------------------------------------------------------------------------------
    // Java 32. Hiểu rõ phương thức GET và SET | Phần 2
    // MyDate md = new MyDate(20 , 1, 2023);
    // System.out.println("Ngay : " + md.GetDay());
    // md.SetDay(1);
    // System.out.println("Ngay sau khi doi : " + md.GetDay());



    // ------------------------------------------------------------------------------------
    // Java 33. Hiểu rõ phương thức toString trong lập trình Java
    Java33 md = new Java33(21 ,1,2023);
    System.out.println(md.toString());
  }
}

// ------------------------------------------------------------------------------------
// Java 30
// nếu mà là public class thì phải đặt cái class thành 1 file riêng biệt
//  còn nếu là class thôi thì ko cần đặt thành 1 file riêng biệt
  class Java30
  {
    //  bước 1 : khai báo thuộc tính
    private int day;
    private int month;
    private int year;

    // bước 2 : khai báo phương thức (method) hoặc còn gọi là hàm(tên hàm giống tên class)
    // Constructor (bắt buộc)
    public Java30(int d, int m , int y )
    {
      // tạo 1 đối tượng mới
      //  this là lấy thông tin nội bộ bên trong lớp này ra
      this.day = d;
      this.month = m;
      this.year = y;

    }

    // Operation
    // nếu phương thức không trả về bất cứ thông tin gì thì dùng "void".. trả về ở đây là "return" (không phải dữ liệu trong ngoặc (..) )
    // nếu có trả thì dùng double , int ,...
    public void printDay()
    {
      System.out.println("Ngay : " + this.day);
    }
    public void printMonth()
    {
      System.out.println("Thang: " + this.month);
    }
    public void printYear()
    {
      System.out.println("Nam: " + this.year);
    }
  }



// ------------------------------------------------------------------------------------
// Java 31
  class HoaDonCaPhe
  {
    // Attribute
    private String tenloaiCaPhe ;
    private double giatien1kg , KhoiLuong;

    // Constructor 
    // Lưu ý : Constructor không có kiểu dữ liệu trả về
    public HoaDonCaPhe(String ten , double gia ,double KL)
    {
      this.tenloaiCaPhe = ten;
      this.giatien1kg = gia;
      this.KhoiLuong = KL;
    }
    // Operation
    public double tinhTongTien()
    {
      return this.giatien1kg * this.KhoiLuong;
    }
    
    public boolean KiemTraKhoiLuong(double kl)
    //  truyền "kl" này là nhập từ bàn phím
    {
    // cách 1
    //   if(this.KhoiLuong > kl)
    //   {
    //     return true;
    //   }
    //   else
    //   {
    //     return false;
    //   }
    // 
    // cách 2
    // thật ra nguyên cụm this.KhoiLuong mặc định đã trả về "true" hoặc "false" rồi
      return this.KhoiLuong > kl;
    }
    public boolean KiemTraGiaTienLonHon500k()
    {
      return this.tinhTongTien() > 500.000;
    }
    public double GiamGia(double x)
    {
      if(this.KiemTraGiaTienLonHon500k() == true)
      {
        System.out.println("Hoa Don cua quy khach tren 500k nen duoc giam " + x +"%");
        return this.tinhTongTien() - (this.tinhTongTien() * x/100);
      }
      else
      {
        System.out.println("Rat tiec . Hoa Don cua quy khach duoi 500k nen khong duoc giam gia");
        return this.tinhTongTien();
      }
    }
  }

// ------------------------------------------------------------------------------------
// Java 32
class MyDate
  {
    // Attribute
    private int day , month , year;

    // Constructor
    public MyDate(int d , int m , int y)
    { 
      if(d >= 1 && d <= 31)
      {
        this.day = d;
      }
      else
      {
        this.day = 1;
      }
      if(m>=1 && m<=12)
      {
        this.month = m;
      }
      else 
      {
        this.month = 1;
      }
      if(y >=1900 && y<=2023)
      {
        this.year = y;
      }
      else
      {
        this.year = 2000;
      }
    }

    // Operation
    public int GetDay()
    {
      return this.day;
    }
    public void SetDay(int d)
    {
      if(d >=1&&d<=31)
      {
        this.day = d;
      }
    }

    public int GetMonth()
    {
      return this.month;
    }
    public void SetMonth(int m)
    {
      if(m>=1 &&m<=12)
      {
        this.month = m;
      }
    }

    public int  GetYear()
    {
      return this.year;
    }
    public void SetYear(int y)
    {
      if(y>=1900 &&y<=2023)
      {
        this.year = y;
      }
    }
  }


// ------------------------------------------------------------------------------------
// Java 33
class Java33
  {
    // Attribute
    public int day , month , year;


    // Contructor
    public  Java33(int day , int month , int year )
    {
      if(day >=1 &&day <=31)
      {
        this.day = day ;
      }
      else 
      {
        this.day = 1;
      }
      if(month >=1&&month <=12)
      {
        this.month = month;
      }
      else
      {
        this.month = 1;
      }
      if(year >=1900&&year <=2023)
      {
      this.year = year;
      }
      else
      {
        this.year = 2023;
      }

      // Operation

    }
    // @Override
    public String toString()
    {
      return this.day + "/" + this.month +"/" +this.year;
    }
  }
