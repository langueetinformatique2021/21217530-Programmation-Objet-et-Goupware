package jordanne;

public class td4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int p1 =10 , p2= 9 , p3 = -1 ,p4=4 , p5 = 8;
          int p6;


  		if (p1 < p2) {
  			if (p3 < p1)
  				p4 = p1;
  			else {
  				if (p2 < p3)
  					p4 = p2;
  				else
  					p4 = p1;

  			}

  		} else {
  			if (p3 < p2)
  				p4 = p2;
  			else {
  				if (p1 > p3)
  					p4 = p3;
  				else
  					p4 = p1;

  			}

  		}

  		System.out.println(p6);

  	}

  }
