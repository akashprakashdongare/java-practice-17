package common;

class CommonDTO{
    int id;
    String name;
    String email;
    int age;
    String address;
    String compName;
    String compAddress;
    int compId;
    String panNo;
    String aadharNo;
    String phoneNo;
    public CommonDTO(int id, String name, String email, int age, String address, String compName, String compAddress,
            int compId, String panNo, String aadharNo, String phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.compName = compName;
        this.compAddress = compAddress;
        this.compId = compId;
        this.panNo = panNo;
        this.aadharNo = aadharNo;
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "CommonDTO [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
                + ", compName=" + compName + ", compAddress=" + compAddress + ", compId=" + compId + ", panNo=" + panNo
                + ", aadharNo=" + aadharNo + ", phoneNo=" + phoneNo + "]";
    }    

}

class CompanyDetail{
    String empName;
    String compName;
    String compAddress;
    int compId;
    String panNo;
    String phoneNo;
    String email;
    
    
public CompanyDetail(String empName, String compName, String compAddress, int compId, String panNo, String phoneNo,
            String email) {
        this.empName = empName;
        this.compName = compName;
        this.compAddress = compAddress;
        this.compId = compId;
        this.panNo = panNo;
        this.phoneNo = phoneNo;
        this.email = email;
    }
@Override
    public String toString() {
        return "CompanyDetail [empName=" + empName + ", compName=" + compName + ", compAddress=" + compAddress
                + ", compId=" + compId + ", panNo=" + panNo + ", phoneNo=" + phoneNo + ", email=" + email + "]";
    }
}

// public record EmpPersonal(CommonDTO dto){
//     return new CompanyDetail(dto.name, dto.compName, dto.compAddress, dto.compId, dto.panNo, dto.phoneNo, dto.email);
// }
public class RecordExample {
    public static void main(String[] args) {
        CommonDTO dto = new CommonDTO(1, "Mahesh Kumar", "mahesh.kumar@gmail.com", 30, 
            "Hinjewadi Pune, abc", "Tata Consultance Service", "Hinjewadi phase 2, Pune", 1200, 
            "AHSB8932HH", "9832891032112", "9021892388");

            
    }
}
