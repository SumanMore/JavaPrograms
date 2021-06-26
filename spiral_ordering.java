import java.util.*;
class Main {
  public static void main(String[] args) {
     ArrayList<ArrayList<Integer>> ob=new ArrayList<ArrayList<Integer>>();

    /* ob.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
    ob.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
    ob.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
    ob.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
    System.out.println("original list: "+ob);
    System.out.println("spiral ordering list: "+matrixspiral(ob));
    */
    

    ob.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
    ob.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
    ob.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
    System.out.println("original list: "+ob);
    System.out.println("spiral ordering list: "+matrixspiral(ob));
    
  }
public static List<Integer> matrixspiral(ArrayList<ArrayList<Integer>> sq){
List<Integer> spiral = new ArrayList <>();
for (int offset = 0; offset < Math.ceil(0.5*sq.size()); offset++)
{
matrixClockwise(sq, offset, spiral);
}
return spiral;
}
private static void matrixClockwise(ArrayList<ArrayList<Integer>> sq ,int offset,List<Integer> spiral) 
{

if (offset==sq.size()-offset- 1) {
spiral.add(sq.get(offset).get(offset));
return ;
}

//this for loop adds n-1 elements of first row
for (int j=offset; j<sq.size()-offset-1; j++) 
{
spiral.add(sq.get(offset).get(j));
}


//adds n-1 of last column
for (int i =offset ;i<sq.size()-offset-1; i++)
{
spiral.add(sq.get(i).get(sq.size()-offset- 1));
}


//adds n-1 elements of last row in reverse order
for (int k = sq.size()-offset-1; k>offset; k--)
{
spiral.add(sq.get(sq.size()-offset-1).get(k));
}


//adds n-1 elements of first column in reverse order
for (int l = sq.size()-offset-1; l>offset; l--) {
spiral.add(sq.get(l).get(offset));
}

}
}
