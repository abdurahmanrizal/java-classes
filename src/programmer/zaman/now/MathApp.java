package programmer.zaman.now;

public class MathApp {
    public static void main(String[] args) {
//        var min = Math.min(100,200);
//        var max = Math.max(100,200);
//        System.out.println(searchMaxNumber(100,2,10000,30000,5000,600));
        System.out.println(searchMaxProfit(44,30,24,32,35,30,40,38,15));
        System.out.println(searchMaxProfit(10,9,8,2));
    }



    public static Integer searchMaxNumber(int... numbers) {
        var maxNumber = 0;
        for(var i = 0; i < numbers.length; i++) {
            maxNumber = i == 0 ? numbers[i] : Math.max(maxNumber, numbers[i]);
        }
        return maxNumber;
    }

    public static Integer searchMaxProfit(int... stocks) {
        var maxProfit = -1;
        for(var i = 0; i < stocks.length; i++) {
            for(var j = 0; j < stocks.length; j++) {
                if(i == j) {
                    continue;
                }else {
                    if(stocks[j] > stocks[i]) {
                        maxProfit = i == 0 ? stocks[j] - stocks[i] : Math.max(maxProfit, (stocks[j] - stocks[i]));
                    }
                }
            }
            stocks[i] = 0;
        }
        return maxProfit;
    }
}
