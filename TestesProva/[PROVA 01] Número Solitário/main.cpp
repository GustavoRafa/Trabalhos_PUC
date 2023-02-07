#include <math.h>
#include <stdio.h>

using namespace std;

long long n,  ans, aux;
int i;

inline void inp( long long int &n )
 {
    n=0;
    long long int ch=getchar_unlocked();
   	long long int sign=1;

    while(  ch >= '0' && ch <= '9' )
            n = (n<<3)+(n<<1) + ch-'0', ch=getchar_unlocked();

    n=n*sign;
  }


int main(){
	while(1){
		inp((n));
		if( n == 0 ) break;
		ans = 0;
		for(i = 0; i < n; ++i)
		{
			inp((aux));
			ans = ans ^ aux;
		}
		printf("%lld\n", ans);
	}
}
