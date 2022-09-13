
public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型の変数を初期化して出力しています。
		long l = 10000000000L;
		System.out.println(l);
		double d = 3.14;
		System.out.println(d);
		boolean b = true;
		System.out.println(b);
		// ラッパークラスをオートボクシングで初期化して出力しています。
		Integer i = 100;
		System.out.println(i);
		Float f = 1.4142f;
		System.out.println(f);
		Character c = 'う';
		System.out.println(c);
		
		int[] array = { 0, 10, 20, 30, 40 };
		System.out.println(array[3]);
	}

}
