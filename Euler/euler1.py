#!/bin/python3

import sys


t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    n3=(n-1)//3
    n5=(n-1)//5
    n15=(n-1)//15
    s3=(n3*(6+(n3-1)*3))//2
    s5=(n5*(10+(n5-1)*5))//2
    s15=(n15*(30+(n15-1)*15))//2
    print(s3+s5-s15)
    # x = sum(i for i in range(n) if i % 3 == 0 or i % 5 == 0)
    # print(x)