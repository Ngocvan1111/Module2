package furama_resort.services;

import furama_resort.models.Customer;

import java.util.List;

public interface IPromotionService {
    void displayCustomerListUseYearService();
    int[] offerPromotionalVouchers();
    void displayCustomerListGetVoucher();
    List<String> CustomerListUseYearService();
}
