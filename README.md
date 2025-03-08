# Factory Method Design Pattern - Healthcare System

This project demonstrates the **Factory Method Design Pattern** in the context of a **Healthcare System**. The Factory Method is a design pattern that defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created. This pattern is used to create instances of related objects without specifying their exact concrete class.

## Key Concepts

- **Factory Method**: A method for creating objects without exposing the instantiation logic to the client.
- **Product**: The object that is created by the factory.
- **Concrete Product**: The actual product created by the factory method.
- **Creator**: The class that contains the factory method and defines the interface for object creation.
- **Concrete Creator**: The class that implements the factory method and provides the actual object creation logic.

## How it Works

In this implementation, we use the **Factory Method** pattern to create different types of **Healthcare Services**. Each type of healthcare service (like **General Consultation**, **Specialist Consultation**, **Emergency Care**) is created using a factory, and the client can request these services without needing to know the exact class used.

### **Key Components**
- **HealthcareService**: An abstract class or interface defining a common service.
- **Concrete Services**: `GeneralConsultation`, `SpecialistConsultation`, and `EmergencyCare`, which implement `HealthcareService`.
- **HealthcareServiceFactory**: A factory interface that defines a method to create `HealthcareService` objects.
- **Concrete Factories**: Each specific factory (e.g., `GeneralConsultationFactory`, `SpecialistConsultationFactory`) implements the `HealthcareServiceFactory` and creates a particular type of service.

**To run the example:**

1. Clone the repository:
        git clone https://github.com/SrilekhaMarthi/Factory_Method_Design_Pattern.git
2. Navigate to the project directory
       cd Factory_Method_Design_Pattern
3. Compile the project
       mvn clean install
4. Run the HealthcareClient to see the output:
       mvn exec:java -Dexec.mainClass="com.healthcare.client.HealthcareClient"
   
### **Benefits of the Factory Method Pattern**
**Decoupling**: The client code doesn't need to know the specific class that is created. It only interacts with the factory interface.
**Flexibility**: You can add new types of healthcare services (like PediatricConsultation) without changing the client code.
**Single Responsibility**: The creation logic is separated from the rest of the code, making it easier to manage.

### **Cons**
**Increased Complexity**: If there are too many variations of products, the number of factory classes can grow, increasing complexity.
**Requires Extra Classes**: More classes are needed (factories, concrete factories), which could make the design more complicated than necessary for small projects.







            
