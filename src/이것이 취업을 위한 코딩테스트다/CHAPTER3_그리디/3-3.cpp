#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
#include"../../solution.h"
using namespace std;


void c3_3() {
	int n, m;// n�� , m��
	int ans;// ��
	scanf("%d %d", &n, &m);
	vector<vector<int>> v(n, vector<int>(m, 0)); //n���� �����, m���� �����Ѵ�. 2���� ����
	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < m; ++j) {
			scanf("%d", &v[i][j]);
		}
	}

	// 2�������� ���ο�� �� ����, �� ������� 
	for (int i = 0; i < v.size(); ++i) {
		for (int j = 0; j < v[i].size(); ++j)
			sort(v[i].begin(), v[i].end());
	}

	//�� �࿡ ���� ���� ��鸸 �����ϴ� ���� ����
	vector<int> ansGroup;
	for (int i = 0; i < n; ++i)
		ansGroup.push_back(v[i][0]);
	//�������� ����
	sort(ansGroup.begin(), ansGroup.end(), greater<>());
	//�� ���� ģ���� ��
	printf("%d",ansGroup.front());

}