package QLSV;

import java.util.Scanner;

public class ChuongTrinh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UpdateSV up = new UpdateSV();

        int chon;

        do {

            System.out.println("===== QUAN LY SINH VIEN =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Hien thi DS Sinh Vien");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch(chon)
            {
	            case 1:
	            {
	
	                SinhVien sv = new SinhVien();
	
	                System.out.print("Nhap ma SV: ");
	                sv.maSV = sc.nextLine();
	
	                System.out.print("Nhap ten: ");
	                sv.name = sc.nextLine();
	
	                System.out.print("Nhap ngay sinh: ");
	                sv.ngay = sc.nextInt();
	
	                System.out.print("Nhap thang sinh: ");
	                sv.thang = sc.nextInt();
	
	                System.out.print("Nhap nam sinh: ");
	                sv.nam = sc.nextInt();
	                sc.nextLine();
	
	                System.out.print("Nhap nganh: ");
	                sv.nganh = sc.nextLine();
	
	                System.out.print("Nhap diem TB: ");
	                sv.dTB = sc.nextFloat();
	                sc.nextLine();
	
	                System.out.print("Nhap lop sinh hoat: ");
	                sv.lopSH = sc.nextLine();
	
	                up.themSV(sv);
	                break;
            	}
	            case 2:
	            {
	
	                SinhVien sv1 = new SinhVien();
	
	                System.out.print("Nhap ma SV can sua: ");
	                sv1.maSV = sc.nextLine();
	
	                System.out.print("Nhap ten moi: ");
	                sv1.name = sc.nextLine();
	
	                System.out.print("Nhap ngay sinh: ");
	                sv1.ngay = sc.nextInt();
	
	                System.out.print("Nhap thang sinh: ");
	                sv1.thang = sc.nextInt();
	
	                System.out.print("Nhap nam sinh: ");
	                sv1.nam = sc.nextInt();
	                sc.nextLine();
	
	                System.out.print("Nhap nganh: ");
	                sv1.nganh = sc.nextLine();
	
	                System.out.print("Nhap diem TB: ");
	                sv1.dTB = sc.nextFloat();
	                sc.nextLine();
	
	                System.out.print("Nhap lop sinh hoat: ");
	                sv1.lopSH = sc.nextLine();
	
	                up.suaSV(sv1);
	                break;
	            }
	            case 3:
	            {
	
	                System.out.print("Nhap ma SV can xoa: ");
	                String masv = sc.nextLine();
	
	                up.xoaSV(masv);
	                break;
	            }
	            
	
	            case 4:
	            {
	                up.hienThi();
	                break;
	            }
                case 5: {
                    System.out.println("Da thoat chuong trinh");
                    break;
                }
	            default:
	            	System.out.println("loi chon");
            	}
        	} while (chon != 5);

    }
}