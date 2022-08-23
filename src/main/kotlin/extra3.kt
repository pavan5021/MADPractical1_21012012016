fun main()
{
    val obj = ArrayList<Student> (6)

    obj.add(Student())
    obj.add(Student("21012012001","CE","D","AB1","harsh","khamar",21))
    obj.add(Student("21012012002","CE","D","AB1","kishan","bhavsar", 22))
    obj.add(Student("21012012003","CE","D","AB1","meet","Patel",20))
    obj.add(Student("21012012004","CE","D","AB1","archan","Acharya", 22))
    obj.add(Student("21012012005","CE","D","AB1","dev","parmar",21))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fname: String, private val lname: String, private val age: Int)
{
    fun details() {
        println("First Name = $fname")
        println("Last Name = $lname")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }

    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}