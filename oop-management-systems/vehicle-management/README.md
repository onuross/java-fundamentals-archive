# Object-Oriented Java Project: Vehicle Management System

This Java project implements a simple Vehicle Management System with a focus on object-oriented principles. The system includes three main classes: `Bus`, `ContactInfo`, and `Person`, along with an abstract class `Vehicle`. Let's take a closer look at each component.

## Bus Class

The `Bus` class extends the abstract class `Vehicle` and represents a bus entity. It includes properties such as capacity and age of the bus. Some key features:

- **Constructor Overloading**: The class includes multiple constructors, allowing the creation of Bus objects with different parameters.
- **Tax Calculation**: The `calculateTax` method determines the tax to be paid based on the age of the bus.
- **Object Copying**: It implements a copy constructor and equals method for creating copies and checking equality.

## ContactInfo Class

The `ContactInfo` class represents the contact information of an individual, including home address, telephone number, and email. Key features include:

- **Constructor Overloading**: The class includes multiple constructors for creating ContactInfo objects with different parameters.
- **Object Copying**: It implements a copy constructor for creating copies of ContactInfo objects.

## Person Class

The `Person` class represents an individual with a name and associated contact information. Key features:

- **Constructor Overloading**: The class includes multiple constructors for creating Person objects with different parameters.
- **Object Copying**: It implements a copy constructor for creating copies of Person objects.

## Vehicle Class

The `Vehicle` abstract class serves as the base class for vehicles and includes properties such as brand, license plate, and owner. Key features:

- **Constructor Overloading**: The class includes multiple constructors for creating Vehicle objects with different parameters.
- **Object Copying**: It implements a copy constructor for creating copies of Vehicle objects.
- **Abstract Method**: The `calculateTax` method is declared as abstract, emphasizing its implementation in the derived `Bus` class.

## Demo Class

The `Demo` class provides a sample scenario demonstrating the functionality of the system. It creates instances of `ContactInfo`, `Person`, and `Bus`, showcasing the use of constructors, copying methods, and equality checks.

Feel free to explore the code, create your instances, and integrate this Vehicle Management System into your Java projects!
