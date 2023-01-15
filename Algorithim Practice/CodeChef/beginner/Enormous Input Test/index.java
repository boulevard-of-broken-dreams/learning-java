import java.util.*;

class index {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long k = sc.nextLong();

	int count = 0;
	long[] l = new long[n];

	for (int i = 0;i < n ;i++ ) {
		l[i] = sc.nextLong();
	}

	for (int j = 0;j < n ;j++ ) {
		if (l[j]%k==0) {
			count++;
		}
	}
	System.out.println(count);
}