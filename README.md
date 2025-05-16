# 🚀 PROG-5-USSD

This project simulates a USSD (Unstructured Supplementary Service Data) interface similar to Mvola and YAS.  
It is developed in **Java** using **Maven**, and aims to reproduce a USSD menu system with multiple pages and interactive options.

---

## ✍️ Naming Conventions

To ensure consistency, the project follows standard Java naming conventions:

| Type        | Convention              | Example                |
|-------------|-------------------------|------------------------|
| ✅ Classes   | `PascalCase`            | `InvalidChoice`        |
| ✅ Methods   | `camelCase`             | `displayMenuSosCredit` |
| ✅ Variables | `camelCase`             | `invalidChoice`        |
| ✅ Packages  | lowercase (no `_`)      | `ussd.model`           |

---

## 🎯 Code Style and Linting

This project uses **Checkstyle** to enforce coding standards.  
A custom `checkstyle.xml` file is used to define the rules, including:

- Naming conventions
- Presence of Javadoc comments
- Indentation
- And more...

The configuration is based on the **Google Java Style Guide**.

---

### 🔧 How to Run Checkstyle

You can run Checkstyle from the command line using Maven:

```bash
mvn checkstyle:check
```


📝 **Note**:
- **Maven** must be installed and properly configured on your machine to use the command above.
- You can also use the **Checkstyle plugin** available in **IntelliJ IDEA** (or other supported IDEs) to run checks directly within the editor.

---

### 🧪 Viewing Checkstyle Violations

Any code style violations will be displayed in the **Checkstyle Results** tool window, along with:

- The **line number** where the issue occurs
- The **type of rule** that was violated
- A **description** of the problem

---

### 🔥 Example of a Violation

Missing Javadoc comment. (8:1) [MissingJavadocType] <Google Checks>
