 package conditions;
 
 public class exo4 {
	 
 

	public static void main(String[] args) {
	int  p1=10, p2=9, p3=-1, p4=4, p5=8;     
		int p6=0;
	// touvons la medianne en ultilsant le min max
		
		if (p1 < p2) {
			if (p3 < p1)
				p6 = p1;
			else {
				if (p2 < p3)
					p6 = p2;
				else
					p6 = p1;
			

			}

		} else {
			if (p3 < p2)
				p6 = p2;
			else {
				if (p1 > p3)
					p6 = p3;
				else
					p6 = p1;
			}}
				
				if(p3<p1) {         
					if (p1<p4)
						p6=p1;                     
					else {         
						if (p3<p4)
							p6=p4;                  
						else       
							p6=p3;
					}}
						
						if (p3<p2) {
							if (p3<p5) {
								if (p1<p5)
									p6=p1;              
								else         
									p6=p5; 
							}}
								          
								if (p4<p5) {
									if (p1<p2) {
										if (p5<p3) {
											if (p3<p1)
												p6=p3;
										}}}
				System.out.println(p6);
	}}
	
			

