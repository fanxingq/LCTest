package com.tree.test1;

/**
 * 96. ��ͬ�Ķ���������
 * @author zheng
 *
 */
public class NumTreesTest {

	//��̬�滮 F(i,n) = G(i-1)*G(n-i) 
	public int numTrees(int n) {
        
		int[] G = new int[n+1];
		G[0] = 1;
		G[1] = 1;
		for (int i = 2; i <= n ; i++) {
			for (int j = 1; j <= i; j++) {
				G[i] += G[j-1] * G[i-j];
			}
		}
		return G[n];
    }
	
	//��ѧ���﷨��ʹ�ÿ���������
	public int numTrees2(int n) {
		
		long G = 1;
		for (int i = 0; i < n; i++) {
			G = 2*(2*i+1)*G/(i+2);
		}
		return (int) G;
	}
	
}
