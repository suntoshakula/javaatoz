package exceptions;

public class MyExceptions {

	public static void main(String a[]) {
		MyExceptions mye = new MyExceptions();
		try {
			for (int i = 0; i < 5; i++) {
				mye.getJunck();
				System.out.println(i);
			}
			System.out.println(mye.getStringSize(null));
		} catch (Exception e) {
			System.out.println("zs");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void getJunck() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public int getStringSize(String str) throws Exception{
		if(str==null) {
			throw new Exception("cannot be null");
		}
		return str.length();
	}

}
