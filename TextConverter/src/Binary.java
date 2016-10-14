public class Binary {
	int[] number;
	public Binary(int[] num) {
		number = num;
	}
	
	public Binary() {
		number = new int[1];
		number[0] = -1;
	}
	
	public long toInt() {
		long compressed = 0;
		for (int i = 0; i < number.length; i++) {
			compressed = compressed * 10 + number[i];
		}
		return compressed;
	}
	
	public String toString() {
		String string = "";
		for (int i = 0; i < number.length; i++) {
			string += number[i];
		}
		return string;
	}
}
