Exercise for Unit and Integration Testing

There are two entities: Student and Subject. In Student entity are the following properties: id, firstName, lastName, studentNumber and listOfSubjects. Subject entity has properties: id, name, listOfStudents, timeSlot(1,2,3,4).
Create methods that will check:

One subject can only be listened by maximum 5 users.
One user can only be enrolled in up to 4 subjects.
User can only attend 1 subject in a specific timeslot (ex. Subject 1 (has timeslot 3), Subject 2 (has timeslot 3), user can only attend in one of these subjects).
