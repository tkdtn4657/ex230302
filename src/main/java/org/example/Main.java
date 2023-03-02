package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WiseSay WiseSay = new WiseSay();
    }
}

class WiseSay{
    //command() add() exit() delete() inputText() wsList()
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
        else if(command.contains("삭제")){ // 삭제?id=1 = 7번째 인덱스 확인필요 10번 이상은 아직....모르겠다
            delete(Integer.parseInt(command.substring(6,7)));
        }
        else if(command.contains("수정")){
            modify(Integer.parseInt(command.substring(6,7)));
        }
    }

    void wsList(){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("------------------------");
        for(int i = count-1; i > 0; i--){
            if(author[i].equals("") && wsString[i].equals("")){

            }else {
                System.out.println(i + " / " + author[i] + " / " + wsString[i]);
            }
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
    void delete(int n){
        if(wsString[n].equals("")){
            System.out.println(n + "번 명언은 존재하지 않습니다.");
        }
        else {
            wsString[n] = "";
            author[n] = "";
            System.out.println(n + "번 명언이 삭제되었습니다");
        }
    }

    void modify(int n){
        System.out.println("명언(기존) : " + wsString[n]);
        System.out.print("명언 : ");
        wsString[n] = sc.nextLine();
        System.out.println("작가(기존) : " + author[n]);
        System.out.print("작가 : ");
        author[n] = sc.nextLine();
    }


    void exit(){
        System.exit(0);
    }


    //sc.close();
}