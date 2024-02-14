public class PatientTester {
    public static void main(String[] args) {
        PatientManager p = new PatientManager();
        System.out.println(p);
        for(int i = 1; i <= 4; i++){
            Patient temp = new Patient(i, i*200);
            p.addPatient(temp);
        }
        System.out.print(p);
        p.caffeintAbsorbtion();
        p.caffeintAbsorbtion();
        System.out.print(p);
        int temp = 0;
        for(int i = 0; i < p.Patients.length; i++){
            if(p.Patients[i] != null)
            {
            if(p.Patients[i].caffeine_level > temp){
                temp = i;
            }
        }
        }
        p.removePatient(temp);
        System.out.print(p);
    }
}
