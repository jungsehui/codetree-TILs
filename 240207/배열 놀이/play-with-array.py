n, p = map(int, input().split())

num_list = list(map(int, input().split()))

for _ in range(p):
    qst_inp_list = list(map(int, input().split()))


    if qst_inp_list[0] == 1:
        print(num_list[qst_inp_list[1] - 1])

    elif qst_inp_list[0] == 2:        
        for idx, num in enumerate(num_list):
            if num == qst_inp_list[1]:
                print(idx + 1)
                break

    else:
        for i in range(qst_inp_list[1], qst_inp_list[2] + 1):
            print(num_list[i - 1], end = " ")