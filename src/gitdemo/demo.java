package gitdemo;

public class demo {
	public static void main(String[] args) {
		/*�ɱ� �е�Ǯ     �ܳɱ�  ����׬��  ��׬����
		50    35        50      35        -50
		150   105       200     70        55
		450   315       650     105       115
		1350  945       2000    140       295
		4050  2835      6050    175       835
		12150 8505      18200   210       2455*/
        int k=1;
        int s=0;
        int cb=30;//����
        System.out.print("�ɱ� �е�Ǯ"+"\t"+"     ׬Ǯ "+"\t �ܳ� ����׬��  ��׬����");
		System.out.println();
		int tmp=0;
		for (int i = 0; i < 7; i++) {
			
			s=s+cb*k;
			double d = cb*k*0.7;
			System.out.print (cb*k+"\t"+(int) d+"\t"+s);
			
			k=k*3;
			System.out.println();
		}
		System.out.println();
		
	}
}
