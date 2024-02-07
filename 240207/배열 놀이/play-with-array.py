n, p = map(int, input().split())

num_list = list(map(int, input().split()))

for _ in range(p):
    tmp_list = list(map(int, input().split()))
    if len(tmp_list) == 2:
        prob_index,question = tmp_list
    elif len(tmp_list) == 3:
        prob_index,start_index,end_index = tmp_list

    if prob_index == 1:
        print(num_list[question-1])
    elif prob_index == 2:
        print(num_list.index(question)+1)
        # answer = -1
        # for num_index,num in enumerate(num_list):
        #     if num == question:
        #         answer = num_index+1
        #         break
        # if answer == -1:
        #     print(0)
        # else:
        #     print(answer)
    elif prob_index == 3:
        num_list = list(map(str,num_list))
        print(' '.join(num_list[start_index-1:end_index]))