class AlphanumericRandomGenerate{
	
	public static void main(String... args){
		System.out.println(AlphanumericRandomGenerate.getRandomString(10));
	}

	public static String getRandomString(int maxlength){
	    String result = "";
	    int i = 0, n = 0, min = 47, max = 123;
	    while(i < maxlength){
	        n = (int)(Math.random() * (max - min) + min);
	        if((n > 47 && n < 58) || (n > 64 && n < 91) || (n>96 && n<123))
	        {
	            result += (char)n;
	            ++i;
	        }
	    }
	    return result;
	}
}