/*Given an array of type int, print true if every element is 1 or 4. 
Solution:
*/
class Main {
	public static void main(String[] args) {
int[] array= {1, 4, 2, 4};
		int n = array.length;
		int f=1;
  		for (int i = 0; i < n; i++) 
{
    			if (array[i] == 4 || array[i] == 1)
 {
      				continue;
      			}
      			else 
      			{
      				f=0;
      				break;
      			}
    		}
		System.out.print(f==1?true:false);
}
}
//1-Input – [1,4,1,4]
//2-Input – [1,4,2,4]
