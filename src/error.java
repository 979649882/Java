
public class error {

	public static void main(String[] args) {
		int i;
		int j = 0;
		for(i=0; i<5;++i) {
			for (j=0;j<5;++j) {
				if (i==4&&j==4) {
					break;
				}
			}
		}
		System.out.println("expected i=4 j =4, actual i j value" + i + j);
	}

}
