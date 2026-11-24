#B8-F7-75-4C-D5-5B 
import random
import string

def MAC_Genr():
    mac_addr = ""
    charset = string.hexdigits
    count = 0
    for i in range(1,13):
        count += 1
        mac_addr += random.choice(charset)
        if(count == 2):
            mac_addr += ":"
            count = 0
    return mac_addr
for i in range(20):
    res = MAC_Genr()
    with open("macs.txt", "a") as file:
        file.write(res[:-1].upper()+"\n")
