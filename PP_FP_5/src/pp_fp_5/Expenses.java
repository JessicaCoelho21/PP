package pp_fp_5;

import java.util.Date;

public class Expenses {
    protected int number;
    protected String type;
    protected float value;
    protected Date data;
    
    Expenses (int tempNumber, String tempType, float tempValue, Date tempData){
        number = tempNumber;
        type = tempType;
        value = tempValue;
        data = tempData;
    }
    
    Expenses(int tempNumber, String tempType, float tempValue, Date tempData, String currencyType){
        if("Iene".equals(currencyType)){
           tempValue=tempValue*(float)CurrencyRates.Moeda[2][1];
        }
        
        if("Dolar".equals(currencyType)){
             tempValue=tempValue*(float)CurrencyRates.Moeda[0][1]; 
        }
        
        number = tempNumber;
        type = tempType;
        value = tempValue;
        data = tempData;
    }
}
