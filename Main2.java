import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        // HangSanXuat hang1 = new HangSanXuat("yamaha","Japan");
        // HangSanXuat hang2 = new HangSanXuat("ford","US");
        // PhuongTienDiChuyen maybay= new MayBay("A",hang1);
        // PhuongTienDiChuyen oto= new XeOto("B",hang2);
        // PhuongTienDiChuyen xedap= new Xedap(hang1);
        // System.out.println(maybay.layVanToc());
        // System.out.println(oto.layVanToc());
        // System.out.println(xedap.layVanToc());
        // System.out.println(maybay.loaiPhuongTien);


//------------------------------------------------------------------------------------
        // Java 46. Hiểu rõ về INTERFACE trong lập trình Java | Phần 2
        // Sử dụng Interface là do trong java không có đa kế thừa
        // nên Interface tượng trưng cho đa kế thừa trong jvaa
        // tất cả các operation trong Interface đều là các abstract,không có tham số truyền vào chỉ có các operation
        // cách gọi của interface cũng khác vói abstract
        // Nếu gọi ở trong hàm mà nó implements luôn thì cách gọi sẽ giống như abstract
        // interface  luôn ở dạng public 
        // CasioFX500 fx500 =new CasioFX500();
        // Vinacal500 vn500 =new Vinacal500();

        // System.out.println(fx500.cong(4,2));

        // Phanmemmaytinh pmmt = new Phanmemmaytinh() ;
        // System.out.println(pmmt.cong(6,8));
        // pmmt.sapxepgiam();
//------------------------------------------------------------------------------------
        // Java 47. Hiểu rõ về Gói - Package trong lập trình Java | Phần 2 
        // package giống như thư mục trong Java , tên gói phải ghi chữ thường
        

        //------------------------------------------------------------------------------------
        // Java 48. Phân biệt điều khiển public, protected, private | Phần 2
        

//------------------------------------------------------------------------------------
        // Java 49. Xử lý chuỗi trong lập trình Java | Phần 1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap vao chuoi");
        // String s =sc.nextLine();

        // // Hàm length() : lấy độ dài
        // //  ứng đụng ( đặt mật khẩu ít nhất 8 kí tự )
        // System.out.println("length() : " + s.length());
        
        // Hàm charAt( vị trí ) : lấy kí tự tại vị trí trong chuỗi
        // Ứng dụng kiểm tra số điện thoại, mật khẩu phải có chữ in hoa đầu tiên 
        // for( int i = 0; i<s.length(); i++ )
        // {
        //     System.out.println("ki tu tai vi tri " + i + " la : " + s.charAt(i));
        // }

        // // hàm getChars( vị trí bắt đầu, vị trí kết thúc, mảng mới , vị trí bắt đầu của mảng)
        // //  lấy các kí tự trong mảng copy vào 1 mảng mới
        // char[] a = new char[10] ;
        // s.getChars(2, 5, a, 0);
        // // length là 1 thuộc tính của mảng ( không phải hàm như ở trên)
        // for( int i = 0; i < a.length; i++ )
        // {
        //     System.out.println("Gia tri cua mang tai " + i + " la : " + a[i]);
        // }

        // // hàm getBytes() : chuyển kí tự về bảng mã ASCII
  
        // byte[] b = s.getBytes("UTF-8"); //hàm b hiện là hàm có các kí tự đã được chuyển thành ASCII
        // // byte[] b = s.getBytes("UTF-16"); 
        // for(byte i : b)  //foreach (<kiểu kí tự> tên biến chạy : tên mảng) : nó sẽ tự chạy hết mảng
        // {
        //     System.out.println(i);
        // }
        
