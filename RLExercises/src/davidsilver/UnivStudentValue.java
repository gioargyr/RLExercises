package davidsilver;

public class UnivStudentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] oldGrid = new float[5];
		float[] newGrid = new float[5];
		float g = (float) 1;
		int k = 100;
		
		// Initialization. All values set to 0
		for(int i = 0; i < 5; i++) {
			oldGrid[i] = 0;
		}
		
		System.out.println("Values for iteration k = 0");
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("OldValue" + i + " = " + oldGrid[i]);
		}
		
		for(int j = 0; j < k; j++) {
			// Updating the values for each state
			newGrid[0] = (float) ((0.5 * (0 + g * oldGrid[1])) + (0.5 * (-1 + g * oldGrid[0])));
			newGrid[1] = (float) ((0.5 * (-2 + g * oldGrid[2])) + (0.5 * (-1 + g * oldGrid[0])));
			newGrid[2] = (float) ((0.5 * (-2 + g * oldGrid[3])) + (0.5 * (0 + g * oldGrid[4])));
			newGrid[3] = (float) ((0.5 * (10 + g * oldGrid[4])) + (0.5 * (1 + g * (0.2 * oldGrid[1] + 0.4 * oldGrid[2]) + 0.4 * oldGrid[3])));
			newGrid[4] = 0;
			
			int l = j + 1;
			
//			for(int i = 0; i < 5; i ++) {
//				//System.out.println("Values for iteration: ");
//				System.out.println("OldValue" + i + " = " + oldGrid[i]);
//			}
			
			System.out.println("\n");
			
			System.out.println("Values for iteration k = " + l);
			for(int i = 0; i < 5; i ++) {
				System.out.println("NewValue" + i + " = " + newGrid[i]);
			}
			
			// Transform the new values to be old in order to start the new iteration
			for(int i = 0; i < 5; i ++) {
				oldGrid[i] = newGrid[i];
			}
		}

	}

}
