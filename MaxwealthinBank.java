public class MaxwealthinBank {
    public static int maxWealth(int[][] accounts){
        int maximumWealth =0;
        for(int i=0; i<accounts.length; i++){
            int currentWealth =0;
            for(int j =0; j<accounts[i].length; j++){
                currentWealth+=accounts[i][j];
            }
            System.out.println("Customer with ID :" +(i+1)+" has wealth: " +currentWealth);
            if(currentWealth>maximumWealth){
                maximumWealth=currentWealth;
            }
        }
        return maximumWealth;
    }
    public static void main(String[] args) {
        int[][] accounts = { {1,4,3},{6,2,1},{2,5}};
        int maxWealth = maxWealth(accounts);
        System.out.println("The maximum wealth is: " + maxWealth);
        }
    }