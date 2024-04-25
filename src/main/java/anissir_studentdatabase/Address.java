package anissir_studentdatabase;

import java.io.Serializable;

public class Address implements Serializable {

    String Road, PostOffice, District;

    public Address(String a, String b, String c) {
        this.Road = a;
        this.PostOffice = b;
        this.District = c;
    }

    public String getRoad(){
        return Road;
    } 

    public void setRoad(String Road) {
        this.Road = Road;
    }

    public void setPostOffice(String PostOffice) {
        this.PostOffice = PostOffice;
    }

    public void setDistrict(String District) {
        this.District = District;
    }
    
    public String getPostOffice(){
        return PostOffice;
    }
    
    public String getDistrict(){
        return District;
    }
    @Override
    public String toString() {
        String r = "Address:\n" + "Road:" + Road + "," + "PostOffice:" + PostOffice + "," + "District:" + District;
        return r;
    }

}
