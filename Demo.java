public class Demo {
  public static String arrtoString(int[] arr) {
    if (arr.length == 1) {
    return "{"+arr[0]+"}";
  }
  String array = "{";
  for(int i = 0; i<arr.length; i++) {
    if(i==arr.length-1) {
      array = array + " " + arr[i];
    }
    else if(i==0) {
      array = array + arr[i] + ",";
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
  //int [][] test = {{2, 0}};
  //System.out.println(arrayDeeptoString(test));
  }
}
