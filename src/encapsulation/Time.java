package encapsulation;
// All my Variables are private and all my Classes, Setters and Getters are public.

public class Time {
    private int hour;    //Private Variable. 
    private int minute;  //Private Variable.
    private int second;  //Private Variable.

//Public method to display the time.
public void displayTime(){
    System.out.println("The time is: " + hour + ":" + minute + ":" + second);
}
public void setHour(int h){    //Public setter.
    hour = h;
}
public int getHour(){          //Public getter.
    return hour;
}
public void setMinute(int m){  //Public setter.
    minute = m;
}
public int getMinute(){        //Public getter.
    return minute;
}
public void setSecond(int s){  //Public setter.
    second = s;
}
public int getSecond(){        //Public getter.
    return second;
}
}