class factorial {
	public static void main(String[] args) {
		/* 3 = 3*2*1 */
		int value,result=1;
		for (value=5;value >=1;value--) {
			//System.out.println('1');			
			result = result * value;
		}
		System.out.println(result);	
	}
}