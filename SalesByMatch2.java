import java.util.List;

public class SalesByMatch2 {
    public static void main(String[] args) {
        
        List<Integer> ar= List.of(10,10,20,30,10,40,30);
        int[] in=ar.stream().mapToInt(Integer::intValue).toArray();
        int[] temp=new int[in.length];
        int i=0;
        int k=0;
        int pair=0;
        
 aa:
        for(i=0;i<in.length-1;i++){
            int count=1;
            i=0;
            k=0;
            bb:
            for(int j=i+1;j<in.length;j++){
                
                if(in[i]==in[j]){
                    count=count+1;
                }else if(in[i]!=in[j] && in.length > 2){
                    temp[k]=in[j];
                    k++;
                }else if (in[i]!=in[j] && in.length < 2){
                    break aa;

                }
            }
            
            in=temp.clone();
           for (int t : in) {
               System.out.println(t);
           }

            pair=count / 2;
            
            

        
        }

        System.out.println(pair);
    }
}
