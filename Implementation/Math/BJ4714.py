outputs = []
while True:
    try:
        given = float(input())
        if given < 0:
            break
        else:
            earth = given
            moon= 0.167 * given
            outputs.append('Objects weighing ' + f"{earth:.2f}" +' on Earth will weigh' + f"{moon: .2f}" +' on the moon.')
            

    except EOFError():
        break

for i in outputs:
    print(i)