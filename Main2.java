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
    protected String loaiPhuongTien;
    public PhuongTienDiChuyen(String loaiPhuongTien)
    {
        this.loaiPhuongTien = loaiPhuongTien;
    }
    public abstract String layTenHangSanXuat();
    public abstract void batDau();
    public abstract void tangToc();
    public abstract void tatMay();
    public abstract void vanToc();
}
class MayBay extends PhuongTienDiChuyen
{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu)
    {
        super("MayBay");
    }
    public String layTenHangSanXuat()
    {
        return 
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