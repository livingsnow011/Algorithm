#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
#include"../../solution.h"
using namespace std;
/*
void c3_2() {
	int n, m, k;// n = 배열의 크기,m = 몇 번 더할지,k = 연속된 수의 제한 
	int x; // 배열 요소의 변수
	vector<int> v;//벡터로 풀겠다.
	int ans = 0;//답

	//입력
	scanf("%d %d %d", &n, &m, &k);
	for (int i = 0; i < n; ++i) {
		scanf("%d", &x);
		v.push_back(x);
	}
	//오름차순 정렬
	sort(v.begin(), v.end(), greater<>());

	for (int i = 0; i < m; ++i) {
		//k가 0이 되었다면, 두번째로 큰 수를 더하고 k값을 되돌림
		if (k == 0) {
			ans += v[1];
			k = 3;
		}
		//k가 0이 아니라면, 그냥 제일 큰 수를 계속 더함
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