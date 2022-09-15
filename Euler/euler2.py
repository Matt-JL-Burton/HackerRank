#!/bin/python3

import sys


t = int(input().strip())
for a0 in range(t):
    total = 0
    fibA = 1
    fibB = 1
    n = int(input().strip())
    while fibA < n:
        if fibA%2 == 0:
            total += fibA
        temp = fibA
        fibA = fibA+fibB
        fibB = temp
    print(total)