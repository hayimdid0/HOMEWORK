package HWPICK;

import java.util.Scanner;

public class NUM01 {
	
	
private static String getGoodMorningMessage(String to) { //to��� ������ String ��ü�� ���� �ִ� ��. to�� stringŸ���̰� string�̶�� �ִ� equals �Լ� ���� ����
	String from = null;
	if ("������".equals(to)) { // .�� ��ü ������ �� ���� to.�ϸ� to �ȿ� �ִ� ������ �Լ� ���� ���� 
		from = "������"; 
	} else if ("���־�".equals(to)) {
		from = "�ں���";
	}
	
	if (from != null) {
		return String.format("%s: %s �¸��!", from, to);
	}
	
	
	throw new IllegalArgumentException(String.format("%s�� �λ����� ����� �����ϴ� ��������", to));
}

public static void main (String[] args) {
	//System.out.println(getGoodMorningMessage("������"));
	//System.out.println(getGoodMorningMessage("���־�"));
	
/*	try {
		System.out.println(getGoodMorningMessage(null));
		System.out.println(getGoodMorningMessage("������"));
		System.out.println(getGoodMorningMessage("���־�"));
		System.out.println(getGoodMorningMessage("������"));
		
		
		
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
	



