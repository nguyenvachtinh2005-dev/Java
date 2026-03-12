package QLSV;

public class SinhVien {
	public String maSV;
	public String name;
	public int ngay, thang, nam;
	public String nganh;
	public float dTB;
	public String lopSH;
	
	public SinhVien(){}
	
	public SinhVien(String maSV, String name, int ngay, int thang, 
			int nam, float dTB,String lopSH)
	{
		this.maSV = maSV;
		this.name = name;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.dTB = dTB;
		this.lopSH = lopSH;
		
	}public String getMasv() {
        return maSV;
    }

    public void setMasv(String maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return name;
    }

    public void setHoten(String hoTen) {
        this.name = hoTen;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public float getDtb() {
        return dTB;
    }

    public void setDtb(float dtb) {
        this.dTB = dtb;
    }

    public String getLopSH() {
        return lopSH;
    }

    public void setLopSH(String lopSH) {
        this.lopSH = lopSH;
    }
    public void hienThi() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + name);
        System.out.println("Ngày sinh: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm TB: " + dTB);
        System.out.println("Lớp SH: " + lopSH);
    }
	
	
	
}

