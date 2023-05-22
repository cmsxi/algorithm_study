def solution(s):
    # stack 활용하는 문제
    answer = 0
    char_list = []
    
    for c in s:
        if char_list == []:
            char_list.append(c)
            continue
            
        if char_list[-1] == c:
            char_list.pop()
            
        else:
            char_list.append(c)
        
    
    if char_list == []:
        answer = 1
        
    return answer