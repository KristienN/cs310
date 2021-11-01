def exerciseOne(a):
    count =0;
    for x in range(0, len(a)):
        if(a[x]=='0'):
            count += 1
    
    return count % 2 == 0


userIn = input()
print(exerciseOne(userIn))

