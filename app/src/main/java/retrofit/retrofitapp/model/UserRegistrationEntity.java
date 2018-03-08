package retrofit.retrofitapp.model;

public class UserRegistrationEntity {

    public String PhoneNumber;

    public String PhoneNumberLocal;

    public String UserGuid;

    public String NickName;

    public String DeviceID;

    public String DeviceUniqueID;

    public String DeviceType;

    public String Token;

    public String BackEndName;

    public String EmailAddress;

    public boolean IsZibMiUser;

    public boolean IsLocal;

    public boolean NeedSync;

    public String InvitedUser;

    public boolean IsZibMiCommunity;

    public String ProfilePicture;

    public String OrganizationName;

    public String PersonalStatus;

    public String State;
    //used for company name
    public String Status;

    public UserRegistrationEntity Response;

    public String UserId;

    public String PartitionKey;


    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setUserGuid(String UserGuid) {
        this.UserGuid = UserGuid;
    }

    public void setDeviceID(String DeviceID) {
        this.DeviceID = DeviceID;
    }

    public void setDeviceUniqueID(String DeviceUniqueID) {
        this.DeviceUniqueID = DeviceUniqueID;
    }

    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

   /* public UserRegistrationEntity(String name,String PhoneNumber) {
        this.NickName = name;
        this.UserGuid = UserGuid;
    }*/


}