//------------------------------------------------------------------------------------
        // Java 50. Xử lý chuỗi trong lập trình Java | Phần 2
        // Hàm equals() : so sánh 2 chuỗi ( phân biệt chữ hoa)

        // String s1 = "gg";
        String s1 = new String("gg");
        String s2 = "GG";
        String s3 = "gg";
        // System.out.println("s1 equals s3 " + s1.equals(s3));
        // System.out.println("s1 equals s2 " + s1.equals(s2));
        
        // // hàm equalsIgnoreCase : so sánh 2 chuỗi ( không phân biệt chữ hoa)
        // System.out.println("s1 equalsIgnoreCase s2 " + s1.equalsIgnoreCase(s2));
        
        // hàm compareTo : so sánh > < =
        // ứng dụng : dùng để sắp xếp danh sách
        // Âm : <
        // Dương : >
        // Không : =
        // str1.compareTo(str2) : str 1 có  > < = str2 không
        // System.out.println("s1 compareTo s2 : " + s1.compareTo(s2));
        
        // //  Hàm compareToIgnoreCase : không phân biệt chữ hoa
        // System.out.println("s1 compareToIgnoreCase s2 : " + s1.compareToIgnoreCase(s2));
        
        // // Hàm regionMatches : so sánh một đoạn
        // // regionMatches(in hoa hay không ,từ , chuỗi , đến , độ dài)
        // boolean ss = s1.regionMatches(false, 0, s2, 0, 1);
        // System.out.println("so sanh s1 tu 0 den 1 voi s2 : " + ss);

        // Hàm startsWith : kiểm tra chuỗi bắt đầu bằng 1 chuỗi do mình quy định sẵn
        // String sdt ="012345";
        // System.out.println(sdt.startsWith("012"));
        // System.out.println(sdt.startsWith("013"));

        // // Hàm endsWith : kiểm tra chuỗi kết thúc bằng 1 chuỗi  do mình quy định
        // String fl = "user.c";
        // System.out.println(fl.endsWith("css"));


//------------------------------------------------------------------------------------
        // Java 51. Xử lý chuỗi trong lập trình Java | Phần 3
        // String ss1 = "hello world";
        // String ss2 = "hello";
        // String ss3 = "Hi";
        // // Hàm indexOf : tìm kiếm chuỗi và kí tự
        // // str1.indexOf(str2, vị trí bắt đầu tìm) : kiểm tra str2 có là con của str1 không , nếu có trả về vị trí bắt đầu
        // // nếu ra 1 giá trị âm tức là không tìm thấy str2 trong str1

        // System.out.println(ss1.indexOf(ss2));
        
        // // Hàm lastIndexOf : tìm kiếm từ phải sang trái
        // // str1.lastIndexOf(str2, vị trí bắt đầu)
        // System.out.println(ss1.lastIndexOf(ss3,1));
    

//------------------------------------------------------------------------------------
        // Java 52. Xử lý chuỗi trong lập trình Java | Phần 4
        // hàm concat
        String str1 = "Hello";
        String str2 = " world!";
        String str3 =str1.concat(str2);
        String str4 =str1 + str2 ;
        System.out.println("chuoi s3 duoc noi tu s1 voi s2 bang concat la : " + str3);
        System.out.println("chuoi s4 duoc noi tu s1 voi s2 bang dau ( + ) la : " + str3);
        
        // hàm replace
        String str5 = "Hello world";
        String str6 = str5.replace("Hello","chao");
        System.out.println(str6);

        // hàm tolLowerCase : chuyển về chữ thường
        // hàm toUpperCase : chuyển về chữ hoa
        String str7 = str5.toLowerCase();
        System.out.println(str7); 
        String str8 = str5.toUpperCase();
        System.out.println(str8);
        
        // hàm trim : xóa khoảng tắng dư thừa 
        String str9 = "    hello";
        System.out.println(str9.trim());

        // hàm substring : cắt chuỗi
        // substring(vị trí đầu, vị tría cuối)
        String str10 = "Xin chao cac ban ";
        System.out.println(str10.substring(4, str10.length()));
        // Lưu ý : do length là hàm của chuỗi( không phải thuộc tính như của mảng) nên là length()
}   
    // Java 59. Kiểu dữ liệu Enum trong lập trình Java
    // Enum là kiểu tập hợp nhiều class hữu hạn
}
//------------------------------------------------------------------------------------
// Java 45.
//  Lưu ý : super luôn phải ở đầu
// super giúp cho mình có thể nhập tham chiếu vô luôn
// hangsx không nhập tham chiếu vô được là do nó có kiểu "HangSanXuat"
// "HangSanXuat" (kiểu này do người dùng nhập vào class "HangSanXuat")
abstract class PhuongTienDiChuyen 
{
    protected HangSanXuat hangsx;;
    protected String loaiPhuongTien;
    public PhuongTienDiChuyen(String loaiPhuongTien,HangSanXuat hang)
    {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangsx= hang;
    }
    public  String layTenHangSanXuat()
    {
        return hangsx.getHangsanxuat();
    }
    public  void batDau()
    {
        System.out.println("batDau");
    }
    public  void tangToc()
    {
        System.out.println("Tang toc");
    }
    public  void tatMay()
    {   
        System.out.println("tat may");
    }
    public void vanToc()
    {
        System.out.println("van toc ");
    }
    public abstract double layVanToc();
}
class MayBay extends PhuongTienDiChuyen
{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HangSanXuat hangsx)
    {
        // Lưu ý : super luôn phải ở đầu
        // super giúp cho mình có thể nhập tham chiếu vô luôn
        // hangsx không nhập tham chiếu vô được là do nó có kiểu "HangSanXuat"
        // "HangSanXuat" (kiểu này do người dùng nhập vào class "HangSanXuat")
        // Muốn tra ra tên thì dùng
        // System.out.println(maybay.loaiPhuongTien);(do public nên làm được vậy)
        super("Maybay",hangsx);
       
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public double layVanToc()
    {
        return 200;
    }
    
}   
class HangSanXuat
{
    private String tenHangSanxuat;
    private String tenquocgia;
    public HangSanXuat(String tenHangSanxuat,String tenquocgia)
    {
        this.tenHangSanxuat = tenHangSanxuat;
        this.tenquocgia = tenquocgia;
    }
    public String getHangsanxuat()
    {
        return this.tenHangSanxuat ;
    }
    public void setHangsanxuat(String hangsanxuat)
    {
        this.tenHangSanxuat = hangsanxuat;
    }
}
class XeOto extends PhuongTienDiChuyen
{
    private String loaiNhienlieu;
    public XeOto(String loaiNhienlieu,HangSanXuat hangsx)
    {
        super("XeOto",hangsx);
        this.loaiNhienlieu = loaiNhienlieu;
    }
    public String layTenHangSanXuat(HangSanXuat hangsx)
    {
        return hangsx.getHangsanxuat();
    }
    public double layVanToc()
    {
        return 20;
    }
}   
class Xedap extends PhuongTienDiChuyen
{
    public Xedap(HangSanXuat hangsx)
    {
        super("Xedap",hangsx);
    }
    public String layTenHangSanXuat(HangSanXuat hangsx)
    {
        return hangsx.getHangsanxuat();
    }
    public double layVanToc()
    {
        return 10;
    }
}


