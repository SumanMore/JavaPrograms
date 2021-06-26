import java.util.*;
class Main {
public static void main(String[] args) {
  ArrayList<ArrayList<Integer>> ob=new ArrayList<ArrayList<Integer>>();
  /*ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,1,4,5,2,3,8)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  ob.add(new ArrayList<Integer>(Arrays.asList(9,7,6,8,4,5,2,3,1)));
  */
   ob.add(new ArrayList<Integer>(Arrays.asList(5,3,4,6,7,8,9,1,2)));
    ob.add(new ArrayList<Integer>(Arrays.asList(6,7,2,1,9,5,3,4,8)));
    ob.add(new ArrayList<Integer>(Arrays.asList(1,9,8,3,4,2,5,6,7)));
    ob.add(new ArrayList<Integer>(Arrays.asList(8,5,9,7,6,1,4,2,3)));
    ob.add(new ArrayList<Integer>(Arrays.asList(4,2,6,8,5,3,7,9,1)));
    ob.add(new ArrayList<Integer>(Arrays.asList(7,1,3,9,2,4,8,5,6)));
    ob.add(new ArrayList<Integer>(Arrays.asList(9,6,1,5,3,7,2,8,4)));
    ob.add(new ArrayList<Integer>(Arrays.asList(2,8,7,4,1,9,6,3,5)));
    ob.add(new ArrayList<Integer>(Arrays.asList(3,4,5,2,8,6,1,7,9)));
 if(isValidSudoku(ob))
   System.out.println("valid");
 else{
   System.out.println("not valid");}
  }
  
public static boolean isValidSudoku(ArrayList<ArrayList<Integer>> p){

for (int i = 0; i < p.size(); ++i) {
if (hasDuplicate(p , i, i + 1, 0,p.size())) {
return false;
}
}

for (int j = 0; j < p.size(); ++j) {
if (hasDuplicate(p , 0, p.size(), j,j+1)) {
return false;
}
}
int regionSize = (int)Math.sqrt(p.size());
for (int i = 0 ; i < regionSize; ++i) {
for (int j= 0 ; j < regionSize; ++j) {
if (hasDuplicate(p , regionSize * i,regionSize * (i + 1), regionSize * j,regionSize * (j + 1))) {
return false;
}
}
}
return true ;
}
private static boolean hasDuplicate (ArrayList<ArrayList<Integer>> p,
int startRow, int endRow, int startCol,
int endCol) {
List <Boolean> Present = new ArrayList<>(Collections.nCopies(p .size () + 1, false));
for (int i = startRow; i < endRow; ++i) {
for (int j = startCol; j < endCol; ++j) {
if (p.get(i).get(j) != 0 && Present.get(p.get(i).get(j))) {
return true ;
}
Present.set(p .get(i).get(j), true);
}
}
return false;
}

}
