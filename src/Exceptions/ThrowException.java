package Exceptions;

public class ThrowException {

	public static void main(String[] args) {
		System.out.println("Abc");

		try {
			throw new Exception("chand exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("pqr");
		
		String Excel_Flag = "N";
		if (Excel_Flag.equals("N")) {
			try {
			throw new Exception("Excel flag is Blank Exception");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
			
	
	}
	

}
