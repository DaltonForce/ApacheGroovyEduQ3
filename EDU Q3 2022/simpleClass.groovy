class example1{
    Integer id
    String name
    Date timeCreated

    public Appointment(String appoName){
        name = appoName
        id = 0
        timeCreated = new Date()
    }

    void addNewId(){ id += 1 }
}

def doctorAppointment = new example1()
println doctorAppointment
def getDate = doctorAppointment.Appointment("Whatever1")
def getName = doctorAppointment.name
println getDate
println getName
println doctorAppointment.timeCreated.year
println doctorAppointment.timeCreated.date