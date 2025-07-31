def makeBricks(small, big, goal):
    return goal % 5 <= small and small + 5 * big >= goal
