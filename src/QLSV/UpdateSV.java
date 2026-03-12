package QLSV;

import ConnectionDB.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateSV {

    // thêm sinh viên
	public void themSV(SinhVien sv) {

	    try {

	        Connection c = conn.getConnection();

	        String sql = "INSERT INTO sinhvien(masv,hoten,ngaysinh,nganh,diemtrungbinh,lop) VALUES (?,?,?,?,?,?)";

	        PreparedStatement ps = c.prepareStatement(sql);

	        ps.setString(1, sv.maSV);
	        ps.setString(2, sv.name);

	        String ngaysinh = sv.nam + "-" + sv.thang + "-" + sv.ngay;
	        ps.setString(3, ngaysinh);

	        ps.setString(4, sv.nganh);
	        ps.setFloat(5, sv.dTB);
	        ps.setString(6, sv.lopSH);

	        ps.executeUpdate();

	        System.out.println("Them sinh vien thanh cong");

	    } catch (Exception e) {

	        System.out.println("Loi them sinh vien");
	        e.printStackTrace();
	    }
	}
    // sửa sinh viên
	public void suaSV(SinhVien sv) {

	    try {

	        Connection c = conn.getConnection();

	        String sql = "UPDATE sinhvien SET hoten=?, ngaysinh=?, nganh=?, diemtrungbinh=?, lop=? WHERE masv=?";

	        PreparedStatement ps = c.prepareStatement(sql);

	        ps.setString(1, sv.name);

	        String ngaysinh = sv.nam + "-" + sv.thang + "-" + sv.ngay;
	        ps.setString(2, ngaysinh);

	        ps.setString(3, sv.nganh);
	        ps.setFloat(4, sv.dTB);
	        ps.setString(5, sv.lopSH);
	        ps.setString(6, sv.maSV);

	        ps.executeUpdate();

	        System.out.println("Sua sinh vien thanh cong");

	    } catch (Exception e) {

	        System.out.println("Loi sua sinh vien");
	        e.printStackTrace();
	    }
	}

    // xóa sinh viên
    public void xoaSV(String masv) {

        try {

            Connection c = conn.getConnection();

            String sql = "DELETE FROM sinhvien WHERE masv=?";

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, masv);

            ps.executeUpdate();

            System.out.println("Xoa sinh vien thanh cong");

        } catch (Exception e) {

            System.out.println("Loi xoa sinh vien");
            e.printStackTrace();

        }

    }

    public void hienThi() {

        try {

            Connection c = conn.getConnection();

            String sql = "SELECT * FROM sinhvien";

            PreparedStatement in = c.prepareStatement(sql);

            ResultSet rs = in.executeQuery();

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("Ma SV: " + rs.getString("masv"));
                System.out.println("Ho ten: " + rs.getString("hoten"));
                System.out.println("Ngay sinh: " + rs.getDate("ngaysinh"));
                System.out.println("Nganh: " + rs.getString("nganh"));
                System.out.println("Diem TB: " + rs.getFloat("diemtrungbinh"));
                System.out.println("Lop: " + rs.getString("lop"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    

}