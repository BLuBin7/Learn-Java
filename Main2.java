public class Main2
{
    public static void main(String[] args)
    {
        
    }
}
//------------------------------------------------------------------------------------
// Java 45. Bài tập về kế thừa và abstract | Phần 2
abstract class PhuongTienDiChuyen 
{
    protected HangSanXuat hangsx;;
    protected String loaiPhuongTien;
    public PhuongTienDiChuyen(String loaiPhuongTien,HangSanXuat hang)
    {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangsx= hang;
    }
    public abstract String layTenHangSanXuat(HangSanXuat hangsx);
    public abstract void batDau();
    public abstract void tangToc();
    public abstract void tatMay();
    public abstract void vanToc();
}
class MayBay extends PhuongTienDiChuyen
{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HangSanXuat hangsx)
    {
        // Lưu ý : super luôn phải ở đầu
        // super giúp cho mình có thể nhập tham chiếu vô luôn
        // hangsx không nhập tham chiếu vô được là do nó có kiểu "HangSanXuat"
        super("Maybay",hangsx);
       
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String layTenHangSanXuat(HangSanXuat hangsx)
    {
        return hangsx.getHangsanxuat();
    }
    public  void batDau()
    {

    }
    public  void tangToc()
    {

    }
    public  void tatMay()
    {

    }
    public  void vanToc()
    {

    }
}   
class HangSanXuat
{
    private String tenHangSanxuat;
    private String tenquocgia;
    public HangSanXuat(String tenHangSanxuat)
    {
        this.tenHangSanxuat = tenHangSanxuat;
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
    public  void batDau()
    {

    }
    public  void tangToc()
    {

    }
    public  void tatMay()
    {

    }
    public  void vanToc()
    {

    }
}   
class Xedap extends PhuongTienDiChuyen
{
    public Xedap(HangSanXuat hangsx)
    {
        super("Xedap",hangsx);
    }
}