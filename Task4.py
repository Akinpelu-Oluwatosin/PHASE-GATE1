def get_reach_pump(distance, mpg, gallons):
    
    main_distance = mpg * gallons
    
    if max_distance >= distance:

        return True

    else:

        return False


print(get_reach_pump(50, 25, 2))