package atelier8;
	
	 public LancerD() {
		
				static int lancerDe(){
					return (int) (Math.random()*6+1);
				}
				//affich: affiche dans un AffichagePPM le dé obtenu
				static ImagePPM im;
				static void affich(int d){
					if (d==1){
						try{
							im=new ImagePPM("face1.ppm");
						}catch(Exception e){}
					}
					else if(d==2){
						try{
							im=new ImagePPM("face2.ppm");
						}catch(Exception e){}
					}
					else if(d==3){
						try{
							im=new ImagePPM("face3.ppm");
						}catch(Exception e){}
					}
					else if(d==4){
						try{
							im=new ImagePPM("face4.ppm");
						}catch(Exception e){}
					}
					else if(d==5){
						try{
							im=new ImagePPM("face5.ppm");
						}catch(Exception e){}
					}
					else if(d==6){
						try{
							im=new ImagePPM("face6.ppm");
						}catch(Exception e){}
					}
					new AffichagePPM(im);
				}
				//les 3 joueurs lancent un dé,le plus petit commmence
				static int[] j=new int[3];
				static String[] atontour=new String[3];
				static void debut(){
					do{
						for (int i=0;i<3;i++){
							Terminal.ecrireString("Joueur "+(i+1)+": lancer un Dé");
							Terminal.lireString();
							j[i]=lancerDe();
							Terminal.ecrireStringln("Joueur"+(i+1)+": ");
							affich(j[i]);
						}
						if (Math.min(j[0],j[1])==j[0] && Math.min(j[0],j[2])==j[0]){
							atontour[0]="joueur 1";
							atontour[1]="joueur 2";
							atontour[2]="joueur 3";
						}
						else if(Math.min(j[0],j[1])==j[1] && Math.min(j[1],j[2])==j[1]){
							atontour[0]="joueur 2";
							atontour[1]="joueur 3";
							atontour[2]="joueur 1";
						}
						else if(Math.min(j[0],j[2])==j[2] && Math.min(j[1],j[2])==j[2]){
							atontour[0]="joueur 3";
							atontour[1]="joueur 1";
							atontour[2]="joueur 2";
						}
						else if(j[0]==j[1] && (Math.min(j[0],j[2])==j[2] )){
							atontour[0]="joueur 3";
							atontour[1]="joueur 1";
							atontour[2]="joueur 2";
						}
						else if(j[1]==j[2] && (Math.min(j[0],j[1])==j[0])){
							atontour[0]="joueur 1";
							atontour[1]="joueur 2";
							atontour[2]="joueur 3";
						}
						else if(j[0]==j[2] && (Math.min(j[0],j[1])==j[1])){
							atontour[0]="joueur 2";
							atontour[1]="joueur 3";
							atontour[2]="joueur 1";
						}
					}
					while ((j[0]==j[1]) && (Math.min(j[0],j[2])==j[0])
							|| (j[0]==j[2]) && (Math.min(j[0],j[1])==j[0])
							|| (j[1]==j[2]) && (Math.min(j[0],j[2])==j[2]));
			
						Terminal.ecrireStringln(atontour[0]+" commence");
				}
				//1er tour, le premier lance 3 dés
				static int[] trois=new int[3];
				static int[] lancerTroisDes(){
			
					trois[0]=lancerDe();
					trois[1]=lancerDe();
					trois[2]=lancerDe();
					return trois;
				}
				//les 3 dés sont triés par ordre décroissant dans une combinaison(String) 
				static String ci;
				static String comb(int[] trois) {
					ci="";
					if (Math.max(trois[0],trois[1])==trois[0] && Math.max(trois[0],trois[2])==trois[0]){
						ci=ci+trois[0];
						if (Math.max(trois[1],trois[2])==trois[1])
								ci=ci+trois[1]+trois[2];
						else if(Math.max(trois[1],trois[2])==trois[2])
							ci=ci+trois[2]+trois[1];
					}
					else if (Math.max(trois[0],trois[1])==trois[1] && Math.max(trois[1],trois[2])==trois[1]){
						ci=ci+trois[1];
						if (Math.max(trois[0],trois[2])==trois[0])
							ci=ci+trois[0]+trois[2];
						else if (Math.max(trois[0],trois[2])==trois[2])
							ci=ci+trois[2]+trois[0];
					}
					else if(Math.max(trois[0],trois[2])==trois[2] && Math.max(trois[2],trois[1])==trois[2]){
						ci=ci+trois[2];
						if(Math.max(trois[0],trois[1])==trois[0])
							ci=ci+trois[0]+trois[1];
						else if(Math.max(trois[0],trois[1])==trois[1])
							ci=ci+trois[1]+trois[0];
					}
					return ci;
				}
				//1er tour
			
				//lance 3dés, les affichent et renvoie la combinaison
				static int[] first=new int[3];
				static int n=0;
				static int m=1;
				static int p=2;
				static String pTour(String atontour[],int n){
					first=lancerTroisDes();
					Terminal.ecrireString(atontour[n]+ " lancer 3 dés");
					Terminal.lireString();
			
					affich(first[0]);
					affich(first[1]);
					affich(first[2]);
			
					String rep=comb(first);
					Terminal.ecrireStringln(atontour[n]+" a fait "+rep);
					return rep;
					}
				//on compare la combinaison aux regles
				static int fiches;
				static int regle(String ci){
					if (ci.equals("211")){
						Terminal.ecrireStringln("2 fiches");
						fiches=2;
					}
					else if (ci.equals("311")){
						Terminal.ecrireStringln("3 fiches");
						fiches=3;
					}
					else if (ci.equals("411")){
						Terminal.ecrireStringln("4 fiches");
						fiches=4;
					}
					else if (ci.equals("511")){
						Terminal.ecrireStringln("5 fiches");
						fiches=5;
					}
					else if (ci.equals("611")){
						Terminal.ecrireStringln("3 fiches");
						fiches=3;
					}
					else if (ci.equals("222")){
						Terminal.ecrireStringln("2 fiches");
						fiches=2;
					}
					else if (ci.equals("333")){
						Terminal.ecrireStringln("3 fiches");
						fiches=3;
					}
					else if (ci.equals("444")){
						Terminal.ecrireStringln("4 fiches");
						fiches=4;
					}
					else if (ci.equals("555")){
						Terminal.ecrireStringln("5 fiches");
						fiches=5;
					}
					else if (ci.equals("666")){
						Terminal.ecrireStringln("6 fiches");
						fiches=6;
					}
					else if (ci.equals("421")){
						Terminal.ecrireStringln("8 fiches");
						fiches=8;
					}
					else if(ci.equals("111")){
						Terminal.ecrireStringln("7 fiches");
						fiches=7;
					}
					else if(ci.equals("654") || ci.equals("543") || ci.equals("432") || ci.equals("321")){
						Terminal.ecrireStringln("2 fiches");
						fiches=2;
					}
					else if (ci.equals("221")){
						Terminal.ecrireStringln("Nenette");
						fiches=1;
					}
					else {
						Terminal.ecrireStringln("1 fiche");
						fiches=1;
					}
					return fiches;
				}
				//on compare les combinaisons des 3 joueurs entre elles
				static int banq=11;
				static String a=null;static String b=null;static String c=null;
				static int r1=0;static int r2=0;static int r3=0;
				static int b1=0;static int b2=0;static int b3=0;
				static int g1=0;static int g2=0;static int g3=0;//fiches des joueurs
				static void resultat(String a,String b,String c){
					if (r1>r2 && r1>r3 && r2>r3){
						Terminal.ecrireStringln(atontour[2]+" perd : "+r1+" fiches");
						g3=g3+r1;
						banq=banq-r1;
						n=2;m=0;p=1;
					}
					else if((r1>r2 && r1>r3 && r3>r2)||(r3==r1 && r3>r2)){
						Terminal.ecrireStringln(atontour[1]+" perd : "+r1+" fiches");
						g2=g2+r1;
						banq=banq-r1;
						n=1;m=2;p=0;
					}
					else if((r2>r1 && r2>r3 && r1>r3)||(r1==r2 && r1>r3)){
						Terminal.ecrireStringln(atontour[2]+" perd : "+r2+" fiches");
						g3=g3+r2;
						banq=banq-r2;
						n=2;m=0;p=1;
					}
					else if(r2>r1 && r2>r3 && r3>r1){
						Terminal.ecrireStringln(atontour[0]+" perd : "+r2+" fiches");
						g1=g1+r2;
						banq=banq-r2;
						n=0;m=1;p=2;
					}
					else if(r3>r1 && r3>r2 && r1>r2){
						Terminal.ecrireStringln(atontour[1]+" perd : "+r3+" fiches");
						g2=g2+r3;
						banq=banq-r3;
						n=1;m=2;p=0;
					}
					else if((r3>r1 && r3>r2 && r2>r1)||(r3==r2 && r2>r1)){
						Terminal.ecrireStringln(atontour[0]+" perd : "+r3+" fiches");
						g1=g1+r3;
						banq=banq-r3;
						n=0;m=1;p=2;
					}
					else if (r1==r2 && r1==r3){
						if (b1>b2 && b1>b3 && b2>b3){
							Terminal.ecrireStringln(atontour[2]+" perd : "+r3+" fiches");
							g3=g3+r3;
							banq=banq-r3;
							n=2;m=0;p=1;
						}
						else if (b1>b2 && b1>b3 && b3>b2){
							Terminal.ecrireStringln(atontour[1]+" perd : "+r2+" fiches");
							g2=g2+r2;
							banq=banq-r2;
							n=1;m=2;p=0;
						}
						else if (b2>b1 && b2>b3 && b1>b3){
							Terminal.ecrireStringln(atontour[2]+" perd : "+r3+" fiches");
							g3=g3+r3;
							banq=banq-r3;
							n=2;m=0;p=1;
						}
						else if (b2>b1 && b2>b3 && b3>b1){
							Terminal.ecrireStringln(atontour[0]+" perd : "+r1+" fiches");
							g1=g1+r1;
							banq=banq-r1;
							n=0;m=1;p=2;
						}
						else if (b3>b1 && b3>b2 && b1>b2){
							Terminal.ecrireStringln(atontour[1]+" perd : "+r2+" fiches");
							g2=g2+r2;
							banq=banq-r2;
							n=1;m=2;p=0;
						}
						else if (b3>b1 && b3>b2 && b2>b1){
							Terminal.ecrireStringln(atontour[0]+" perd : "+r1+" fiches");
							g1=g1+r1;
							banq=banq-r1;
							n=0;m=1;p=2;
						}
					}
					else if(r2==r3 && r1>r2){
						if (b2>b3){
							Terminal.ecrireStringln(atontour[2]+" perd : "+r1+" fiches");
							g3=g3+r1;
							banq=banq-r1;
							n=2;m=0;p=1;
						}
						else if (b3>b2){
							Terminal.ecrireStringln(atontour[1]+" perd : "+r1+" fiches");
							g2=g2+r1;
							banq=banq-r1;
							n=1;m=2;p=0;
						}
						else
							Terminal.ecrireStringln("Main chaude");
					}
					else if (r1==r2 && r3>r1){
						if (b1>b2){
							Terminal.ecrireStringln(atontour[1]+" perd : "+r3+" fiches");
							g2=g2+r3;
							banq=banq-r3;
							n=1;m=2;p=0;
						}
						else if (b2>b1){
							Terminal.ecrireStringln(atontour[0]+" perd : "+r3+" fiches");
							g1=g1+r3;
							banq=banq-r3;
							n=0;m=1;p=2;
						}
						else
							Terminal.ecrireStringln("Main chaude");
					}
					else if(r3==r1 && r2>r3){
						if(b3>b1){
							Terminal.ecrireStringln(atontour[0]+" perd : "+r2+" fiches");
							g1=g1+r2;
							banq=banq-r2;
							n=0;m=1;p=2;
						}
						else if(b1>b3){
							Terminal.ecrireStringln(atontour[2]+" perd : "+r2+" fiches");
							g3=g3+r2;
							banq=banq-r2;
							n=2;m=0;p=1;
						}
						else
							Terminal.ecrireStringln("Main chaude");
					}
				} 
				//2eme tour
			
				//menu: le joueur decide s'il laisse sec relance 1 ou 2 dés
				static void menu(){
					Terminal.ecrireStringln("Que voulez vous faire ?");
					Terminal.ecrireStringln("1: laissez sec");
					Terminal.ecrireStringln("2: Relancer 1 dé");
					Terminal.ecrireStringln("3: Relancer 2 dés");
					Terminal.ecrireStringln("4: Relancer Tout");
				}
				//la reponse doit etre comprise entre 1 et 4
				static int reponse(){
					int res=0;
					do{
						Terminal.ecrireString("Entrez votre choix: ");
						try{
							res=Terminal.lireInt();
						}catch(TerminalException te){
							Terminal.ecrireStringln("veuillez entrer un nombre entier entre 1 et 4");
						}
						if (res<1 || res>4){
							Terminal.ecrireStringln("veuillez entrer un nombre entier entre 1 et 4");
					}
					}while (res<1 || res>4);
					return res;
				}
				static int y=3;
				static void exec (int i){
					if (i==1){
						Terminal.ecrireString(atontour[m]+" lancer 3 dés");
						y=0;
					}
					if(i==2){
						Terminal.ecrireStringln("Quel dés voulez vous relancer ?");
						Terminal.ecrireStringln("1 : 1 & 2 ?");
						Terminal.ecrireStringln("2 : 2 & 3 ?");
						Terminal.ecrireStringln("3 : 1 & 3 ?");
						int t=Terminal.lireInt();
						do{
							if (t==1){
								first[0]=lancerDe();
								first[1]=lancerDe();
							}
							else if (t==2){
								first[1]=lancerDe();
								first[2]=lancerDe();
							}
							else if (t==3){
								first[0]=lancerDe();
								first[2]=lancerDe();
							}
						}while(t!=1||t!=2||t!=3);
						y--;
						//a completer
					}
					if(i==3){
						Terminal.ecrireString("Quel dé voulez vous relancer ?");
						Terminal.ecrireString("1 ?");
						Terminal.ecrireString("2 ?");
						Terminal.ecrireString("3 ?");
						int t=Terminal.lireInt();
						do{
							if (t==1)
								first[0]=lancerDe();
							else if (t==2)
								first[1]=lancerDe();
							else if (t==3)
								first[2]=lancerDe();
						}while(t!=1||t!=2||t!=3);
						y--;
						//a completer
					}
					if (i==4){
						a=pTour(atontour,n);
						y--;
						//a suivre
					}
				}
				public static void main(String[] argv){
					debut();
					//1er tour
					do{
						//1er joueur
						a=pTour(atontour,n);
						r1=regle(a);
						b1=Integer.parseInt(a);
						//2eme joueur
						b=pTour(atontour,m);
						r2=regle(b);
						b2=Integer.parseInt(b);
						//3eme joueur
						c=pTour(atontour,p);
						r3=regle(c);
						b3=Integer.parseInt(c);
			
						resultat(a,b,c);
					}while(banq>0);
					//2eme tour	
					Terminal.ecrireStringln("La banque est vide, le 2ème tour commence");
					//1er joueur
			
					do{
						a=pTour(atontour,n);
						menu();
						exec(reponse());
						a=comb(first);
						Terminal.ecrireStringln(atontour[n]+" a fait "+a);
						affich(first[0]);
						affich(first[1]);
						affich(first[2]);
						r1=regle(a);
					}while(y>0);
				}
			
	}

