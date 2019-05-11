package dezhoupuke;
import java.util.Scanner;
import java.util.Arrays;
class test  
{
	public static void main (String[] args) throws java.lang.Exception
	{  

		 Scanner scan = new Scanner(System.in);
		 int d=0;
		 while(d<3){//3 represent the number of commit  
		 d=d+1;
		 int l[]=new int[2];
		 int r[]=new int[2];
		 String o[]=new String[2];
		 int y=0;
		 int z=0;
		 while(z<2){
		 z=z+1;
		 
        int A[]=new int[5];
        String S[]=new String[5];
        int n=0;
        int u=1;
        int v=0;
        while (scan.hasNext()) {
            if(v==6){
                break;
            }
            String x= scan.next();
           
            if(u==1){
             u=u-1;   
            }
          else {
          String ten="10";
          String q = new String("");
          String w = new String("");
          if(x.substring(0,2).equals(ten)==true){
               q="10";
               w=x.substring(2);
          }
          else{
           q=x.substring(0,1);
           w=x.substring(1);
          }
         //String y = scan.next();
           //S[n]=w;
           
           String J="J";
           String Q="Q";
           String K="K";
           String AT="A";
           if(q.equals(J)==true){
           q="11";
           }
           else{
           if(q.equals(Q)==true){
           q="12";
           }
           else{
          if(q.equals(K)==true){
           q="13";
           } 
           else{
               if(q.equals(AT)==true){
                   q="14";
               }
           }
           }
           }
           Integer num=Integer.parseInt(q);
           A[n]=num;
           S[n]=w;
           //A[n]=y;
          //int i = x-'0';
          //System.out.println(A[n]); 
           //System.out.println(S[n]); 
            n=n+1;
        }//else
        v=v+1;    
        }//while
      
      Arrays.sort(A);

      int max=A[4];
     int B[]=new int[4];
     int m=0;
     int p=1;
     int f=1;//tonghua
     int h=1;//shunzi
     int R=0;
    for(int i=0;i<4;i++){
        B[i]=A[i]-A[i+1];
        
        if(S[i].equals(S[i+1])!=true){
            f=0;
        }
        
        
        if(B[i]!=-1){
            h=0;
        }
        if(B[i]==0){
            m=m+1;
        }
        else{
            B[i]=p;
            p=p+1;
        }
    }
    
    
    int C[]=new int[3];
    int k=0;
   
    
    for(int c=0;c<3;c++){
      C[c]=B[c]-B[c+1];
      if(C[c]==0){
         k=k+1;
      }
        
    }
    
    //fenlei
    if(m==3){
        if(k==1){R=7;o[y]="FULL HOUSE";
            //System.out.println("ºùÂ«"); 
        }
       else{R=8;o[y]="BOMB";
           // System.out.println("Õ¨µ¯"); 
       }
    }
   else{
       if(m==2){
           if(k==1){R=4;o[y]="THREE WITH a";
                //System.out.println("sange"); 
           }
        else{R=3;o[y]="TWO PAIRS";
             //System.out.println("liadui"); 
            }
       }
        else{
         if(m==1){R=2;o[y]="A PAIR";
             // System.out.println("yidui"); 
         }   
         else{
             if(h==1){
                
                if(f==1){R=9;o[y]="STRAIGHT FLUSH";
                 //System.out.println("contisamsuit"); 
                    
                }
                else{R=5;o[y]="STRAIGHT";
                  //System.out.println("continuous"); 
                }
             }
            else{
                if(f==1){R=6;o[y]="FLUSH";
                     //System.out.println("samesuit"); 
                }
                else{R=1;o[y]="LEAFLETS";
                     //System.out.println("laji"); 
                }
            } 
             
         }   
        }    
        
   }
   
   l[y]=max;
   r[y]=R;  
   //System.out.println(r[y]);
   y=y+1; //ÕâÀïy+1ÁË£¬notice when check output


 
}
   if(r[0]>r[1]){
       System.out.println("Blackwin: "+o[0]); 
   }
   else{
        if(r[0]<r[1]){
        System.out.println("Whitewin: "+o[1]);
   }
   else {
       if(l[0]>l[1]){
        System.out.println("Blackwin: "+o[0]); 
        }
       else{
           if(l[0]<l[1]){
            System.out.println("Whitewin: "+o[1]);
       }
       else{
            System.out.println("Tie");
       }
           
       }
   }       
   }      //ÅÐ¶Ï½áÊø
  
   
		 }   
        scan.close();

	}
	
} 