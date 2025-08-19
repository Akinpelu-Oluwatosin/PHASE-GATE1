def main():
    score1 = 100
    score2 = 30
    score3 = 40

    the_sum = score1 + score2 + score3

    the_average = the_sum / 3.0  

    if 90 <= the_average <= 100:
        print("A")

    elif 80 <= the_average < 90:
        print("B")

    elif 70 <= the_average < 80:
        print("C")

    elif 60 <= the_average < 70:
        print("D")

    elif 0 <= the_average < 60:
        print("YOU ARE A FAILURE")

    else:
        print("INVALID INPUT")


main()