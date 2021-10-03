//Name-Harpreet Kaur Student id: A00245132
//Name-Amritpal Singh Pawar Student id:A00241707
//This program is to encrypt and decrypt the string and calculates the average of an array , finds the elements in the array and it also reverse the array.

import java.util.Scanner;

 class ArrayTool {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //created scanner class object
                                  System.out.print("Enter the string to encrypt : "); //print to indicate user to enter string
  	                String data=sc.next(); //input of string to encrypt
                                   System.out.print("Enter the value to encrypt : ");//print to indicate user to enter shift value
                                    int value=sc.nextInt(); //input of shift value
                                    String enc=encrypt(data,value); //calling encrypt method
                                   System.out.println("Encrypted string is : "+enc);
    
                                    System.out.println("Decrypting "+ enc +" with -"+value);
                                    System.out.println(data);
		System.out.print("Testing methods with :");
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		
		}
		
		
		float res=arrayAvg(arr); //calling arrayAvg method
		System.out.println("The Average value is :" +res);
		
		
		System.out.println("Enter the value to search for : ");
		int c=sc.nextInt();
		boolean b=arrayContains(arr,c); //calling arrayContains method
                                  if(b)
                                  System.out.println("Array contains "+c);
                                  else
		System.out.println("Array doesn't contain "+c);
		System.out.print("Reverse of array is: ");
		int[] rev=arrayReverse(arr); //calling arrayReverse method
		for(Integer a:rev) {
			System.out.print(a);
                                                   System.out.print(" ");
		}
		

	}

                  public static final String alph = "abcdefghijklmnopqrstuvwxyz";
    //String method to encrypt the data
   public static String encrypt( String data,int value) 
  {
    data=data.toLowerCase();
    String encData="";
   
   for(int i=0;i<data.length();i++)
   { 
    
     int mapValue = alph.indexOf(data.charAt(i));
            // value of each alphabet in integers like for A=0, B=1 ...
            int encValue = (value + mapValue) % 26;
            char ch = alph.charAt(encValue); // the character to be replaced
            encData = encData + ch; // adding to ciphertext
        }
        return encData; //returning the encrypted data
  } 
	// method to calculate avg of array values
	public static float arrayAvg(int[] arr) {
		int sum=0;
		float avg=0.0f;
		for(int i=0; i<10; i++) {
			sum=sum+arr[i];
		}
		avg=sum/10;
		return avg;
		
	}
	// method to check value contains in array
	public static boolean arrayContains(int[] arr,int a) {
		boolean temp=false;
		for(int i=0; i<arr.length; i++) {
			if(a==arr[i]) {
				temp=true;
			}
		}
		return temp;
		
	}
	// method to reverse array
	public static int[] arrayReverse(int[] arr) {
                                  int j=0;
		int[] arr1=new int[10];
		for(int i=10;i>0; i--,j++) {
			arr1[j]=arr[i-1];
			
		}
		return arr1;
		
	}

}
