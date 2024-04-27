package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewRoadSystem {

	public static void main(String[] args) {
		Boolean[][] roadRegister = {{false, true,  false, false},
		                {false, false, true,  false},
		                {true,  false, false, true },
		                {false, false, true,  false}};
		
		System.out.println(solution(roadRegister));
	}
	
	public static boolean solution(Boolean[][] roadRegister) {
		Map<Integer, city> list= new HashMap<Integer, city>();
		
		
		for(int i=0; i< roadRegister.length; i++) {
			for(int j=0; j<roadRegister[i].length; j++) {
				if(roadRegister[i][j] == true) {
					
					if( list.get(i) == null ) {
						city c= new city();
						c.setOut(1);
						list.put(i, c);
					}else {
						city c= list.get(i);
						int t= c.getOut();
						c.setOut(t+1);
					}
					
					if(list.get(j)==null) {
						city c= new city();
						c.setIn(1);
						list.put(j, c);
					}else {
						city c= list.get(j);
						int t= c.getIn();
						c.setIn(t+1);
					}
						
				}
				
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getIn() !=list.get(i).getOut() ) {
				return false;
			}
		}
		
		
		return true;

}

}

class city{
	@Override
	public String toString() {
		return "city [out=" + out + ", in=" + in + "]";
	}
	int out=0;
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	int in=0;
	
}
