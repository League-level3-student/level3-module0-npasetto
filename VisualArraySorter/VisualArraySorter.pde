//1. create an array of ints. don't initialize it yet.
int[] ints;
import java.util.Random;
 Random rand=new Random();
void setup() {
  //2. set the size of your window
 
  size(500,500);

  //3. initialize your array with the built in width variable
  ints=new int[width];
  randomize();
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  

  //5. call the noStroke() method
  noStroke();
}
void randomize(){
  for(int i=0; i<ints.length; i++){
    ints[i]=rand.nextInt(height);
  }
}
void draw() {
  //6. set the background color with background(r, g, b);
background(55,66,255);

  //7. set the color for your graph
fill(255,88,99);

  //8. draw a rectangle for each int in your array.
  for(int i=0; i<ints.length; i++){
   rect(i,height,1,-ints[i]);
  }
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method
  stepSort(ints);

  //10. extract the code that randomizes the array into a method.
  if(mousePressed){
    randomize();
  }

  //11. call the method you made in step 10 when the mouse is pressed
  
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}