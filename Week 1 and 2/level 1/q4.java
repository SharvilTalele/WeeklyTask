public static void main(){
    int cost = 129;
    int sell = 191;
    double profit = sell - cost;
    double perc = (profit/cost)*100;
    System.err.println("The cost price is INR " + cost + " and Selling Price is INR " + sell + "\nThe profit is INR " + profit + " and the profit percentage is "+ perc);
}