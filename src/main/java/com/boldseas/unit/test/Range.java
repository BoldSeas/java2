package com.boldseas.unit.test;

/**
 * Created by bykj on 2015/9/6.
 */
public class Range {

    private int low;
    private int high;
    private boolean isOpenL;
    private boolean isOpenH;

    public Range(int low, boolean isOpenL,int high,boolean isOpenH ){
        this.low = low;
        this.high = high;

        this.isOpenL = isOpenL;
        this.isOpenH = isOpenH;

        if(isOpenL || isOpenH){
            if(low >= high)
                throw new IllegalArgumentException();
        }
    }
    public boolean contains(int input){

        boolean lowFlag = false;
        boolean highFlag = false;

        if(isOpenL) {
            if(input > low ){
                lowFlag = true;
            }

        }else{
            if(input >= low ) {
                lowFlag = true;
            }
        }

        if(isOpenH) {
            if(input < high ){
                highFlag = true;
            }

        }else{
            if(input <= high ) {
                highFlag = true;
            }
        }


        return lowFlag && highFlag;
    }
}
