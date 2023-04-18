package de1;

/**
 * Câu 1 (3 điểm): Cho số tự nhiên n.
 * 
 * a. Kiểm tra xem số đó có là số nguyên tố không.
 * 
 * b. Phân tích số n ra các thừa số nguyên tố.
 * 
 * @author ADMIN
 *
 */
public class c1 {

	public boolean checkSNT(int number) {
		int count = 0;
		for (int n = 1; n <= number; n++) {
			if (number % n == 0) {
				count = count + 1;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

//c2 Cho một dãy gồm n số. Kiểm tra xem dãy có đan dấu hay không. Ví dụ dãy sau là đan dấu: 2 -1 7 -3 4 -5 6
	public boolean dandau(int[] arr) {
		if (arr[0] > 0) {
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]==0)return false;
				if (!(i % 2 == 0) ) {
					if (!(arr[i] * -1 == Math.abs(arr[i]))) {
						return false;
					}

					if (!(arr[i] == Math.abs(arr[i]))) {
						return false;
					}
				}
			}
		} else {
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]==0)return false;
				if (!(i % 2 == 0)) {
					if (!(arr[i] == Math.abs(arr[i]))) {
						return false;
					}
				} else {

					if (!(arr[i] * -1 == Math.abs(arr[i]))) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		c1 c = new c1();
	
		int[] arr = { -1, 2, -2, 0, -3,3 };
		System.out.println(c.dandau(arr));
	}
}
