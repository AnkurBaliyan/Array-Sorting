public class BubbleSort {

	static void display(int a[], int length) {
		int tmp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length - i; j++) {
				if (a[j] < a[j - 1]) {
					tmp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = tmp;
				}

			}

		}

	}

	public static void main(String[] args) {
		int array[] ={34,89,242,186,227,528,260,529,519,548,377,363,586,591,585,583,362,584,550,549,602,269,556,276,277,551,314,302,295,315,338,351,612,366
				,804,620,619,615,617,616,614,618,611,613,443,452,463,465,472,473,479,480,481,482,483,484,489,515,518,589,520,524,521,522,593,526,527,
				532,540,544,535,534,539,533,603,536,560,558,537,565,566,567,579,580,581,582,568,590,595,594,610,608,599,597,598,600,601,609,632,628,
				621,622,624,626,627,629,630,631,801,802,803,805,806,807};
		
		System.out.println("\nArray after sorting");
		display(array, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println(array.length);

	}

}