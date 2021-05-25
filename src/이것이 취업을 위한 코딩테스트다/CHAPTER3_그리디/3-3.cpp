#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
#include"../../solution.h"
using namespace std;


void c3_3() {
	int n, m;// n행 , m열
	int ans;// 답
	scanf("%d %d", &n, &m);
	vector<vector<int>> v(n, vector<int>(m, 0)); //n행을 만들고, m열을 생성한다. 2차원 벡터
	for (int i = 0; i < n; ++i) {
		for (int j = 0; j < m; ++j) {
			scanf("%d", &v[i][j]);
		}
	}

	// 2차원벡터 내부요소 간 정렬, 잘 기억하자 
	for (int i = 0; i < v.size(); ++i) {
		for (int j = 0; j < v[i].size(); ++j)
			sort(v[i].begin(), v[i].end());
	}

	//각 행에 가장 낮은 놈들만 저장하는 벡터 선언
	vector<int> ansGroup;
	for (int i = 0; i < n; ++i)
		ansGroup.push_back(v[i][0]);
	//오름차순 정렬
	sort(ansGroup.begin(), ansGroup.end(), greater<>());
	//맨 앞쪽 친구가 답
	printf("%d",ansGroup.front());

}