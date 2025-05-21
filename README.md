# Simple Cal – Smart Calculator App

Simple Cal is a fully functional Android calculator app built using Kotlin. It supports a wide range of arithmetic and mathematical operations including addition, subtraction, multiplication, division, modulus, square, square root, LCM, HCF, and root calculations. Designed with a clean UI, it also maintains a history of operations for better usability.

---

## 📌 Objective

To develop a smart, interactive, and user-friendly calculator application that goes beyond basic arithmetic and offers additional mathematical functionality such as LCM, HCF, and square roots. Ideal for quick daily calculations with easy access to previous operations.

---

## 🔧 Tech Stack

- **Language**: Kotlin  
- **UI Design**: XML  
- **IDE**: Android Studio  
- **Architecture**: Basic Activity Architecture (MVVM if extended)

---

## 🎯 Features

- Supports basic arithmetic: `+`, `−`, `×`, `÷`, `%`  
- Advanced functions:  
  - **Square**
  - **Square Root**
  - **LCM**
  - **HCF**
  - **Root (Any nth root)**
- History log to view past calculations
- Error handling for invalid inputs (e.g., divide by zero)
- Clean and interactive user interface
- Responsive layout for different screen sizes

---

## 📲 How It Works

1. **Enter Numbers**: Input two numbers using the number fields.
2. **Select Operation**: Choose any operation (add, subtract, multiply, etc.) via the buttons.
3. **Get Result**: The result is displayed below the input area.
4. **View History**: Scroll to view past calculation results stored in the session.

---

## 🗂 Folder Structure

SimpleCal/
├── app/
│ └── src/
│ └── main/
│ ├── java/com/yourpackage/simplecal/
│ │ ├── MainActivity.kt
│ ├── res/
│ │ ├── layout/
│ │ │ └── activity_main.xml
│ │ ├── values/
│ │ │ ├── strings.xml
│ │ │ └── styles.xml
│ ├── AndroidManifest.xml
├── build.gradle
└── README.md
