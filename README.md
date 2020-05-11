# Poised Project-Manager

## Project Description

This project management system is designed for a small structural engineering firm called "Poised". Poised does the engineering needed to ensure the structural integrity of various buildings. 

### Poised stores the following information for each project that they work on:

* Project number.
* Project name.
* What type of building is being designed? E.g. House, apartment block or store, etc.
* The physical address for the project.
* ERF number.
* The total fee being charged for the project.
* The total amount paid to date.
* Deadline for the project.
* The name, telephone number, email address and physical address of the architect for   the project.
* The name, telephone number, email address and physical address of the contractor for   the project.
* The name, telephone number, email address and physical address of the customer for   the project.

## Programme Overview

* The programme will capture information about the new projects. If a project name is
  not provided when the information is captures, the project default name will then   be the surname of the customer.
* The programme allows for the updating of information whether it is the project 
  information, contractor information, customer information and/or architect
  information.
* The programme generates the following when a project is finalised/completed:
  * An invoice is generated for the client, which includes the customer's contact
    details and the total amount that the customer is outstanding in payments.
    However, if the customer does not have any outstanding payments, an invoice 
    will not be generated.
  * The project is marked as "finalised" and the completion date is then added.
  * All information about the project is added to the text file named
    **CompletedProject.txt**.
* A list of uncompleted projects can be shown along with overdue projects.
* The programme allows for a user to find and select a project by entering either 
  the project number or project name.
