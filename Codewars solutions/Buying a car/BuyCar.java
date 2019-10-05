/* A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy
 * the secondhand one.
 *
 * He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5 percent per month. Furthermore 
 * this percent of loss increases by 0.5 percent at the end of every two months. Our man finds it difficult to make all these calculations.
 *
 * How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?
 *
 * For more detail see: https://www.codewars.com/kata/554a44516729e4d80b000012
 */
 
public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    if (startPriceOld >= startPriceNew) return new int[] {0, (startPriceOld - startPriceNew)};
		
    int count = 0;
    double priceOld = startPriceOld;
    double priceNew = startPriceNew;
    int funds = 0;
    
    while (priceOld + funds < priceNew) {
        count++;
        if (count % 2 == 0) {
            percentLossByMonth += 0.5;
        }
        funds += savingperMonth;
        priceOld *= (100 - percentLossByMonth) / 100;
        priceNew *= (100 - percentLossByMonth) / 100;
        
        System.out.println("priceOld: " + priceOld);
        System.out.println("priceNew: " + priceNew);
        System.out.println("funds: " + funds);
    }        
    return new int[] {count, (int) Math.round(((priceOld + funds) - priceNew))};
  }
}
