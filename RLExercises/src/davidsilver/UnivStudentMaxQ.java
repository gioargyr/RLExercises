package davidsilver;

public class UnivStudentMaxQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] oldGrid = new float[5];
		float[] newGrid = new float[5];
		float g = (float) 1;
		float p = (float) 1;
		int k = 5;
		
		
		// Initialization. All values set to 0
		for(int i = 0; i < 5; i++) {
			oldGrid[i] = 0;
		}
		
		System.out.println("Values for iteration k = 0");
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("OldValue" + i + " = " + oldGrid[i]);
		}
		System.out.println("\n\n");
		
		float[] action = new float[2];
		int[] selectAction = new int[5];
		for(int i = 0; i < 5; i++) {
			selectAction[i] = 0;
		}
		for(int j = 0; j < k; j++) {
			int l = j + 1;
			float max = 0;
			System.out.println("Iteration k = " + l);
			// Updating the values for each state
			action[0] = (float) (p * (0 + g * oldGrid[1]));
			System.out.println("State 1: Standard movement gives q = " + action[0]);
			action[1] = (float) (p * (-1 + g * oldGrid[0]));
			System.out.println("State 1: Secondary movement gives q = " + action[1]);
			System.out.println();
			max = action[0];
			if(max < action[1]) {
				selectAction[0] = 1;
				max = action[1];
			}
			newGrid[0] = max;
			if(selectAction[0] == 0) {
				System.out.println("State 1: Standard movement selected");
			}
			else {
				System.out.println("State 1: Secondary movement selected");
			}
			System.out.println("\n");
			
			action[0] = (float) (p * (-2 + g * oldGrid[2]));
			System.out.println("State 2: Standard movement gives q = " + action[0]);
			action[1] = (float) (p * (-1 + g * oldGrid[0]));
			System.out.println("State 2: Secondary movement gives q = " + action[1]);
			System.out.println();
			max = action[0];
			if(max < action[1]) {
				selectAction[1] = 1;
				max = action[1];
			}
			newGrid[1] = max;
			if(selectAction[1] == 0) {
				System.out.println("State 2: Standard movement selected");
			}
			else {
				System.out.println("State 2: Secondary movement selected");
			}
			System.out.println("\n");
			
			action[0] = (float) (p * (-2 + g * oldGrid[3]));
			System.out.println("State 3: Standard movement gives q = " + action[0]);
			action[1] = (float) (p * (0 + g * oldGrid[4]));
			System.out.println("State 3: Secondary movement gives q = " + action[1]);
			System.out.println();
			max = action[0];
			if(max < action[1]) {
				selectAction[2] = 1;
				max = action[1];
			}
			newGrid[2] = max;
			if(selectAction[2] == 0) {
				System.out.println("State 3: Standard movement selected");
			}
			else {
				System.out.println("State 3: Secondary movement selected");
			}
			System.out.println("\n");
			
			action[0] = (float) (p * (10 + g * oldGrid[4]));
			System.out.println("State 4: Standard movement gives q = " + action[0]);
			action[1] = (float) (p * (1 + g * (0.2 * oldGrid[1] + 0.4 * oldGrid[2]) + 0.4 * oldGrid[3]));
			System.out.println("State 4: Secondary movement gives q = " + action[1]);
			System.out.println();
			max = action[0];
			if(max < action[1]) {
				selectAction[3] = 1;
				max = action[1];
			}
			newGrid[3] = max;
			if(selectAction[3] == 0) {
				System.out.println("State 4: Standard movement selected");
			}
			else {
				System.out.println("State 4: Secondary movement selected");
			}
			System.out.println("\n");
			
			newGrid[4] = 0;
			System.out.println("State 5: Terminal state");
			
//			newGrid[0] = (float) ((0.5 * (0 + g * oldGrid[1])) + (0.5 * (-1 + g * oldGrid[0])));
//			newGrid[1] = (float) ((0.5 * (-2 + g * oldGrid[2])) + (0.5 * (-1 + g * oldGrid[0])));
//			newGrid[2] = (float) ((0.5 * (-2 + g * oldGrid[3])) + (0.5 * (0 + g * oldGrid[4])));
//			newGrid[3] = (float) ((0.5 * (10 + g * oldGrid[4])) + (0.5 * (1 + g * (0.2 * oldGrid[1] + 0.4 * oldGrid[2]) + 0.4 * oldGrid[3])));
//			newGrid[4] = 0;
			
//			for(int i = 0; i < 5; i ++) {
//				//System.out.println("Values for iteration: ");
//				System.out.println("OldValue" + i + " = " + oldGrid[i]);
//			}
			
			System.out.println("\n");
			
			System.out.println("Values for iteration k = " + l);
			for(int i = 0; i < 5; i ++) {
				System.out.println("NewValue" + i + " = " + newGrid[i]);
			}
			System.out.println("\n\n\n");
			
			// Transform the new values to be old in order to start the new iteration
			for(int i = 0; i < 5; i ++) {
				oldGrid[i] = newGrid[i];
			}
		}

	}

}
