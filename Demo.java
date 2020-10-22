public class Demo {
  public static String arrtoString(int[] arr) {
    if (arr.length == 1) {
    return "{"+arr[0]+"}";
  }
  String array = "{";
  for(int i = 0; i<arr.length; i++) {
    if(i==0) {
      array = array + arr[i] + ",";
    }
    else if(i==arr.length-1) {
      array = array + " " + arr[i];
    }
    else {
      array = array + " " + arr[i] +",";
    }
  }
  return array + "}";
  }
  public static String arrayDeeptoString(int[][] arr) {
    if (arr.length == 1) {
    return "{"+arrtoString(arr[0])+"}";
  }
  String array = "{";
  for(int i = 0; i<arr.length; i++) {
    if(i==arr.length-1) {
      array = array + " " + arrtoString(arr[i]);
    }
    else if(i==0) {
      array = array + arrtoString(arr[i]) + ",";
    }
    else {
      array = array + " " + arrtoString(arr[i]) +",";
    }
  }
  return array + "}";
  }
  public static int[][] create2DArray(int rows,int cols,int MaxValue) {
    int[][] newArray = new int[rows][cols];
    for(int r = 0; r<rows; r++) {
      for(int c = 0; c<cols; c++) {
        newArray[r][c] = (int)(Math.random()*(MaxValue+1));
      }
    }
    return newArray;
  }
  public static int[][] create2DArrayRandomized(int rows,int cols,int MaxValue) {
    int[][] newArray = new int[rows][];
    for(int r = 0; r<rows; r++) {
      int colLength = (int) (Math.random()*(cols+1));
      newArray[r] = new int[colLength];
      for(int c = 0; c<colLength; c++) {
        newArray[r][c] = (int)(Math.random()*(MaxValue+1));
      }
    }
    return newArray;
  }
  public static void printLoop(int n){
  for(int i = 1; i<=n; i++){
    for(int j = 0; j<(n+1)-i; j++){
       System.out.print(i);
    }
    System.out.println();
  }
}
  public static void main(String[] args) {
    if (args.length==0) {
      printLoop(5);
    }
    else {
      int a = Integer.parseInt(args[0]);
      printLoop(a);
    }
  //int[][] test = create2DArray(5,4,4);
  //int[][] randomizedTest = create2DArrayRandomized(4,10,100);
  //System.out.println(arrayDeeptoString(test));
  //System.out.println(arrayDeeptoString(randomizedTest));
  //int[] again = {3,4,5};
  //System.out.println(arrtoString(again));
  }
}
