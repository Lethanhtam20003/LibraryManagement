package Model;

import java.util.HashMap;
import java.util.Map;

public class QLSach {
	private Map<Sach,Integer> listBook ;

	public QLSach() {
		this.listBook = new HashMap<Sach,Integer>();
	}

	public Map<Sach, Integer> getListBook() {
		return listBook;
	}

	public void setListBook(Map<Sach, Integer> listBook) {
		this.listBook = listBook;
	}
	
	
}
