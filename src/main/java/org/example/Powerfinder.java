package org.example;

public class Powerfinder {
    private int powerOfNumber;
    private int powerRaisedto;

    public int getPowerOfNumber() {
        return powerOfNumber;
    }

    public int getPowerRaisedto() {
        return powerRaisedto;
    }

    public void setPowerOfNumber(int powerOfNumber) {
        this.powerOfNumber = powerOfNumber;
    }

    public void setPowerRaisedto(int powerRaisedto) {
        this.powerRaisedto = powerRaisedto;
    }
    static int result = 1;
    private static int findPower(int powerOfNumber, int powerRaisedto){

        if(powerRaisedto == 0) return 1;

        for(int i=0; i<powerRaisedto; i++){
            result = result * powerOfNumber;
        }

        return result;
    }

    public int getFindPower(){
        return findPower(powerOfNumber,powerRaisedto);
    }

    public  void setFindPower(int powerOfNumber, int powerRaisedto){
        this.powerOfNumber = powerOfNumber;
        this.powerRaisedto = powerRaisedto;
    }
}

//------------- Code Already Written ---------------------------------

/*public class powerfinder {
    public static int OF(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++) {
            p *= xyz;
        }
        return p;
    }
}
*/