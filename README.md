# Course Intro

## Overview

The **Course Intro** project is a console-based Java application designed to explore inheritance and polymorphism through a vehicle-themed example. Users interact with various types of vehicles, demonstrating shared and specialized behavior, as well as static and instance methods.

This project is an educational exercise focused on teaching object-oriented programming concepts like inheritance, method overriding, and the use of polymorphism.

## Features

1. **Vehicle Management:**
    - Demonstrates a base `Vehicle` class with shared attributes and methods.
    - Specialized subclasses (`Car` and `Motorcycle`) that extend `Vehicle` with additional features.

2. **Dynamic Behavior:**
    - Method overriding in subclasses to provide custom behavior.
    - Polymorphism illustrated through an array of `Vehicle` objects.

3. **Static and Instance Methods:**
    - Showcases static methods for class-level operations.
    - Highlights instance methods for object-specific functionality.

4. **Interactive Console Output:**
    - Displays features of different vehicle types.
    - Custom animations and separators for enhanced readability.

## Project Structure

- **Main Application:**
    - `Main.java`: The entry point, showcasing various features of vehicles through method calls and polymorphism.

- **Vehicle Classes:**
    - `Vehicle.java`: The base class defining common properties like `brand` and `speed`, and methods for displaying features.
    - `Car.java`: Extends `Vehicle`, adding a `numberOfDoors` attribute and custom behavior.
    - `Motorcycle.java`: Extends `Vehicle`, adding a `hasSidecar` attribute and custom methods.

This project serves as a practical introduction to object-oriented design principles, providing a hands-on approach to inheritance, method overriding, and polymorphism in Java. It is a fun and engaging way to learn the basics of OOP through relatable examples.