class CurrencyTester{
public static void main(String args[]){

Currency currency =new Currency();
currency.countryCode = "IND";
currency.countryName = "India";
currency.currencyCode = "INR";
currency.unit="rupee";
currency.subUnit="paisa";
System.out.println(currency.countryCode + " " + currency.countryName + "  " + currency.currencyCode + " " + currency.unit + " " + currency.subUnit);


Currency currency1 =new Currency();
currency1.countryCode = "Afaghani";
currency1.countryName = "Afaganistan";
currency1.currencyCode = "AFN";
currency1.unit="puls";
currency1.subUnit="pul";
System.out.println(currency1.countryCode + " " + currency1.countryName + "  " + currency1.currencyCode + " " + currency1.unit + " " + currency.subUnit);


Currency currency2 =new Currency();
currency2.countryCode = "Euro";
currency2.countryName = "France";
currency2.currencyCode = "EUR";
currency2.unit="franc";
currency2.subUnit="centime";
System.out.println(currency2.countryCode + " " + currency2.countryName + "  " + currency2.currencyCode + " " + currency2.unit + " " + currency.subUnit);

Currency currency3 =new Currency();
currency3.countryCode = "yen";
currency3.countryName = "japan";
currency3.currencyCode = "JPY";
currency3.unit="yen";
currency3.subUnit="sen";
System.out.println(currency3.countryCode + " " + currency3.countryName + "  " + currency3.currencyCode + " " + currency3.unit + " " + currency3.subUnit);




}



}