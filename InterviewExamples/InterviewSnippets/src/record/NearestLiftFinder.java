package record;

import java.util.ArrayList;
import java.util.List;

public class NearestLiftFinder {

	public static int findNearestLift (int userFloor, List<Lift> lifts) {
		
		int nearestLiftId = -1;
		int minDistance = Integer.MAX_VALUE;
		
		for (Lift lift : lifts) {
			 
			int distance = Math.abs(lift.currentFloor() - userFloor);
			System.out.println("Lift Id : " +lift.id()+ ", Distance : "+ distance);
			if (distance < minDistance) {
				System.out.println("Distance -- " + distance);
				minDistance = distance;
				nearestLiftId = lift.id();
			}
		}
		
		return nearestLiftId;
	}
	
	public static void main(String[] args) {
		
		int userFloor = 4;
		List<Lift> lifts = new ArrayList<Lift>();
		lifts.add(new Lift(1, 1));
		lifts.add(new Lift(2, 8));
		lifts.add(new Lift(3, 3));
		lifts.add(new Lift(4, 10));
		
		int nearstLift = findNearestLift(userFloor, lifts);
		System.out.println("Nearest lift id is : "+nearstLift);

	}

}
