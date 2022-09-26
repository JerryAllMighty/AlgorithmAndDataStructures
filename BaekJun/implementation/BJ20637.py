cases = int(input())

hospitalizations = int(input())

if cases <= 50 and hospitalizations <= 10:
    print('White')
elif hospitalizations > 30:
    print('Red')
else:
    print('Yellow')

