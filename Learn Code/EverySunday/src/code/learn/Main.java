package code.learn;

public class Main {

	public static void main(String[] args) {
		// write your code here

		Practice practice = new Practice();


		/**
		 * Persistent Little Bugger
		 * https://edabit.com/challenge/zZxPQRjn8q2iB9Biv
		 */
		System.out.println("\n*** Persistent Little Bugger - Begin ***");
		System.out.println(practice.bugger(25));
		System.out.println("\n*** Persistent Little Bugger - End ***\n\n");

		/**
		 * Seven Boom
		 * https://edabit.com/challenge/CKqfEowjmSTw2jsso
		 */
		System.out.println("\n*** Seven Boom - Begin ***");
        int[] arr1 = {2, 8, 10, 12, -99};
        int[] arr2 = {-2, 9, 12, 0, 0, 9, 22, 99, 127};
        int[] arr3 = {};
        System.out.println("\n1st arr");
        practice.sevenBoom(arr1);
        System.out.println("\n2nd arr");
        practice.sevenBoom(arr2);
        System.out.println("\n3rd arr");
        practice.sevenBoom(arr3);
		System.out.println("\n*** Seven Boom - End ***\n\n");





	}


}
