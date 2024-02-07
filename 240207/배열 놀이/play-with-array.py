n, p = map(int, input().split())
num_list = list(map(int, input().split()))

for _ in range(p):
    tmp_list = list(map(int, input().split()))

    prob_index = tmp_list[0]

    if prob_index == 1:
        question = tmp_list[1]
        print(num_list[question-1])

    elif prob_index == 2:
        question = tmp_list[1]
        found_indices = [i+1 for i, num in enumerate(num_list) if num == question]

        if found_indices:
            print(min(found_indices))
        else:
            print(0)

    elif prob_index == 3:
        start_index, end_index = tmp_list[1], tmp_list[2]
        print(' '.join(map(str, num_list[start_index-1:end_index])))