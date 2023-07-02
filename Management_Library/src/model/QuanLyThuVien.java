package model;

import java.util.List;

public interface QuanLyThuVien {
	// tìm kiêm (sách, khách hàng, phiếu mượn) theo id

	public List<Object> timKiemTheoID(String id);

	// tìm kiêm (sách, khách hàng, phiếu mượn) theo ten
	public List<Object> timKiemTheoTen(String id);

	// tao(sach, khách hàng, phieu mượn)=> tạo ra đối tượng
	public void them(Object object);

	// xóa (sach, khách hàng, phieu mượn)
	public void xoa(String id);

	// cập nhật (sach, khách hàng, phieu mượn) có id.
	public void capNhat(String id);

	// lấy ra số lượng tổng (sách, ...., khach hàng..., phieu mượn.....) co trong
	// kho
	public int getTongSoLuong();

	// lấy ra số lượng của một quyến sách có id...
	public int getSoLuong(String id);

}
