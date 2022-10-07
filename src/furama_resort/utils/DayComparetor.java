package furama_resort.utils;

import furama_resort.models.Booking;

import java.util.Comparator;

public class DayComparetor implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        if(o1.getStartDay().compareTo( o2.getEndDay()) > 0){
            return 1;
        }else if(o1.getStartDay().compareTo( o2.getEndDay()) == 0){
            if(o1.getEndDay().compareTo(o2.getEndDay()) > 0){
                return 1;
            }
            else if(o1.getEndDay().compareTo(o2.getEndDay())==0){
                return 0;
            }
            else return -1;
        }
        else {
            return -1;
        }
    }
}
