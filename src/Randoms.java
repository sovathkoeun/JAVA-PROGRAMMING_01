
public class Randoms{
        public static void main(String[] args) {
        	int [] number = new int[15];
    		int count = 0;
    		String index = " ";
    		for(int i = 0 ;i < number.length;i++) {
    			int random = (int)(Math.random() * 11+0);
    			number[i] = random;
    			System.out.print(number[i]+" ");
    			if(number[i] == 5) {
    				count++;
    				index = index+i+" ";
    			}
    			
    		}
    		System.out.println();
    		if(count != 0) {
    			System.out.println("There aer " + count + "number 5 found in index as bellow:");
    			System.out.println("Index:" + index);
    		}else {
    			System.out.println("Number 5 not found!"); 	
     }
   }
} 