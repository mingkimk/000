package TestCode;

import org.junit.Test;

public class MsgAna {
	
	@Test
	public void kkk() {
		String msg="/to kkk hi! good!!";
		//System.out.println(msg.indexOf(" "));
		//System.out.println(msg.indexOf(" ",4));
		//4��° ���� �������  ��� �ϸ� 7 
		int firstInt = msg.indexOf(" ")+1;
		int endInt= msg.indexOf(" ",firstInt);
		String id = msg.substring(firstInt, endInt);
		System.out.println(id);
		//7�� string���� �ٲٸ� kkk�� ���
		String idMsg=msg.substring(endInt+1);
		System.out.println(idMsg);
		// �޼����� kkk ���� ���� ���� ��� hi! good!!

	}

}
