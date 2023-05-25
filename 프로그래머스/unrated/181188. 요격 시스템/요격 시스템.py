def solution(targets):
    targets = sorted(targets, key = lambda x:x[1])
    
    msl = [0]
    msl_e = targets[0][1]
    k = 1
    
    for i in range(1, len(targets)):
        if targets[i][0] < msl_e:
            k += 1
        #elif targets[i][0] == msl_e:
            
        else:
            msl_e = targets[i][1]
            msl.append(k)
            k = 1
        # 비어있는 구간 추가하기
    return len(msl)