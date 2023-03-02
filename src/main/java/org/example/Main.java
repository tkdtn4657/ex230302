package org.example;

public class Main {
    public static void main(String[] args) {
        WiseSay WiseSay = new WiseSay();


    }
}

class WiseSay{
    //command() add() exit() printWiseSay() delete()

    WiseSay(){
        System.out.println("== 명언 앱 ==");
        command();
    }

    void command(){
        System.out.print("명령) ");
        exit();
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

}