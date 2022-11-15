import groovy.transform.Immutable

@Immutable
class Employee {

    String id
    String firstName, lastName
    Date employerSince
    Collection skills

}

def whatever = new Date()
def c1 = new Employee(id: "AHU2123", firstName: 'Pawel', lastName: "Nowak", employerSince: whatever, skills: ["Java", "Angular"])
def c2 = new Employee("AHU2123", "Pawel", "Nowak", whatever, ["Java", "Angular"])
assert  c1 == c2

if ( c1 == c2 ){
    println("true")
} else {return false}