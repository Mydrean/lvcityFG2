package danlimoshi;

public class Guest {
	public static void main(String[] args) {
		//����8������
		int guestNum=5;
		for(int i=0;i<guestNum;i++){
			Wife wife=Wife.getInstance();
			System.out.println("��"+(i+1)+"�����˼����ǣ�");
			wife.say();
		}
	}

}
