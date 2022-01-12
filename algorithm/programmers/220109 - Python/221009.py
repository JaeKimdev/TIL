def solution(s):
    e = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(10):
        # s.replace(a, b): 문자열 s에서 a를 찾아 b로 바꾼다
        s = s.replace(e[i], str(i))
    return int(s)

