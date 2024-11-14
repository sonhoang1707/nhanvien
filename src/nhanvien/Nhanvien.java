package nhanvien;

public class Nhanvien {
	   private String id;
	   private String ten;
	   private int tuoi;
	   private double luong;

	   public Nhanvien(String id, String ten, int tuoi, double luong) {
	       this.id = id;
	       this.ten = ten;
	       this.tuoi = tuoi;
	       this.luong = luong;
	   }

	   public String getId() {
	       return id;
	   }

	   public void setId(String id) {
	       this.id = id;
	   }

	   public String getTen() {
	       return ten;
	   }

	  
	   public void setTen(String ten) {
	       this.ten = ten;
	   }

	   public int getTuoi() {
	       return tuoi;
	   }

	   public void setTuoi(int tuoi) {
	       this.tuoi = tuoi;
	   }

	   public double getLuong() {
	       return luong;
	   }

	   public void setLuong(double luong) {
	       this.luong = luong;
	   }

	   @Override
	   public String toString() {
	       return "------------------------------------------\n" +
	               "Mã Nv: " + id + ", Tên: " + ten + ", Tuổi: " + tuoi + ", Lương: " + luong;
	   }
	}


	//Quan li nhan vien NhanVien(id, ten, tuoi, luong)
	//Main(thêm nhân viên, sửa nhân viên, xóa nhân viên, tìm kiếm nhân viên)
	//Nâng cao: tìm nhân viên có lương lớn hơn 100