public class FlowerBed {
    public static void main(String[] args){
        int[] flowerBed = {1,0,0,0,1};
        int n = 2;
        boolean canPlace = canPlaceFlowers(flowerBed, n);
        if (canPlace) {
            System.out.println("Yes, "+n+" number of flowers can be planted.");
        }
    else{
        System.out.println("No, "+n+" number of flowers can not be planted.");
    }
    }

    public  static boolean canPlaceFlowers(int[] flowerBed, int n){
        boolean canPlace=false;
        int countFlower=0;
        for(int i = 0; i<flowerBed.length; i++){
            boolean rightEmpty=false;
            boolean leftEmpty=false;
            if (i==0 || flowerBed[i-1]==0) {
                leftEmpty=true;
            }
            if(i==flowerBed.length-1 || flowerBed[i+1]==0 ){
                rightEmpty=true;
            }
            if(rightEmpty && leftEmpty &&flowerBed[i]==0){
                countFlower++;
                flowerBed[i]=1;
            }
        }
        if (countFlower>=n) {
            canPlace= true;
        }
        return canPlace;
    }
}
