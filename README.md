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

```
Suppose it is given to find out coprime triplet between l and r, inclusive both.
Also one more condition is once a triplet (a,b,c) is counted, any of the number among the triplet cannot be a part of one more triplet.

So the triplet has to have at most 1 even number, thus the triplets can be in the form of
(a,b,c) = (odd,odd,odd) or (odd,even,odd)
or
(a,b,c) = (2k-1, 2k, 2k+1)

To prove, gcd(a,b) = gcd(b,c) = gcd(a,c) = 1,

since 2k is the only even number, thus, its gcd with other two numbers will be 1,
In case of other two numbers ,
gcd(2k-1,2k+1) = gcd(2k-1, 2k + 1 - (2k-1)) = gcd(2k-1,2) = 1
[since, gcd(x,y) = gcd(x-y), x>= y]

We can use a counter to count such triplets
at the end the counter value should be equal to the (number of odd numbers between l & r)/2
```
