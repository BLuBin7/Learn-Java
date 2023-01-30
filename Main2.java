public class Main2
{
    public static void main(String[] args)
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
        // interface  luôn ở dạng public 
        CasioFX500 fx500 =new CasioFX500();
        Vinacal500 vn500 =new Vinacal500();

        System.out.println(fx500.cong(4,2));

        
        
        // Java 59. Kiểu dữ liệu Enum trong lập trình Java
        // Enum là kiểu tập hợp nhiều class hữu hạn
    }
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