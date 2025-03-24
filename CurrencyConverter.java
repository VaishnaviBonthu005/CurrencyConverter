import java.awt.*;
import java.awt.event.*;
import java.util.Optional;

public class CurrencyConverter extends Frame {

    Label label1, label2, label3;
    TextField inputField, outputField;
    Choice currencyChoice;
    Button convertButton;


    double inrToUsd = 0.012;  
    double inrToEur = 0.011;  
    double inrToSgp = 0.015;  
    double inrToPkr = 3.21;  
    double inrToJpn = 1.71;  
    double inrToInd = 188.16;
    double inrToAus = 0.018;  
    double inrToBgd = 1.39;  
    double inrToChn = 0.083;  

    public CurrencyConverter() {
        setTitle("Currency Converter");


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        label1 = new Label("Enter Amount in INR: ");
        label2 = new Label("Select Currency: ");
        label3 = new Label("Converted Amount: ");
        inputField = new TextField(20);
        outputField = new TextField(20);
        outputField.setEditable(false);
        //outputField.setBackground(Color.LIGHT_GRAY);
        convertButton = new Button("Convert");

        currencyChoice = new Choice();
        currencyChoice.add("USD (US Dollar)");
        currencyChoice.add("EUR (Euro)");
        currencyChoice.add("SGD (Singapore Dollar)");
        currencyChoice.add("PKR (Pakistani Rupee)");
        currencyChoice.add("JPY (Japanese Yen)");
        currencyChoice.add("IDR (Indonesian Rupiah)");
        currencyChoice.add("AUD (Australian Dollar)");
        currencyChoice.add("BDT (Bangladeshi Taka)");
        currencyChoice.add("CNY (Chinese Yuan)");


        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));
        outputField.setFont(new Font("Arial", Font.PLAIN, 16));
        convertButton.setFont(new Font("Arial", Font.BOLD, 16));
        convertButton.setBackground(new Color(70, 130, 180));
        convertButton.setForeground(Color.WHITE);


        gbc.gridx = 0;
        gbc.gridy = 0;
        add(label1, gbc);

        gbc.gridx = 1;
        add(inputField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label2, gbc);

        gbc.gridx = 1;
        add(currencyChoice, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(label3, gbc);

        gbc.gridx = 1;
        add(outputField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Make button span across both columns
        add(convertButton, gbc);

        convertButton.addActionListener(e -> {
            try {
                String inputText = inputField.getText();
                Optional<Double> amountInINR = parseAmount(inputText);
                amountInINR.ifPresent(amount -> {
                    String selectedCurrency = currencyChoice.getSelectedItem();
                    double convertedAmount = convertCurrency(selectedCurrency, amount);
                    outputField.setText(String.format("%.2f", convertedAmount));
                });


                if (!amountInINR.isPresent()) {
                    outputField.setText("Invalid Input");
                }

            } catch (Exception ex) {
                outputField.setText("Error");
            }
        });


        setSize(800, 600);  

        //setBackground(Color.PINK);

        setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private double convertCurrency(String selectedCurrency, double amountInINR) {
        switch (selectedCurrency) {
            case "USD (US Dollar)": return amountInINR * inrToUsd;
            case "EUR (Euro)": return amountInINR * inrToEur;
            case "SGD (Singapore Dollar)": return amountInINR * inrToSgp;
            case "PKR (Pakistani Rupee)": return amountInINR * inrToPkr;
            case "JPY (Japanese Yen)": return amountInINR * inrToJpn;
            case "IDR (Indonesian Rupiah)": return amountInINR * inrToInd;
            case "AUD (Australian Dollar)": return amountInINR * inrToAus;
            case "BDT (Bangladeshi Taka)": return amountInINR * inrToBgd;
            case "CNY (Chinese Yuan)": return amountInINR * inrToChn;
            default: return 0;
        }
    }

    // Method to parse the input amount and return an Optional<Double>
    private Optional<Double> parseAmount(String inputText) {
        try {
            double amount = Double.parseDouble(inputText);
            return amount > 0 ? Optional.of(amount) : Optional.empty();
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }


    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
