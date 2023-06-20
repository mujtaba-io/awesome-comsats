

# Author: Muhammad Mujtaba SP22-BSE-036 1A
# Description: Creates 2 lists and prints them sorted and merged.

#################################################################
#################################################################

# Home Activity 1:

def lists_merge():
    list1 = []
    for i in range(3):
        n = int(input("Enter number for 1st list: "))
        list1.append(n)
        
    list2 = []
    for i in range(3):
        n = int(input("Enter number for 2nd list: "))
        list2.append(n)
    return (list1 + list2)

sorted_list = sorted(lists_merge())

print("Sorted list: ", sorted_list)

#################################################################
#################################################################

# Home Activity 2:

print("Smallest value: ", sorted_list[0])
print("Largest value: ", sorted_list[len(sorted_list) - 1])
