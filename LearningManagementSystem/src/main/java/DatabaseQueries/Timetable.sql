/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 11, 2025
 */

CREATE TABLE Timetable (
    timetableID INT AUTO_INCREMENT PRIMARY KEY,
    lecturerID VARCHAR(20),
    subjectName VARCHAR(100),
    courseID VARCHAR(20),
    lectureDate DATE,
    startTime VARCHAR(20),
    endTime VARCHAR(20),
    hallNumber VARCHAR(20),
    FOREIGN KEY (lecturerID) REFERENCES Lecturer(lecturerID),
    FOREIGN KEY (subjectName) REFERENCES Subject(subjectName),
    FOREIGN KEY (courseID) REFERENCES Course(courseID)
);