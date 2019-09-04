package HWPICK;

import java.util.Scanner;

public class NUM01 {
	
	
private static String getGoodMorningMessage(String to) { //to라는 변수에 String 객체가 들어와 있는 것. to가 string타입이고 string이라는 애는 equals 함수 갖고 있음
	String from = null;
	if ("김혜림".equals(to)) { // .은 객체 접근할 때 쓰임 to.하면 to 안에 있는 변수나 함수 접근 가능 
		from = "이진욱"; 
	} else if ("김주아".equals(to)) {
		from = "박보검";
	}
	
	if (from != null) {
		return String.format("%s: %s 굿모닝!", from, to);
	}
	
	
	throw new IllegalArgumentException(String.format("%s는 인사해줄 사람이 없습니다 힝구르르", to));
}

public static void main (String[] args) {
	//System.out.println(getGoodMorningMessage("김혜림"));
	//System.out.println(getGoodMorningMessage("김주아"));
	
/*	try {
		System.out.println(getGoodMorningMessage(null));
		System.out.println(getGoodMorningMessage("김혜림"));
		System.out.println(getGoodMorningMessage("김주아"));
		System.out.println(getGoodMorningMessage("교수님"));
		
		
		
	} catch (Exception a) {
		System.out.println(a.getMessage());
		
	}
	
	try {
		getGoodMorningMessage(null);
	
	}catch (Exception b) {
		System.out.println(b.getMessage());
	}
} 

	
} */	
	

		try {
			for(int i=1; i<=4; i++) {
				Scanner input1 = new Scanner(System.in);
				String to = input1.nextLine();
				System.out.println(getGoodMorningMessage(to));
			}
		}catch (Exception c) {
			System.out.println(c.getMessage());
		}
		
	
	}
}
	



