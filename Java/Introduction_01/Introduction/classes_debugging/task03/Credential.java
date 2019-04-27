package homework.oop_principles_debugginf_06.task3;

 class Credential {

    private final String credentialName;
    private String credentialPassword;
    private String[] oldPass;
    private byte oldPasssize;
    private byte possitPass = 0;// taken position in array of old passwords

    public Credential(String credentialName, String credentialPassword) {
        this.credentialName = validName(credentialName);
        this.credentialPassword = validName(credentialPassword);
        this.oldPasssize = 100;// user can has only 100 old pass no more
        this.oldPass = new String[oldPasssize];//initialize possible choice of passwords
    }

    // is check to validate set name
    private String validName(String date) {
        if (date != null || !date.isEmpty()) {
            return date;
        }
        return "Invalid date";
    }

    //getters

    //get name
    public String getCredentialName() {
        return credentialName;
    }
    // get password
    public String getCredentialPassword() {
        return credentialPassword;
    }

    public boolean changePassword( String credentialCurrentPassword, String newPassword) {
        if (isMatchWhitPassword(newPassword)){
            return false;// the new pass is same the old
        }

        //to change pass we can only if current is matching whit pass
        if (credentialCurrentPassword.equals(this.credentialPassword)) {
            //check if we already yet this password in old
            for (int i = 0; i < possitPass; i++) {
                if (newPassword.equals(oldPass[i])) {
                    // we have new password in olds
                    return false;
                }
            }
        }       //here we can change the pass
        this.oldPass[possitPass++] = credentialCurrentPassword;//save current pass in old
        this.credentialPassword = newPassword;
        return true;
    }


    //check input pass is match whit the current
    public boolean isMatchWhitPassword(String inputPassword){
        return inputPassword.equals(this.credentialPassword);
    }
}
