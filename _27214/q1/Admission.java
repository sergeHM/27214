package _27214.q1;
public class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;
    public Admission(int id, String createdDate, String updatedDate,
                    String patientName, int age, String gender, String contactNumber,
                    String admissionDate, String roomNumber, double roomCharges) 
                    throws HospitalDataException {
        super(id, createdDate, updatedDate, patientName, age, gender, contactNumber);
        setAdmissionDate(admissionDate);
        setRoomNumber(roomNumber);
        setRoomCharges(roomCharges);
    }
    public String getAdmissionDate() {
        return admissionDate;
    }
    
    public void setAdmissionDate(String admissionDate) throws HospitalDataException {
        if (admissionDate == null || admissionDate.trim().isEmpty()) {
            throw new HospitalDataException("Admission date cannot be null or empty");
        }
        this.admissionDate = admissionDate;
    }
    
    public String getRoomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(String roomNumber) throws HospitalDataException {
        if (roomNumber == null || roomNumber.trim().isEmpty()) {
            throw new HospitalDataException("Room number cannot be null or empty");
        }
        this.roomNumber = roomNumber;
    }
    
    public double getRoomCharges() {
        return roomCharges;
    }
    
    public void setRoomCharges(double roomCharges) throws HospitalDataException {
        if (roomCharges <= 0) {
            throw new HospitalDataException("Room charges must be greater than 0");
        }
        this.roomCharges = roomCharges;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nAdmission Date: " + admissionDate + 
               ", Room Number: " + roomNumber + ", Room Charges: $" + String.format("%.2f", roomCharges);
    }
}

