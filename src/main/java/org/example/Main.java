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
    int count = 1;

    WiseSay(){
        System.out.println("== 명언 앱 ==");
        while(true){
            menu();
        }
    }


    void menu(){
        System.out.print("명령) ");
        String command = sc.nextLine();
        if(command.equals("등록")){
            System.out.print("명언 : ");
            sc.nextLine();
            System.out.print("작가 : ");
            sc.nextLine();
            System.out.println(count + "번 명언이 등록되었습니다.");
        }
        else if(command.equals("종료")){
            exit();
        }
    }

    String inputText(){
        String s = sc.nextLine();
        return s;
    }

    void add(){

    }

    void exit(){
        System.exit(0);
    }
    void printWiseSay(){

    }
    void delete(){

    }

    //sc.close();
}