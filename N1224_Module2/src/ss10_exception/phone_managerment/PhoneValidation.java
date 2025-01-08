package ss10_exception.phone_managerment;

import ss10_exception.exception.EmptyFieldException;
import ss10_exception.validation.CommonValidation;

import java.util.Scanner;

public class PhoneValidation {
    public static final Scanner scanner = new Scanner(System.in);

    public static String inputName(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String name = scanner.nextLine();

                CommonValidation.validationIsEmpty(name, fieldName);
                return name;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại!");
            }
        }
    }

    public static double inputPrice(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String priceStr = scanner.nextLine();

                CommonValidation.validationIsEmpty(priceStr, fieldName);
                double price = Double.parseDouble(priceStr);
                CommonValidation.validateIsNegativeNumber(price, fieldName);

                return price;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại!");
            }
        }
    }

    public static int inputWarranty(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s: ", fieldName);
                String warrantyStr = scanner.nextLine();

                CommonValidation.validationIsEmpty(warrantyStr, fieldName);
                int warranty = CommonValidation.parseInt(warrantyStr, fieldName);
                CommonValidation.validateIsNegativeNumber(warranty, fieldName);
                return warranty;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại !");
            }
        }
    }

    public static String inputManufacturer(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s: ", fieldName);
                String manufacturer = scanner.nextLine();

                CommonValidation.validationIsEmpty(manufacturer, fieldName);
                return manufacturer;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại !");
            }

        }
    }

    public static Integer inputBatteryPercentage(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s: ", fieldName);
                String batteryPercentageStr = scanner.nextLine();

                CommonValidation.validationIsEmpty(batteryPercentageStr, fieldName);
                int batteryPercentage = CommonValidation.parseInt(batteryPercentageStr, fieldName);
                CommonValidation.validationNumberOutOfRangeException(batteryPercentage, fieldName, 0, 100);
                return batteryPercentage;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại !");
            }
        }
    }

    public static String inputDescription(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s: ", fieldName);
                String description = scanner.nextLine();

                CommonValidation.validationIsEmpty(description, fieldName);
                CommonValidation.validateMinLength(description, fieldName, 10);
                return description;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại !");
            }
        }
    }

    public static Integer inputQuantity(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s: ", fieldName);
                String quantityStr = scanner.nextLine();

                CommonValidation.validationIsEmpty(quantityStr, fieldName);
                int quantity = CommonValidation.parseInt(quantityStr, fieldName);
                CommonValidation.validateIsNegativeNumber(quantity, fieldName);
                return quantity;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Xin nhập lại !");
            }
        }
    }
}
