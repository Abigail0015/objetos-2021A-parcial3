package uaslp.objetos.exams;

public class Group
{
    private List<Student> students = new ArrayList<>();
    private int capacity;
    private int availability;
    private double average;

    public Group(int capacity)
    {

        this.capacity = capacity;
        availability = 0;
        average = 0.0;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getAvailability()
    {
        return availability;
    }


    public List<Student> getStudents()
    {
        return students;
    }


    public List<Student> addStudent(Student student)
    {
        if(capacity > availability)
        {

        }
        else
        {
            throw new GroupIsFullException();
        }
    }

    public double getAverage() {
    }
}
