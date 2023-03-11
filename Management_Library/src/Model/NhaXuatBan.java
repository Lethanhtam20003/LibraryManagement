package Model;

public class NhaXuatBan {
	private String idNhaXuatBan;
	private String name;
	private String address;
	private String SDT_NXB;

	public NhaXuatBan(String idNhaXuatBan, String name, String address, String sDT_NXB) {
		super();
		this.idNhaXuatBan = idNhaXuatBan;
		this.name = name;
		this.address = address;
		SDT_NXB = sDT_NXB;
	}

	public String getIdNhaXuatBan() {
		return idNhaXuatBan;
	}

	public void setIdNhaXuatBan(String idNhaXuatBan) {
		this.idNhaXuatBan = idNhaXuatBan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSDT_NXB() {
		return SDT_NXB;
	}

	public void setSDT_NXB(String sDT_NXB) {
		SDT_NXB = sDT_NXB;
	}

}
