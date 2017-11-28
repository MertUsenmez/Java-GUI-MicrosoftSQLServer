
package database.project.projectt;


class School {
    
    private int SchoolIDm;
    private String SchoolNamem;
    private String SchoolTypem;
    private int AddressIDm;
    private String Streetm;
    private String Statem;
    private String Country;
    private int ZipCode;
    private String City;
    private String AddressDetail;
    private int phoneID;
    private String phoneNumber;
    private String phoneType;

    public School(int SchoolIDm, String SchoolNamem, String SchoolTypem, int AddressIDm, String Streetm, String Statem, String Country, int ZipCode, String City, String AddressDetail, int phoneID, String phoneNumber, String phoneType) {
        this.SchoolIDm = SchoolIDm;
        this.SchoolNamem = SchoolNamem;
        this.SchoolTypem = SchoolTypem;
        this.AddressIDm = AddressIDm;
        this.Streetm = Streetm;
        this.Statem = Statem;
        this.Country = Country;
        this.ZipCode = ZipCode;
        this.City = City;
        this.AddressDetail = AddressDetail;
        this.phoneID = phoneID;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public int getSchoolIDm() {
        return SchoolIDm;
    }

    public void setSchoolIDm(int SchoolIDm) {
        this.SchoolIDm = SchoolIDm;
    }

    public String getSchoolNamem() {
        return SchoolNamem;
    }

    public void setSchoolNamem(String SchoolNamem) {
        this.SchoolNamem = SchoolNamem;
    }

    public String getSchoolTypem() {
        return SchoolTypem;
    }

    public void setSchoolTypem(String SchoolTypem) {
        this.SchoolTypem = SchoolTypem;
    }

    public int getAddressIDm() {
        return AddressIDm;
    }

    public void setAddressIDm(int AddressIDm) {
        this.AddressIDm = AddressIDm;
    }

    public String getStreetm() {
        return Streetm;
    }

    public void setStreetm(String Streetm) {
        this.Streetm = Streetm;
    }

    public String getStatem() {
        return Statem;
    }

    public void setStatem(String Statem) {
        this.Statem = Statem;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAddressDetail() {
        return AddressDetail;
    }

    public void setAddressDetail(String AddressDetail) {
        this.AddressDetail = AddressDetail;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
    
    
    
    
}
