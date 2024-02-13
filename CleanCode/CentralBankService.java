package CleanCode;

public class CentralBankService implements BankService {
    @Override
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.0; //usd 30

    }

}