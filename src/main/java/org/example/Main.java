package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WiseSay WiseSay = new WiseSay();


    }
}

class WiseSay{
    //command() add() exit() printWiseSay() delete() inputText()
    Scanner sc = new Scanner(System.in);


    WiseSay(){
        System.out.println("== 명언 앱 ==");
        command();
    }

    void command(){
        System.out.print("명령) ");
        menu(inputText());
        exit();
    }
    void menu(String command){
        if(command.equals("등록")){
            System.out.print("명언 : ");
            sc.nextLine();
            System.out.print("작가 : ");
            sc.nextLine();

        }
    }

    String inputText(){
        String s = sc.nextLine();
        return s;
    }

    void add(){

    }

    void exit(){
        System.out.println("종료");
    }
    void printWiseSay(){

    }
    void delete(){

    }

    //sc.close();
}