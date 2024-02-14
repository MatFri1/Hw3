public class PatientManager {
    public Patient[] Patients;
    public PatientManager(){
        Patients = new Patient[10];
    }

    public int addPatient(Patient p){
        for(int i = 0; i < Patients.length; i++){
            if(Patients[i] == null){
                Patients[i] = p;
                return i;
            }
        }
        return -1;
    }
    public Patient removePatient(int i){
        Patient temp = Patients[i];
        Patients[i] = null;
        return temp;
    }
    public void caffeintAbsorbtion(){
        for(int i = 0; i < Patients.length; i++){
            if(Patients[i] != null){
                Patients[i].caffeine_level = Patients[i].caffeine_level - 130;
                if(Patients[i].caffeine_level <= 0){
                    removePatient(i);
                }
            }
        }
    }
    public String toString(){
        int fix = 0;
        for(int i = 0; i < Patients.length; i++){
            if(Patients[i] != null){
                System.out.println(Patients[i].ID_number + " " + Patients[i].caffeine_level);
                fix++;
            }
        }
        if(fix == 0){
            System.out.print("Empty");
        }
        return "";
    }
}
