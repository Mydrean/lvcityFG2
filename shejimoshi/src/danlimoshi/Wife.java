package danlimoshi;

import java.util.ArrayList;
import java.util.Random;
	public class Wife {
		//��������ܲ�����ʵ������
		private static int maxNumOfWife = 4;
		//ÿ�����Ӷ������֣�ʹ��һ��ArrayList�����ɣ�ÿ�������˽������
		private static ArrayList<String> nameList=new ArrayList<String>();
		//����һ���б��������е����ӵ�ʵ��
		private static ArrayList<Wife> wifeList=new ArrayList<Wife>();
		//��ǰ�������к�
		private static int countNumOfWife =0;
		//�������еĶ���
		static{
			for(int i=0;i<maxNumOfWife;i++){
				wifeList.add(new Wife("��"+(i+1)+"��"));	
			}
		}
	
	private Wife(){
		
	}
	//�����������ƣ�����һ�����Ӷ���
	private Wife(String name){
		nameList.add(name);
	}
	//������һ�����Ӷ��� 
	public static Wife getInstance(){
		Random random = new Random();
		countNumOfWife =random.nextInt(maxNumOfWife);
		return wifeList.get(countNumOfWife);
	}
	
	public static void say(){
		System.out.println(nameList.get(countNumOfWife));
	}
	}

