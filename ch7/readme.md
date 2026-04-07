#新裝置開啟軟體流程(筆電沒電時)

step 0.
    開啟cmd
    輸入cd Desktop/Java Prac/ch7

step 1.網站
    開啟moodle(瀏覽上課簡報、上課練習撰寫)/
    github(登入、推送)/
    學校雲端(課本檔案下載)

step 2.下載git
    open icon

step 3. vscode輸入指令
    (1)self-practice
        git clone https://github.com/warren1008/114-1_Java_prac.git
    (2)class folder
        git clone https://github.com/warren1008/114_JAVA_I_hw.git

step 4.vscode 下載套件:暫無

step 5.完成檔案後
    輸入git add . 
    git commit -m ""
    git push -u origin 

step 6. 刪除乾淨
    刪除專案檔案:到桌面把你剛才 Clone 下來的專案資料夾直接刪除
    清除 Windows 系統紀錄的 Git 密碼 (最重要！)
    點擊電腦左下角的 Windows 「開始」按鈕（或搜尋放大鏡）。

輸入 認證管理員 (或英文 Credential Manager ) 並開啟它。

點擊 「Windows 認證」。

在下方的「一般認證」清單中，找到開頭是 git:https://github.com 的項目。

點擊它展開，然後選擇 「移除」。
