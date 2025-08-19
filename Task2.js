	let score1 = 100;

	let score2 = 10;

	let score3 = 40;
	

        let theSum = score1 + score2 + score3;

	let theAverage = theSum / 3.0;
	

       
        if (theAverage >= 90 && theAverage <= 100) {
        console.log("A");

        } else if (theAverage >= 80 && theAverage < 90) {
         console.log("B");

        }
	 else if (theAverage >= 70 && theAverage < 80) {
          console.log("C");

        }
	 else if (theAverage >= 60 && theAverage < 70) {
          console.log("D");

        }
	 else if (theAverage >= 0 && theAverage < 60) {
          console.log("YOU ARE A FAILURE");

        } 
	else {
         console.log("INVALID INPUT");
        }