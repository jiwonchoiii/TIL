import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Computer {

	
	int sum1(int[] values) {
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		} // for

		return sum;
	} // sum1

	int sum2(int... values) {
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		} // for

		return sum;
	}// sum2

} // end class
