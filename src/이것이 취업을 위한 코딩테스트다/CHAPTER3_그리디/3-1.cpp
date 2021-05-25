#include<iostream>
#include<cstdio>
#include"../../solution.h"
using namespace std;

void c3_1() {
	int n; // 입력값
	int ans=0;//동전의 최소 개수
	int coin[4] = { 500,100,50,10 };
	scanf("%d", &n);

	for (int i = 0; i < 4; ++i) {
		ans += (n / coin[i]);//n을 큰 동전으로 나눈 몫이, 추가되는 동전이다.
		n %= coin[i];//나누기 했으면 n은 나머지 값이 된다.
	}

	printf("%d\n", ans);
}