package com.dhugge;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer player = new SoccerPlayer.SoccerPlayerBuilder()
                .firstName("par")
                .lastName("dhu")
                .transferMarketId("12312")
                .build();

        SoccerPlayer player1 = new SoccerPlayer.SoccerPlayerBuilder()
                .firstName("Bob")
                .lastName("Hob")
                .transferMarketId("13212")
                .build();


        System.out.println(player);
        System.out.println(player.equals(player1));
    }
}
