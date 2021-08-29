
public class binary_finding{
  import java.util.Arrays;
  import java.lang.Interger;

class Solution{
public static int doSearch(int[] array, int targetValue){
int min = 0;//step 1 i challenge binary search, minimums værdien bliver sat til 0
system.out.println(array.toString(array));
int max = array.lenght - 1;//int max er sat til længden af array minus 1, også step 1
int guess = max/2;// kan være svaret til step 3. skal nok være et if statement, men kunne
//ikke få det til at virke
if(guess == targetValue){//step 4
return guess;
else if (array[guess] < targetValue) {//step 5
return guess = guess +1;
}
else if (array[guess] > targetValue) {//step 6
  return guess = guess -1;// alle de her if statements skal være i et for loop men kunne ikke
  // få det til at virke, det skulle være et for loop for at komme tilbage til  step 2
}

}

return -1;
}

}
public static void main(String[] args){


  }

}
