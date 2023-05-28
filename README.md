## EasyContactForms - A Backend for Contact Forms

Welcome to the readme file for the EasyContactForms program built with Spring Boot. This application allows you to store or forward contact form submissions via a REST endpoint. Below you will find important information regarding the setup and usage of the program.

### Functionality
The EasyContactForms Backend utilizes a REST endpoint to receive and process form submissions. The endpoint expects a POST request with the necessary fields for the contact form entry. Once a request is received, it will either be stored in a relational database or forwarded to the specified email address.

### Installation

1. Ensure that you have Java and Gradle installed on your system.

2. Clone the repository from [GitHub Repository URL].

3. Navigate to the project directory:

   ```
   cd easy-contact-forms
   ```

4. Build the system:

   ```
   gradle build
   ```

### Configuration

1. Open the "application.properties" file located in the src/main/resources directory.

2. Configure the following properties according to your requirements:

    - Specify the database connection URL, username, and password for storing the form submissions.
    - Set the email settings to forward submissions to a particular email address.
      - You will need an email account from which this application will send the contact requests to your destination email

### Usage

1. Start the application:

   ```
   gradle bootRun
   ```

2. The application will start on port 8080 by default. If you wish to change the port, update the "application.properties" file accordingly.

3. Send a POST request to the endpoint `http://localhost:8080/contact` with the required form data. Ensure that you include the correct fields and data format.

4. It is recommended to setup a proxy server to enable HTTPS. This is needed especially in context of the GDPR(General Data Protection Regulation) of the EU.

### Troubleshooting

- If you encounter any issues during installation or usage of the application, please check the error logs and console output for any error messages or warnings.

- Verify that all configuration parameters are set correctly, including the database connection and email settings.

### Contribution

We welcome contributions to improve this Kontaktformular Backend program. If you have any suggestions for improvement or have found any issues, please feel free to submit them in the form of pull requests or issues on [GitHub Repository URL].

### License

This program is licensed under the MIT license and is freely available for personal and commercial use.

### Contact

For any questions or inquiries, please contact [Your Name] at [Your Email Address].

Thank you for using EasyContactForms!

© 2023, Jan Korb