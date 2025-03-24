# Currency Converter

## Overview

This project is a simple Java-based **Currency Converter** application that allows users to convert an amount from **Indian Rupees (INR)** to various other currencies. The application provides a graphical user interface (GUI) built using Java's AWT (Abstract Window Toolkit) library.

## Features

- **User-Friendly Interface**: The application provides a clean and intuitive interface for users to input an amount in INR and select the target currency.
- **Multiple Currencies**: Supports conversion to the following currencies:
  - USD (US Dollar)
  - EUR (Euro)
  - SGD (Singapore Dollar)
  - PKR (Pakistani Rupee)
  - JPY (Japanese Yen)
  - IDR (Indonesian Rupiah)
  - AUD (Australian Dollar)
  - BDT (Bangladeshi Taka)
  - CNY (Chinese Yuan)
- **Real-Time Conversion**: Converts the amount instantly when the user clicks the "Convert" button.
- **Error Handling**: Handles invalid input gracefully by displaying appropriate error messages.

## How to Use

1. **Enter Amount**: Input the amount you want to convert in the "Enter Amount in INR" field.
2. **Select Currency**: Choose the target currency from the dropdown menu.
3. **Convert**: Click the "Convert" button to see the converted amount in the "Converted Amount" field.
4. **Reset**: To perform another conversion, simply change the amount or select a different currency and click "Convert" again.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK installed on your system.
- **IDE**: You can use any Java IDE (e.g., IntelliJ IDEA, Eclipse) or compile and run the program using the command line.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/currency-converter.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd currency-converter
   ```
3. **Compile the Java File**:
   ```bash
   javac CurrencyConverter.java
   ```
4. **Run the Application**:
   ```bash
   java CurrencyConverter
   ```

## Code Structure

- **CurrencyConverter.java**: The main Java file containing the GUI implementation and currency conversion logic.
  - **Labels**: `label1`, `label2`, `label3` for displaying instructions.
  - **Text Fields**: `inputField` for user input and `outputField` for displaying the converted amount.
  - **Choice Menu**: `currencyChoice` for selecting the target currency.
  - **Convert Button**: `convertButton` to trigger the conversion.
  - **Conversion Rates**: Predefined conversion rates for various currencies.
  - **ActionListener**: Handles the button click event and performs the conversion.

## Customization

- **Add More Currencies**: To add more currencies, simply add a new entry in the `currencyChoice` dropdown and update the `convertCurrency` method with the corresponding conversion rate.
- **Change Conversion Rates**: Update the conversion rates in the code as per the latest exchange rates.

## Contributing

Contributions are welcome! If you have any suggestions, bug reports, or feature requests, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to Java AWT for providing the tools to create this GUI application.
- Inspired by the need for a simple and efficient currency conversion tool.

---
