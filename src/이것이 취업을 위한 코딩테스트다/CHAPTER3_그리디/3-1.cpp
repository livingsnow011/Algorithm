#include<iostream>
#include<cstdio>
#include"../../solution.h"
using namespace std;

void c3_1() {
	int n; // �Է°�
	int ans=0;//������ �ּ� ����
	int coin[4] = { 500,100,50,10 };
	scanf("%d", &n);

	for (int i = 0; i < 4; ++i) {
		ans += (n / coin[i]);//n�� ū �������� ���� ����, �߰��Ǵ� �����̴�.
		n %= coin[i];//������ ������ n�� ������ ���� �ȴ�.
	}

	printf("%d\n", ans);
}