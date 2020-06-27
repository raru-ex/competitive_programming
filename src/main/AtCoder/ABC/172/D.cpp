#include <bits/stdc++.h>
#define REP(i, n) for(int i = 0; i < n; i++)
#define REPR(i, n) for(int i = n; i >= 0; i--)
#define FOR(i, m, n) for(int i = m; i < n; i++)
#define INF 2e9
#define ALL(v) v.begin(), v.end()
using namespace std;
typedef long long ll;
int main()
{
  int N;
  cin >> N;

  ll result = 0;
  for(int j = 1; j <= N; j++) {

    int count = 0;
    for (ll i = 1; i * i <= j; ++i) {
      if (j % i == 0) {
        count++;
        if (j/i != i) count++;
      }
    }

    result = j * count;
  }

  cout << result << endl;
}
