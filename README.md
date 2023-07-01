# Customer Data Saving Tool

This Java program, `CustomerDataSavingTool`, is designed to provide a graphical user interface (GUI) for saving customer data. It allows users to input customer information such as name, email, age, and location, and then saves and displays the entered data.

## Features

- GUI Interface: The program utilizes Swing components to create a user-friendly interface for data input and display.
- Input Fields: Text fields are provided for entering customer name and email.
- Age Spinner: A spinner component allows users to select the age within a specified range (0 to 150 years) with a step size of 1.
- Location Selection: A dropdown combo box enables the selection of customer location from a list of predefined options.
- Submit Button: The "Submit" button triggers the saving and display of the entered customer data.
- Data Validation: The program validates the entered age and displays an error message if it exceeds the maximum limit of 100.
- Message Dialog: After submitting the data, a message dialog box displays the entered customer information.

## Usage

1. Run the program by executing the `main` method in the `CustomerDataSavingTool` class.
2. The GUI window titled "Customer Data" will appear.
3. Enter the customer's name, email, age, and select the location.
4. Click the "Submit" button to save and display the customer data.
5. If an invalid age (greater than 100) is entered, an error message will be shown.
6. The program will display a message dialog box with the saved customer data, including name, email, age, and location.

Feel free to explore and utilize this `CustomerDataSavingTool` to efficiently collect and save customer information.
