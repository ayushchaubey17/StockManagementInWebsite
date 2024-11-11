# Stock Notification System
A simple stock notification system using the Observer and Singleton design patterns, following the MVVM architectural pattern. This system allows customers to subscribe to stock updates and receive notifications whenever the stock quantity changes.

## Table of Contents
Overview
Features
Design Patterns Used
Installation
Usage
Classes Overview

```Overview```

This project demonstrates a basic stock notification system where:
#### Customers can subscribe or unsubscribe to stock notifications.
#### Stock updates trigger notifications to all subscribed customers.
#### Users interact with the application through a console-based menu.
Features
#### Add or remove customers from stock notifications.
#### Update stock quantity.
#### Notify customers of stock changes.


````Design Patterns Used````
### Observer Pattern:
Used to manage customer subscriptions and notifications.
### Singleton Pattern:
Ensures that only one instance of StockManagementSystem exists.
#### MVVM (Model-View-ViewModel):
Separates concerns into distinct layers:
#### Model: 
Contains core business logic (Logic class).
#### View:
Handles user interaction (ViewScreen class).
#### ViewModel:
Manages UI logic and interaction between the view and model (StockObservable and StockManagementSystem classes).

```Run the application:```

Start the application by running the Main class. You will see a menu with the following options:
markdown
Copy code
Welcome to the stock notification system, enter your choice:
1. **Add subscriber**
2. **Remove subscriber**
3. **Set stock quantity**
4. **Notify customers**
5. **Exit**
   Operations:

Add Subscriber: Adds a new customer to receive stock notifications.
Remove Subscriber: Removes a customer from receiving notifications.
Set Stock Quantity: Updates the stock quantity. If stock changes from 0 to a positive number, all subscribers will be notified.
Notify Customers: Manually triggers a notification to all subscribed customers.
Exit: Exits the application.
Classes Overview
Main: Entry point of the application.
StockManagementSystem (viewmodel): Singleton class that manages the application flow.
Logic (model): Contains business logic for adding/removing customers and managing stock notifications.
ViewScreen (view): Handles user input and display.
Customer (view): Represents a customer, who is notified of stock updates.
Observer (view): Interface for customer notifications.
Subject (viewmodel): Interface for managing subscribers and notifying them.
StockObservable (viewmodel): Implements Subject, manages the stock and customer list, and triggers notifications.



## Project Structure
````
src/
├── stock_notification/
│   ├── model/
│   │   └── Logic.java
│   ├── view/
│   │   ├── Customer.java
│   │   ├── Observer.java
│   │   └── ViewScreen.java
│   ├── viewmodel/
│   │   ├── StockManagementSystem.java
│   │   ├── StockObservable.java
│   │   └── Subject.java
└── Main.java
````

## 🗂️ Class Descriptions

| Class                 | Description                                        |
|-----------------------|----------------------------------------------------|
| `StockManagementSystem` | Main system handler, Singleton, entry point      |
| `Logic`               | Business logic for customer/stock operations       |
| `ViewScreen`          | Console interface for user input/output            |
| `Customer`            | Represents a subscribing customer                 |
| `Observer`            | Interface for customer notifications               |
| `Subject`             | Interface for managing and notifying subscribers   |
| `StockObservable`     | Implements `Subject`, handles stock notifications  |


## 🗂️ Classes

| Class                 | Purpose                                            |
|-----------------------|----------------------------------------------------|
| `StockManagementSystem` | Singleton, main system controller                |
| `Logic`               | Business logic for managing customers and stocks   |
| `ViewScreen`          | Console interface                                  |
| `Customer`            | Subscriber, implements `Observer`                  |
| `Observer`            | Interface for subscriber notifications             |
| `Subject`             | Interface for managing subscribers                 |
| `StockObservable`     | Manages stock levels, notifies subscribers on change |
