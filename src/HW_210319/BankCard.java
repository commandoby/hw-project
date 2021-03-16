package HW_210319;

import javax.xml.validation.Validator;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BankCard {

    //Создаём характеристики банковских карт
    private long cardNumber;
    private String cardType;
    private String cardowner;
    private GregorianCalendar cardExpiryDate;
    private int cardCVV;
    private boolean correct = true;

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardowner() {
        return cardowner;
    }

    public void setCardowner(String cardowner) {
        this.cardowner = cardowner;
    }

    public GregorianCalendar getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(int year, int month, int day) {
        this.cardExpiryDate = new GregorianCalendar(year, month, day);
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public BankCard(long cardNumber, String cardType, String cardowner, int year, int month, int day, int cardCVV) {
        setCardNumber(cardNumber);
        setCardType(cardType);
        setCardowner(cardowner);
        setCardExpiryDate(year, month, day);
        setCardCVV(cardCVV);
        correct = true;
    }

    //Валидатор карт
    public void cardValidator(BankCard bankCard) {
        final GregorianCalendar now = new GregorianCalendar();
        class ValidatorCard {
            {
                if (bankCard.cardNumber / 1000000000000L != 3355) {
                    bankCard.correct = false;
                    System.out.printf("Карта **%d имеет некорректный номер.\n", bankCard.cardNumber % 10000);
                }
                if (bankCard.cardType != "debit") {
                    bankCard.correct = false;
                    System.out.printf("Карта **%d не является дебетовой.\n", bankCard.cardNumber % 10000);
                }
                if (bankCard.cardowner == "") {
                    bankCard.correct = false;
                    System.out.printf("Карта **%d не имеет владельца.\n", bankCard.cardNumber % 10000);
                }
                if (bankCard.cardExpiryDate.get(Calendar.YEAR) <= now.get(Calendar.YEAR)) {
                    if (bankCard.cardExpiryDate.get(Calendar.MONTH) <= now.get(Calendar.MONTH)) {
                        if (bankCard.cardExpiryDate.get(Calendar.DATE) < now.get(Calendar.DATE)) {
                            bankCard.correct = false;
                            System.out.printf("У карты **%d вышел срок.\n", bankCard.cardNumber % 10000);
                        }
                    }
                }
                float chechCVV = (float) bankCard.cardCVV / 1000;
                if (chechCVV > 1) {
                    bankCard.correct = false;
                    System.out.printf("Карта **%d имеет не верный код CVV.\n", bankCard.cardNumber % 10000);
                }
                if (bankCard.correct) {
                    System.out.printf("Карта **%d корректна.\n", bankCard.cardNumber % 10000);
                }
            }
        }
        ValidatorCard validatorCard = new ValidatorCard();
    }
}
