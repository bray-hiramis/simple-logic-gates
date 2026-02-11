# 🕹️ Simple Logic Gates

A lightweight logic gate simulator built with **Java** and **JavaFX**, designed using **Scene Builder**. This tool allows users to visualize and interact with fundamental boolean logic components.

---

## 🖼️ Preview

| Static Screenshot | Animated Demo |
| :--- | :--- |
| ![Logic Gates](/screenshots/logicgates_screenshot.png) | ![Logic Gates GIF](/screenshots/demo-logicgates.gif) |

---

## 🛠️ Prerequisites

Before running the application, ensure you have the following installed:

* **JDK 25** (or compatible version)
* **IDE** (e.g., Eclipse, IntelliJ IDEA, or VS Code)
* **JavaFX SDK** ([Download here](https://gluonhq.com/products/javafx/) and extract the files)
* **Scene Builder** (Optional, for UI editing)

---

## 🚀 Setup & Installation

### 1. Clone the Project
```bash
git clone https://github.com/bray-hiramis/simple-logic-gates.git
```

### 2. Configure the IDE (Eclipse Example)

To resolve dependency issues, you must link the JavaFX library:

1. Open the project in your IDE.

2. Right-click the project in Package Explorer > Build Path > Configure Build Path.

3. Go to the Libraries tab and select Modulepath.

4. Click Add Library... > User Library > Next.

5. Select your pre-configured JavaFX library and click Finish.

> Note: If you haven't created a User Library yet, go to _Preferences > Java > Build Path > User Libraries_ and create one pointing to your JavaFX lib folder.

6. Click Apply and Close.

### 3. Running the Program

If you encounter an error: add this in the 
> Run Configuration > Arguments > VM Arguments: 
```
--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml --enable-native-access=javafx.graphics
```

### Author: 
**Bray Hiramis**: https://github.com/bray-hiramis