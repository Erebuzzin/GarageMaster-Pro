# GarageMaster Pro (VPark)

Java-based **Vehicle Hiring & Management System** for the fictional company **VPark**, developed as part of a university Object-Oriented Programming (OOP) course project.  
This project demonstrates clean architectural practices using inheritance, interfaces, encapsulation, polymorphism, exception handling, and modular design.

---

## 🚘 Features

### ✅ Vehicle Types

- **Car**
  - `Sports`: Bookable, Remote deliverable/droppable
  - `StationWagon`: Can carry small load, Remote deliverable/droppable
  - `SUV`: Has `wheelDrive` (RWD, FWD, AWD, 4WD); _not_ remote deliverable/droppable

- **Truck**
  - `SmallTruck`: Requires booking 7+ days prior; _not_ remote deliverable/droppable
  - `TransportTruck`: May go abroad; same restrictions as SmallTruck

---

## 👥 User Roles

### Admin Menu
- View all vehicles
- View available vehicles (with date input)
- Add / remove vehicles
- Generate daily report
- Save system state to binary file

### Customer Menu
- View all vehicles
- View available vehicles (with date input)
- Book / cancel booking
- Rent / drop vehicles
- Load vehicles with extra weight (if supported)

---

## 🛠 Technologies

- Java
- OOP: Abstract classes, Interfaces, Custom Exceptions
- File I/O (binary file save planned)
- CLI Interface (Scanner)

---

## 🧱 Project Structure

```
.
├── Vehicle.java              # Abstract base class
├── Car.java / Truck.java     # Abstract subclasses
├── Sports.java / SUV.java / StationWagon.java
├── SmallTruck.java / TransportTruck.java
├── Interfaces/
│   ├── Bookable.java
│   ├── Rentable.java
│   ├── Deliverable.java
│   └── Droppable.java
├── Exceptions/
│   ├── SorryWeDontHaveThatOneException.java
│   ├── NoCancellationYouMustPayException.java
│   ├── OverWeightException.java
│   └── InvalidWheelDriveException.java
├── VehiclePark.java          # Core logic and coordination
├── User.java                 # Registered user
├── Test.java                 # Menu selector
└── Main.java                 # Entry point
```

---

## ▶️ How to Run

1. **Compile all `.java` files**
   ```bash
   javac *.java
   ```

2. **Run the program**
   ```bash
   java Main
   ```

3. **Follow the prompts**:
   - Select `Customer` or `Admin`
   - Interact with the system from terminal

---

## 📋 Notes

- Binary saving/loading functionality is expected but not implemented yet
- Exceptions are thrown for booking conflicts, overweight issues, or rule violations
- Menu systems for both roles are functional
- System is easily extensible for GUI or database integration in the future

---

## 👨‍💻 Authors

- Erebuzzin  
- Based on COMP1112 OOP Spring 2025 Guidelines

---

## 📄 License

This project is for educational use only.
