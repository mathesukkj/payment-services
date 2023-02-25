package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(int number, LocalDate date, double totalValue, List<Installment> installments) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = installments;
    }

    public int getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

}
