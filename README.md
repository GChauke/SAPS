# PoliceService
The Police Service System is a software application designed to improve the management of crime cases and the evaluation of police officer performance. The system will enable police officers to create and manage cases efficiently and provide a streamlined process for handling crime cases. The purpose of this document is to provide a detailed description of the system's functional and non-functional requirements.
Stakeholder Analysis:
The stakeholders for the Police Service System include:
Police Officers: 
The primary users of the system who will be creating and managing cases.
Department Supervisors: 
Responsible for overseeing the cases in their department and ensuring that they are resolved in a timely manner.
Victims:
 The individuals reporting the crime cases and providing information to the police officers.
Criminal Investigation Department: 
The department responsible for investigating serious and complex cases.
Use Case Narratives:
Case Creation:
a. User Story: As a police officer, I want to create a new case in the system when a person comes to lay a charge.
b. Use Case: The system triggers a new case creation when a person comes to lay a charge. The police officer captures the case, attaches any required documents if necessary, and the system generates a unique case number for each case.
Case Assignment
a. User Story: As a police officer, I want to assign a case to myself from the backlog.
b. Use Case: All created cases will be assigned to the backlog of the relevant department. The supervisor of the department will receive a notification to inform them of the newly assigned case. Police officers assigned to that department will have to assign the case to their name from the backlog.
Case Status
a. User Story: As a supervisor, I want to review a completed case.
b. Use Case: The system supports the following case statuses: "to do" when it is not assigned, "assigned" when it has been assigned to a police officer, "in progress" when the police officer starts working on it, "completed" when the police officer has completed the case, and "closed" when it has been reviewed by the supervisor. A case can also be on a "cancelled" status when the victim instructs that it be closed before any work is done on it.
Dashboard
a. User Story: As a department supervisor, I want to see all cases in my department and their different states.
b. Use Case: The system will have a dashboard feature that allows department supervisors to see all cases in their department and their different states. They can dive deep into the report to see who closes the most reports and who is trailing behind. Supervisors can only view cases in their department as well as the dashboard related to cases in their department. A Police Office Constable has the user rights to view a dashboard for all departments, the cases assigned to each department, the status of the cases. The Constable is also able to see the best performing department in terms of most completed cases and the challenged departments that are trailing behind.
Service Level Agreements
a. User Story: As a supervisor, I want to be informed when a case has passed its delivery time.
b. Use Case: The service level agreement for all case types will be different. This will be used to determine if a case is past its delivery time, for the system to inform the relevant supervisor that the case has passed its service level agreement period to be closed.
Personas:
Police Officer: A police officer who will be using the system to create and manage cases.
Department Supervisor: A department supervisor who will oversee the cases in their department.
Victim: An individual reporting a crime case and providing information to the police officers.

Functional Requirements:
Case Creation: 
The system will trigger a new case creation when a person comes to lay a charge. The police officer will capture the case, attach any required documents if necessary, and the system will generate a unique case number for each case.
Case Types:
 The system will support multiple case types including Theft, housebreaking, hijacking, assault, kidnapping, home robbery, murder, sexual offence, street robbery or consumer fraud.
Case Assignment:
 All created cases will be assigned to the backlog of the relevant department. The supervisor of the department will receive a notification to inform them of the newly assigned case. Police officers assigned to that department will have to assign the case to their name from the backlog.
Case Status:
 The system will support the following case statuses: "to do" when it is not assigned, "assigned" when it has been assigned to a police officer, "in progress" when the police officer starts working on it, "completed" when the police officer has completed the case and "closed" when it has been reviewed by the supervisor. A case can also be on a "cancelled" status when it has been deemed as invalid.
Alert System:
 A case that has not been picked up from the backlog for over 24 hours will trigger an alert to the supervisor informing them that the case is still in a to do state.
Dashboard:
 The system will have a dashboard feature that allows department supervisors to see all cases in their department and their different states. They can dive deep into the report to see who closes the most reports and who is trailing behind. Supervisors can only view cases in their department as well as the dashboard related to cases in their department. A Police Office Constable has the user rights to view a dashboard for all departments, the cases assigned to each department, the status of the cases. The Constable is also able to see the best performing department in terms of most completed cases and the challenged departments that are trailing behind.
Service Level Agreements: 
The service level agreement for all case types will be different. This will be used to determine if a case is past its delivery time, for the system to inform the relevant supervisor that the case has passed its service level agreement period to be closed.
Non-Functional Requirements:
Security:
 The system must ensure that all data is secure and only accessible by authorized users.
Reliability:
 The system must be reliable and available 24/7 to ensure that police officers can access it at any time.
Performance: 
The system must perform efficiently to ensure that police officers can quickly and easily create and manage cases.
User Interface:
 The system must have a user-friendly interface that is easy to use for all police officers.
Integration: 
The system must be able to integrate with other police systems such as the criminal record system.

Conclusion:
 The Police Service System is an essential tool that will enable the police department to manage crime cases more effectively. The system will streamline the process of creating and managing cases and will enable the police department to monitor the performance of their officers. The system must meet all the functional and non-functional requirements outlined in this specification to ensure that it is a reliable, secure, and efficient system.
