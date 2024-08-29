# My Codeforces Journey

Here I am just putting the solutions for the codeforces problems that I am solving.
These questions are selected from the TLE Eliminators CP-31 Sheet.
This also includes all the Codeforces contests I am giving and will be giving until I decide to move to a new repo.
Daily 2 questions of Codeforces.

Following are some properties which were new to me:

```
Difference Property:
If a and b are two integers, and d is a multiple of both, i.e. a/d=const1. and b/d=const2.
(const1 and const2 ∈ Integer )
Then let ø = a - b, then ø/d is also an Integer
```

```
Relation between LCM and GCD of a and b:
LCM(a,b) * GCD(a,b) = a*b

Some more LCM properties
LCM(a,0) = a
```

```
Suppose an array a is given of length n, and it is given to find out a number x such that by doing operation ai = ai % x, i = 0 -> n-1, array should become a palindrome.
Here we can use GCD
int ans = 0;
    for (int i = 0; i < n / 2; i++) {
        int temp = Math.abs(a[i] - a[n - i - 1]);
        ans = gcd(ans, temp);

    }
System.out.println(ans);
```
