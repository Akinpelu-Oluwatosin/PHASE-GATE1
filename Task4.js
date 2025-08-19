

Function getReachPump(int distance, int mpg, int gallons) {

        let mainDistance = mpg * gallons;

        if (mainDistance >= distance) {

            return true;

        } else {

            return false;
        }
    

    
       console.log(getReachPump(50, 25, 2));
    
