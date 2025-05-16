# PROG-5-USSD
This project simulates a USSD (Unstructured Supplementary Service Data) interface 0f Mvola and YAS.
It is developed in Java with maven, aims to reproduce a USSD menu system with multiple pages and options.

## Naming Conventions
To ensure consistency, this project follows standard Java naming conventions:

✅ Classes\
PascalCase \
Examples: InvalidChoice

✅ Methods\
camelCase \
Examples: displayMenuSosCredit

✅ Variables\
camelCase\
Examples: invalidChoice

✅ Packages\
lowercase, avoid underscores\
Examples: ussd.model

## Code Style and Linting
This project uses Checkstyle to enforce coding standards.\
Checkstyle Configuration: A custom checkstyle.xml file is used to define the style rules, such as:
Naming conventions , Javadoc presence , Indentation ,... \
The configuration is based on the Google Java Style Guide.

### How to Run Checkstyle
Using a build tool, we can  run Checkstyle via command line :

```bash
mvn checkstyle:check
```

📝 Note: 
- Maven  must be installed and configured to use these commands.
 
- We can also use Checkpoint IDEA

#### Any code style violations will be shown in the Checkstyle Results tool window with line numbers and rule names.

### 🔥 Example of a Violation
"Commentaire Javadoc manquant. (8:1) [MissingJavadocType] <Google Checks>"
