

# Author: Muhammad Mujtaba SP22-BSE-036 1A
# Description: Prints Mclaurin Series' summation.

#################################################################
#################################################################

# Home Activity 1:

print("*** *** ***  HOME ACTIVITY 1 *** *** ***")

# First we define factorial() function that we will use later:
def factorial(n):
    factorial = 1
    if n < 0:
        print("ERROR: expected non-negative number.")
    elif n == 0:
        return 1
    else:
        for i in range(1, n + 1):
            factorial = factorial * i
        return factorial

# Defining mclaurin series summation function:

def maclaurin_series(x, N):
    result = 0
    for o in range(N):
        result += ((x ** o) / factorial(o))
    return result

# Calling this function to see results:
x = int(input("Enter x: "))
N = int(input("Enter N: "))
print("Mclaurin series summation for these inputs is: ", maclaurin_series(x, N))

#################################################################
#################################################################

