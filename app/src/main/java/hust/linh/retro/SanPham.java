package hust.linh.retro;

/**
 * Created by duy on 2/14/2017.
 */

public class SanPham {
    private int id;
    private String TentenSP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return TentenSP;
    }

    public void setTenSP(String tenSP) {
        TentenSP = tenSP;
    }

    public String getHinhSP() {
        return HinhSP;
    }

    public void setHinhSP(String hinhSP) {
        HinhSP = hinhSP;
    }

    private String HinhSP;
}
