public class Main {
  // 1. Define Scanner in Main scope
  // 2. Define Random in Main scope
      static Random r = new Random();
      static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

   //  3. Create a function getString which gets a String msg as parameter and returns a String
   //  println (msg)
   //  return a string input from the user (use Scanner)
   
        System.out.print(" say something:" );
        getString("hi");

   //  4. Create a function howManyDigits which gets an int as parameter and returns the number of digits (int)
  //  i.e. howManyDigits(985) -> will return 3
  //  i.e. howManyDigits(12343) -> will return 5
  
        int num = 8976;
        System.out.print("Number of digits : " + howManyDigits(num));

  // 5. Create a function isLonger which gets an int[] arr and int len and return true if the array length is bigger than len
  // i.e. int[] arr = {1,2,3,4}
  // isLonger(arr, 5) -> will return false
  // isLonger(arr, 4) -> will return false
  //  isLonger(arr, 3) -> will return true
  //  create overloading for float[] and int len ..

         int [] arr = new int [4];
         System.out.print("arr is bigger - true or false ?:  " + isLonger(arr,5 ));

        float [] arr1 = new float [4];
        System.out.print("arr is bigger - true or false ?:  " + isLonger1 (arr1,3 ));

   // 6. Create a function arrayEqual which gets int[] , int[] and return true if both arrays are equal in size and content
   // i.e. int[] arr1 = {1,2,3,4}
   // int[] arr2 = {1,2,3,4}
   // arrayEqual (arr1, arr2) -> will return true
   // i.e. int[] arr1 = {1,2,3,4}
   //  int[] arr2 = {1,2,3}
   //  arrayEqual (arr1, arr2) -> will return false
   //  i.e. int[] arr1 = {1,2,3,4}
   // int[] arr2 = {4,3,2,1}
   // arrayEqual (arr1, arr2) -> will return false
   
        int[] arr4 = {1,2,3,4,5,7};
        int[] arr8 = {1,2,3,4,5,7};
        System.out.print(" arr4 is equal to arr8 ? : " + arrayEqual1(arr4, arr8));

    }

    private static String getString(String say) {
        say = s.next();
        return say;
    }

    private static int howManyDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }

    private static boolean isLonger(int[] arr, int len) {
        if (arr.length > len) {
            return true;
        } else
            return false;
    }

    private static boolean isLonger1(float[] arr, int len) {
        if (arr.length > len) {
            return true;
        } else
            return false;
    }

    private static boolean arrayEqual1 (int[] arr4, int[] arr8) {
            if (Arrays.equals(arr4,arr8) )
                return true;
             else
                return false;
        }
    }
