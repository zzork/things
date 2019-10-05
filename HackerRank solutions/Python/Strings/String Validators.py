# You are given a string S.
# Your task is to find out if the string S contains: alphanumeric characters, alphabetical characters, digits, lowercase and uppercase 
# characters.

if __name__ == '__main__':
    s = input()
    is_al_num, is_alpha, is_digit, is_upper, is_lower = False, False, False, False, False

    for c in s:
        if c.isalnum():
            is_al_num = True
        if c.isalpha():
            is_alpha = True
        if c.isdigit():
            is_digit = True
        if c.isupper():
            is_upper = True
        if c.islower():
            is_lower = True

    print("%s\n%s\n%s\n%s\n%s\n" % (is_al_num, is_alpha, is_digit, is_lower, is_upper))
