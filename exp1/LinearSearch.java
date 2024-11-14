public classTest
{
 public static int LinearSearch(int[] data,int key){
  for(int i=0;i<data.length;i++){
   if(data[i]==key){
    return i;
   }
  }
  return -1;
 }
 public static void main(String args[]){
  int[] data={50,27,30,50,70,9,19};
  int key=9;
  System.out.println(key+" is found at index:"+LinearSearch(data,key));
 }
}