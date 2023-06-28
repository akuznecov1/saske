package ru.project.saske;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDTO {

    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("FatherName")
    public String fatherName;
    @JsonProperty("DateOfBirth")
    public String dateOfBirth;
    @JsonProperty("YearsOld")
    public int yearsOld;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Login")
    public String login;
    @JsonProperty("Password")
    public String password;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Gender")
    public String gender;
//    @JsonProperty("GenderCode")
//    public String genderCode;
//    @JsonProperty("PasportNum")
//    public String pasportNum;
//    @JsonProperty("PasportSerial")
//    public String pasportSerial;
//    @JsonProperty("PasportNumber")
//    public int pasportNumber;
//    @JsonProperty("PasportCode")
//    public String pasportCode;
//    @JsonProperty("PasportOtd")
//    public String pasportOtd;
//    @JsonProperty("PasportDate")
//    public String pasportDate;
//    public String inn_fiz;
//    public String inn_ur;
//    public String snils;
//    public long oms;
//    public String ogrn;
//    public int kpp;
//    @JsonProperty("Address")
//    public String address;
//    @JsonProperty("AddressReg")
//    public String addressReg;
//    @JsonProperty("Country")
//    public String country;
//    @JsonProperty("Region")
//    public String region;
//    @JsonProperty("City")
//    public String city;
//    @JsonProperty("Street")
//    public String street;
//    @JsonProperty("House")
//    public int house;
//    @JsonProperty("Apartment")
//    public int apartment;
//    public int bankBIK;
//    public String bankCorr;
//    public long bankINN;
//    public int bankKPP;
//    public String bankNum;
//    public String bankClient;
//    public String bankCard;
//    public String bankDate;
//    public int bankCVC;
//    @JsonProperty("EduSpecialty")
//    public String eduSpecialty;
//    @JsonProperty("EduProgram")
//    public String eduProgram;
//    @JsonProperty("EduName")
//    public String eduName;
//    @JsonProperty("EduDocNum")
//    public String eduDocNum;
//    @JsonProperty("EduRegNumber")
//    public String eduRegNumber;
//    @JsonProperty("EduYear")
//    public int eduYear;
//    @JsonProperty("CarBrand")
//    public String carBrand;
//    @JsonProperty("CarModel")
//    public String carModel;
//    @JsonProperty("CarYear")
//    public int carYear;
//    @JsonProperty("CarColor")
//    public String carColor;
//    @JsonProperty("CarNumber")
//    public String carNumber;
//    @JsonProperty("CarVIN")
//    public String carVIN;
//    @JsonProperty("CarSTS")
//    public String carSTS;
//    @JsonProperty("CarSTSDate")
//    public String carSTSDate;
//    @JsonProperty("CarPTS")
//    public String carPTS;
//    @JsonProperty("CarPTSDate")
//    public String carPTSDate;


}



