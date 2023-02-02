Feature: Проблемы простого огурца

  Scenario: Использование разных defs файлов
    Given open browser
    * urlLoginPageOpened
    * user "atrostyanko@gmail.com" with password "Qwertyu_1" logged in
    Then open page param