def solution(n, arr1, arr2):
    answer = []
    # bin(num) : num을 이진수 문자열로 변환해줌
    for i in range(n):
        temp = bin(arr1[i] | arr2[i])[2:]
        while(len(temp) != n):
            temp = '0' + temp

        answer.append(temp.replace('1', '#').replace('0',' '))
    return answer