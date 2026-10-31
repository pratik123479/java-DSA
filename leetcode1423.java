public class leetcode1423{
    public static void main(String[] args) {
        int cardPoints[]={100,40,17,9,73,75};
        int k=3;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
           sum=sum+cardPoints[i];
        }
        maxsum=sum;
        for(int i=1;i<=k;i++){
            sum=sum-cardPoints[k-i];
            sum=sum+cardPoints[cardPoints.length-i];

            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
}
