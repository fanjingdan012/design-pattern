# Visitor
## Purpose
A visitor(FindLargeClassroomVisitor) want to find all classrooms that have area >100 in the university

## Run
run VisitorTest
output:
```
classroom:length=500,width=300
classroom:length=400,width=800
2
```
## Project Structure
[!uml](https://github.com/fanjingdan012/design-pattern/blob/master/visitor/doc/visitor.png)
## Responsibilities of each class
### FindLargeClassroomVisitor
- decide what to do with the place it visit by implementing `visitXX()`, eg:
  - call `accept()` method of each of XX's parts
  - for classroom, it need to measure the area and print out them.
- only need to visit the outsider university, each part of the university will tell visitor what are its parts.
- no need to know the structure of the university
### University
- university only know its campuses, no need to know more detailed like building info
- implement `accept()` by calling `visitXX()` of the visitor to visit itself

## Code
Entrance code as following:
```java
    public static void main(String [] args){
        University u = new University();
        FindLargeClassroomVisitor visitor = new FindLargeClassroomVisitor();
        visitor.visitUniversity(u);
        System.out.println(visitor.total);
    }
```