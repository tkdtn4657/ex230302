package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WiseSay WiseSay = new WiseSay();


    }
}

class WiseSay{
    //command() add() exit() printWiseSay() delete() inputText() wsList()
    //HashMap<Integer, HashMap<String, String>> result = new HashMap<Integer, HashMap<String, String>>();
    Scanner sc = new Scanner(System.in);
    int count = 1;//result map 변수1 아직미구현으로 일반배열로 사용
    String[] wsString = new String[100];//result map 변수2 아직미구현으로 일반배열로 사용
    String[] author = new String[100];//result map 변수3 아직미구현으로 일반배열로 사용


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
            add();
        }
        else if(command.equals("목록")){
            wsList();
        }
        else if(command.equals("종료")){
            exit();
        }
    }

    void wsList(){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("------------------------");
        for(int i = count-1; i > 0; i--){
            System.out.println(i + " / " + author[i] + " / " + wsString[i]);
        }
    }

    void add(){
        System.out.print("명언 : ");
        wsString[count] = sc.nextLine();
        System.out.print("작가 : ");
        author[count] = sc.nextLine();
        System.out.println(count + "번 명언이 등록되었습니다.");
        //result.put(count, wsString, author); // 아직미구현으로 일반배열로 사용
        count++;
    }
    void delete(){

    }

    void exit(){
        System.exit(0);
    }
    void printWiseSay(){

    }


    //sc.close();
}