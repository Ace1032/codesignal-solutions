package solutions;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.*;
import java.util.Random;

public class Quack_data_structure {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		DataInputStream in = new DataInputStream(System.in);
		Random random= new Random();
		int num=0;
		
		for(int i=0; i<10; i++) {
			list.add(random.nextInt(100));
		}
		Quack q= new Quack(list);
		
		System.out.println("enter an integer: ");
		try {
			num= Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("hell");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("hell");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("push");
		q.push(num);
		q.printList();
		System.out.println("pop");
		q.pop();
		q.printList();
		System.out.println("pull");
		q.pull();
		q.printList();

	}	

}




class Quack{
	
	Quack(ArrayList<Integer> list ){
		for(int i=0 ; i<list.size(); i++) {
			
			push(list.get(i));
		}
		printList();
		
	}
	
	private Node first=null;
	private Node last=null;
	class Node{
		int x;
		Node next=null;
		Node last=null;
	}	
	
	
	public void push(int x) {
		if(first==null) {
			Node temp= new Node();
			temp.x=x;
			first = temp;
			last= first;
			return;
		} else {
			Node temp= new Node();
			temp.x=x;
			temp.next= first;
			first= temp;
			return;
		}
		
	}
	
	public Integer pop() {
		int x=0;
		if(first == null) return 0;
		else {
			x=first.x;
			Node temp= first.next;
			first=temp;
		}
		
		return x;
	}
	
	public void pull() {
		//System.out.println(last.x);
		Node temp= first;
		while(temp != last) {
			temp=temp.next;
			//System.out.print(temp.x+ " ");
			if(temp.next== last) {
				last= temp;
				temp.next=null;
			}
		}
	}
	
	public void printList() {
		Node temp= first;
		while(temp != null) {
			System.out.print(temp.x + ", ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	
		
	}