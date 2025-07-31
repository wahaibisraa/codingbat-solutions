def blackjack(a, b):
    if a > 21 and b > 21:
        return 0
    if a > 21:
        return b
    if b > 21:
        return a
    return max(a, b)
