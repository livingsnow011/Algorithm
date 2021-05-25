#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
#include"../../solution.h"
using namespace std;

void c3_4() {
	int N, K;
	int ans = 0;
	scanf("%d %d", &N, &K);

	while(N!=1){
		if (N % K == 0)
			N /= K;
		else
			N - 1;
		ans++;
	}

	printf("%d", ans);
}