# 퀵 소트 0(nlogn), 최악의 경우 0(n^2)

import sys

def quick_sort(li):
    length = len(li)
    if length <= 1:
        return li
    else:

        pivot=li[0]
        bigger = [ele for ele in li[1:] if ele > pivot]
        smaller = [ele for ele in li]