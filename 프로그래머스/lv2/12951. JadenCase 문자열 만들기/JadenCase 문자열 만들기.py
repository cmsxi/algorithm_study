def solution(s):
    answer = ''
    s = s.lower()

    answer += s[0].upper()
    for i in range(0, len(s)-1):
        if s[i] == ' ':
            temp = s[i+1].upper()
            answer += temp
            continue
        answer += s[i+1]
        

    return answer