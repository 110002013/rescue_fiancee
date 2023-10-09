# rescue_fiancee
### 遊戲介紹
這回未婚妻又被大猩猩給捉走了，瑪莉歐要孤身奮鬥去拯救未婚妻，他們還設置重重的關卡來阻止馬力歐，現在就讓瑪莉歐打敗可惡的大猩猩救出未婚妻吧！  
### 關卡介紹
遊戲開始的時候會要求輸入勇者的名字，輸入ＯＫ(大小寫皆可)後會跑出前情提要，再輸入ＯＫ後會呼叫副程式poem_１，如果不是輸入ＯＫ就會直接結束遊戲。
```
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("請輸入勇者名字:");
String name = input.nextLine();
System.out.println("這回未婚妻又被大猩猩給捉走了，"+name+"勇者要孤身奮鬥去拯救未婚妻，\n" + "他們還設置重重的關來阻止你，希望你能打敗可惡的大猩猩救出未婚妻！\n"
    + "準備好就輸入ok並按下Enter");
```
#### 關卡一
第一關是冒險篇，名字叫做「被攻佔的碧姬公主城堡」需要通過關卡才能夠渡過岩漿，但是岩漿火焰令腳下晃動不已，要特別小心。  
關卡內容：我們總共有六首詩，然後隨機抽一首詩來默打 ，如果默打不出來就直接掉入岩漿，必須重頭來過！！
```
String start = input.nextLine();
  String start_L = start.toLowerCase();
  if (start_L.equals("ok")) {
   poem_1();
  } else {
   System.out.println("掰掰，有緣再相見");
  }
 }
```
上面會呼叫副程式poem_1，就會從六首中用亂數隨機抽取一首詩，會把抽到的詩與使用者的默打傳到副程式poem_one
```
 public static void poem_one(int x, String write) {
  String o_poem[] = { // o_poem陣列存詩
    "春眠不覺曉，處處聞啼鳥。夜來風雨聲，花落知多少。",... };
  String os_poem[] = new String[24];
...
  poem_two(os_poem, write);//副程式poem_t判斷輸入是否有錯字或多/少字

 }
```
#### 關卡二
第二關猜謎語「薄荷諸島隱藏關卡」要能穿越薄荷島就能乘船去尋找大魔王，如果不細心的話會很難找出答案
question_riddle陣列儲存題目，有個answer_riddle陣列儲存答案。
接著會用亂數抽題並顯示。勇者輸入完答案後，下面除錯
```
public static void riddle_2() {
  System.out.println("第二關益智篇「薄荷諸島隱藏關卡」若能穿越薄荷島就能乘船去尋找大魔王，如果不細心的話會很難找出答案\r\n"
    + "關卡：猜謎語   <注意！！若沒找出正確的答案會被困在島上，也必須重新來過！！>\n" + "閱讀完請輸入ok題目將會出現");
  Scanner input = new Scanner(System.in);
  String start_1 = input.nextLine();
  String start_L = start_1.toLowerCase();
  if (start_L.equals("ok")) {
   int x = (int) (Math.random() * 10 + 2);

   String question_riddle[] = { "叫馬不是馬，地上不見它。若用它做藥，請到海里找(猜動物)", ...};
   String answer_riddle[] = { "海馬",...};
   System.out.println("題目：" + question_riddle[x]);
   String i_riddle_answer = input.nextLine();// 玩家輸入的答案
   if (i_riddle_answer.equals(answer_riddle[x])) {
    System.out.println("恭喜你答對了，準備好，輸入ok趕快進入最後一關吧~");
    String start_2 = input.nextLine();
    String start_L2 = start_2.toLowerCase();
...
 }
```
#### 關卡三
關卡：終極密碼(範圍:1~100 ) 有五次機會!  
勇者輸入一個數字，如果大於100或小於0的話，會提示請重新輸入。  
變數count紀錄總共猜了幾次

```
public static void number_3() {
  System.out.println("第三關策略篇「決戰！碧姬公主城堡」... "閱讀完請輸入ok");
  Scanner input = new Scanner(System.in);
  String start_1 = input.nextLine();
  String start_L = start_1.toLowerCase();
  if (start_L.equals("ok")) {
   int x = 0;
   x = (int) (Math.random() * 99 + 1); // 將X設為終極密碼-電腦變數
   int count = 0, n1 = 0, n2 = 100; // 將猜的次數、最小值、最大值設定好
   while (true) {
    System.out.print("請輸入數字:");
    int number = input.nextInt(); // number設為玩家輸入字
    count++;
...
   }
   System.out.println("共猜了 " + count + " 次唷!");
   if (count > 5) {
    System.out.println("挑戰失敗，掰掰，有緣再相見");
   } else {
    System.out.println("恭喜你救出了未婚妻哈哈哈!!!!!");
   }
  } else {
   System.out.println("掰掰，有緣再相見");
  }
 }
}
```
