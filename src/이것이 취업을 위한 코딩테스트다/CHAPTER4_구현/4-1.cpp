#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
#include"../../solution.h"
using namespace std;
/*
void c3_2() {
	int n, m, k;// n = �迭�� ũ��,m = �� �� ������,k = ���ӵ� ���� ���� 
	int x; // �迭 ����� ����
	vector<int> v;//���ͷ� Ǯ�ڴ�.
	int ans = 0;//��

	//�Է�
	scanf("%d %d %d", &n, &m, &k);
	for (int i = 0; i < n; ++i) {
		scanf("%d", &x);
		v.push_back(x);
	}
	//�������� ����
	sort(v.begin(), v.end(), greater<>());

	for (int i = 0; i < m; ++i) {
		//k�� 0�� �Ǿ��ٸ�, �ι�°�� ū ���� ���ϰ� k���� �ǵ���
		if (k == 0) {
			ans += v[1];
			k = 3;
		}
		//k�� 0�� �ƴ϶��, �׳� ���� ū ���� ��� ����
		else {
			ans += v[0];
			k--;
		}
	}

	printf("%d", ans);
}
*/

void c4_1() {
	int n;
	char command;
	scanf("%d", &n);
	vector<vector<int>> v(n, vector<int>(n, 0));

}