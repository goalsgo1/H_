package book.ch4;

public class FlowChart_Step1 {
//odd:Ȧ���� ���� ���, even:¦���� ���� ���, i=:1���� 10������ ���ϴ� ���� ��� ����
	int odd = 0, even = 0, i = 0;
	public static void main(String[] args) {
		FlowChart_Step1 fcs = new FlowChart_Step1();
		for(fcs.i=1;fcs.i <=10;fcs.i=fcs.i+1) {
			if(fcs.i%2 ==0) {
				fcs.even =fcs.even +fcs.i;
			}///////end of if
			else {//�׷� Ȧ����?
				fcs.odd =fcs.odd +fcs.i;
			}/////end of else
			
		}/////end of for
		System.out.println(fcs.even);//¦���� ��
		System.out.println(fcs.odd);//Ȧ���� ��
	}

}
