# Task - Gadget Inventor

## Deadline
This assignment is due before the next class session.

## Instructions
For detailed instructions on how to complete and submit this assignment, refer to the assignments section of the course instructions available on the course webpage.

## Preparation
- Complete and review questions in Module 2: Exploring Classes in Java.
- Access the OLI material:
  - Via the link provided in your course's learning platform.
  - Or directly via the webpage link given in the module.

## Learning Goals
After completing this week's assignment, you should be familiar with:
* Creating and designing Java classes and objects.
* Understanding and using instance fields.
* Understanding and implementing constructors.
* Implementing getters and setters methods.
* Manipulating objects using the dot operator.
* Outputting information to the terminal.
* Utilizing the main method effectively.
* Understanding variable scope and shadowing.

## Troubleshooting
If you encounter any problems, follow these steps:
1. Review this week's [posted issues](link) to see if other students have encountered similar problems.
2. If your issue is not listed, create a [New Issue](link) with a descriptive title.
3. Get in-person help during the weekly lab session.

## Assignment

In the scenic town of TechVille, a passionate inventor named Alex is known for creating extraordinary gadgets out of ordinary objects. Your task is to model these incredible gadgets in Java!

### Exercise 1.0: Begin the Invention Journey

To kick things off, create a new Java file named `Gadget.java` in your project's `src` folder. In this file, define a class named `Gadget`.

Now, let's model our first gadget. Add the main method to your `Gadget` class and define variables with the following attributes:

- `String` modelName: "SparkPlug"
- `int` powerUse: 15
- `boolean` isWireless: true
- `String` function: "Generates Sparks"
- `boolean` isOn: false

Test your code to ensure everything works as expected.

### Exercise 1.1: Expanding the Invention Portfolio

After creating your first gadget, let's invent two more, increasing your total number of gadgets to three. Print information about all three gadgets to the console.

### Exercise 1.2: Using Fields

Now, reimagine how to store gadget data. Instead of local variables in the main method, utilize class fields. Create fields for each attribute mentioned in Exercise 1.0. 

Instantiate a new gadget object in the main method, but this time, assign the attribute values through the object itself using dot notation.

### Exercise 1.3: Getters and Setters

Introduce encapsulation by setting your fields to private and creating getters and setters for each attribute. This practice enforces secure access and modification of your gadget attributes.

### Exercise 1.4: Constructor

Implement a constructor for the `Gadget` class that accepts arguments for each field. This allows you to instantiate gadget objects more efficiently by providing attribute values at creation time.

### Exercise 1.5: More Gadgets, More Fun

Utilize the constructor to add two more gadgets to your portfolio. Observe how much cleaner and more manageable your code becomes with this approach.

### Exercise 1.6: `printInfo` Method

To further streamline your code, implement a `printInfo()` method in the `Gadget` class. This method should print all relevant information about a gadget.

### Exercise 1.7: Gadget Interaction

Let's add some interactivity. Implement a method called `activateGadget` that simulates turning a gadget on or off. This method should also print the gadget's new state to the console.

### Exercise 1.8: Exploring Variable Shadowing

Examine the examples of variable shadowing provided and understand how it can be resolved using the `this` keyword. You may be asked to discuss this concept in class.

## Checklist
- Complete the introductory exercise of creating multiple gadgets.
- Define fields for the `Gadget` class and test object manipulation.
- Implement getters and setters for all fields.
- Use a constructor to streamline object creation.
- Implement the `printInfo()` method.
- Create an `activateGadget()` method for interactive functionality.
- Review variable shadowing examples and understand their resolution.
