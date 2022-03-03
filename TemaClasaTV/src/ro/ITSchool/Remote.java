package ro.ITSchool;

import java.util.Locale;
import java.util.Scanner;

public class Remote {
    private boolean power;
    private int channel;
    private int volume;
    private String channelUp;
    private String channelDown;
    private String volumeUp;
    private String volumeDown;

    //---------------------------------//

    public void tvON() {
        Scanner scan = new Scanner(System.in);


        if (power == true) {

            System.out.println("Type the channel you want");
            this.channel = scan.nextInt();

            if (this.channel >= 1 && this.channel <= 100) {
                System.out.println("You are watching channel " + this.channel);
            } else if (this.channel < 1 || channel > 100) {
                this.channel = 100;
                System.out.println("You are watching channel " + this.channel);
            }

        }
        if(power == true){
            System.out.println("Type the volume you want");
            this.volume = scan.nextInt();
            if(this.volume >=0 && this.volume <= 50){
                System.out.println("Your volume is "+ this.volume);

            }else if(this.volume < 0){
                System.out.println("Your volume is MUTED");
            }else if (this.volume >= 50){
                System.out.println("Your volumes is MAX ");
            }

        }


        if (power == false) {
            System.out.println("TV OFF, Good Bye");

        }


        //-----------------------------------------//
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setChannelDown(String channelDown) {
        this.channelDown = channelDown;
    }

    public void setChannelUp(String channelUp) {
        this.channelUp = channelUp;
    }

    public void setVolumeDown(String volumeDown) {
        this.volumeDown = volumeDown;
    }

    public void setVolumeUp(String volumeUp) {
        this.volumeUp = volumeUp;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public String getChannelDown() {
        return channelDown;
    }

    public String getChannelUp() {
        return channelUp;
    }

    public boolean getPower() {
        return power;
    }

    public String getVolumeDown() {
        return volumeDown;
    }

    public String getVolumeUp() {
        return volumeUp;
    }
}

