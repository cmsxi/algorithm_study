def solution(n):
    # 분할 정복과 동일
    case = [1, 1]
    
    for i in range(2, n+1):
        case.append(case[i-2] + case[i-1])
    answer = case[n] % 1234567
    
    return answer