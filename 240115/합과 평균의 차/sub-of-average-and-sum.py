_list = list(map(int, input().split()))

print(f"""{sum(_list)}
{int(sum(_list)/len(_list))}
{int(sum(_list) - (sum(_list)/len(_list)))}""")