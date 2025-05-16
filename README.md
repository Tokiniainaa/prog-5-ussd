# prog-5-ussd
This project simulates a USSD (Unstructured Supplementary Service Data) interface 0f Mvola and YAS.
It is developed in Java, aims to reproduce a USSD menu system with multiple pages and options.

## Naming Conventions
To ensure consistency, this project follows standard Java naming conventions:

✅ Classes

PascalCase (each word starts with a capital letter)

Examples:

InvalidChoice, RapelleMoi, ServiceYas

✅ Methods

camelCase (starts with a lowercase letter, then capital letters for new words)

Examples:

displayMenuSosCredit, showMenuServiceYas

✅ Variables

camelCase

Clear, descriptive names

Examples:

invalidChoice, page

✅ Packages

lowercase, avoid underscores

Use reverse-domain naming if applicable

Examples:

ussd.service,ussd.model

## Code Style and Linting
This project uses Checkstyle to enforce coding standards and ensure code consistency.

🔧 Tool Used: We use the Checkstyle-IDEA plugin integrated with IntelliJ IDEA.

📄 Checkstyle Configuration: A custom checkstyle.xml file is used to define the style rules, such as:

Naming conventions

Javadoc presence

Indentation

Method and class structure

This configuration is based on the Google Java Style Guide (or Sun Style, depending on the setup).

### How to Run Checkstyle
In IntelliJ IDEA:
Go to Settings → Plugins, search for Checkstyle-IDEA, install it and restart IntelliJ.

### Configure the plugin:

Go to Settings → Tools → Checkstyle

Click + to add a new configuration

Select your checkstyle.xml file

Set it as the default configuration

To run Checkstyle:

Right-click on a file, package, or directory (e.g. src)

Select: Checkstyle → Check Code with Checkstyle

### With Build Tools (optional):
If you're using a build tool, you can also run Checkstyle via command line:

With Maven:
mvn checkstyle:check

With Gradle:
./gradlew checkstyle
📝 Note: Maven or Gradle must be installed and configured to use these commands.
Any code style violations will be shown in the Checkstyle Results tool window with line numbers and rule names.

### 🔥 Example of a Violation
 ."Commentaire Javadoc manquant. (8:1) [MissingJavadocType] <Google Checks>"
 ."'member def modifier' au niveau d'indentation 4 n'est pas indenté correctement, le niveau attendu est 2. (12:5) [Indentation] <Google Checks>"
