package Assignments;

public class Assignment22 {
	
	public static void main(String[] args) {
		String str = "Welcome to Capgemini India.";
        char ch = 'i';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
	}

}
