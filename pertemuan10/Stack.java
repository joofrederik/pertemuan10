package pertemuan10;

public class Stack {
	 public static void main(String[] args) {
	        StukturStack stack = new StukturStack(3);
	        System.out.println("#Sebelum push");
	        System.out.println("Size : " + stack.size());
	        System.out.println("Empty :" + stack.isEmpty());
	        System.out.println("Full : " + stack.isFull());
	        System.out.println("TOP : " + stack.TOP());
	        stack.display();
	        System.out.println("Melakukan push 3x:");
	        stack.push(1);
	        stack.push(4);
	        stack.push(2);
	        System.out.println("Size : " + stack.size());
	        System.out.println("Empty : " + stack.isEmpty());
	        System.out.println("Full : " + stack.isFull());
	        System.out.println("TOP : " + stack.TOP());
	        stack.display();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	      
	    }
	}
	