//------------------------------------------------------------------------------------
// Java 46
interface Maytinhbotui
{
    public double cong(double a, double b);
    public double tru(double a,double b);
    public double nhan(double a,double b);
    public double chia(double a,double b);
}
class CasioFX500 implements Maytinhbotui
// không có constructor thì mặc định là có constructor rỗng
// Constructor dùng để lấy dữ liệu hằng số
{
    // @Override
    public double cong(double a,double b)
    {
        return a+b;
    }
    public double tru(double a,double b)
    {
        return a-b;
    }
    public double nhan(double a,double b)
    {
        return a*b;
    }
    public double chia(double a,double b)
    {
        return a/b;
    }
}
class Vinacal500 implements Maytinhbotui
{
    // @Override
    public double cong(double a,double b)
    {
        return a+b;
    }
    public double tru(double a,double b)
    {
        return a-b;
    }
    public double nhan(double a,double b)
    {
        return a*b;
    }
    public double chia(double a,double b)
    {
        return a/b;
    }
}
interface Sapxep
{
    public void sapxeptang();
    public void sapxepgiam();
}
class Sapxepchen implements Sapxep
{
    public void sapxepgiam()
    {
        System.out.println("sapxepchen : giam");
    }
    public void sapxeptang()
    {
        System.out.println("sapxepchen : tang");
    }
}
class Sapxepchon implements Sapxep
{
    public void sapxeptang()
    {
        System.out.println("sapxepchon : tang");
    }
    public void sapxepgiam()
    {
        System.out.println("sapxepchon : giam");
    }
}
class Phanmemmaytinh implements Maytinhbotui , Sapxep
{
    // kế thừa dưới dạng override (ghi đè)
    public double cong(double a,double b)
    {
        return a+b;
    }
    public double tru(double a,double b)
    {
        return a-b;
    }
    public double nhan(double a,double b)
    {
        return a*b;
    }
    public double chia(double a,double b)
    {
        return a/b;
    }
    public void sapxeptang()
    {
        System.out.println("sapxepchon : tang");
    }
    public void sapxepgiam()
    {
        System.out.println("sapxepchon : giam");
    }
}