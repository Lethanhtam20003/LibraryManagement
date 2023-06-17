package model;

import java.util.List;

public interface ThuThu {
	// tìm kiêm (sách, khách hàng, phiếu mượn) theo id
		public List<Object> timKiemTheoID(String id);

	//tìm kiêm (sách, khách hàng, phiếu mượn) theo ten
		public List<Object> timKiemTheoTen(String id);

	//tao(sach, khách hàng, phieu mượn)=> tạo ra đối tượng
		public void them(Object object);

	//xóa tương tự
		public void xoa(String id);

	//cập nhật tương tự
		public void capNhat(String id);

	//lấy ra số lượng(sách, ...., khach hàng..., phieu mượn.....)
		public int getSoLuong();

}
